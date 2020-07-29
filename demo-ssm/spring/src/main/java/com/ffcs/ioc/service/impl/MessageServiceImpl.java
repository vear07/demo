package com.ffcs.ioc.service.impl;

import org.springframework.stereotype.Service;

import com.ffcs.ioc.service.MessageService;

@Service
public class MessageServiceImpl implements MessageService {

	public String getMessage() {
		return "Hello World!";
	}
}
