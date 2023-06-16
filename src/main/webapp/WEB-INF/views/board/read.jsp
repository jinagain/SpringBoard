<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="../include/header.jsp" %>
	<h1>read.jsp</h1>
	
<%-- 	${vo} --%>
	<div class="box box-primary">
		<div class="box-header with-border">
			<h3 class="box-title">ITWILL 게시판 본문(내용)</h3>
		</div>
			
		<!-- 수정(get-post)/삭제(post) 정보 전달용 -->
		<form role="form" id="fr">
			<input type="hidden" name="bno" value="${vo.bno }">
		</form>
		
		<div class="box-body">
			<div class="form-group">
				<label for="exampleInputEmail1">번  호</label> 
				<input type="text" name="title" class="form-control" id="exampleInputEmail1" readonly value="${vo.bno }">
			</div>		
			<div class="form-group">
				<label for="exampleInputEmail1">제  목</label> 
				<input type="text" name="title" class="form-control" id="exampleInputEmail1" readonly value="${vo.title }">
			</div>		
			<div class="form-group">
				<label for="exampleInputPassword1">이  름</label>
				<input type="text" name="writer" class="form-control" id="exampleInputPassword1" readonly value="${vo.writer }">
			</div>		
			<div class="form-group">
				<label>내  용</label>
				<textarea name="content" class="form-control" rows="3" readonly>${vo.content }</textarea>
			</div>
			
			<div class="box-footer">
				<button type="button" class="btn btn-danger">수정하기</button>
				<button type="button" class="btn btn-warning">삭제하기</button>
				<button type="button" class="btn btn-success">목록으로</button>
			</div>
		</div>
	</div>
	
	<script>
		$(document).ready(function() {
			// 폼태그 객체
			//$("#fr"); id 속성탐색
			var frObj = $("form[role='form']"); // 속성탐색 선택자
// 			console.log(frObj);
			
			$(".btn-danger").click(function() {
// 				location.href="/board/modify?bno=${vo.bno}";
				// 폼태그 사용해서 bno가지고, 수정페이지로 이동(GET)
				frObj.attr("action", "/board/modify");
				frObj.submit();
			});
			
			$(".btn-success").click(function() {
				location.href='/board/listAll';
			});
		});
	</script>
	
<%@include file="../include/footer.jsp" %>