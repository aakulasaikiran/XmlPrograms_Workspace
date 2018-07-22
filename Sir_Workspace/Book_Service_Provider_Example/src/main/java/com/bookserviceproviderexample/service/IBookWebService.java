package com.bookserviceproviderexample.service;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.bookserviceproviderexample.domain.SearchParameters;
import com.bookserviceproviderexample.domain.SearchResults;
@WebService
public interface IBookWebService {
	@WebMethod
	public List<SearchResults>
	searchBooks(SearchParameters searchParameters);

}
