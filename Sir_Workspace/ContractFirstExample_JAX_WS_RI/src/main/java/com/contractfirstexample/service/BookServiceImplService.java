
package com.contractfirstexample.service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "BookServiceImplService", targetNamespace = "http://service.contractfirstexample.com", wsdlLocation = "file:/E:/webservices11am/ContractFirstExample_JAX_WS_RI/src/main/webapp/WEB-INF/BookService.wsdl")
public class BookServiceImplService
    extends Service
{

    private final static URL BOOKSERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException BOOKSERVICEIMPLSERVICE_EXCEPTION;
    private final static QName BOOKSERVICEIMPLSERVICE_QNAME = new QName("http://service.contractfirstexample.com", "BookServiceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/E:/webservices11am/ContractFirstExample_JAX_WS_RI/src/main/webapp/WEB-INF/BookService.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BOOKSERVICEIMPLSERVICE_WSDL_LOCATION = url;
        BOOKSERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public BookServiceImplService() {
        super(__getWsdlLocation(), BOOKSERVICEIMPLSERVICE_QNAME);
    }

    public BookServiceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), BOOKSERVICEIMPLSERVICE_QNAME, features);
    }

    public BookServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, BOOKSERVICEIMPLSERVICE_QNAME);
    }

    public BookServiceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, BOOKSERVICEIMPLSERVICE_QNAME, features);
    }

    public BookServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BookServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns IBookService
     */
    @WebEndpoint(name = "IBookService")
    public IBookService getIBookService() {
        return super.getPort(new QName("http://service.contractfirstexample.com", "IBookService"), IBookService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IBookService
     */
    @WebEndpoint(name = "IBookService")
    public IBookService getIBookService(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.contractfirstexample.com", "IBookService"), IBookService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BOOKSERVICEIMPLSERVICE_EXCEPTION!= null) {
            throw BOOKSERVICEIMPLSERVICE_EXCEPTION;
        }
        return BOOKSERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}
