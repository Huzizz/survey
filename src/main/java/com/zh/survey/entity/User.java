package com.zh.survey.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


@Document(collection = "user")
public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 用户id
	 */
	@Id
	private String userId;
	
	/**
	 * 昵称 
	 */
	@Field("nick_name")
	private String nickName;
	
	/**
	 * 手机号码
	 */
	@Field("phone")
	private Long phone;
	
	/**
	 * 可用状态
	 */
	@Field("status")
	private Integer status;

	/**
	 * 创建时间
	 */
	@Field("create_time")
	private Date createTime;
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
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
		return "User [userId=" + userId + ", nickName=" + nickName + ", phone=" + phone + ", status=" + status
				+ ", createTime=" + createTime + "]";
	}


	
}
