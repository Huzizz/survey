package com.zh.survey.mapper.mapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;
import com.zh.survey.entity.AnswerSpool;
import com.zh.survey.mapper.AnswerSpoolMapper;

@Repository
public class AnswerSpoolMapping implements AnswerSpoolMapper {

	@Autowired
    private MongoTemplate mongoTemplate;
	
	@Override
	public void insert(AnswerSpool answerSpool) {
		mongoTemplate.save(answerSpool);
	}

	@Override
	public void update(AnswerSpool answerSpool) {
		Query query = new Query(Criteria.where("_id").is(answerSpool.getAnswerSpoolId()));
        Update update = new Update()
                .set("user_id", answerSpool.getUserId())
                .set("quesnaire_Id", answerSpool.getQuesnaireId())
                .set("ques_name", answerSpool.getQuesName())
                .set("status", answerSpool.getStatus())
        		.set("questions", answerSpool.getQuestionList())
        		.set("create_time", answerSpool.getCreateTime());
        mongoTemplate.updateFirst(query, update, AnswerSpool.class);
	}

	@Override
	public AnswerSpool findByAnswerSpoolId(String answerSpoolId) {
		Query query = new Query(Criteria.where("_id").is(answerSpoolId));
		AnswerSpool answerSpool = mongoTemplate.findOne(query, AnswerSpool.class);
        return answerSpool;
	}

}
