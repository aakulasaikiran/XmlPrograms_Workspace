package com.jerseyexampleutil.domain;

import java.io.Serializable;

public class ResponseDTO implements Serializable{
private byte status;
private String msg;
private String data;
public byte getStatus() {
	return status;
}
public void setStatus(byte status) {
	this.status = status;
}
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

}
