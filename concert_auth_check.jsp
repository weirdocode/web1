<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <%
    /*
	- 사용자가 입력한 인증코드와 랜덤으로 생성한(UUID객체로 생성한) 인증코드를
	 서로 비교하여 코드가 일치한다면 세션을 하나 생성 후 "concert_reserve.jsp"로
	 이동시켜 주세요.
	 세션 이름은 "auth_pass", 값: "true"
	 
	- 코드가 일치하지 않는다면 "인증코드가 일치하지 않습니다. 다시 입력해 주세요."
	 라는 경고창 출력 후 concert_auth.jsp로 이동시켜 주세요.
	*/
	
	//사용자가 입력한 인증번호
	String code = request.getParameter("code");
    
    //생성한 인증번호
    String aCode = (String) session.getAttribute("auth_code");
    
    if(code.equals(aCode)) {
    	session.setAttribute("auth_pass", "true");
    	response.sendRedirect("concert_reserve.jsp");
    } else {
    %>
    	<script>
    		alert("인증번호가 일치하지 않습니다. 다시 인증해 주세요.");
    		location.href="concert_auth.jsp";
    	</script>
    	
    <% } %>
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    