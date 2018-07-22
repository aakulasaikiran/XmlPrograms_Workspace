package com.nareshit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nareshit.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userService;
//in spring these controller's are called
	//Handler classes
@RequestMapping(value="searchUser/{userId}",
method=RequestMethod.GET)
@ResponseBody //produce output in the form json/xml then we can use this annotation
public String 
searchUser(@PathVariable("userId") Integer userId){
String jsonUser=userService.searchUser(userId);
		return jsonUser;
	}
}
//User Id is a path parameters
//Every Path Parameter must be include in URL

