package com.axis2clientexample.service;

import java.rmi.RemoteException;

import com.axis2clientexample.service.ProductServiceClient;
import com.axis2clientexample.vo.ProductVO;
import com.contractlastexample.service.ProductServiceStub;
import com.contractlastexample.service.ProductServiceStub.ProductBO;
import com.contractlastexample.service.ProductServiceStub.RegisterProduct;
import com.contractlastexample.service.ProductServiceStub.RegisterProductResponse;


public class ProductServiceClientImpl 
implements ProductServiceClient{
public boolean registerProduct
(ProductVO productVO) {
	boolean response=false;
try{		
ProductServiceStub stub=new ProductServiceStub();
RegisterProduct registerProduct=new 
RegisterProduct();//binding obj
ProductBO productBo=new ProductBO();//binding obj
productBo.setProductId(Integer.parseInt(productVO.getProductId()));
productBo.setProductName(productVO.getProductName());
productBo.setPrice(Double.parseDouble(productVO.getPrice()));

registerProduct.setProductBO(productBo);
 RegisterProductResponse registerProductResponse
 =stub.registerProduct(registerProduct);
 //read results
 response=registerProductResponse.get_return();
}catch(RemoteException re){
	re.printStackTrace();
}
return response;
	}
}
