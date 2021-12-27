package kr.oco.jsp.board.service;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.oco.jsp.board.model.BoardDAO;
import kr.oco.jsp.board.model.BoardVO;
import kr.oco.jsp.board.model.PageCreator;
import kr.oco.jsp.board.model.PageVO;

public class GetListService implements IBoardService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
			
				BoardDAO dao = BoardDAO.getInstance();
				PageVO paging = new PageVO();
				
				if(request.getParameter("page") != null) {
					paging.setPage(Integer.parseInt(request.getParameter("page")));
					paging.setCountPerPage(Integer.parseInt(request.getParameter("countPerPage")));
				}
				
				System.out.println("페이지: " + paging.getPage());
				System.out.println("게시물 수: " + paging.getCountPerPage());
				
				List<BoardVO>list = dao.list(paging);
				
				PageCreator pc = new PageCreator();
				
				pc.setPaging(paging);
				pc.setArticleTotalCount(dao.countArticles()); //페이징 알고리즘 발동
				
				System.out.println("시작페이지: " + pc.getBeginPage());
				System.out.println("끝페이지: " + pc.getEndPage());
				
				request.setAttribute("boardList", list);
				request.setAttribute("pc", pc);
				
			
			
			
		
















	}

}
