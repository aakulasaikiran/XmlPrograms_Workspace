package com.axis2helloclient.client;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;

import com.axis2example.service.HelloServiceStub;
import com.axis2example.service.HelloServiceStub.Name;
import com.axis2example.service.HelloServiceStub.SayHelloReturn;

public class Test {
 public static void main(String[] args)
		 throws RemoteException {
	HelloServiceStub stub=new HelloServiceStub();
   Name name=new Name();
   name.setName("sathish");
SayHelloReturn sayHelloReturn=stub.sayHello(name);
	  String msg=sayHelloReturn.getSayHelloReturn();
	System.out.println(msg);  
	}
}
