package com.cg.jpalabbook.service;

import java.util.List;

import com.cg.jpalabbook.dto.Book;

public interface BookService {
	
	public List<Book> getBooks(Integer authorId);

}
