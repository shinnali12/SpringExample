package com.shinnal.spring.ex.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shinnal.spring.ex.mybatis.domain.Review;
import com.shinnal.spring.ex.mybatis.service.ReviewService;

@Controller
public class ReviewController {
	
	@Autowired
	private ReviewService reviewService;
	
	// id가 5인 리뷰정보를 json으로 response에 담는다
	
	@ResponseBody
	@RequestMapping("/mybatis/review")
	public Review review() {
	
		// id가 5인 리뷰정보 얻어오기
		Review review = reviewService.getReview();
		
		return review;
		
	}
	
}
