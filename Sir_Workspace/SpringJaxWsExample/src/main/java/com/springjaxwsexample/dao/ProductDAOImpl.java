package com.springjaxwsexample.dao;

import java.sql.Connection;



import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.springjaxwsexample.domain.Product;

public class ProductDAOImpl implements ProductDAO{
private DataSource dataSource;//dependency
	
	public void setDataSource(DataSource dataSource) {
	this.dataSource = dataSource;
}

	public int registerProduct(Product product) {
	int count=0;
		try{
	Connection con=dataSource.getConnection();
String sql="insert into Product_Details values(?,?,?)";
PreparedStatement pst=con.prepareStatement(sql);
pst.setInt(1,product.getPid());
pst.setString(2,product.getProductName());
pst.setDouble(3,product.getPrice());
count=pst.executeUpdate();

		}catch(SQLException se){
		se.printStackTrace();	
		}
		return count;
	}
	

}
