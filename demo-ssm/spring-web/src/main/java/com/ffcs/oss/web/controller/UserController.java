package com.ffcs.oss.web.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ffcs.oss.web.model.UserEvt;
import com.ffcs.ssm.dao.UserMapper;
import com.ffcs.ssm.dao.entity.User;

@RequestMapping("user")
@Controller
public class UserController {

	@Autowired
	private UserMapper userMapper;

	@RequestMapping("save")
	@ResponseBody
	public Object saveUser(UserEvt evt) {
		User target = new User();
		BeanUtils.copyProperties(evt, target);
		userMapper.insertUser(target);
		return target;
	}
}
