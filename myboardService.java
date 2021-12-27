package kr.oco.jsp.user.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.oco.jsp.board.model.BoardDAO;
import kr.oco.jsp.board.model.BoardVO;
import kr.oco.jsp.user.model.UserDAO;

public class myboardService implements IUserService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
	
		
		List<BoardVO> boardList = UserDAO.getInstance().myboard();
		
		

		request.setAttribute("boardList", boardList);

	}

}
