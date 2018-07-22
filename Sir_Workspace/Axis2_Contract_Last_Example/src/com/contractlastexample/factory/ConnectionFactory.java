package com.contractlastexample.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
static{
try {
	Class.forName("com.mysql.jdbc.Driver");
} catch (ClassNotFoundException e) {
	e.printStackTrace();
}	
}
public static Connection getConnection() throws SQLException{
String url="jdbc:mysql://localhost:3306/nit";
String un="root";
String pass="root";
Connection con=DriverManager.getConnection(url,un,pass);	
return con;
}
}
