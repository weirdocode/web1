<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    	String title = request.getParameter("title");
    %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<% if(title.equals("sel1")) { %>
			
			<div align="center">
				<h2>선택하신 앨범 정보</h2>
				<hr>
				<p>
					당신이 선택하신 앨범은 BE'O(비오) 의 <strong>리무진 (Feat. MINO) (Prod. GRAY)</strong> 입니다.
				</p>
				<hr>
				<h3>타이틀 곡 뮤직 비디오</h3>
				<iframe width="800" height="600" src="https://www.youtube.com/embed/8Acx4qioj64?autoplay=1" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
				
			</div>
			
	<% } else if(title.equals("sel2")) { %>
			<div align="center">
				<h2>선택하신 앨범 정보</h2>
				<hr>
				<p>
					당신이 선택하신 앨범은 sokodomo 의 <strong>회전목마 (Feat. Zion.T, 원슈타인) (Prod. Slom)</strong> 입니다.
				</p>
				<hr>
				<h3>타이틀 곡 뮤직 비디오</h3>
				<iframe width="800" height="600" src="https://www.youtube.com/embed/an2Jh3ouLz8?autoplay=1" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
				
			</div>
	<% } %>

</body>
</html>
















