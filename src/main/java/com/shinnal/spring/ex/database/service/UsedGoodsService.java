package com.shinnal.spring.ex.database.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shinnal.spring.ex.database.domain.UsedGoods;
import com.shinnal.spring.ex.database.repository.UsedGoodsRepository;

// 로직(business) 담당
// 데이터 가공
// 그외 복잡한 기능 수행
// Controller에서 필요한 기능 수행

@Service
public class UsedGoodsService {
	
	// 해당 멤버변수에 Spring이 자동으로 객체를 생성해서 <주입> 해준다!!
	@Autowired
	private UsedGoodsRepository usedGoodsRepository;
	
	// 중고물품 게시글 모두 얻어오기
	public List<UsedGoods> getUsedGoodsList() {
		// used_goods 테이블 모든 행 조회 -> repository에서 수행
		
		List<UsedGoods> usedGoodsList = usedGoodsRepository.selectUsedGoodsList();
		// 데이터 가공 과정이 들어갈 수 있다.
		return usedGoodsList;
		
		
	}

}
