package com.jaxwsexamples.authentication;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;

@WebService
public class CompanyServiceImpl implements ICompanyService {
	@Resource
	private WebServiceContext webServiceContext;

	public Employee getEmployeeDetails(Employee emp) throws AuthenticationException {
		if (authenticate()) {
			System.out.println("In CompanyServiceImpl provider " + emp.getEmpId());
			emp.setEmpName("SAIKIRAN");
			emp.setDesignation("Student");
			return emp;
		} else {
			throw new AuthenticationException("you are  not authenicated to access service");
		}

	}

	@WebMethod(exclude = true)
	private boolean authenticate() {
		MessageContext mctx = webServiceContext.getMessageContext();

		Map<String, Object> soapHeader = (Map<String, Object>) mctx.get(MessageContext.HTTP_REQUEST_HEADERS);

		List<String> userList = (List) soapHeader.get("user");
		List<String> passwordList = (List) soapHeader.get("password");
		String username = "";
		String password = "";
		if (userList != null) {
			username = (String) userList.get(0);
		}
		if (passwordList != null) {
			password = passwordList.get(0).toString();
		}
		if ("jaxwsusername".equals(username) && "jaxwspassword".equals(password)) {
			return true;
		} else {
			return false;
		}
	}
}
