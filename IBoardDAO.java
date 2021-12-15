package kr.co.jsp.board.model;

import java.util.List;

public interface IBoardDAO {
	
	//게시글 등록
	boolean insert(BoardVO vo);
	
	//게시글 전체 조회
	List<BoardVO> selectAll();
	
	//게시글 상세 조회
	BoardVO selectOne(int bId);
	
	//게시글 수정
	boolean update(BoardVO vo);
	
	//게시글 삭제
	boolean delete(int bId);

}








