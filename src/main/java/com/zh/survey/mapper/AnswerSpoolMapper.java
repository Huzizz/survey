package com.zh.survey.mapper;

import com.zh.survey.entity.AnswerSpool;

public interface AnswerSpoolMapper {

	void insert(AnswerSpool answerSpool);
	
	void update(AnswerSpool answerSpool);
	
	AnswerSpool findByAnswerSpoolId(String answerSpoolId);
}
