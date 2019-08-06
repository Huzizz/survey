package com.zh.survey.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@RequestMapping("user")
	public Map<String,Object> getData(@RequestParam Map<String,Object> map){
		map.put("hello", "world");
		return map;
	}
	
	@RequestMapping("test")
	public String test(@RequestParam Map<String,Object> map){
		System.out.println(map);
		return "test";
	}
}
