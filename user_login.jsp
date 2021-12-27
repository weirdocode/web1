<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>BBS Test</title>

<!--login만 적용되는 css-->
<style>
.table-striped>tbody>tr {
	background-color: #f9f9f9
}

.join-form {
	margin: 100px auto;
	padding: 20px;
	width: 50%;
	float: none;
	background-color: white;
}
</style>
</head>

<body>

		<!--header -->
	 <%@ include file="../include/header.jsp" %>

	<section>
		<div class="container">
			<div class="row">
				<div class="col-lg-6 col-md-9 col-sm-12 join-form">
					<h2>
						로그인<small>(가운데정렬)</small>
					</h2>


					<form action="/SemiProject/loginSuccess.user">
						<div class="form-group">
							<label for="id">아이디</label> <input type="text" name= "id"
								class="form-control" id="id" placeholder="아이디">
						</div>
						<div class="form-group">
							<label for="password">비밀번호</label> <input type="password" name ="pw"
								class="form-control" id="password" placeholder="비밀번호 ">
						</div>

						<div class="form-group">
							<button type="button" class="btn btn-lg btn-success btn-block" onclick="location.href='/SemiProject/join.user'">회원가입</button>
						</div>

						<div class="form-group">
							<button type="submit" class="btn btn-lg btn-info btn-block">로그인</button>
						</div>
					</form>
				</div>
			</div>
		</div>


	</section>
 

</body>

</html>