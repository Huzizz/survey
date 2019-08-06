package com.zh.survey.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zh.survey.entity.AnswerSpool;
import com.zh.survey.mapper.AnswerSpoolMapper;
import com.zh.survey.service.AnswerSpoolService;

@Service("answerSpoolService")
public class AnswerSpoolServiceImpl implements AnswerSpoolService {
	
	@Autowired
	private AnswerSpoolMapper answerSpoolMapper;

	@Override
	public void insert(AnswerSpool answerSpool) {
		answerSpoolMapper.insert(answerSpool);
	}

	@Override
	public void update(AnswerSpool answerSpool) {
		answerSpoolMapper.update(answerSpool);
	}

	@Override
	public AnswerSpool findByAnswerSpoolId(String answerSpoolId) {

		return answerSpoolMapper.findByAnswerSpoolId(answerSpoolId);
	}

}
