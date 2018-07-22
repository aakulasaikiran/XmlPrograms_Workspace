package com.jsonexample.client;

import com.jsonexample.domain.Product;
import com.jsonexample.util.JsonUtil;

public class App {
   public static void main( String[] args ){
  Product product=new Product();
  product.setProductId(201);
  product.setProductName("mouse");
  product.setPrice(300.0);
   String jsonProduct
   =JsonUtil.convertJavaToJson(product);
   System.out.println(jsonProduct);
   
   Product p1
 =JsonUtil.convertJsonToJava(jsonProduct,Product.class);
   System.out.println(p1.getProductId()+" "+p1.getProductName()+" "+p1.getPrice());
   }
}
