package com.zh.survey.mapper.mapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;
import com.zh.survey.entity.Questionnaire;
import com.zh.survey.mapper.QuestionnaireMapper;

@Repository
public class QuestionnaireMapping implements QuestionnaireMapper {

	@Autowired
    private MongoTemplate mongoTemplate;
	
	@Override
	public void insert(Questionnaire questionnaire) {
		mongoTemplate.save(questionnaire);
	}

	@Override
	public void update(Questionnaire questionnaire) {
		Query query = new Query(Criteria.where("_id").is(questionnaire.getQuesnaireId()));
        Update update = new Update()
                .set("publish_userId", questionnaire.getPublishUserId())
                .set("ques_name", questionnaire.getQuesName())
                .set("questions", questionnaire.getQuestionList())
                .set("publish_total", questionnaire.getPublishTotal())
        		.set("receive_total", questionnaire.getReceiveTotal())
        		.set("complete_total", questionnaire.getCompleteTotal())
        		.set("task_status", questionnaire.getTaskStatus())
        		.set("status", questionnaire.getStatus())
        		.set("create_time", questionnaire.getCreateTime())
        		.set("complete_time", questionnaire.getCompleteTime());
        mongoTemplate.updateFirst(query, update, Questionnaire.class);
	}

	@Override
	public Questionnaire findByQuesnaireId(String quesnaireId) {
		Query query = new Query(Criteria.where("_id").is(quesnaireId));
		Questionnaire questionnaire = mongoTemplate.findOne(query, Questionnaire.class);
        return questionnaire;
	}

}
