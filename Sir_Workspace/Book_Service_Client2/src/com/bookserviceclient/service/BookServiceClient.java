package com.bookserviceclient.service;

import com.bookwebserviceprovider.domain.Book;

public interface BookServiceClient {
public Book searchBook(Integer isbn);
}
