package com.zh.survey.entity;

import java.io.Serializable;

/**
 * 问题实体类
 * @author Jim Green
 *
 */
public class Question implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 问卷id
	 */
	private String quesNaireId;
	
	/**
	 * 题目
	 */
	private String topic;
	
	/**
	 * 类型
	 */
	private String type;
	
	/**
	 * 序号：在一张问卷中的序号
	 */
	private Integer serialNumber;

	/**
	 * 答案
	 */
	private String answer;
	
	
	public String getQuesNaireId() {
		return quesNaireId;
	}

	public void setQuesNaireId(String quesNaireId) {
		this.quesNaireId = quesNaireId;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(Integer serialNumber) {
		this.serialNumber = serialNumber;
	}

	
	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "Question [quesNaireId=" + quesNaireId + ", topic=" + topic + ", type=" + type + ", serialNumber="
				+ serialNumber + ", answer=" + answer + "]";
	}



}
