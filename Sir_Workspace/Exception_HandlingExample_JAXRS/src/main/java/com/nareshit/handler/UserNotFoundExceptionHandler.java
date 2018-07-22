package com.nareshit.handler;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.nareshit.exceptions.UserNotFoundException;

@Provider
public class UserNotFoundExceptionHandler
implements 
ExceptionMapper<UserNotFoundException>{
@Override
public Response toResponse
(UserNotFoundException exception) {
return Response.status(Status.BAD_REQUEST).entity(exception.getMessage()).type(MediaType.APPLICATION_JSON).build();
	}

}


