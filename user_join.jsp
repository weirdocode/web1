<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>BBS Test</title>


<!--회원가입 폼만 적용되는 css-->
<style type="text/css">
.table-striped>tbody>tr {
	background-color: #f9f9f9
}

.join-form {
	margin: 0 auto;
	padding: 20px;
	width: 50%;
	float: none;
	background-color: white;
}

.form-group>.sel {
	width: 120px;
	display: inline-block;
}
</style>



</head>

<body>

	<!--header -->


	<%@ include file="../include/header.jsp"%>

	<section>
		<div class="container">
			<div class="row">
				<div class="col-lg-6 col-md-9 col-sm-12 join-form">
					<h2>
						회원가입<small>(가운데정렬)</small>
					</h2>

					<form action="/SemiProject/login.user" method="post"
						name="reg_form">
						<div class="form-group">
							<label for="id">아이디</label> <input type="text" name="id"
								class="form-control" id="id" placeholder="아이디를 (영문포함 4~12자 이상)">


						</div>
						<div class="form-group">
							<label for="password">비밀번호</label> <input type="password"
								class="form-control" id="pw" name="pw"
								placeholder="비밀번호 (영 대/소문자, 숫자, 특수문자 3종류 이상 조합 8자 이상)">
						</div>
						<div class="rm-group">
							<label for="password-confrim">비밀번호 확인</label> <input
								type="password" class="form-control" name="pw_check" id="pwcon"
								placeholder="비밀번호를 확인해주세요.">
						</div>


						<div class="form-group">
							<label for="name">이름</label> <input type="text" name="name"
								class="form-control" id="name" placeholder="이름을 입력하세요.">
						</div>
						<!--input2탭의 input-addon을 가져온다 -->
						<div class="form-group">
							<label for="hp">휴대폰번호</label><br> <input id="phone"
								class="form-control sel" placeholder="010-xxxx-xxxx" size="13"
								name="phone">



						</div>
						<div class="form-group">
							<label for="hp">이메일</label><br> <input
								class="form-control sel" name = "email2">@ <select name="email"
								class="form-control sel">
								<option value="naver.com">naver.com</option>
								<option value="gmail.com">gmail.com</option>
								<option value="daum.net">daum.net</option>
							</select>
						</div>

						<div class="form-group">
							<label for="addr-num">주소</label> <input type="text"
								name="address" class="form-control" id="addr-basic"
								placeholder="기본주소">
						</div>
						<div class="form-group">
							<input type="text" class="form-control" id="addr-detail"
								placeholder="상세주소">
						</div>
						<div class="form-group">
							<button type="button" id="join-btn" class="btn btn-lg btn-success btn-block">회원가입</button>
						</div>
						<div class="form-group">
							<button type="button" class="btn btn-lg btn-info btn-block"
								onclick="location href= '/SemiPriject_LoginGo.user/'">로그인</button>
						</div>
					</form>
				</div>
			</div>
		</div>


	</section>

	<!--footer -->
	<%@ include file="../include/footer.jsp"%>

	<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
	<script src="../js/bootstrap.js"></script>

	<script>
		
		document.getElementById("join-btn").onclick = function() {
			if(document.getElementById("id").value <  4){
				alert('아이디는 4자리보다 커야한다..');
				return;
			}
			
			if(document.getElementById("pw").value == '') {
				alert("비밀번호는 필수사항");
				return;
			}
			
			if(document.getElementById("pwcon").value == '') {
				alert("비밀번호 체크사항 입력");
				return;
			}
				
	
			if(document.getElementById("pw").value != document.getElementById("pwcon").value) {
				alert('비밀번호는 서로 같아야한다.');
				return;
			}
			if(document.getElementById("name").value == ''){
				alert('이름은 필수 입력 사항입니다.');
			}
			
			var regPhone = /^01([0|1|6|7|8|9])-?([0-9]{3,4})-?([0-9]{4})$/;
	         if(regPhone.test(document.getElementById("phone").vlaue) == true){
	            alert("휴대전화 번호를 확인해주세요");
	            return
	         }
			document.reg_form.submit();
		}
	
								
	 </script>

</body>

</html>