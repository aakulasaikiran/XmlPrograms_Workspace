package com.jsonexample.util;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class JsonUtil {
public static String convertJavaToJson(Object obj){
String jsonStr="{}";
try{
ObjectMapper mapper=new ObjectMapper();
jsonStr=mapper.writeValueAsString(obj);
}catch(JsonGenerationException je){
	je.printStackTrace();
}
catch(JsonMappingException jm){
	jm.printStackTrace();
}
catch(IOException ie){
	ie.printStackTrace();
}
return jsonStr;
}
public static <T> T convertJsonToJava
(String jsonStr,Class<T> cls){
	T response=null;
	try{
	ObjectMapper mapper=new ObjectMapper();
	response=mapper.readValue(jsonStr,cls);
	}catch(JsonGenerationException je){
		je.printStackTrace();
	}
	catch(JsonMappingException jm){
		jm.printStackTrace();
	}
	catch(IOException ie){
		ie.printStackTrace();
	}
	return response;
}
}
