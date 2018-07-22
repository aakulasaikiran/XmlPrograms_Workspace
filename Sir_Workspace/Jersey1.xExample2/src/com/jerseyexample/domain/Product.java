package com.jerseyexample.domain;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement //jaxb annotation
public class Product {
private Integer pid;
private String pname;
private Double price;

//required setters and getters





public Integer getPid() {
	return pid;
}
public void setPid(Integer pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public Double getPrice() {
	return price;
}
public void setPrice(Double price) {
	this.price = price;
}

}
