<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../include/header.jsp" %>
	<h1>http://localhost:8088/board/listAll 호출</h1>
	<h1>/board/listAll.jsp</h1>
	
<%-- 	${boardList } --%>
	<h2> result : ${result }</h2>

	<script type="text/javascript">
	// DB - Service - Controller - View(jsp) -> JS -> AJAX
	var data = "${result}";
	if(data == "CREATEOK") {
		alert("글쓰기 성공!");
	}	
	</script>

	<div class="box">
		<div class="box-header with-border">
			<h3 class="box-title">Bordered Table</h3>
		</div>
	
		<div class="box-body">
			<table class="table table-bordered">
				<tbody>
					<tr>
						<th style="width: 10px">bno</th>
						<th>Title</th>
						<th>Writer</th>
						<th>Regdate</th>
						<th style="width: 60px">ViewCnt</th>
					</tr>
					<c:forEach var="vo" items="${boardList }">
					<tr>
						<td>${vo.bno }</td>
						<td>${vo.title }</td>
						<td>${vo.writer }</td>
						<td>${vo.regdate }</td>
						<td><span class="badge bg-olive">${vo.viewcnt }</span></td>
					<tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
<%@ include file="../include/footer.jsp" %>