package com.contractfirstexample.service;

import javax.jws.WebService;

import com.contractfirstexample.domain.Book;

@WebService
public class BookServiceImpl implements
IBookService{

	public Book searchBook(int isbn) {
		Book book=null;
		if(isbn==101){
book=new Book();
book.setIsbn(isbn);
book.setBookName("java");
book.setPrice(9000.0);
book.setAuthor("sathish");
		}
		return book;
	}

}
