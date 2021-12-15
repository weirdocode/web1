<%@page import="kr.co.jsp.user.model.UserDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <%
    	request.setCharacterEncoding("utf-8");
    
    	String id = request.getParameter("id");
    	
    	UserDAO dao = UserDAO.getInstance();
    	
    	if(dao.confirmId(id)) { //아이디가 중복됨! %>
    		<script>
    			alert("아이디가 중복되었습니다.");
    			history.back();
    		</script>
    <%  } else { //아이디가 중복되지 않음! 
    		//회원 가입 처리가 들어가면 됩니다.
    	}
    %>
    
    
    
    
    
    
    
    
    
    
    
    
    