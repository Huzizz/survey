package com.zh.survey.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * 问卷
 * @author Jim Green
 *
 */
@Document(collection = "questionnaire")
public class Questionnaire implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 问卷id
	 */
	@Id
	private String quesnaireId;
	
	/**
	 * 发布者用户id
	 */
	@Field("publish_userId")
	private Integer publishUserId;
	
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
	 * 发布总数
	 */
	@Field("publish_total")
	private Integer publishTotal;
	
	/**
	 * 领取总数
	 */
	@Field("receive_total")
	private Integer receiveTotal;
	
	/**
	 * 完成总数
	 */
	@Field("complete_total")
	private Integer completeTotal;
	
	/**
	 * 任务进度状态
	 */
	@Field("task_status")
	private Integer taskStatus;
	
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
	
	
	/**
	 * 完成时间
	 */
	@Field("complete_time")
	private Date completeTime;
	
	
	public String getQuesnaireId() {
		return quesnaireId;
	}

	public void setQuesnaireId(String quesnaireId) {
		this.quesnaireId = quesnaireId;
	}

	public Integer getPublishUserId() {
		return publishUserId;
	}

	public void setPublishUserId(Integer publishUserId) {
		this.publishUserId = publishUserId;
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

	public Integer getPublishTotal() {
		return publishTotal;
	}

	public void setPublishTotal(Integer publishTotal) {
		this.publishTotal = publishTotal;
	}

	public Integer getReceiveTotal() {
		return receiveTotal;
	}

	public void setReceiveTotal(Integer receiveTotal) {
		this.receiveTotal = receiveTotal;
	}

	public Integer getCompleteTotal() {
		return completeTotal;
	}

	public void setCompleteTotal(Integer completeTotal) {
		this.completeTotal = completeTotal;
	}

	public Integer getTaskStatus() {
		return taskStatus;
	}

	public void setTaskStatus(Integer taskStatus) {
		this.taskStatus = taskStatus;
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

	public Date getCompleteTime() {
		return completeTime;
	}

	public void setCompleteTime(Date completeTime) {
		this.completeTime = completeTime;
	}

	@Override
	public String toString() {
		return "Questionnaire [quesnaireId=" + quesnaireId + ", publishUserId=" + publishUserId + ", quesName="
				+ quesName + ", questionList=" + questionList + ", publishTotal=" + publishTotal + ", receiveTotal="
				+ receiveTotal + ", completeTotal=" + completeTotal + ", taskStatus=" + taskStatus + ", status="
				+ status + ", createTime=" + createTime + ", completeTime=" + completeTime + "]";
	}
}
