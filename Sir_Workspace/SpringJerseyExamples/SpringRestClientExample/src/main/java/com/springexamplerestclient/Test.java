package com.springexamplerestclient;

import java.io.IOException;

import javax.ws.rs.core.MediaType;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.springexamplerest.domain.Book;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.WebResource.Builder;

public class Test
{
    public static void main( String[] args ) throws JsonGenerationException, JsonMappingException, IOException
    {
    String URL="http://localhost:8090/SpringJerseyRestFullExample/books/registerBook";
   Book book=new Book();
   book.setIsbn(302);
   book.setTitle("jva");
   book.setPrice(1900.0);
   book.setPublication("nit");
   book.setAuthor("jhon");
   ObjectMapper mapper=new ObjectMapper();
   String jsonBook=mapper.writeValueAsString(book);
   System.out.println(jsonBook);
   Client client=Client.create();
   WebResource resource=client.resource(URL);
   Builder builder=resource.accept(MediaType.APPLICATION_JSON);
   builder.type(MediaType.APPLICATION_JSON);
  ClientResponse clientResponse=builder.post(ClientResponse.class,jsonBook);
   System.out.println(clientResponse.getStatus()+" "+clientResponse.getStatusInfo());
System.out.println(clientResponse.getEntity(String.class));

   /*
    * Try with
    * RestTemplate restTemplate=new RestTemplate();
   String jsonResponseDTO=restTemplate.postForObject(URL,jsonBook, String.class);
   System.out.println(jsonResponseDTO);*/
    
    
    }
}
