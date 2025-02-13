package com.shinnal.spring.ex.mybatis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shinnal.spring.ex.mybatis.domain.Review;
import com.shinnal.spring.ex.mybatis.repository.ReviewRepository;

@Service
public class ReviewService {
	
	@Autowired
	private ReviewRepository reviewRepository;
	
	// id가 5인 리뷰정보 얻어오기
	public Review getReview() {
		 // new_review 테이블에서 id가 5인 행 조회 -> repository에서 조회
		
		Review review = reviewRepository.selectReview(5);
		
		return review;
	}

}
