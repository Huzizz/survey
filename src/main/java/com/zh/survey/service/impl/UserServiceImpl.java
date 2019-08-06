package com.zh.survey.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zh.survey.entity.User;
import com.zh.survey.mapper.UserMapper;
import com.zh.survey.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{

	@Autowired
    private UserMapper userMapper;
	
	@Override
	public void insert(User user) {
		userMapper.insert(user);
	}

	@Override
	public void update(User user) {
		userMapper.update(user);
	}

	@Override
	public User findByUserId(String userId) {
		
		return userMapper.findByUserId(userId);
	}

}
