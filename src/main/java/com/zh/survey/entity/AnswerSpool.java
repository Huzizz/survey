package com.zh.survey.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * 用户回答问卷
 * @author Jim Green
 *
 */
@Document(collection = "answer_spool")
public class AnswerSpool implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@Id
	private String answerSpoolId;
	
	/**
	 * 用户id
	 */
	@Field("user_id")
	private Integer userId;
	
	/**
	 * 问卷id
	 */
	@Field("quesnaire_Id")
	private Integer quesnaireId;
	
	/**
	 * 问卷名称
	 */
	@Field("ques_name")
	private String quesName;
	
	/**
	 * 问卷题目
	 */
	@Field("questions")
	private List<Question> questionList;
	
	/**
	 * 状态
	 */
	@Field("status")
	private Integer status;

	/**
	 * 创建时间
	 */
	@Field("create_time")
	private Date createTime;
	
	public String getAnswerSpoolId() {
		return answerSpoolId;
	}

	public void setAnswerSpoolId(String answerSpoolId) {
		this.answerSpoolId = answerSpoolId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getQuesnaireId() {
		return quesnaireId;
	}

	public void setQuesnaireId(Integer quesnaireId) {
		this.quesnaireId = quesnaireId;
	}

	public String getQuesName() {
		return quesName;
	}

	public void setQuesName(String quesName) {
		this.quesName = quesName;
	}


	public List<Question> getQuestionList() {
		return questionList;
	}

	public void setQuestionList(List<Question> questionList) {
		this.questionList = questionList;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
	
	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		return "AnswerSpool [answerSpoolId=" + answerSpoolId + ", userId=" + userId + ", quesnaireId=" + quesnaireId
				+ ", quesName=" + quesName + ", questionList=" + questionList + ", status=" + status + ", createTime="
				+ createTime + "]";
	}


}
