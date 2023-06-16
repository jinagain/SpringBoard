package com.itwillbs.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.itwillbs.domain.BoardVO;
import com.itwillbs.service.BoardService;

@Controller
@RequestMapping(value = "/board/*")
public class BoardController {
	
	// 서비스 객체 주입
	@Autowired
	private BoardService service;
	
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
	public String registPOST(BoardVO vo, RedirectAttributes rttr) throws Exception{
		logger.debug(" registPOST() 호출! ");
		// 한글처리(필터)
		// 페이지 전달된 데이터 저장
		logger.debug("vo : {}", vo); // err레벨에서 사용권장
		// logger.error(msg);
		
		// 서비스 - 글쓰기 동작 호출
		service.insertBoard(vo);
		
		// 리스트로 정보를 전달 (rttr)
		rttr.addFlashAttribute("result", "CREATEOK");
		
		// 리스트페이지로 이동
//		return "redirect:/board/listAll?test=12345"; // Model객체(@ModelAttribute)
		return "redirect:/board/listAll";
	}
	
	// 게시판 글 목록
	@RequestMapping(value = "/listAll", method = RequestMethod.GET)
	public String listAllGET(Model model, @ModelAttribute("result") String result) throws Exception {
		logger.debug(" listAllGET() 호출 ");
		logger.debug(" result : " + result);
		// DB에 저장된 글 정보를 가져오기
		List<BoardVO> boardList = service.getListAll();
		logger.debug("boardList : " + boardList);		
		
		model.addAttribute("boardList", boardList);
		// 연결된 뷰페이지로 전달 (뷰-출력)
		return "/board/listAll";
	}
	
}
