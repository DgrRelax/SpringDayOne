package com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.Idao;
import com.service.Iuser;
@Service
public class UserServiceImpl implements Iuser{
	@Autowired //�Զ�װ��
	private Idao dao; //װ����ǽӿ�
	
	@Override
	public void updat() {
		dao.select();
	}

}
