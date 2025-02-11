package com.shinnal.spring.ex.lifecycle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Ex02Controller {
	
	@RequestMapping("/lifecycle/ex02/1")
	public String thymeleafResponse() {
		// html 파일 경로를 리턴
		// src/main/resources/templates 생략
		// .html 확장자 생략
		return "lifecycle/ex02";
	}

}
