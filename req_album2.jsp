<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style>
	table {
		width: 800px;
	}
	
	tr {
		text-align: center;
	}
</style>

</head>
<body>

	<div align="center">
			<table border="1">
				<tr>
					<th>앨범 커버</th>
					<th>가수</th>
					<th>앨범 제목</th>
					<th>발매일</th>
				</tr>
				<tr>
					<td>
						<img alt="pic1" src="showme1.jpg" width="100px" height="100px">
					</td>
					<td>BE'O (비오)</td>
					<td>
						<a href="req_album_result.jsp?title=sel1">리무진 (Feat. MINO) (Prod. GRAY)</a>
					</td>
					<td>2021.11.20</td>
				</tr>
				<tr>
					<td>
						<img alt="pic2" src="showme2.jpg" width="100px" height="100px">
					</td>
					<td>sokodomo</td>
					<td>
						<a href="req_album_result.jsp?title=sel2">회전목마 (Feat. Zion.T, 원슈타인) (Prod. Slom)</a>
					</td>
					<td>2021.11.13</td>
				</tr>
				
			</table>
	</div>



</body>
</html>





















