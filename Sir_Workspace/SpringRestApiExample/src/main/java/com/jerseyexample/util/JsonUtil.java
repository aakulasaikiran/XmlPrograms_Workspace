package com.jerseyexample.util;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class JsonUtil {
  //helper class
	//static memebers
	public static String
	javaToJson(Object obj){
String json="{}";	
ObjectMapper mapper=new ObjectMapper();
  try {
	json=mapper.writeValueAsString(obj);
} catch (JsonGenerationException e) {
	e.printStackTrace();
} catch (JsonMappingException e) {
	e.printStackTrace();
} catch (IOException e) {
	e.printStackTrace();
}
		return json;
	}
}
