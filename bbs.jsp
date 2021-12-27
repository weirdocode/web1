<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <title>BBS Test</title>
        <!--게시판만 적용되는 css-->            
        <style>

            .table-striped > tbody > tr {
                background-color: rgba(255, 255, 255)
            }
            .row h2 {
                color: aliceblue;
                
            }
            .pagination-sm {
                margin: 0;
            }
            
        </style>
    </head>

    <body>
    
        <!--header -->


	 <%@ include file="../include/header.jsp" %>
	 
    <section>
        
        <div class="container">
            <div class="row">
                
                <h2>게시판 목록</h2>
                <table class="table table-striped" style="text-align: center; border: 2px solid #737373">
                    <thead>
                        <tr>
                            <th style="background-color: #9DCAFF; text-align: center;">번호</th>
                            <th style="background-color: #9DCAFF; text-align: center;">제목</th>
                            <th style="background-color: #9DCAFF; text-align: center;">작성자</th>
                            <th style="background-color: #9DCAFF; text-align: center;">작성일</th>
                            <th style="background-color: #9DCAFF; text-align: center;">조회수</th>
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

                    <div class="text-center">
                    <ul class="pagination pagination-sm">
                    <%--이전 --%>
                    <c:if test="${pc.prev}">
                        <li><a href="/SemiProject/list.board?page=${pc.beginPage-1}&countPerPage=${pc.paging.countPerPage}">이전</a></li>
                     </c:if>
                     <%--페이지 목록 --%>
                     <c:forEach var="pageNum" begin="${pc.beginPage}" end="${pc.endPage}">
                           <li class="active">
                           <a href="/SemiProject/list.board?page=${pageNum}&countPerPage=${pc.paging.countPerPage}"
                           style=" ${pageNum == pc.paging.page ? 'background-color: orange;' : ''}"
                               ${pageNum == pc.paging.page}>${pageNum}</a>
                           </li>
                     </c:forEach>
                     <%--다음 --%>
                        <c:if test="${pc.next}">
                           <li >
                             <a href="/SemiProject/list.board?page=${pc.endPage+1}&countPerPage=${pc.paging.countPerPage}"
                             
                              >다음</a>
                           </li>
                  </c:if>
                
                   <form action="/SemiProject/search.board">
                    	<div>
                    		<select name="category">
                    			<option value="title">제목</option>
                    			<option value="writer">작성자</option>
                    			<option value="content">내용</option>
                    		</select>
                    		<input type="text" name="search" placeholder="검색어 입력">
                    		<input type="submit" value="검색">
                    	</div>
                    </form>
                    <button class="btn btn-info pull-right" onclick="location.href='/SemiProject/write.board'">글쓰기</button>
                </div>
                
            </div>
        </div>
    </section>
        
 
        

	
	<!--footer -->
	<!--footer -->
	 <%@ include file="../include/footer.jsp" %>
		<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
    <script src="../js/bootstrap.js"></script>

</html>
