package com.nareshit.service;

import org.springframework.stereotype.Service;

import com.jerseyexample.util.JsonUtil;
import com.nareshit.domain.User;

@Service
public class UserServiceImpl
implements UserService{

	@Override
	public String searchUser(Integer userId) {
		String jsonUser="";
		if(userId!=null && userId.equals(101)){
		User user=new User();
		user.setUserId(userId);
		user.setUserName("rama");
		user.setEmail("rama@gmail");
jsonUser=JsonUtil.javaToJson(user);		
		}
		return jsonUser;
	}

}
