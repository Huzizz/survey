package com.zh.survey.controller;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import com.zh.survey.constant.ResponseStatus;

public class BaseController {

	public static final String resultCode = "resultCode";
	public static final String resultMessage = "resultMessage";
	public static final String resultData = "resultData";
	
	/**
	 * 检查map中是否存有数组中的元素
	 */
	public boolean checkObject(String [] paras,Map<String,Object> map) {
		
		if(paras.length == 0 ||map == null || map.size() == 0) {
			return false;
		}
		for(String key : paras) {
			Object value = map.get(key);
			if(value == null || StringUtils.isNotBlank(value.toString())) {
				return false;
			}
		}
		return true;
	}
	
	
	public Map<String,Object> responseData(ResponseStatus responseStatus){
		
		return responseData(responseStatus,null);
	}
	
	public Map<String,Object> responseData(ResponseStatus responseStatus,Object object){
		Map<String,Object> map = new HashMap<>();
		map.put(resultCode, responseStatus.getCode());
		map.put(resultMessage, responseStatus.getMessage());
		if(object != null) {
			map.put(resultData, object);
		}
		return map;
	}
}
