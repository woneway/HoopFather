package com.woneway.service;

import org.springframework.stereotype.Service;

import com.woneway.domain.User;


@Service
public interface UserService {
	public User login(String userEmail, String userPwd);

	public int register(User user);

	public User getByUserCode(String userCode);

	public void updateUserInfo(User user);
}
