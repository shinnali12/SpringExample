package com.shinnal.spring.ex.database.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.shinnal.spring.ex.database.domain.UsedGoods;

// 데이터베이스 관련 처리 
// Mybatis Framework
@Mapper
public interface UsedGoodsRepository {
	
	// used_goods 테이블 모든 행 조회 -> domain
	public List<UsedGoods> selectUsedGoodsList();
	

}
