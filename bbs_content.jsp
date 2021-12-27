<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

	 <meta http-equiv="content-type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <title>BBS Test</title>
</head>
<body>
	 <%@ include file="../include/header.jsp" %>
    
     <section>
        <div class="container">
            <div class="row">
                <div class="col-lg-8 col-md-10 col-sm-12 join-form">
                    <h2>게시판 상세보기<small>(디자인이궁금하세요?)</small></h2>
                    
      

                    <form action="/SemiProject/delete.board">
                        <div class="form-group">
                            <label>등록일</label>
                            <input type="text" class="form-control" value="${content.regDate}" readonly>
                        </div>
                        <div class="form-group">
                            <label>글번호</label>
                            <input type="text" class="form-control" name = "id" value="${content.id}" readonly>
                        </div>
                        <div class="form-group">
                            <label>조회수</label>
                            <input type="text" class="form-control" value="${content.hit}" readonly>
                        </div>
                        <div class="form-group">
                            <label>글쓴이</label>
                            <input type="text" class="form-control" value="${content.writer}" readonly>
                        </div>
                       
                        <div class="form-group">
                            <label>제목</label>
                            <input type="text" class="form-control" value="${content.title}" readonly>
                        </div>
                        <div class="form-group">
                            <label>내용</label>
                            <textarea class="form-control" rows="5" readonly>${content.content}</textarea>
                        </div>
                        
                        <!--구현로직: 버튼은 온클릭을 사용하던 자바스크립트를 이용해야 합니다-->
                        <c:choose>
                      	  <c:when test="${user != null}">	
                        <div class="form-group">
                            <button type="button" class="btn btn-success" onclick="location.href='/SemiProject/list.board'">목록</button>
                           	<button type="sumiit" class="btn btn-default"  onclick="confirm('정말 삭제 하시 겠습니까?'); return;">삭제</button>
                            <button type="button" class="btn btn-info" onclick="location.href='/SemiProject/modify.board?bId=${content.id}'">수정</button>
                          </div>
                         
                            </c:when>
                          <c:otherwise>
                           <div class="form-group">
                            <button type="button" class="btn btn-success" onclick="location.href='/SemiProject/list.board'">목록</button>
                            <button type="button" class="btn btn-info" onclick="location.href='/SemiProject/LoginGo.user'">로그인</button>
                          </div>
                          </c:otherwise>
                          </c:choose>


                    </form>
                </div>
            </div>
        </div>


        </section>
    
        <%@ include file="../include/footer.jsp" %>

</body>
</html>