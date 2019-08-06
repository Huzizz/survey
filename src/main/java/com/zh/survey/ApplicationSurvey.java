package com.zh.survey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.zh.survey"})
public class ApplicationSurvey {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationSurvey.class, args);
	}
}
