package com.ruiheng.spring5.dao;

import org.springframework.stereotype.Repository;

import com.ruiheng.spring5.entity.Book;


@Repository
public interface BookDao {
	void add(Book book);
}
