package com.itwillbs.domain;

import lombok.Data;

//@Data
public class PageVO {
	// 페이지정보 저장 객체
	// 페이지정보
	private int page;
	// 페이지 크기(한페이지에 출력될 크기)
	private int pageSize;
	
	public PageVO() {
		// 페이징처리의 기본값 설정
		this.page = 1;
		this.pageSize = 10;
	}

	public void setPage(int page) {
		if(page <= 0) {
			this.page = 1;
			return;
		}
		
		this.page = page;
	}
	public void setPageSize(int pageSize) {
		if(pageSize <= 0 || pageSize > 100) {
			this.pageSize = 10;
			return;
		}
		this.pageSize = pageSize;
	}
	
	// get()는 mapper에서 #{ㅇㅇㅇ}사용
	// => VO객체의 getㅇㅇㅇ() 메서드를 의미함.
	public int getPage() {
		return page;
	}
	public int getPageSize() {
		return pageSize;
	}
	
	// 페이지에 따른 시작인덱스 계산
	// mapper에서만 사용되는 메서드
	public int getStartPage() {
		return (this.page - 1) * pageSize;
	}
	
	// 페이지 정보에 따른 인덱스 정보
	// private int pageIndex; (저장x)

	@Override
	public String toString() {
		return "PageVO [page=" + page + ", pageSize=" + pageSize + "]";
	}
	
	
	
	
	
}
