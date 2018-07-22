package com.nareshit.exceptions;

public class UserNotFoundException
extends RuntimeException{
public UserNotFoundException(){
	
}
public UserNotFoundException(String s){
	super(s);
}
public UserNotFoundException(Exception e){
	super(e);
}
}
