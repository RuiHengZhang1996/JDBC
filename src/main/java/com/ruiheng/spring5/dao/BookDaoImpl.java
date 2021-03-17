package com.ruiheng.spring5.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ruiheng.spring5.entity.Book;

@Repository
public class BookDaoImpl implements BookDao {

	//注入JdbcTemplate
	private JdbcTemplate jdbcTemplate;

	@Override
	public void add(Book book) {
		
		//创建sql语句
		Object[] args = {book.getUserId(),book.getUsername(),book.getUstatus()};
        int update = jdbcTemplate.update("insert into t_user values (?,?,?)", args);
        System.out.println("update successful!" + update);
	}
	
}
