<%@page import="user.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    	User user = (User) session.getAttribute("login");
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<% if(user == null) { %>

		<form action="login_controller.jsp" method="post">
			<input type="text" name="account" placeholder="아이디"> <br>
			<input type="password" name="password" placeholder="비밀번호"> <br>
			<input type="submit" value="로그인">
			<button type="button" onclick="location.href='register_form.jsp'">회원가입</button>
			<%--
				onclick 속성을 사용하면 해당 태그가 클릭 되었을 시에 동작할
				자바스크립트 문법을 작성할 수 있습니다.
				자바스크립트는 문자열을 "", '' 둘 다 인정합니다.
			 --%>
		</form>
	
	<% } else { %>
		<h2><%=user.getName() %>님이 현재 로그인 중입니다.</h2>
		<a href="login_welcome.jsp">웰컴 페이지로</a>
	<% } %>

</body>
</html>














