
package com.jaxwsexamples.authentication;

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
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "CompanyServiceImplService", targetNamespace = "http://authentication.jaxwsexamples.com/", wsdlLocation = "http://localhost:1414/JaxWSProviderApplicationAuthentication/getEmployees?wsdl")
public class CompanyServiceImplService
    extends Service
{

    private final static URL COMPANYSERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException COMPANYSERVICEIMPLSERVICE_EXCEPTION;
    private final static QName COMPANYSERVICEIMPLSERVICE_QNAME = new QName("http://authentication.jaxwsexamples.com/", "CompanyServiceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:1414/JaxWSProviderApplicationAuthentication/getEmployees?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        COMPANYSERVICEIMPLSERVICE_WSDL_LOCATION = url;
        COMPANYSERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public CompanyServiceImplService() {
        super(__getWsdlLocation(), COMPANYSERVICEIMPLSERVICE_QNAME);
    }

    public CompanyServiceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), COMPANYSERVICEIMPLSERVICE_QNAME, features);
    }

    public CompanyServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, COMPANYSERVICEIMPLSERVICE_QNAME);
    }

    public CompanyServiceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, COMPANYSERVICEIMPLSERVICE_QNAME, features);
    }

    public CompanyServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CompanyServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CompanyServiceImpl
     */
    @WebEndpoint(name = "CompanyServiceImplPort")
    public CompanyServiceImpl getCompanyServiceImplPort() {
        return super.getPort(new QName("http://authentication.jaxwsexamples.com/", "CompanyServiceImplPort"), CompanyServiceImpl.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CompanyServiceImpl
     */
    @WebEndpoint(name = "CompanyServiceImplPort")
    public CompanyServiceImpl getCompanyServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://authentication.jaxwsexamples.com/", "CompanyServiceImplPort"), CompanyServiceImpl.class, features);
    }

    private static URL __getWsdlLocation() {
        if (COMPANYSERVICEIMPLSERVICE_EXCEPTION!= null) {
            throw COMPANYSERVICEIMPLSERVICE_EXCEPTION;
        }
        return COMPANYSERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}
