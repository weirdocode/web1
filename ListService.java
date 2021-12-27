package kr.oco.jsp.board.service;



import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.oco.jsp.board.model.BoardDAO;
import kr.oco.jsp.board.model.BoardVO;
import kr.oco.jsp.board.model.PageVO;

public class ListService implements IBoardService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		List<BoardVO> boardList = BoardDAO.getInstance().listBoard();
		

		request.setAttribute("boardList", boardList);

		
}
}
