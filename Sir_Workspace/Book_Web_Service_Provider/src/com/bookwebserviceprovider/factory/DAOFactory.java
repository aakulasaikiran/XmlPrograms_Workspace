package com.bookwebserviceprovider.factory;

import com.bookwebserviceprovider.dao.BookDAO;
import com.bookwebserviceprovider.dao.BookDAOImpl;

public class DAOFactory {
private static BookDAO bookDAO;
static{
bookDAO=new BookDAOImpl();	
}
public static BookDAO getBookDAO(){
	return bookDAO;
}
}
