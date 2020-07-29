package com.ffcs.ioc.run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ffcs.ioc.service.MessageService;

public class ClassPathXmlApplicationContextApplication {

	private static ApplicationContext appContext;

	public static void main(String[] args) {
		appContext = new ClassPathXmlApplicationContext("spring-applicationContext.xml");
		MessageService messageService = appContext.getBean(MessageService.class);
		System.out.println(messageService.getMessage());
	}
}
