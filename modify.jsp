<%@page import="kr.co.jsp.board.model.BoardDAO"%>
<%@page import="kr.co.jsp.board.model.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    	/*
    	사용자에게 본인이 썼던 글을 기본적으로 제공을 하고
    	원하는 항목만 수정할 수 있게끔 폼을 제공해야 하기 때문에
    	selectOne()메서드를 호출하여 글 번호에 해당하는 모든 정보를 얻어와야 합니다.
    	*/
    	int bId = Integer.parseInt(request.getParameter("bId"));
    	BoardVO vo = BoardDAO.getInstance().selectOne(bId);
    		
    %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1><%=vo.getBoardId() %>번 게시물 내용 수정</h1>
	
	<form action="modify_con.jsp" method="post">
	
		<%--
			hidden type은 브라우저에 input창을 노출하지 않고
			데이터를 전송할 때 사용하는 방법입니다.
		--%>
	
		<input type="hidden" name="bId" value="<%=vo.getBoardId()%>">
	
		# 작성자: <input type="text" name="writer" value="<%=vo.getWriter()%>" readonly> <br>
		
		# 제목: <input type="text" name="title" value="<%=vo.getTitle()%>"> <br>
		
		# 내용: <br>
		<textarea rows="5" name="content"><%=vo.getContent() %></textarea> <br>
		
		<input type="submit" value="수정">
	</form>

</body>
</html>
























