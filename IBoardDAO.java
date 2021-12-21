package kr.co.jsp.board.model;

import java.util.List;

public interface IBoardDAO {

	//글 등록 메서드
	void regist(String writer, String title, String content);
	
	//글 전체 목록을 가지고 오는 메서드
	List<BoardVO> listBoard();
	
	//글 상세보기 요청을 처리할 메서드
	BoardVO contentBoard(int bId);
	
	//글 수정 요청을 처리할 메서드 (제목, 내용)
	void updateBoard(String title, String content, int bId);
	
	//글 삭제 요청을 처리할 메서드
	void deleteBoard(int bId);
	
	//글 검색 요청을 처리할 메서드 (제목, 내용, 작성자 검색)
	List<BoardVO> searchBoard(String keyword, String category);
	
	//조회수를 올려주는 메서드
	void upHit(int bId);
	
	//총 게시물의 수를 조회하는 메서드
	int countArticles();
	
}













