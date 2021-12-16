<%@page import="kr.co.jsp.user.model.UserDAO"%>
<%@page import="kr.co.jsp.user.model.UserVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <%
    /*
	1. 폼 데이터 처리 (기존 비번, 변경 비번)
	2. dao주소값을 받아오시고, userCheck()를 활용하여
	 기존 비번과 아이디 정보를 바탕으로 해당 비밀번호가 일치하는지를 검사.
	 (id는 세션에서 구해옵니다.)
	
	3. 기존 비밀번호가 일치한다면 비밀번호 변경 메서드 changePassword() 호출.
	4. "비밀번호가 정상적으로 변경되었습니다." 경고창 출력 후 mypage 이동.
	5. 현재 비밀번호가 불일치 -> "현재 비밀번호가 다릅니다." 경고창 출력 후 뒤로가기.
	*/
	
	String oldPw = request.getParameter("old_pw");
	String newPw = request.getParameter("new_pw");
	
	//String id = ((UserVO) session.getAttribute("user")).getId();
	UserVO vo = (UserVO) session.getAttribute("user");
	String id = vo.getId();
	
	UserDAO dao = UserDAO.getInstance();
	
	if(dao.userCheck(id, oldPw) == 1) {
		dao.changePassword(id, newPw); %>
		<script>
			alert("비밀번호가 정상적으로 변경되었습니다.");
			location.href="user_mypage.jsp";
		</script>
	<% } else { %>
		<script>
			alert("현재 비밀번호가 다릅니다.");
			history.back();
		</script>
	<% } %>
	
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    