package com.shinnal.spring.ex.mybatis.repository;

import org.apache.ibatis.annotations.Mapper;

import com.shinnal.spring.ex.mybatis.domain.Review;

@Mapper
public interface ReviewRepository {
	
	// id가 5인 행 조회
	public Review selectReview();

}
