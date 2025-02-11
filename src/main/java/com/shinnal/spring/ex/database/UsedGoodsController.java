package com.shinnal.spring.ex.database;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


// request, response 처리
@Controller
public class UsedGoodsController {
	
	// used_goods 테이블의 모든 행을 response에 담는다
	@RequestMapping("/db/usedgoods/list")
	public usedGoodsList() {
		// 중고물품 게시글 정보 얻어오기
		
		
	}

}
