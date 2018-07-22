package com.jerseyexampleserver.factory;

import com.jerseyexampleserver.dao.BookDAO;
import com.jerseyexampleserver.dao.BookDAOImpl;

public class DAOFactory {
private static BookDAO bookDAO;
static{
	bookDAO=new BookDAOImpl();
}
public static BookDAO getBookDAO(){
	return bookDAO;
}
}
