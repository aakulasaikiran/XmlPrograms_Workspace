package com.jerseyexample.service;

import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.jerseyexample.domain.Product;
@Path("products")
public class ProductService {
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/searchProductInJson/{pid}")
public Product 
getProductInJson(@PathParam("pid") Integer pid){
		Product product=null;
		 if(pid!=null && pid==101){
		  product=new Product();
		  product.setPid(pid);
		  product.setPname("mouse");
		  product.setPrice(300.0);
		 }
		 return product;
}//end of getProductInJson
	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("/searchProductInXML")
public Product getProductInXML(@QueryParam("pid") Integer pid){
		Product product=null;
		 if(pid!=null && pid==101){
		  product=new Product();
		  product.setPid(pid);
		  product.setPname("mouse");
		  product.setPrice(300.0);
		 }
		 return product;
}//end of getProductInXML
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/searchProduct")
public Product getProduct(
@MatrixParam("pid") Integer pid,
@MatrixParam("pname") String pname){
		Product product=null;
		 if(pid!=null && pid==101 && pname!=null && pname.equals("mouse")){
		  product=new Product();
		  product.setPid(pid);
		  product.setPname(pname);
		  product.setPrice(400.0);
		 }
		 return product;
}//end of getProduct
}
