package com.bookserviceproviderexample.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bookserviceproviderexample.domain.SearchParameters;
import com.bookserviceproviderexample.domain.SearchResults;
import com.bookserviceproviderexample.factory.ConnectionFactory;

public class BookDAOImpl implements
BookDAO{
public List<SearchResults>
searchBooks(SearchParameters searchParams) 
{
List<SearchResults> list
=new ArrayList<SearchResults>();
Connection con=null;
try{
if(searchParams!=null){
StringBuilder sql=
new StringBuilder("select isbn,title,author,publication,price from Books_Details ");
boolean isFirst=true;
if(searchParams.getIsbn()!=null && searchParams.getIsbn()>0){	
sql.append(" where isbn="+searchParams.getIsbn());
isFirst=false;
}
 if(searchParams.getTitle()!=null 
&& searchParams.getTitle().trim().length()>0){
if(isFirst==true){
sql.append(" where title='"+searchParams.getTitle()+"'");
isFirst=false;
}else{
sql.append(" And title='"+searchParams.getTitle()+"'");
}
}
 if(searchParams.getAuthor()!=null 
&& searchParams.getAuthor().trim().length()>0){
if(isFirst==true){
sql.append(" where author='"+searchParams.getAuthor()+"'");
}else{
sql.append(" And author='"+searchParams.getAuthor()+"'");
}
}
 con=ConnectionFactory.getConnection();
PreparedStatement pst=con.prepareStatement(sql.toString());
  ResultSet rs=pst.executeQuery();
  while(rs.next()){
SearchResults searchResults=new SearchResults();
searchResults.setIsbn(rs.getInt("isbn"));
searchResults.setTitle(rs.getString("title"));
searchResults.setAuthor(rs.getString("author"));
searchResults.setPrice(rs.getDouble("price"));
searchResults.setPublication(rs.getString("publication"));
list.add(searchResults);
  }
}
}catch(SQLException se){
System.out.println("Exception Occured while searching the books :"+se.getMessage());	
}finally{
	if(con!=null){
		try{
		con.close();
		}catch(SQLException se){
System.out.println("Exception Occured while closing the connection :"+se.getMessage());	
			
		}
	}
}
	return list;
	}
}
