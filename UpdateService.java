package kr.oco.jsp.user.service;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.oco.jsp.user.model.UserDAO;
import kr.oco.jsp.user.model.UserVO;

public class UpdateService implements IUserService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		response.setContentType("text/html; charset=UTF-8");
	    UserVO vo = new UserVO();
	    vo.setId(request.getParameter("id"));
	    vo.setPw(request.getParameter("pw"));
	    vo.setName(request.getParameter("name"));
	    vo.setPhone(request.getParameter("phone"));
	    vo.setEmail(request.getParameter("email"));
	    vo.setAddress(request.getParameter("addFir" + "addSec"));
	    
	    UserDAO dao = UserDAO.getInstance();
	    dao.updateUser(vo);
		request.getSession().setAttribute("user", dao.getUserInfo(vo.getId()));
	    
		try {
			PrintWriter out = response.getWriter();
			
			String htmlCode = 
				"<script>\r\n" +
		    	"alert('회원 정보가 수정되었습니다.');\r\n" + 
		    	"location.href='/SemiProject/mypageGo.user';" +
		    	"</script>";
			out.print(htmlCode);
			out.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	    
		
	}

}








