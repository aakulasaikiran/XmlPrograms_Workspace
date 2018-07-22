package com.jerseyexample.dao;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jerseyexample.domain.Book;

import java.sql.PreparedStatement;
@Repository
public class BookDAOImpl 
implements BookDAO{ //dependent
	@Autowired
private DataSource dataSource;//dependency
	public int registerBook(Book book) {
	int count=0;
	Connection con=null;
	 try{
 con=dataSource.getConnection();
String sql="insert into Book_Details values(?,?,?,?,?)";
PreparedStatement pst=con.prepareStatement(sql);
pst.setInt(1,book.getIsbn());
pst.setString(2,book.getTitle());
pst.setString(4,book.getAuthor());
pst.setDouble(3,book.getPrice());
pst.setString(5,book.getPublication());
  count=pst.executeUpdate();
	 }catch(SQLException se){
	se.printStackTrace(); 
	 }
		return count;
	}
}
