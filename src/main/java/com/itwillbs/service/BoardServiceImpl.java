package com.itwillbs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itwillbs.domain.BoardVO;
import com.itwillbs.persistence.BoardDAO;

@Service
public class BoardServiceImpl implements BoardService {

	// DAO 객체 필요 => 객체 주입
	@Autowired
	private BoardDAO bdao;
	@Override
	public void insertBoard(BoardVO vo) throws Exception {
		// DAO - 글정보 저장 기능 호출
		bdao.createBoard(vo);
	}
	@Override
	public List<BoardVO> getListAll() throws Exception {
		// DAO-글목록 가져오는 동작
		return bdao.readBoardListAll();
	}
	@Override
	public void upViewcnt(Integer bno) throws Exception {
		bdao.updateViewcnt(bno);		
	}
	@Override
	public BoardVO getBoard(Integer bno) throws Exception {
		
		return bdao.readBoard(bno);
	}
	@Override
	public void modifyBoard(BoardVO uvo) throws Exception {
		bdao.updateBoard(uvo);		
	}
	@Override
	public void removeBoard(Integer bno) throws Exception {
		bdao.deleteBoard(bno);
		
	}
	
	
	
}
