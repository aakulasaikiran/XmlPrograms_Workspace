package com.springjaxwsexample.service;

import com.springjaxwsexample.dao.ProductDAO;
import com.springjaxwsexample.domain.Product;

/**
 * writing of service is an optional
 * in this class write Exception-Handling
 * Transaction-Management logic
 * logger
 * Type-Converstion
 * Bussiness logic's
 * if we are not writing this seperate service class
 * we include above logic directly in webservice class
 * 
 * This class is called as Bussiness Delegeate Class
 */
public class ProductServiceImpl implements
ProductService{
private ProductDAO productDAO;

public void setProductDAO(ProductDAO productDAO) {
	this.productDAO = productDAO;
}
public boolean registerProduct(Product product) {
	boolean flag=false; 
	int count=productDAO.registerProduct(product);
	 if(count>0){
		 flag=true;
	 }
  		return flag;
	}

}
