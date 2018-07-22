package com.bookwebserviceprovider.service;

import java.rmi.RemoteException;

import com.bookwebserviceprovider.dao.BookDAO;
import com.bookwebserviceprovider.domain.Book;
import com.bookwebserviceprovider.factory.DAOFactory;

public class BookServiceImpl implements IBookService{

	
	public Book searchBook(Integer isbn) 
			throws RemoteException {
return DAOFactory.getBookDAO().searchBook(isbn);	
	}
	

}
