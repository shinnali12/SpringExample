package com.shinnal.spring.ex.mvc.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.shinnal.spring.ex.mvc.domain.User;

@Mapper
public interface UserRepository {

	
	// 사용자 정보를 전달 받고 new_user 테이블 한행 삽입
	public int insertUser(
			@Param("name") String name
			, @Param("birthday") String birthday
			, @Param("email") String email
			, @Param("introduce") String introduce);
	
	public int insertUserByObject(User user);
	
	
	// 가장 최근에 등록된 행 조회
	public User selectLastUser();
	
	
	// 전달받은 email 과 일치하는 행의 개수 조회
	public int selectCountByEmail(@Param("email") String email);
	
}
