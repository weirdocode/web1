package kr.co.jsp.user.service;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.jsp.user.model.UserDAO;
import kr.co.jsp.user.model.UserVO;

public class ChangePwService implements IUserService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		response.setContentType("text/html; charset=UTF-8");
		String oldPw = request.getParameter("old_pw");
		String newPw = request.getParameter("new_pw");
		
		UserVO vo = (UserVO) request.getSession().getAttribute("user");
		String id = vo.getId();
		
		UserDAO dao = UserDAO.getInstance();
		
		String htmlCode;
		
		try {
			PrintWriter out = response.getWriter();
			if(dao.userCheck(id, oldPw) == 1) {
				dao.changePassword(id, newPw);
				htmlCode = 
				"<script>\r\n" +
					"alert('비밀번호가 정상적으로 변경되었습니다.');\r\n" +
					"location.href='/MyWeb/myPage.user';\r\n" +
				"</script>";
				out.print(htmlCode);
				out.flush();
			 } else {
				 htmlCode = 
				"<script>\r\n" +
					"alert('현재 비밀번호를 확인하세요.');\r\n" +
					"history.back();\r\n" +
				"</script>";
				out.print(htmlCode);
				out.flush();
			 } 
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}
