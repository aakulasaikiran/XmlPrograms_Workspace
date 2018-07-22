package jerseyclientexample.service;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Configuration;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.filter.LoggingFilter;

import com.jerseyexampleutil.domain.Book;
import com.jerseyexampleutil.domain.ResponseDTO;
import com.jerseyexampleutil.util.JsonUtil;

public class BookServiceClientImpl implements
BookServiceClient{
public ResponseDTO registerBook(Book book) {
String jsonBook=JsonUtil.javaToJson(book);
 Client client=
ClientBuilder.newClient(new ClientConfig().register(LoggingFilter.class));
 System.out.println("Request to WebService ::"+jsonBook);
 
 String url="http://localhost:8082/JerseyExampleServer/books/registerBook";  
 WebTarget webTarget=client.target(url);
 Builder builder=webTarget.request(MediaType.APPLICATION_JSON);
 builder.accept(MediaType.APPLICATION_JSON);
 Response response=builder.post(Entity.entity(jsonBook,MediaType.APPLICATION_JSON),Response.class);
   String jsonResponseDTO
   =response.readEntity(String.class);
  System.out.println("Response of WebService ::"+jsonResponseDTO);
   ResponseDTO responseDTO=JsonUtil.jsonToJava(ResponseDTO.class,jsonResponseDTO);
   
		return responseDTO;
	}

}
