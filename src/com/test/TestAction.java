package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.controller.ControllerTest;

public class TestAction {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		ControllerTest con = (ControllerTest)context.getBean("aaa");
		con.add();
	}
}
