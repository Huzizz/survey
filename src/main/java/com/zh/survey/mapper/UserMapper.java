package com.zh.survey.mapper;

import com.zh.survey.entity.User;

public interface UserMapper {

	void insert(User user);
	
	void update(User user);
	
	User findByUserId(String userId);
}
