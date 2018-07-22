package com.springjaxwsexample.domain;

import java.io.Serializable;

public class Product implements Serializable{
private Integer pid;
private String productName;
private Double price;
public Integer getPid() {
	return pid;
}
public void setPid(Integer pid) {
	this.pid = pid;
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
