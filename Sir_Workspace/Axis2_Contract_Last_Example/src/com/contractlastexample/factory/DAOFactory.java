package com.contractlastexample.factory;

import com.contractlastexample.dao.ProductDAO;
import com.contractlastexample.dao.ProductDAOImpl;

public class DAOFactory {
private static ProductDAO productDAO;
static{
	productDAO=new ProductDAOImpl();
}
public static ProductDAO getProductDAO(){ 
return productDAO;	
}
}
