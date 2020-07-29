package com.ffcs.oss.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ffcs.ioc.service.MessageService;
import com.ffcs.oss.web.model.UserEvt;

@Controller
public class HelloWorldController {
	@Autowired
	private MessageService messageService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "helloWorld";
	}

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home(Model model) {
		model.addAttribute("msg", "HelloWorld");
		return "home";
	}

	@RequestMapping(value = "/getMsg", method = RequestMethod.GET)
	public String getMsg(Long userId, Model model) {
		model.addAttribute("msg", "HelloWorld:" + userId);
		return "home";
	}

	@RequestMapping(value = "/getMsgParam", method = RequestMethod.GET)
	public String getMsgParam(@RequestParam(value = "nickname", required = false) String nickname, Model model) {
		model.addAttribute("msg", "HelloWorld:" + nickname);
		return "home";
	}

	@RequestMapping(value = "/getMsgPath/{nickname}/{age}", method = RequestMethod.GET)
	public String getMsgPath(@PathVariable("nickname") String nickname, @PathVariable("age") Integer age, Model model) {
		model.addAttribute("msg", "HelloWorld:" + nickname + ":" + age);
		return "home";
	}

	@RequestMapping(value = "/getMsgObj")
	public String getMsgObj(UserEvt userEvt, Model model) {
		
		model.addAttribute("msg", "HelloWorld:" + userEvt.getUserName());
		return "home";
	}

	@RequestMapping(value = "/getMsgJson", method = RequestMethod.POST)
	public String getMsgJson(@RequestBody UserEvt userEvt, Model model) {
		model.addAttribute("msg", "HelloWorld:" + userEvt.getUserName());
		return "home";
	}

	@RequestMapping(value = "/print")
	@ResponseBody
	public String print() {
		return messageService.getMessage();
	}

}
