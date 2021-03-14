package com.ruiheng.spring5.service;

import com.ruiheng.spring5.dao.UserDao;
import com.ruiheng.spring5.dao.UserDaoImpl;

public class UserService {
		
		//private UserDao userDao;
		//creating UserDao object(_primitive way)
		//UserDao userDao = new UserDaoImpl();
		//userDao.update();
		//now doing this spring way
		
		//create UserDao attribute, generate set method
		private UserDao userDao;
		
		//setter, use setter to finish the injection
		public void setUserDao(UserDao userDao) {
			this.userDao = userDao;
		}

		
		public void add() {
			System.out.println("adding service");
			userDao.update();
		}
		
		
}
