package com.jerseyexampleutil.util;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class JsonUtil {
public static String javaToJson(Object obj){
	String jsonStr="{}";
	ObjectMapper mapper=new ObjectMapper();
	try {
		jsonStr=mapper.writeValueAsString(obj);
	} catch (JsonGenerationException e) {
		e.printStackTrace();
	} catch (JsonMappingException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	return jsonStr;
}
public static <T> T jsonToJava(Class<T> cls,String str){
	T response=null;
ObjectMapper mapper=new ObjectMapper();	
	try {
		response=mapper.readValue(str,cls);
	} catch (JsonParseException e) {
		e.printStackTrace();
	} catch (JsonMappingException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	return response;
}
}
