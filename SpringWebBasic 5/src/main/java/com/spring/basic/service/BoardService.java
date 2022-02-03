package com.spring.basic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.basic.model.BoardVO;
import com.spring.basic.repository.IBoardDAO;

@Service
public class BoardService implements IBoardService {

	@Autowired
	private IBoardDAO dao;
	
	@Override
	public void insertArticle(BoardVO vo) {
		dao.insertArticle(vo);
	}

	@Override
	public List<BoardVO> getArticles() {
		return dao.getArticles();
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
