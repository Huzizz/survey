package com.zh.survey.controller;

import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.zh.survey.constant.ResponseStatus;
import com.zh.survey.util.RedisUtil;


@RestController
public class UserController extends BaseController{

	@Autowired
	private RedisUtil redisUtil;
	
	@RequestMapping("login")
	public Map<String,Object> getData(@RequestParam Map<String,Object> map){

		if(!checkObject(new String[] {"phone"},map)) {
			return responseData(ResponseStatus.NO_PARAMETER);
		};
		
		return map;
	}
	
	
}
