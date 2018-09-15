package com.dao.impl;

import org.springframework.stereotype.Repository;

import com.dao.Idao;//ʵ�ֽӿ� ҲҪ�����

@Repository
public class DaoImpl implements Idao{

	@Override
	public void select() {
		System.out.println("兄弟，拿到数据了");
	}
}
