package com.bookserviceclientexample.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookserviceclientexample.service.BookServiceClient;
import com.bookserviceclientexample.service.BookServiceClientImpl;
import com.bookserviceproviderexample.service.SearchParameters;
import com.bookserviceproviderexample.service.SearchResults;

public class BookServlet extends HttpServlet{
	private BookServiceClient bookServiceClient;
	public void init(){
	bookServiceClient=new BookServiceClientImpl();	
	}
public void doPost(HttpServletRequest req,
		HttpServletResponse res)throws ServletException,IOException{
SearchParameters searchParams=new
SearchParameters();
int isbn=0;
if(req.getParameter("isbn")!=null &&
req.getParameter("isbn").trim().length()>0){
isbn=Integer.valueOf(req.getParameter("isbn"));
}
searchParams.setIsbn(isbn);
searchParams.setTitle(req.getParameter("title"));
searchParams.setAuthor(req.getParameter("author"));
 List<SearchResults> list=bookServiceClient.searchBooks(searchParams);
  req.setAttribute("searchResultsList",list);
 String targetView="/WEB-INF/pages/searchBooksResults.jsp";
 RequestDispatcher rd=req.getRequestDispatcher(targetView);
 rd.forward(req, res);
}
}
