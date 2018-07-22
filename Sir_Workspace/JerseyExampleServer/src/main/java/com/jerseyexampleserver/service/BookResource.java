package com.jerseyexampleserver.service;

import javax.print.attribute.standard.Media;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.jerseyexampleserver.dao.BookDAO;
import com.jerseyexampleserver.factory.DAOFactory;
import com.jerseyexampleutil.domain.Book;
import com.jerseyexampleutil.domain.ResponseDTO;
import com.jerseyexampleutil.util.JsonUtil;

@Path("books")
public class BookResource {
@POST
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/registerBook")
public ResponseDTO registerBook(String jsonBook){
	System.out.println("Entered into registerBook ::"+jsonBook);
Book book=JsonUtil.jsonToJava(Book.class,jsonBook);
BookDAO bookDAO=DAOFactory.getBookDAO();
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
 return responseDTO;  
}
}
