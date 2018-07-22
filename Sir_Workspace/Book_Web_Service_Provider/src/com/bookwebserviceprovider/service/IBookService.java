package com.bookwebserviceprovider.service;

import java.rmi.Remote;
import java.rmi.RemoteException;

import com.bookwebserviceprovider.domain.Book;

public interface IBookService extends Remote {
public Book searchBook(Integer isbn)throws 
RemoteException;
}
