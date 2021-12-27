package kr.oco.jsp.user.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.oco.jsp.user.model.UserDAO;
import kr.oco.jsp.user.model.UserVO;

public class UserloginSuccess implements IUserService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// 로그인 성공 후 세션에 남 길것
		String id = request.getParameter("id");
		String pw = request.getParameter("pw"); 
		
		 UserDAO dao = UserDAO.getInstance();
		    int result = dao.userCheck(id, pw);
		    
		   
			if(result == -1){ 
				response.setContentType("text/html; charset=UTF-8");
				PrintWriter out;
				try {
					out = response.getWriter();
						String htmlCode = "<script>\r\n"
						+ "		alert('아이디가 없습니다.');\r\n"
						+ "		location.href=\"user_login.jsp\"\r\n"
						+ "	</script>";
				out.print(htmlCode);
				out.flush();
				} catch (IOException e) {
					e.printStackTrace();
				}
			
			}else if(result == 0){
				PrintWriter out;
				try {
					out = response.getWriter();
					String htmlCode = "	<script>\r\n"
						+ "		alert('비밀번호가 틀려요.');\r\n"
						+ "		history.back();\r\n"
						+ "	</script>";
				out.print(htmlCode);
				out.flush();
				} catch (IOException e) {
					e.printStackTrace();
				}
				
			}else{
			UserVO vo = dao.getUserInfo(id);
			HttpSession session = request.getSession(); // class에서는 session을 직접 받아와야함.
			session.setAttribute("user", vo);
			try {
				response.sendRedirect("user/user_mypage.jsp");
			} catch (IOException e) {
				e.printStackTrace();
			}
			}

		}
	}


