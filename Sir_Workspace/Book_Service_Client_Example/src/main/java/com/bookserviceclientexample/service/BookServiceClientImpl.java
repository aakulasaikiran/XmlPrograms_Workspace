package com.bookserviceclientexample.service;

import java.util.List;

import com.bookserviceproviderexample.service.BookWebServiceImplService;
import com.bookserviceproviderexample.service.IBookWebService;
import com.bookserviceproviderexample.service.SearchParameters;
import com.bookserviceproviderexample.service.SearchResults;
public class BookServiceClientImpl 
implements BookServiceClient{
public List<SearchResults> 
searchBooks(SearchParameters searchParams) {
BookWebServiceImplService service=new
BookWebServiceImplService();
  IBookWebService sei=service.getBookWebServiceImplPort();
     List<SearchResults> list=sei.searchBooks(searchParams);
		return list;
	}
}
