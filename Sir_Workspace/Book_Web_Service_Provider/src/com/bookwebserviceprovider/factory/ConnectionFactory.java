package com.bookwebserviceprovider.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
static{
try {
	Class.forName("oracle.jdbc.driver.OracleDriver");
} catch (ClassNotFoundException e) {
System.out.println("Exception Occured while loading the Driver class ::"+e.getMessage());	
}
}
public static Connection getConnection()
		throws SQLException{
Connection con=null;
String url="jdbc:oracle:thin:@localhost:1521:XE";
String un="system";
String pass="manager";
con=DriverManager.getConnection(url,un,pass);
return con;
}
}