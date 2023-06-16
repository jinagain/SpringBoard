<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/include/header.jsp"%>

	<h1>http://localhost:8088/board/regist 작성</h1>
	<h1>/board/regist.jsp</h1>
	
	<div class="box box-primary">
		<div class="box-header with-border">
			<h3 class="box-title">ITWILL 게시판 글쓰기</h3>
		</div>
	
	
		<!-- /board/regist (post) -->
		<form role="form" method="post">
			<div class="box-body">
				<div class="form-group">
					<label for="exampleInputEmail1">제  목</label> 
					<input type="text" name="title" class="form-control" id="exampleInputEmail1" placeholder="제목을 입력하세요">
				</div>
				
				<div class="form-group">
					<label for="exampleInputPassword1">이  름</label>
					<input type="text" name="writer" class="form-control" id="exampleInputPassword1" placeholder="이름을 입력하세요">
				</div>
				
				<div class="form-group">
					<label>내  용</label>
					<textarea name="content" class="form-control" rows="3" placeholder="Enter ..."></textarea>
				</div>
			</div>
	
			<div class="box-footer">
				<button type="submit" class="btn btn-success">Submit</button>
			</div>
		</form>
	</div>

<%@ include file="../include/footer.jsp"%>