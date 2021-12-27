package kr.oco.jsp.board.service;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import kr.oco.jsp.board.model.BoardDAO;
import kr.oco.jsp.board.model.BoardVO;

public class ContentService implements IBoardService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {

		int bId = Integer.parseInt(request.getParameter("bId"));
		BoardVO con = BoardDAO.getInstance().contentBoard(bId);
		String bIdhit = request.getParameter("bId");
		Cookie hitCoo = new Cookie(bIdhit, bIdhit);
		hitCoo.setMaxAge(15);
		response.addCookie(hitCoo);
		
		boolean flag = false;
		Cookie[] cookies = request.getCookies();
		
		
		if(cookies != null) {
			for(Cookie c :cookies) {
				if(c.getName().equals(bIdhit)) {
					System.out.println("쿠키 존재 확인");				
					flag = true;
					break;
				}
			
			}
		}
		if(!flag) {
			BoardDAO.getInstance().uphit(bId);
			System.out.println("쿠키 존재 없음 쿠키 재생성!");
		}
		request.setAttribute("content", con);
	}

}
