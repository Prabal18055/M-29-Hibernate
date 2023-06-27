package org.tnsif.service;

import java.util.List;

import org.tnsif.entities.Book;

public interface BookService {
	
	Book getBookByID(int id);
	List<Book>getAllBooks();
	Long getBookCount();
	List<Book>getAuthorBooks(String author);
	List<Book>getBookByTitle(String title);
	List<Book>getBookByPrice(double low, double high);

}