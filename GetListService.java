package kr.co.jsp.board.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.jsp.board.model.BoardDAO;
import kr.co.jsp.board.model.BoardVO;

public class GetListService implements IBoardService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		List<BoardVO> boardList = BoardDAO.getInstance().listBoard();
		
		//1일 이내 신규글 new마크 처리 로직
		for(BoardVO vo : boardList) {
			//현재 시간 읽어오기 (밀리초)
			long now = System.currentTimeMillis();
			//게시물의 작성 시간 밀리초로 읽어오기
			long regTime = vo.getRegDate().getTime();
			
			if(now - regTime < 60 * 60 * 24 * 1000) {
				vo.setNewMark(true);
			}
		}
		
		request.setAttribute("boardList", boardList);
	}

}













