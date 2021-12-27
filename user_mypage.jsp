<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    
    <style type="text/css">

    </style>
    
    
</head>
<!--header -->


<%@ include file="../include/header.jsp" %>
    
    
<section>
        <div class="container">
            <div class="row join-wrap">
                
                <div class="col-xs-12 col-md-9 join-form">
                    
                    <div class="titlebox">
                        MEMBER                   
                    </div>
                    <div>
                        <p>${user.id}님 회원정보</p>
                    </div>
                    <div>
                        <button type="button" class="btn btn-primary" onclick="location.href='/SemiProject/mypageinfo.user'">회원정보변경</button>
                        <button type="button" class="btn btn-primary" id="delCheck">회원 탈퇴</button>
                         
                    </div>
                    <div class="delete-hidden">
                        <form>
                        <input type="password" class="form-control" placeholder="비밀번호를 입력하세요">
                        <button type="button" class="btn btn-primary" >확인</button>
                        </form>
                    </div>
                    
                    <br>
                    <div>
                        <p>${user.id}님의 작성 게시물</p>
                        <table class="table table-striped" style="text-align: center; border: 2px solid #737373">
                    <thead>
                        <tr>
                            <th style="text-align: center;">번호</th>
                            <th style="text-align: center;">제목</th>
                            <th style="text-align: center;">작성자</th>
                            <th style="text-align: center;">작성일</th>
                            <th style="text-align: center;">조회수</th>
                        </tr>
                    </thead>
                        <tbody>
                    
                    <c:forEach var="b" items="${boardList}">
					<tr>
						<td>${b.id}</td>
						<td>
							<a href="/SemiProject/content.board?bId=${b.id}">${b.title}</a>
							&nbsp; &nbsp; <c:if test="${b.newMark}">
								<img alt="newMark" src="/SemiProject/img/icon_new.gif">
							</c:if></td>
						</td>
						<td>${b.writer}</td>
						<td>
							<fmt:formatDate value="${b.regDate}" />
						</td>
						<td>${b.hit}</td>
					</tr>
				</c:forEach>
                    
       
                    </tbody>
                </table>
                    </div>
                    
                    
                </div>


            </div>

        </div>

    </section>
    
    	<!--footer -->
	 <%@ include file="../include/footer.jsp" %>
    </body>

    
    
    
    <script>
        //탈퇴버튼 디스플레이 처리
        var delCheck = document.getElementById("delCheck");
        delCheck.onclick = function() {
            var del  = document.querySelector(".delete-hidden");
            if(del.style.display == "none" || del.style.display == "") {
                del.style.display = "inline";
            } else {
                del.style.display = "none";
            }
        }
    </script>
  
</body>
</html>