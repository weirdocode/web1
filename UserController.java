package kr.oco.jsp.user.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.oco.jsp.user.service.IUserService;
import kr.oco.jsp.user.service.UserLoginService;
import kr.oco.jsp.user.service.UserUpdateService;
import kr.oco.jsp.user.service.UserloginSuccess;
import kr.oco.jsp.user.service.myboardService;

@WebServlet("*.user")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private RequestDispatcher dp;
	private IUserService sv;
	
	public UserController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doRequest(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		doRequest(request, response);
	}

	protected void doRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String uri = request.getRequestURI();
		String conPath = request.getContextPath();
		uri = uri.substring(conPath.length() + 1, uri.lastIndexOf("."));

		System.out.println(uri); // 체크용

		switch (uri) {
		case "join":
			System.out.println("회원가입 페이지로 이동 요청!");
			response.sendRedirect("user/user_join.jsp");
			break;

		case "login" : 
			System.out.println("회원가입 시도중 .. ");
			sv = new UserLoginService();
			System.out.println("회원가입 메소드 접속");
			sv.execute(request, response);
			System.out.println("데이터 베이스 입력완료");
			break;
			
		case "LoginGo" : 
			System.out.println("로그인 페이지로 이동 ");
			response.sendRedirect("user/user_login.jsp");
			break;
			
		case "loginSuccess" : 
			System.out.println("로그인 페이지로 이동 성공! ");
			sv = new UserloginSuccess();
			sv.execute(request, response);
			break;
		case "mypage" : 
			System.out.println("마이페이로 이동!");
			sv = new myboardService();
			sv.execute(request, response);	
			System.out.println("마이페이지 중간 확인");
			dp = request.getRequestDispatcher("user/user_mypage.jsp");
			dp.forward(request, response);
			System.out.println("마이페이지로 이동 성공!");
			break;
		case "mypageinfo" :
			System.out.println("회원 정보 페이지로 이동!");
			response.sendRedirect("user/user_mypageinfo.jsp");
			System.out.println("회원 정보 페이로 이동 성공");
			break;
		case "updateUser" :
			System.out.println("회원정보 수정 요청!");
			sv = new UserUpdateService();
			sv.execute(request, response);
			System.out.println("수정 완료");
			response.sendRedirect("user/user_mypage.jsp");
			break;
		case "logout":
			System.out.println("로그아웃 요청!");
			response.sendRedirect("user/user_logout.jsp");
			System.out.println("로그아웃 성공!");
		
	
		default:
			break;
		}

	}
}
