package com.springjaxwsexample.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.springjaxwsexample.domain.Product;
import com.springjaxwsexample.service.ProductService;
@WebService
public class ProductServiceWs{
	private ProductService productService;
	@WebMethod(exclude=true)
public void setProductService(ProductService productService) {
	this.productService = productService;
}
   @WebMethod(exclude=false)
	public Boolean registerProduct(Product product) {
		Boolean flag=productService.registerProduct(product);
		return flag;
	}

}
