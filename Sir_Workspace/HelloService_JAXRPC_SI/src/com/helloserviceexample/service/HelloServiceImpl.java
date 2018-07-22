package com.helloserviceexample.service;
public class HelloServiceImpl 
implements IHelloService{
public String sayHello(String name){
String msg="Hello  "+name+" welcome to webservices";		
		return msg;
	}
}
