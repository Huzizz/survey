package com.zh.survey.mapper;

import com.zh.survey.entity.Questionnaire;

public interface QuestionnaireMapper {

	void insert(Questionnaire questionnaire);
	
	void update(Questionnaire questionnaire);
	
	Questionnaire findByQuesnaireId(String quesnaireId);
}
