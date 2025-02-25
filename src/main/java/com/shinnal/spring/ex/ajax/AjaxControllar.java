package com.shinnal.spring.ex.ajax;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AjaxControllar {

	
	// 데이터를 담은 response 구성하는 페이지 (json)
	// API <-> View (html) 서로 응답의 형태가 다름
	// 이름과 생년월일을 전달 받고,
	// 이름과 나이를 json을 응답에 답는 페이지
	@ResponseBody
	@GetMapping("/ajax/person")
	public Map<String, Object> personInfo(
			@RequestParam("name") String name
			, @RequestParam("birthday") String birthday) {
		
		int year = Integer.parseInt(birthday.substring(0, 4));
		
		int age = 2025 - year + 1;
		
		// {"name":"김인규", "age":29}
		
		Map<String, Object> personMap = new HashMap<>();
		personMap.put("name", name);
		personMap.put("age", age);
		
		return personMap;
		
	}
	
	@GetMapping("/ajax/ex01")
	public String ex01() {
		
		return "ajax/ex01";
	}
	
	
}
