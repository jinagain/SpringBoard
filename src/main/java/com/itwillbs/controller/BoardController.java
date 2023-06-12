package com.itwillbs.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/board/*")
public class BoardController {
	
	
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	// 글쓰기 - /board/regist (GET)
	// http://localhost:8088/board/regist
	@RequestMapping(value = "/regist", method = RequestMethod.GET)
	public void registGET() throws Exception{
		logger.debug(" registGET() 호출! ");
		logger.debug(" /board/regist.jsp 페이지 이동");
	}
	// 글쓰기 - /board/regist (POST)
	@RequestMapping(value = "/regist", method = RequestMethod.POST)
	public void registPOST() throws Exception{
		logger.debug(" registPOST() 호출! ");
	}
	
}
