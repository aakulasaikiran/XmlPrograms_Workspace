package com.jerseyexample.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jerseyexample.dao.BookDAO;
import com.jerseyexample.domain.Book;
import com.jerseyexample.domain.ResponseDTO;
import com.jerseyexample.util.JsonUtil;

@Path("books")
@Service
public class BookService{
	@Autowired
	private BookDAO bookDAO;
	
@POST
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/registerBook")
public String registerBook(String jsonBook){
	System.out.println("Entered into registerBook ::"+jsonBook);
Book book=JsonUtil.convertJsonToJava(Book.class,jsonBook);
String msg="Registration Is Failure!Please Try Again";
ResponseDTO responseDTO=new ResponseDTO();
responseDTO.setMsg(msg);
   int count=bookDAO.registerBook(book);
   if(count>0){
msg="Registration Is Success";
	 responseDTO.setMsg(msg);
	 responseDTO.setStatus((byte)1);
	 responseDTO.setData(book.getIsbn().toString());
   }
	System.out.println("Response of  registerBook ::"+responseDTO.getMsg());
  String jsonResponseDTO=JsonUtil.convertJavaToJson(responseDTO);
  return jsonResponseDTO;
}
}
