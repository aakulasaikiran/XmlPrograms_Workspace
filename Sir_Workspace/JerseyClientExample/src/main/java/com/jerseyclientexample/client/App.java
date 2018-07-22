package com.jerseyclientexample.client;

import java.io.IOException;

import javax.ws.rs.core.MediaType;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.jerseyclientexample.domain.Book;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.WebResource.Builder;

public class App {
  public static void main( String[] args )
		  throws JsonGenerationException, 
		  JsonMappingException, IOException{
 Book book=new Book();
 book.setIsbn(101);
 book.setAuthor("jhon");
 book.setPrice(200.0);
 book.setPublication("nit");
 book.setTitle("java in two days");
 //convert book obj into json string
 //for this we can use Jackson API
 ObjectMapper mapper=new ObjectMapper();
 String jsonBook
 =mapper.writeValueAsString(book);
 //jersey 1.x code to access resource
 Client client=Client.create();
 String url="http://localhost:8082/SpringRestfullWebservicesExample/books/registerBook";
    WebResource webResource
    =client.resource(url);
 Builder builder=webResource.accept(MediaType.APPLICATION_JSON);
     builder.type(MediaType.APPLICATION_JSON);
 ClientResponse clientResponse
 =builder.post(ClientResponse.class,jsonBook);
  System.out.println(clientResponse.getStatus()) ;
    String jsonResponse=clientResponse.getEntity(String.class);
    System.out.println(jsonResponse);
  }
}
