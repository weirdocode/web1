package kr.co.jsp.board.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.jsp.board.model.BoardDAO;
import kr.co.jsp.board.model.BoardVO;

public class ContentService implements IBoardService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		//글 번호를 받아오셔서 DAO의 contentBoard() 호출.
		//가져온 데이터를 request에 담아서 board_content.jsp로 포워딩
		//content.jsp에서 데이터를 화면에 뿌려 보세요.

		int bId = Integer.parseInt(request.getParameter("bId"));
		BoardVO vo = BoardDAO.getInstance().contentBoard(bId);
		request.setAttribute("content", vo);
	}

}
