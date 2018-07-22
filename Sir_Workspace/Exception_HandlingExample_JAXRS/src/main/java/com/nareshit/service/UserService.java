package com.nareshit.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.nareshit.domain.User;
import com.nareshit.exceptions.UserNotFoundException;

@Path("userService")
public class UserService {
@Path("getUser/{uid}")
@Produces(MediaType.APPLICATION_JSON)
@GET
	public Response 
	getUser(@PathParam("uid") int uid){
	if(uid==101){	
  User user=new User();
 user.setUserId(uid);
 user.setUserName("sathish");
 user.setEmail("sathish@gmail");
 return Response.status(200).entity(user).type(MediaType.APPLICATION_JSON).build();
	}
	else{	
 throw new UserNotFoundException(uid+" User is not found in DB ");		
	}
	}
}
