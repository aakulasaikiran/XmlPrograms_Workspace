package com.jerseyexample.domain;

import java.io.Serializable;

public class ResponseDTO 
implements Serializable{
private String msg,data;
private byte status;
public String getMsg() {
	return msg;
}
public void setMsg(String msg) {
	this.msg = msg;
}
public String getData() {
	return data;
}
public void setData(String data) {
	this.data = data;
}
public byte getStatus() {
	return status;
}
public void setStatus(byte status) {
	this.status = status;
}

}
