package com.cg.jpalabbook.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.cg.jpalabbook.dto.Author;
import com.cg.jpalabbook.dto.Book;

public class BookDaoImpl implements BookDao {
	private static EntityManagerFactory emf;
	private static EntityManager em;
	static {
		emf = Persistence.createEntityManagerFactory("jpalabbook");
	    em = emf.createEntityManager();
	}

	public List<Book> getBooks(Integer authorId) {
		// TODO Auto-generated method stub
		Author author = em.find(Author.class, authorId);
		if(author!=null) {
			return author.getBooks();
		}
		return null;
	}
	
	public Book addBook(Book book) {
		
		Book managedBook = em.find(Book.class,book.getBookId());
		EntityTransaction trans = em.getTransaction();
		trans.begin();
		for(int i=0;i<book.getAuthors().size();i++) {
			
		}
	}

}
