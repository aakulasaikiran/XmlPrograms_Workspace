package com.jerseyexample.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.jerseyexample.domain.Product;

@Path("products")
public class ProductService {
	@GET
	@Path("/searchProductInJSON")
	@Produces(MediaType.APPLICATION_JSON)
	public Product searchProduct1(@QueryParam("pid") Integer pid) {
		if(pid!=null && pid.equals(101)){
		Product product = new Product();
		product.setPid(101);
		product.setPname("mouse");
		product.setPrice(300);
		return product;
	}
		else{
			return null;
		}
	}

}
