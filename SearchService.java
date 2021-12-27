package kr.oco.jsp.board.service;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.oco.jsp.board.model.BoardDAO;
import kr.oco.jsp.board.model.BoardVO;

public class SearchService implements IBoardService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String search = request.getParameter("search");
		String category = request.getParameter("category");
		
		List<BoardVO>list = BoardDAO.getInstance().searcboard(search, category);
		
		if(list.size() == 0) {
			response.setContentType("text/html; charset=UTF-8");
			try {
				PrintWriter out = response.getWriter();
				String code = "<script> \r\n"+
							  "alert('검색어가 존재하지 않습니다.'); \r\n"+
							  "location.href='/SemiProject/list.board'; \r\n"+
							  "</script>";
				out.print(code);
				out.flush();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}else {
			request.setAttribute("boardList", list);
		}
		
	}

}
