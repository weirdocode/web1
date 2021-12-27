package kr.oco.jsp.board.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.oco.jsp.board.service.ContentService;
import kr.oco.jsp.board.service.DeleteService;
import kr.oco.jsp.board.service.GetListService;
import kr.oco.jsp.board.service.IBoardService;
import kr.oco.jsp.board.service.ListService;
import kr.oco.jsp.board.service.ModifyService;
import kr.oco.jsp.board.service.RegistService;
import kr.oco.jsp.board.service.SearchService;
import kr.oco.jsp.board.service.UpdateService;


@WebServlet("*.board")
public class BoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private RequestDispatcher dp;
	private IBoardService sv;
    
    public BoardController() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doRequest(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doRequest(request, response);
		request.setCharacterEncoding("utf-8");
	}
	
	protected void doRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri = request.getRequestURI();
		uri = uri.substring(request.getContextPath().length()+1, uri.lastIndexOf("."));
		System.out.println(uri);
		
		switch (uri) {
		case "list":
			System.out.println("게시판 리스트로 이동");
			sv = new GetListService();
			sv.execute(request, response);
			dp = request.getRequestDispatcher("bbs/bbs.jsp");
			dp.forward(request, response);
		break;
		
			
		case "write" : 
				System.out.println("게시판 글쓰기로 이동");
				response.sendRedirect("bbs/bbs_write.jsp");
				
			break;
			
		case "regist":
			System.out.println("글 등록 요청이 들어옴");
			sv = new RegistService();
			System.out.println("registService");
			sv.execute(request, response);
			response.sendRedirect("/SemiProject/list.board");
			System.out.println("글 등록 완료");
			break;
			
		case "content":
			System.out.println("글 상세보기 요청이 들어옴");
			sv = new ContentService();
			sv.execute(request, response);
			System.out.println("글 상세보기 sv 동작 확인");
			dp = request.getRequestDispatcher("bbs/bbs_content.jsp");
			dp.forward(request, response);
			System.out.println("글 상세보기 dp 동작 확인!");
			break;
			
		case "modify":
			System.out.println("글 수정 페이지 이동 요청 들어옴");
			sv = new ModifyService();
			sv.execute(request, response);
			dp = request.getRequestDispatcher("bbs/bbs_modify.jsp");
			dp.forward(request, response);
			break;
			
		case "update":
			System.out.println("글 수정 요청이 들어옴");
			sv = new UpdateService();
			System.out.println("sv 확인");
			sv.execute(request, response);
			response.sendRedirect("/SemiProject/content.board?bId=" + request.getParameter("bId"));
			System.out.println("수정 완료!");
			break;
			
		case "delete":
			System.out.println("글 삭제 요청이 들어옴");
			sv = new DeleteService();
			sv.execute(request, response);
			response.sendRedirect("/SemiProject");
			break;
			
		case "search":
			System.out.println("제목 검색 요청이 들어옴");
			sv = new SearchService();
			sv.execute(request, response);
			if(request.getAttribute("boardList") != null) {
				dp = request.getRequestDispatcher("bbs/bbs.jsp");
				dp.forward(request, response);
			}
			break;	
		default:
			break;
		}
			
		}
	}


















