package com.bookserviceproviderexample.factory;

import com.bookserviceproviderexample.dao.BookDAO;
import com.bookserviceproviderexample.dao.BookDAOImpl;

public class DAOFactory {
private static BookDAO bookDAO;
static{
	bookDAO=new BookDAOImpl();
}
public static BookDAO getBookDAO(){
	return bookDAO;
}
}
