package com.shinnal.spring.ex.mybatis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shinnal.spring.ex.mybatis.domain.Review;
import com.shinnal.spring.ex.mybatis.repository.ReviewRepository;

@Service
public class ReviewService {
	
	@Autowired
	private ReviewRepository reviewRepository;
	
	// 전달 받은 id와 일치하는 리뷰정보 얻어오기
	public Review getReview(int id) {

		// new_review 테이블에서 전달한 id와 일치하는 행 조회 -> repository에서 조회
		Review review = reviewRepository.selectReview(id);
		
		return review;
	}

}
