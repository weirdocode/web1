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
		<form action="req_album_result.jsp">
			<table border="1">
				<tr>
					<th></th>
					<th>앨범 커버</th>
					<th>가수</th>
					<th>앨범 제목</th>
					<th>발매일</th>
				</tr>
				<tr>
					<td>
						<input type="radio" name="title" value="sel1">
					</td>
					<td>
						<img alt="pic1" src="showme1.jpg" width="100px" height="100px">
					</td>
					<td>BE'O (비오)</td>
					<td>리무진 (Feat. MINO) (Prod. GRAY)</td>
					<td>2021.11.20</td>
				</tr>
				<tr>
					<td>
						<input type="radio" name="title" value="sel2">
					</td>
					<td>
						<img alt="pic2" src="showme2.jpg" width="100px" height="100px">
					</td>
					<td>sokodomo</td>
					<td>회전목마 (Feat. Zion.T, 원슈타인) (Prod. Slom)</td>
					<td>2021.11.13</td>
				</tr>
				<tr>
					<td colspan="5">
						<input type="submit" value="확인">
					</td>
				</tr>
				
			</table>
		</form>
	</div>



</body>
</html>





















