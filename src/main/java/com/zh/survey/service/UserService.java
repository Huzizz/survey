package com.zh.survey.service;

import com.zh.survey.entity.User;

public interface UserService {

	void insert(User user);
	
	void update(User user);
	
	User findByUserId(String userId);
}
