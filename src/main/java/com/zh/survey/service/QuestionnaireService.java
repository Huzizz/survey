package com.zh.survey.service;

import com.zh.survey.entity.Questionnaire;

public interface QuestionnaireService {

	void insert(Questionnaire questionnaire);
	
	void update(Questionnaire questionnaire);
	
	Questionnaire findByQuesnaireId(String quesnaireId);
}
