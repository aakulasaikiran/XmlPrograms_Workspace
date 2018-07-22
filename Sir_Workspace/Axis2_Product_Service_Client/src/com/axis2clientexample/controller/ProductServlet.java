package com.axis2clientexample.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.axis2clientexample.service.ProductServiceClient;
import com.axis2clientexample.service.ProductServiceClientImpl;
import com.axis2clientexample.vo.ProductVO;

public class ProductServlet 
extends HttpServlet{
	private ProductServiceClient productServiceClient;
	public void init(){
		productServiceClient=new ProductServiceClientImpl();
	}
public void doPost(HttpServletRequest req,
		HttpServletResponse res)throws 
		ServletException,IOException{
ProductVO productVO=new ProductVO();
productVO.setProductId(req.getParameter("productId"));
productVO.setProductName(req.getParameter("productName"));
productVO.setPrice(req.getParameter("productPrice"));
 boolean flag=productServiceClient.registerProduct(productVO);
 String status="Product Registration is failure";
 if(flag==true){
	status="Product Registration is success";  
  }
 req.setAttribute("status",status);
 String targetView="/WEB-INF/pages/productRegForm.jsp";
 RequestDispatcher rd=req.getRequestDispatcher(targetView);
 rd.forward(req,res);
}
}
