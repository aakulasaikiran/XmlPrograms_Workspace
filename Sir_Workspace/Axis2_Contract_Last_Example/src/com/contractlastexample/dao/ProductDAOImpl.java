package com.contractlastexample.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.contractlastexample.bo.ProductBO;
import com.contractlastexample.factory.ConnectionFactory;
public class ProductDAOImpl implements
ProductDAO{
public int registerProduct(ProductBO productBo) {
int count=0;
try{
Connection con=ConnectionFactory.getConnection();
String sql="insert into Product_Details values(?,?,?)";
PreparedStatement pst=con.prepareStatement(sql);
pst.setInt(1,productBo.getProductId());
pst.setString(2,productBo.getProductName());
pst.setDouble(3,productBo.getPrice());
  count=pst.executeUpdate();
}catch(SQLException se){
	se.printStackTrace();
}
return count;
	}

}
