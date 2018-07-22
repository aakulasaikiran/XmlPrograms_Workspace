package com.jaxwsexamples.publisher;

import javax.xml.ws.Endpoint;

import com.jaxwsexamples.authentication.CompanyServiceImpl;

public class CompanyMain {
	public static final String endPointURI = "http://localhost:8586/JaxWSProviderApplicationAuthentication/getEmployees?wsdl";

	public static void main(String[] args) {
		CompanyServiceImpl compImpl = new CompanyServiceImpl();

		Endpoint.publish(endPointURI, compImpl);
		System.out.println("webservice published successfully");

	}

}
