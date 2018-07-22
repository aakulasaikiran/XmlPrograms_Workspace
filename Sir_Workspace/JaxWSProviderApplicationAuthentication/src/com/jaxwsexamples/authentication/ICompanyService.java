package com.jaxwsexamples.authentication;

import javax.jws.WebService;

@WebService
public interface ICompanyService {

	public Employee getEmployeeDetails(Employee emp) throws AuthenticationException;

}
