package com.my.spring.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class AppConfig implements WebMvcConfigurer {
	@Value("${attachPath}")
	private String attachPath;
	
	@Override //model없이 view만 return할거야. 할때 사용한다.
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("ch01/main");
		registry.addViewController("/ch02/ex03/user").setViewName("ch02/ex03/userIn");
	}
	// res/duke.gif 가 들어오면 WEB-INF/res/duke.gif 로 바꾼다.
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("res/**").addResourceLocations("WEB-INF/res/");
		registry.addResourceHandler("attach/**").addResourceLocations("file:///" + attachPath + "/");
	}
}
