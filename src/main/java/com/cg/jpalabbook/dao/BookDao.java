package com.cg.jpalabbook.dao;

import java.util.List;

import com.cg.jpalabbook.dto.Book;

public interface BookDao {
	
	public List<Book> getBooks(Integer authorId);

}
