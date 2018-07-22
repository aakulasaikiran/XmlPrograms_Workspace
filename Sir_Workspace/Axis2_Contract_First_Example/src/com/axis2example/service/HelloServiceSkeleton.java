
/**
 * HelloServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
    package com.axis2example.service;
    /**
     *  HelloServiceSkeleton java 
     *  skeleton for the axisService
     */
    public class HelloServiceSkeleton{ 
public SayHelloReturn sayHello(Name name){
   SayHelloReturn sayHelloReturn=new
		   SayHelloReturn();
String msg="Hello  "+name.getName()+" welcome to axis";
sayHelloReturn.setSayHelloReturn(msg);    
	return sayHelloReturn;
        }
    }
    
    