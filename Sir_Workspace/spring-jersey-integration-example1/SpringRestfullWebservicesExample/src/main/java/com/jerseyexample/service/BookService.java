package com.jerseyexample.service;

import javax.print.attribute.standard.Media;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.codehaus.jackson.annotate.JsonUnwrapped;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jerseyexample.dao.BookDAO;
import com.jerseyexample.domain.Book;
import com.jerseyexample.domain.ResponseDTO;
import com.jerseyexample.util.JsonUtil;

@Path("books")
@Service
public class BookService { //dependent
	@Autowired
private BookDAO bookDAO;//dependency
@Path("/registerBook")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@POST
public String registerBook(String jsonBook){
ResponseDTO responseDTO=new ResponseDTO();
responseDTO.setMsg("Book Registration is Failure!Please Try Again");
//convert jsonBook into java book obj
//to convert we have  no of API's
	//jackson-api,,gson api,simple json apiObject
Book book=JsonUtil.jsonToJava(jsonBook,Book.class);
//call BookDAO method
  int count=bookDAO.registerBook(book);
   if(count>0){
responseDTO.setMsg("Book Registration completed successfully");
responseDTO.setData(book.getIsbn().toString());
responseDTO.setStatus((byte)1);
   }
  String jsonResponse=
		  JsonUtil.javaToJson(responseDTO);
  return jsonResponse;
}
}
