<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%--
		- /selectOne 요청을 통해 해당 학번을 가진 학생의 성적 정보를 조회하여
		search-result.jsp에 한 학생의 모든 정보를 적절하게 출력하세요. (디자인은 안하셔도 됩니다.)
	 --%>
	 
	 <form action="/db/score/selectOne">
	 	<p>
	 		# 조회할 학번: <input type="text" name="stuNum" size="5">
	 		<input type="submit" value="확인">
	 	</p>
	 </form>
	 
	 <%-- 사용자가 입력한 학번의 학생이 없다면 "학번 정보가 없습니다." 메세지를 띄워보세요. 
	 	  입력받은 학번의 학생이 없는지를 파악하는 법: DB 대용으로 사용하고 있는 리스트의 크기를 얻어내서
	 	  									 입력받은 값보다 큰지 작은지를 비교하면 됩니다.
	 --%>
	 <p style="color: red;">
	 	${msg}
	 </p>

</body>
</html>



















