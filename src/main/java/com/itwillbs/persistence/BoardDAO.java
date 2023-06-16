package com.itwillbs.persistence;

import java.util.List;

import com.itwillbs.domain.BoardVO;

public interface BoardDAO {

	// Board관련된 DB동작 선언/호출
	
	// 글쓰기 - C
	public void createBoard(BoardVO vo) throws Exception;
	
	// 글 목록 조회 - R
	public List<BoardVO> readBoardListAll() throws Exception;
}
