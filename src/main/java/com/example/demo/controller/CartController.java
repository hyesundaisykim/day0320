package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.db.DBManager;
import com.example.demo.vo.CartVo;

@RestController
public class CartController {
	
	@RequestMapping("/insertCart")
	public String insertCart(CartVo c) {
		String str = "ok";
		DBManager.insertCart(c);
		System.out.println("장바구니에 담긴 상품번호 : "+c.getGno());
		return str;
	} 
}