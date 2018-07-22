package jerseyclientexample.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jerseyexampleutil.domain.Book;
import com.jerseyexampleutil.domain.ResponseDTO;

import jerseyclientexample.service.BookServiceClient;
import jerseyclientexample.service.BookServiceClientImpl;

public class BookServlet extends HttpServlet {
	private BookServiceClient bookServiceClient;
	public void init(){
	bookServiceClient=new BookServiceClientImpl();	
	}
public void doPost(HttpServletRequest req,HttpServletResponse res) 
		throws ServletException, IOException{
Integer isbn=Integer.parseInt(req.getParameter("isbn"));
String title=req.getParameter("title");
String author=req.getParameter("author");
String publication=req.getParameter("publication");
Double price=Double.parseDouble(req.getParameter("price"));
 Book book=new Book();
 book.setIsbn(isbn);
 book.setTitle(title);
 book.setAuthor(author);
 book.setPublication(publication);
 book.setPrice(price);
 ResponseDTO responseDTO=bookServiceClient.registerBook(book);
 req.setAttribute("responseDTO",responseDTO);
 String targetView="/WEB-INF/pages/regBook.jsp";
 RequestDispatcher rd=req.getRequestDispatcher(targetView);
 rd.forward(req,res);
}
}
