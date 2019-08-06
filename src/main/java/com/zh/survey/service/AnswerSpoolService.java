package com.zh.survey.service;

import com.zh.survey.entity.AnswerSpool;

public interface AnswerSpoolService {

	void insert(AnswerSpool answerSpool);
	
	void update(AnswerSpool answerSpool);
	
	AnswerSpool findByAnswerSpoolId(String answerSpoolId);
}
