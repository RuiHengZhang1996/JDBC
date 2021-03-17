package com.ruiheng.spring5.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ruiheng.spring5.dao.BookDao;
import com.ruiheng.spring5.entity.Book;


@Service
public class BookService {

	//注入dao
	@Autowired
    private BookDao bookDao;

    public void addBook(Book book){
        bookDao.add(book);
    }
	
}
