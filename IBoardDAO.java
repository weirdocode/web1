package kr.oco.jsp.board.model;

import java.util.List;

public interface IBoardDAO {

	// 글 등록 메소드 
	   
	   void regist(String writer, String title, String content);
	   
	   
	   //글 목록을 가지고 오는 메소드 
	   List<BoardVO> listBoard();
	   
	   
	   //글 상세 보기 요청을 처리하 메소드 
	   BoardVO contentBoard(int boardId);
	   
	   //글 수정을 요청할 메소드 (제목 내용)
	   void updateBoard(BoardVO vo);
	   
	   //글 삭제 요청을 보내는 메소드 
	   void deleteBoard(int boardId); 
	   
	   //글 검색 요청을 처리할 메소드 (제목 검색)
	   List<BoardVO> searcboard(String search , String category);
	   
	   //조회수를 올려주는 메소드 
	   void uphit(int BoardId);

	   //총 게시물의 수를 조회하는 메소드 
	   
	   int countArticles();
	   
	   public List<BoardVO> list(PageVO paging);
}
