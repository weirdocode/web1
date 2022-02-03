package com.spring.basic.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring.basic.model.BoardVO;

@Repository
public class BoardDAO implements IBoardDAO {

	//게시글을 저장할 리스트 (DB 대용)
	private List<BoardVO> articles = new ArrayList<>();
	
	@Override
	public void insertArticle(BoardVO vo) {
		articles.add(vo);
	}

	@Override
	public List<BoardVO> getArticles() {
		return articles;
	}

	@Override
	public BoardVO getArticle(int bId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteArticle(int bId) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateArticle(BoardVO vo, int bId) {
		// TODO Auto-generated method stub

	}

}
