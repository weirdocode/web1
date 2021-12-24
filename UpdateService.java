package kr.co.jsp.user.service;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.jsp.user.model.UserDAO;
import kr.co.jsp.user.model.UserVO;

public class UpdateService implements IUserService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		response.setContentType("text/html; charset=UTF-8");
	    UserVO vo = new UserVO();
	    vo.setId(request.getParameter("id"));
	    vo.setName(request.getParameter("name"));
	    vo.setEmail(request.getParameter("email"));
	    vo.setAddress(request.getParameter("address"));
	    
	    UserDAO dao = UserDAO.getInstance();
	    dao.updateUser(vo);
		request.getSession().setAttribute("user", dao.getUserInfo(vo.getId()));
	    
		try {
			PrintWriter out = response.getWriter();
			
			String htmlCode = 
				"<script>\r\n" +
		    	"alert('회원 정보가 수정되었습니다.');\r\n" + 
		    	"location.href='/MyWeb/myPage.user';" +
		    	"</script>";
			out.print(htmlCode);
			out.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	    
		
	}

}








