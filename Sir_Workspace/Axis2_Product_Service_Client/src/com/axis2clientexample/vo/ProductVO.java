package com.axis2clientexample.vo;

import java.io.Serializable;

public class ProductVO implements Serializable{
private String productId,productName,price;

public String getProductId() {
	return productId;
}

public void setProductId(String productId) {
	this.productId = productId;
}

public String getProductName() {
	return productName;
}

public void setProductName(String productName) {
	this.productName = productName;
}

public String getPrice() {
	return price;
}

public void setPrice(String price) {
	this.price = price;
}

}
