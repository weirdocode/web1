<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
        <meta http-equiv="content-type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>BBS Test</title>

</head>
<body>

	  <!--header -->
	 <%@ include file="../include/header.jsp" %>

     <section>
        <div class="container">
            <div class="row">
                <div class="col-lg-8 col-md-10 col-sm-12 join-form">
                    <h2>게시판 수정<small>(디자인이궁금하세요?)</small></h2>

                    <form action="/SemiProject/update.board">
                        <div class="form-group">
                            <label>글번호</label>
                            <input type="text" name=bId  class="form-control" value="${article.id}" readonly>
                        </div>
                        <div class="form-group">
                            <label>글쓴이</label>
                            <input type="text" name="writer" class="form-control" value="${user.id}" readonly>
                        </div>
                        <div class="form-group">
                            <label>제목</label>
                            <input type="text" name="title" class="form-control" value="${article.title}">
                        </div>
                        <div class="form-group">
                            <label>내용</label>
                            <textarea class="form-control" name="content" rows="5" >${article.content}</textarea>
                        </div>

                        <!--구현로직: 버튼은 온클릭을 사용하던 자바스크립트를 이용해야 합니다-->
                        <div class="form-group">
                            <button type="button" class="btn btn-success" onclick="location.href='/SemiProject/list.board'">목록</button>
                            <button type="submit" class="btn btn-info" >수정</button>
                            <button type="button" class="btn btn-default" onclick="location.href='/SemiProject/delete.board'">삭제</button>
                        </div>

                    </form>
                </div>
            </div>
        </div>


        </section>
	
		<!--footer -->
	 <%@ include file="../include/footer.jsp" %>
	 
        
    
</body>
</html>