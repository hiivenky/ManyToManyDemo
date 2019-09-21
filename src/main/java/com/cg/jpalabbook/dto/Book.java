package com.cg.jpalabbook.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.ManyToMany;

public class Book {
	
	private Integer bookId;
	private String bookTitle;
	private Double bookCost;
	@ManyToMany(cascade = CascadeType.ALL,mappedBy = "books")
	private List<Author> authors;
	
	public Book() {
		
	}

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public Double getBookCost() {
		return bookCost;
	}

	public void setBookCost(Double bookCost) {
		this.bookCost = bookCost;
	}

	public List<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookTitle=" + bookTitle + ", bookCost=" + bookCost + ", authors=" + authors
				+ "]";
	}
	
	
 
}
