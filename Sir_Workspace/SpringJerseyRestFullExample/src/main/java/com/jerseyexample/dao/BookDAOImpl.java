package com.jerseyexample.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jerseyexample.domain.Book;
@Repository
public class BookDAOImpl implements BookDAO{
	@Autowired
	private DataSource dataSource;
  public int registerBook(Book book) {
	int count=0;
	 Connection con=null;
	 try{ 
con=dataSource.getConnection();
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
