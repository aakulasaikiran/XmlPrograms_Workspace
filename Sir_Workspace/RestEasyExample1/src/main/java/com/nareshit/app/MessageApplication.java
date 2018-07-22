package com.nareshit.app;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import com.nareshit.service.HelloService;

public class MessageApplication extends Application{
	private Set<Object> hs=new HashSet<>();
	public MessageApplication(){
		hs.add(new HelloService());
	}

public Set<Object> getSingletons(){
return hs;	
}
}
