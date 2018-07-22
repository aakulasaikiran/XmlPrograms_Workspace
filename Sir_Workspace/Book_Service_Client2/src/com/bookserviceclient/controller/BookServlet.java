package com.bookserviceclient.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookserviceclient.service.BookServiceClient;
import com.bookserviceclient.service.BookServiceClientImpl;
import com.bookwebserviceprovider.domain.Book;

public class BookServlet
extends HttpServlet{
private BookServiceClient bookServiceClient;
public void init(){
bookServiceClient=new BookServiceClientImpl();	
}
public void doPost(HttpServletRequest req,
		HttpServletResponse res)throws ServletException,IOException{
//gather request parameters
Integer isbn=
Integer.valueOf(req.getParameter("isbn"));
  Book book=bookServiceClient.searchBook(isbn);
  //store book in a memory obj
  //i,e request obj 
  req.setAttribute("book",book);
 String targetView="/WEB-INF/pages/searchBookResults.jsp"; 
 RequestDispatcher rd=req.
		 getRequestDispatcher(targetView);
 rd.forward(req,res);
}
}
