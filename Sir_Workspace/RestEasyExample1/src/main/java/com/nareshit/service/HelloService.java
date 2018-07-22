package com.nareshit.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("hello")
public class HelloService {
	@Path("sayHello/{name}")
	@Produces(MediaType.TEXT_PLAIN)
	@GET
public String sayHello(@PathParam("name") String name){
	String msg="Hello :"+name+" welcome to RESTEASY";
	return msg;
}
}
