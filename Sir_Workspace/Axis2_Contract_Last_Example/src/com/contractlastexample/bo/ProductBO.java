package com.contractlastexample.bo;

import java.io.Serializable;

public class ProductBO implements Serializable{
private Integer productId;
private String productName;
private Double price;
public Integer getProductId() {
	return productId;
}
public void setProductId(Integer productId) {
	this.productId = productId;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public Double getPrice() {
	return price;
}
public void setPrice(Double price) {
	this.price = price;
}

}
