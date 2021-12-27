<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="css/bootstrap.css">
    <link rel="stylesheet" href="css/custom.css">
    
</head>
<body>

	<!--header -->


	 <%@ include file="../include/header.jsp" %>
    
<section>
        <div class="container">
            <div class="row join-wrap">
                <!--join-form을 적용한다 float해제 margin:0 auto-->
                <div class="col-xs-12 col-md-9 join-form">
                    
                    <div class="titlebox">
                        MEMBER INFO                    
                    </div>
                    
                    <p>*표시는 필수 입력 표시입니다</p>
                   <form action="/SemiProject/updateUser.user" method="post">
                    <table class="table">
                    	
	                        <tbody class="m-control">
	                            <tr>
	                                <td class="m-title">*ID</td>
	                                <td><input class="form-control input-sm" name ="id" value="${user.id}" readonly="readonly"></td>
	                            </tr>
	                            <tr>
	                                <td class="m-title">*이름</td>
	                                <td><input class="form-control input-sm" value="${user.name}" readonly="readonly"></td>
	                            </tr>
	                            <tr>
	                                <td class="m-title">*비밀번호</td>
	                                <td><input class="form-control input-sm"$value="${user.pw}"></td>
	                            </tr>
	                            <tr>
	                                <td class="m-title">*비밀번호확인</td>
	                                <td><input class="form-control input-sm"></td>
	                            </tr>
	                            <tr>
	                                <td class="m-title">*E-mail</td>
	                                <td>
	                                    <input class="form-control input-sm" value="${user.email }" name ="email">@
	                                    <select class="form-control input-sm sel">
	                                        <option>naver.com</option>
	                                        <option>gmail.com</option>
	                                        <option>daum.net</option>
	                                    </select>
	                                </td>
	                            </tr>
	                            <tr>
	                                <td class="m-title">*휴대폰</td>
	                                <td>
	                                    <input class="form-control" type="text" size="13" value="${user.phone}" name ="phone" > 
	                                  
	                                </td>
	                            </tr>
	                            <tr>
	                                <td class="m-title">*주소</td>
	                                <td><input class="form-control input-sm add" value ="${user.address}" name = "address"></td>
	                            </tr>
	                            <tr>
	                                <td class="m-title">*상세주소</td>
	                                <td><input class="form-control input-sm add"></td>
	                            </tr>
	                        </tbody>
                    </table>
                    
                    <div class="titlefoot">
                        <button type="submit" class="btn">수정</button>
                        <button class="btn">목록</button>
                    </div>
                    </form>
                </div>

			
            </div>

        </div>

    </section>
    
    	<!--footer -->
	 <%@ include file="../include/footer.jsp" %>
    
    	<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
    <script src="../js/bootstrap.js"></script>
             
</body>
</html>