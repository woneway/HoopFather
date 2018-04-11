package com.woneway.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.woneway.domain.User;
import com.woneway.mapper.UserMapper;
import com.woneway.service.UserService;


@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserMapper userMapper;
	
	//登录
	@Override
	public User login(String userEmail, String userPwd){
		// TODO Auto-generated method stub
		User rs = userMapper.login(userEmail, userPwd);
		if(rs==null) 
			return null;
		return rs;
	}

	@Override
	public int register(User user){
		// TODO Auto-generated method stub
		return userMapper.register(user);
	}

	@Override
	public User getByUserCode(String userCode) {
		// TODO Auto-generated method stub
		return userMapper.getByUserCode(userCode);
	}

	@Override
	public void updateUserInfo(User user) {
		// TODO Auto-generated method stub
		userMapper.updateUserInfo(user);
	}

}
