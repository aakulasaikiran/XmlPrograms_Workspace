package com.bookserviceproviderexample.service;

import java.util.List;

import javax.jws.WebService;

import com.bookserviceproviderexample.domain.SearchParameters;
import com.bookserviceproviderexample.domain.SearchResults;
import com.bookserviceproviderexample.factory.DAOFactory;

@WebService(endpointInterface="com.bookserviceproviderexample.service.IBookWebService")
public class BookWebServiceImpl implements IBookWebService{

	public List<SearchResults> 
searchBooks(SearchParameters searchParams){
	List<SearchResults>	list
=DAOFactory.getBookDAO().searchBooks(searchParams);
				return list;
	}
}
