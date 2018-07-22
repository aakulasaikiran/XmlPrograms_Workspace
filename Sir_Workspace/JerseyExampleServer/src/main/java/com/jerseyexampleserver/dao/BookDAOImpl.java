package com.jerseyexampleserver.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jerseyexampleserver.factory.ConnectionFactory;
import com.jerseyexampleutil.domain.Book;

public class BookDAOImpl implements BookDAO{
  public int registerBook(Book book) {
	int count=0;
	 Connection con=null;
	 try{ 
con=ConnectionFactory.getConnection();
String sql="insert into Book_Details values(?,?,?,?,?)";
PreparedStatement pst=con.prepareStatement(sql);
pst.setInt(1,book.getIsbn());
pst.setString(2,book.getTitle());
pst.setDouble(3,book.getPrice());

pst.setString(4,book.getAuthor());
pst.setString(5,book.getPublication());
   count=pst.executeUpdate();
	 }catch(SQLException se){
		se.printStackTrace(); 
	 }finally{
	if(con!=null){
		try{
       con.close();
		}catch(SQLException se){
		se.printStackTrace();	
		}
	}
	 }
		return count;
	}
}
