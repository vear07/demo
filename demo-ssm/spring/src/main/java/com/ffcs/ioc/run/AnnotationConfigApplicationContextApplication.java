package com.ffcs.ioc.run;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ffcs.ioc.service.MessageService;

public class AnnotationConfigApplicationContextApplication {

	private static AnnotationConfigApplicationContext context;

	public static void main(String[] args) {
		context = new AnnotationConfigApplicationContext("com.ffcs.*");
		MessageService messageService = context.getBean(MessageService.class);
		System.out.println(messageService.getMessage());
	}
}
