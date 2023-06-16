package com.itwillbs.service;

import java.util.List;

import com.itwillbs.domain.BoardVO;

public interface BoardService {
	// Board에서 수행하는 동작 선언
	
	// 글쓰기 - Create
	public void insertBoard(BoardVO vo) throws Exception;
	
	// 글 목록 조회 - Read
	public List<BoardVO> getListAll() throws Exception;
}
