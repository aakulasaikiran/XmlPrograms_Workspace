package com.bookserviceproviderexample.dao;

import java.util.List;

import com.bookserviceproviderexample.domain.SearchParameters;
import com.bookserviceproviderexample.domain.SearchResults;

public interface BookDAO {
public List<SearchResults>
searchBooks(SearchParameters searchParameters);

}
