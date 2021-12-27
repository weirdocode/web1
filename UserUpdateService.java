package kr.oco.jsp.user.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.oco.jsp.user.model.UserDAO;
import kr.oco.jsp.user.model.UserVO;

public class UserUpdateService implements IUserService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String id = request.getParameter("id");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String address = request.getParameter("address");
		
		UserVO vo = new UserVO();
		vo.setId(id);
		vo.setEmail(email);
		vo.setPhone(phone);
		vo.setAddress(address);
		
		UserDAO dao = UserDAO.getInstance();
		dao.updateUser(vo);
		
		HttpSession session = request.getSession();
		session.setAttribute("user",dao.getUserInfo(id));
	}

}
