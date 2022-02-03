package com.spring.basic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.basic.model.ScoreVO;
import com.spring.basic.repository.IScoreDAO;
import com.spring.basic.repository.ScoreDAO;

@Service
public class ScoreService implements IScoreService {

	//서비스 계층과 DAO 계층 사이의 의존성 자동 주입을 위해 변수를 선언.
	@Autowired
	private IScoreDAO dao;
	
	@Override
	public void insertScore(ScoreVO score) {
		score.calcData(); //총점, 평균을 구하자
		dao.insertScore(score);
	}

	@Override
	public List<ScoreVO> selectAllScores() {
		return dao.selectAllScores();
	}

	@Override
	public void deleteScore(int num) {
		dao.deleteScore(num - 1);
	}

	@Override
	public ScoreVO selectOne(int num) {
		return dao.selectOne(num - 1);
	}

}













