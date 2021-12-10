<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

	<%--
		- 태그에 내부 스타일 시트 방식으로 디자인을 적용하려면
		선택자(selector)를 사용하여 지목해야 합니다.
		(위에서 미리 디자인을 지정해 놓고, 선택자를 이용해서 부여하는 방식)
		- 클래스 선택자: .클래스이름 -> 공통된 디자인을 적용할 때 사용.
		- 아이디 선택자: #아이디이름 -> 고유한 디자인을 적용할 때 사용.
		- 태그 선택자: 태그이름 -> 해당 태그에 모두 디자인을 적용할 때 사용.
	 --%>

<style>
	#login-btn {
		background-color: yellow;
		width: 60px;
		height: 50px;
		font-family: cursive;
		padding: 2px;	
	}
</style>


</head>
<body>

	<%--
		*CSS (Cascade Style Sheet)
		- CSS는 HTML에 디자인 요소를 적용하는 언어입니다.
		- CSS를 HTML에 적용하는 방법은 크게 3가지가 있습니다.
		
		1. 인라인 스타일 시트 - 태그 내부에 해당 태그에만 적용되는 스타일을 지정.
		2. 내부 스타일 시트 - 태그의 스타일을 HTML문서의 head태그에 따로 지정.
		3. 외부 스타일 시트 - 외부에 .css파일을 따로 만들어서 디자인 소스만 모두 지정한 뒤
		 나중에 HTML 문서 내부에서 링크를 통해 로딩시킴.
	 --%>


	<div align="center" style="border: 2px dotted red; padding:30px; width: 700px">
		
		<h3>sendRedirect 연습!</h3>
		
		<form action="res_login_con.jsp" method="post">
			<table border="1">
				<tr>
					<td>
						<input type="text" name="id" size="10" placeholder="ID를 입력">
					</td>
					<td rowspan="2">
						<input id="login-btn" type="submit" value="로그인">
					</td>
				</tr>
				<tr>
					<td>
						<input type="password" name="pw" size="10" placeholder="PW를 입력">
					</td>
				</tr>
			</table>
		</form>
		
	</div>



</body>
</html>

















