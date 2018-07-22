package com.bookserviceclient.service;

import com.bookwebserviceprovider.domain.Book;
import com.bookwebserviceprovider.service.BookServiceImpl;
import com.bookwebserviceprovider.service.BookServiceImplServiceLocator;

public class BookServiceClientImpl
implements BookServiceClient{
public Book searchBook(Integer isbn) {
	Book book=null;
	try{
BookServiceImplServiceLocator locator=
new BookServiceImplServiceLocator();
   BookServiceImpl sei=locator.getBookServiceImpl();
   book=sei.searchBook(isbn);
	}catch(Exception e){
		e.printStackTrace();
	}
		return book;
	}

	
}


//call webservice
	//from webservice 
	//result is comming as Book obj
	
	//Book is BO 
	//create VO(TO) class obj
	//convert BO object data into VO obj
	//then return VO object to servlet
	//from this service
//Note:- in this example we are not
//implementing VO class