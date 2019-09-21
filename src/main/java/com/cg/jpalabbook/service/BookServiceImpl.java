package com.cg.jpalabbook.service;

import java.util.List;

import com.cg.jpalabbook.dao.BookDao;
import com.cg.jpalabbook.dao.BookDaoImpl;
import com.cg.jpalabbook.dto.Book;

public class BookServiceImpl implements BookService {
	
	private BookDao dao = new BookDaoImpl();

	public List<Book> getBooks(Integer authorId) {
		// TODO Auto-generated method stub
		return dao.getBooks(authorId);
	}
	
	

}
