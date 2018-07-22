package com.jaxwsclientexample.client;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;

import com.jaxwsexamples.authentication.AuthenticationException_Exception;
import com.jaxwsexamples.authentication.CompanyServiceImpl;
import com.jaxwsexamples.authentication.CompanyServiceImplService;
import com.jaxwsexamples.authentication.Employee;

public class Test {

	public static final String WS_URL = "http://localhost:1414/JaxWSProviderApplicationAuthentication/getEmployees?wsdl";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompanyServiceImplService implService 
		= new CompanyServiceImplService();
		CompanyServiceImpl sei = implService.getCompanyServiceImplPort();
		
		setAuthentication(sei);
		Employee emp = new Employee();
		emp.setEmpId(301);
		try{
		Employee empReturn =sei.getEmployeeDetails(emp);
		System.out.println(empReturn.getEmpName() + "  ..  " + empReturn.getDesignation());
		}catch(AuthenticationException_Exception e){
		System.out.println(e.getMessage());	
		}
		
	}
	public static void setAuthentication(CompanyServiceImpl sei){
		Map<String, Object> req_ctx = ((BindingProvider)sei).getRequestContext();
			  req_ctx.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, WS_URL);

		Map<String, List<String>> headers = new HashMap<String, List<String>>();
			headers.put("user", Collections.singletonList("abcabcabc"));
			headers.put("password", Collections.singletonList("jaxwspassword"));
			req_ctx.put(MessageContext.HTTP_REQUEST_HEADERS, headers);
	}

		


}
