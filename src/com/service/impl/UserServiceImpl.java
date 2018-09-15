package com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.Idao;
import com.service.Iuser;
@Service
public class UserServiceImpl implements Iuser{
	@Autowired //自动装配
	private Idao dao; //装配的是接口
	
	@Override
	public void updat() {
		dao.select();
	}

}
