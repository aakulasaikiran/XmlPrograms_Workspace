package com.jerseyexample.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("products")
public class ProductService {
@Path("/registerProduct")
@POST
@Produces(MediaType.TEXT_PLAIN)
@Consumes(MediaType.APPLICATION_XML)
public String registerProduct(String productInXML){
String status="Registration Is Failure!Please Try Again.";
System.out.println("Entered into registerProduct method");
System.out.println(productInXML);
 if(productInXML!=null 
		 && productInXML.trim().length()>0){
//convert XML into Java obj by using JAXB API
//communicate with DAO and save java obj into db
 status="Registration is success";
 }
 return status;
	}
}
