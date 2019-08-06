package com.zh.survey.mapper.mapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

import com.zh.survey.entity.User;
import com.zh.survey.mapper.UserMapper;

@Component
public class UserMapping implements UserMapper {

	@Autowired
    private MongoTemplate mongoTemplate;
	
	@Override
	public void insert(User user) {
		mongoTemplate.save(user);
	}

	@Override
	public void update(User user) {
		Query query = new Query(Criteria.where("_id").is(user.getUserId()));
        Update update = new Update()
                .set("phone", user.getPhone())
                .set("nick_name", user.getNickName())
                .set("status", user.getStatus())
                .set("create_time", user.getCreateTime());
        mongoTemplate.updateFirst(query, update, User.class);
	}

	@Override
	public User findByUserId(String userId) {
		Query query = new Query(Criteria.where("_id").is(userId));
        User user = mongoTemplate.findOne(query, User.class);
        return user;
	}

}
