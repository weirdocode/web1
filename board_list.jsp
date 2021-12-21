﻿<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	tbody{
		font-size: 20px;
	}
</style>

</head>
<body>

	<%--
		로그인하지 않은 사용자가 게시판에 들어왔을 경우 돌려보내는 코드를 작성
	 --%>
	 <c:if test="${user == null}">
	 	<script>
	 		alert('회원만 이용 가능한 게시판 입니다. 로그인 해 주세요.');
	 		// board_list.jsp로 직접 요청이 들어가는 경우는 없기 때문에
	 		// 컨트롤러를 기준으로 상대 경로로 작성하시든지, 절대경로를 사용합니다.
	 		location.href="user/user_login.jsp";
	 	</script>
	 </c:if>
	 
	 <c:if test="${searchFail}">
	 	<script>
	 		alert("조회 결과가 없습니다.");
	 		location.href="/MyWeb/list.board";
	 	</script>
	 </c:if>


	<jsp:include page="../include/header.jsp"/>

	<div class="container">
		<h2>My Web게시판</h2>

		<table class="table table-secondary table-hover table-bordered">
			<thead style="font-size: 25px">
				<tr>
					<th>글 번호</th>
					<th>작성자</th>
					<th>제목</th>
					<th>날짜</th>
					<th>조회수</th>
				</tr>
			</thead>

			
			<tbody>
				<c:forEach var="b" items="${boardList}">
					<tr>
						<td>${b.boardId}</td>
						<td>${b.writer}</td>
						<td>
							<a href="/MyWeb/content.board?bId=${b.boardId}">${b.title}</a>
							&nbsp;&nbsp;
							<c:if test="${b.newMark}">
								<img alt="newMark" src="/MyWeb/img/icon_new.gif">
							</c:if>
						</td>
						<td>
							<fmt:formatDate value="${b.regDate}" pattern="yyyy년 MM월 dd일 a hh시 mm분"/>
						</td>
						<td>${b.hit}</td>
					</tr>
				</c:forEach>
			</tbody>
			
			
			
			<tbody>
				<tr>
					<td colspan="5" align="right">
						<form action="/MyWeb/search.board" class="form-inline" >
						  <div class="form-group">
						  	<select name="category" class="form-control">
						  		<option value="title">제목</option>
						  		<option value="writer">작성자</option>
						  		<option value="content">내용</option>
						  	</select>
						    <input type="text" name="search" placeholder="검색어 입력" class="form-control" >
						  	<input type="submit" value="검색" class="btn btn-default">
							<input type="button" value="글 작성" class="btn btn-default" onclick="location.href='/MyWeb/write.board'">
						  </div>
						</form> 
					</td>
				</tr>
			</tbody>
		
		</table>
	</div>

	<jsp:include page="../include/footer.jsp"/>

</body>
</html>







