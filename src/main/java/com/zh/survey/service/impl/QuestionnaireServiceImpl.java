package com.zh.survey.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zh.survey.entity.Questionnaire;
import com.zh.survey.mapper.QuestionnaireMapper;
import com.zh.survey.service.QuestionnaireService;

@Service("questionnaireService")
public class QuestionnaireServiceImpl implements QuestionnaireService {

	@Autowired
	private QuestionnaireMapper questionnaireMapper;
	
	@Override
	public void insert(Questionnaire questionnaire) {
		questionnaireMapper.insert(questionnaire);
	}

	@Override
	public void update(Questionnaire questionnaire) {
		questionnaireMapper.update(questionnaire);
	}

	@Override
	public Questionnaire findByQuesnaireId(String quesnaireId) {

		return questionnaireMapper.findByQuesnaireId(quesnaireId);
	}

}
