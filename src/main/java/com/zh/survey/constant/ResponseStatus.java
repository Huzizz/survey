package com.zh.survey.constant;

public enum ResponseStatus {
	
	SUCCESS(200,"success"),
	
	UN_LOGIN(601,"用户未登录！"),

	NO_PARAMETER(602,"缺少必要参数！"),
	
	SERVICE_BUSY(603,"服务器繁忙，请稍后再试！");
	
	private final int code;
	
			
	/**
	 * code说明
	 */
	private final String message;
	
	ResponseStatus(int code,String message){
		this.code = code;
		this.message = message;
	}
	
	public int getCode() {
		return code;
	}
	
	public String getMessage() {
		return message;
	};
	
}
