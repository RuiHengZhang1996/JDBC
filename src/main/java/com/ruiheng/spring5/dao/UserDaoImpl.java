package com.ruiheng.spring5.dao;

import org.springframework.stereotype.Repository;

@Repository(value="userDaoImp")
public class UserDaoImpl implements UserDao {

	@Override
	public void add() {
		
		System.out.println("dao add....");

	}

}
