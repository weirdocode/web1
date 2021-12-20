package kr.co.jsp.board.model;

import java.util.List;

public class BoardDAO implements IBoardDAO {

	@Override
	public void regist(String writer, String title, String content) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<BoardVO> listBoard() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BoardVO contentBoard(int bId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateBoard(String title, String content, int bId) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteBoard(int bId) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<BoardVO> searchBoard(String keyword) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void upHit(int bId) {
		// TODO Auto-generated method stub

	}

}
