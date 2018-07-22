package com.resteasyclientexample;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.client.RestTemplate;


public class App {
    public static void main( String[] args ) throws Exception{
String URL="http://localhost:8082/RestEasyExample1/nit/hello/sayHello/{name}";
  RestTemplate template=new RestTemplate();
  Map<String,Object> map=new HashMap<>();
  map.put("name","sathish");
  String response=template.getForObject(URL,String.class,map);
    System.out.println(response);
    }
}
/*
ClientRequest clientRequest=new ClientRequest(URL);
clientRequest.accept(MediaType.TEXT_PLAIN);
ClientResponse clientResponse
=clientRequest.get(ClientResponse.class);
  String response=(String)clientResponse.getEntity(String.class);
  System.out.println(clientResponse.getStatus());
  System.out.println(response);*/