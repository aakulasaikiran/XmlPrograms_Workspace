/**
 * BookServiceImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bookwebserviceprovider.service;

public class BookServiceImplServiceLocator extends org.apache.axis.client.Service implements com.bookwebserviceprovider.service.BookServiceImplService {

    public BookServiceImplServiceLocator() {
    }


    public BookServiceImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public BookServiceImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BookServiceImpl
    private java.lang.String BookServiceImpl_address = "http://localhost:8082/Book_Web_Service_Provider/services/BookServiceImpl";

    public java.lang.String getBookServiceImplAddress() {
        return BookServiceImpl_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BookServiceImplWSDDServiceName = "BookServiceImpl";

    public java.lang.String getBookServiceImplWSDDServiceName() {
        return BookServiceImplWSDDServiceName;
    }

    public void setBookServiceImplWSDDServiceName(java.lang.String name) {
        BookServiceImplWSDDServiceName = name;
    }

    public com.bookwebserviceprovider.service.BookServiceImpl getBookServiceImpl() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BookServiceImpl_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBookServiceImpl(endpoint);
    }

    public com.bookwebserviceprovider.service.BookServiceImpl getBookServiceImpl(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.bookwebserviceprovider.service.BookServiceImplSoapBindingStub _stub = new com.bookwebserviceprovider.service.BookServiceImplSoapBindingStub(portAddress, this);
            _stub.setPortName(getBookServiceImplWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBookServiceImplEndpointAddress(java.lang.String address) {
        BookServiceImpl_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.bookwebserviceprovider.service.BookServiceImpl.class.isAssignableFrom(serviceEndpointInterface)) {
                com.bookwebserviceprovider.service.BookServiceImplSoapBindingStub _stub = new com.bookwebserviceprovider.service.BookServiceImplSoapBindingStub(new java.net.URL(BookServiceImpl_address), this);
                _stub.setPortName(getBookServiceImplWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("BookServiceImpl".equals(inputPortName)) {
            return getBookServiceImpl();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service.bookwebserviceprovider.com", "BookServiceImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service.bookwebserviceprovider.com", "BookServiceImpl"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BookServiceImpl".equals(portName)) {
            setBookServiceImplEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
