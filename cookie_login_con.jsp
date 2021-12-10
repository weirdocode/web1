<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <%
    	request.setCharacterEncoding("utf-8");
    	
    	String id = request.getParameter("id");
    	String pw = request.getParameter("pw");
    	
    	if(id.equals("abc1234") && pw.equals("aaa1111")) {
    		Cookie loginCoo = new Cookie("login_cookie", id);
    		loginCoo.setMaxAge(5);
    		response.addCookie(loginCoo);
    		
    		if(request.getParameter("id_remember") != null) {
    			Cookie idMemory = new Cookie("remember_id", id);
    			idMemory.setMaxAge(30);
    			response.addCookie(idMemory);
    		}
    		
    		response.sendRedirect("cookie_welcome.jsp");
    	} else {
    		response.sendRedirect("cookie_login.jsp");
    	}
    	
    	
    %>
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    