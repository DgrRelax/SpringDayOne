package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.service.Iuser;

@Controller("aaa")
public class ControllerTest {
	@Autowired
	private Iuser service;
	
	public void add(){
		service.updat();
	}
	
}
