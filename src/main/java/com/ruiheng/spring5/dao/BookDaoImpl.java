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
		String sql = "insert into t_book values(?,?,?)";
		
		//调用方法实现
		int update = jdbcTemplate.update(sql, book.getUserId(), book.getUsername(), book.getUstatus());
		
	}
	
}
