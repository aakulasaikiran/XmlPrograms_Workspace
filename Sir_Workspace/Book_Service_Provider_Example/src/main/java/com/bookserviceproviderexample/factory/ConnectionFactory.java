package com.bookserviceproviderexample.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;


public class ConnectionFactory {
	private static ResourceBundle  bundle;
static{
try {
bundle=ResourceBundle.getBundle("com/bookserviceproviderexample/database");
Class.forName(bundle.getString("db.driverClass"));	
} catch (ClassNotFoundException e) {
	e.printStackTrace();
}
}
public static Connection getConnection()throws
SQLException{
return DriverManager.getConnection(bundle.getString("db.url"),bundle.getString("db.userName"),bundle.getString("db.password"));
}
}
