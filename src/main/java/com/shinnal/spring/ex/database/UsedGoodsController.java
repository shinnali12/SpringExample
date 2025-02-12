package com.shinnal.spring.ex.database;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shinnal.spring.ex.database.domain.UsedGoods;
import com.shinnal.spring.ex.database.service.UsedGoodsService;


// request, response 처리
@Controller
public class UsedGoodsController {
	
	@Autowired // 객체를 자동으로 생성해줌 Spring Bean으로 등록해야 사용 가능- 어노테이션을 통해 등록
	private UsedGoodsService usedGoodsService;
	
	// used_goods 테이블의 모든 행을 response에 담는다
	@ResponseBody
	@RequestMapping("/db/usedgoods/list")
	public List<UsedGoods> usedGoodsList() {
		// 중고물품 게시글 정보 얻어오기 -> service에서 수행
		List<UsedGoods> usedGoodsList = usedGoodsService.getUsedGoodsList();
		
		return usedGoodsList;
		
	}

}
