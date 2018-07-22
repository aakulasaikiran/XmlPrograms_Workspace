/**
 * BookServiceImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bookwebserviceprovider.service;

public interface BookServiceImpl extends java.rmi.Remote {
    public com.bookwebserviceprovider.domain.Book searchBook(int isbn) throws java.rmi.RemoteException;
}
