package kr.oco.jsp.user.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.oco.jsp.user.model.UserDAO;
import kr.oco.jsp.user.model.UserVO;

public class UserLoginService implements IUserService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		String address = request.getParameter("address");

		
		UserVO vo = new UserVO();
		vo.setId(id);
		vo.setPw(pw);
		vo.setName(name);
		vo.setPhone(phone);
		vo.setEmail(email);
		vo.setAddress(address);

		
		UserDAO dao = UserDAO.getInstance();
		
		boolean flag = dao.confirmId(id);
	    
	    if(flag){ 
	    	response.setContentType("text/html; charset=UTf-8");
	    	try {
				PrintWriter out = response.getWriter();
				String htmlCode = "<script> alert(\"아이디가 중복되었습니다.\"); history.back(); </script>";
				out.print(htmlCode);
				out.flush();
				
				return;
			} catch (IOException e) {
				e.printStackTrace();
			}
	    
		}else { // 아이디가 중복되지않음
			
			try {
				response.sendRedirect("user/user_login.jsp");
			} catch (IOException e) {
				e.printStackTrace();
			}
    	
		
    	dao.insertUser(vo);
    	
    	
    	
    }
		
	}

}
