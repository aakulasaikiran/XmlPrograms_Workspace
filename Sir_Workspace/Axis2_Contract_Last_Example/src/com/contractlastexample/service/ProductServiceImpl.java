package com.contractlastexample.service;

import com.contractlastexample.bo.ProductBO;
import com.contractlastexample.factory.DAOFactory;

public class ProductServiceImpl implements
ProductService{
public boolean registerProduct(ProductBO productBO) {
boolean flag=false;
	int count=DAOFactory.getProductDAO().registerProduct(productBO);
if(count>0){
	flag=true;
}
 return flag;
	}
}
