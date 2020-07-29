package com.ffcs.old;

public class Application {

	private static MessageService messageService = new MessageServiceImpl();

	public static void main(String[] args) {
		System.out.println(messageService.getMessage());
	}
}
