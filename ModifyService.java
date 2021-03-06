package kr.oco.jsp.board.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.oco.jsp.board.model.BoardDAO;
import kr.oco.jsp.board.model.BoardVO;

public class ModifyService implements IBoardService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		int id = Integer.parseInt(request.getParameter("bId"));//content에서 받은 파라미터값
		BoardVO vo = BoardDAO.getInstance().contentBoard(id);
		request.setAttribute("article", vo);
	}

}
