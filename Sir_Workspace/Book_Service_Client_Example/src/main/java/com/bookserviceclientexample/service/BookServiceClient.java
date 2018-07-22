package com.bookserviceclientexample.service;

import java.util.List;

import com.bookserviceproviderexample.service.SearchParameters;
import com.bookserviceproviderexample.service.SearchResults;

public interface BookServiceClient {
public List<SearchResults>
searchBooks(SearchParameters searchParams);
}
