package com.nareshit;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.client.RestTemplate;


public class App {
    public static void main( String[] args ){
 String url="http://localhost:8082/SpringRestApiExample/searchUser/{userId}";
 RestTemplate restTemplate=new
		 RestTemplate();
 //Map is used to store path parameters of URL
 Map<String,Integer> map=new 
		 HashMap<String, Integer>();
 map.put("userId",101);
 String jsonUser=restTemplate.getForObject(url,String.class,map);
 System.out.println(jsonUser);
    }
}
