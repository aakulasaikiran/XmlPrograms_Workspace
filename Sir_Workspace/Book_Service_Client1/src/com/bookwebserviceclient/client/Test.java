package com.bookwebserviceclient.client;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import com.bookwebserviceprovider.domain.Book;
import com.bookwebserviceprovider.service.BookServiceImpl;
import com.bookwebserviceprovider.service.BookServiceImplServiceLocator;

public class Test {
public static void main(String[] args) throws ServiceException, RemoteException{
BookServiceImplServiceLocator locator=
new BookServiceImplServiceLocator();
  BookServiceImpl sei=locator.getBookServiceImpl();
  Book book=sei.searchBook(1001);
System.out.println(book.getBookName()+" "+book.getAuthor()+" "+book.getPrice());  
}
}
