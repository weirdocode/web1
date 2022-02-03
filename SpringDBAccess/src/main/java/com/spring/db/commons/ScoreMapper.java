package com.spring.db.commons;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.db.model.ScoreVO;

//JdbcTemplate에서 SELECT 쿼리문을 위한 ResultSet 사용을 편하게 하기 위해
//클래스를 생성해서 전달해 주어야 한다.
//RowMapper 인터페이스를 구현한 클래스를 생성합니다.
public class ScoreMapper implements RowMapper<ScoreVO> {

	@Override
	public ScoreVO mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		ScoreVO vo = new ScoreVO();
		vo.setStuId(rs.getInt("stu_id"));
		vo.setStuName(rs.getString("stu_name"));
		vo.setKor(rs.getInt("kor"));
		vo.setEng(rs.getInt("eng"));
		vo.setMath(rs.getInt("math"));
		vo.setTotal(rs.getInt("total"));
		vo.setAverage(rs.getDouble("average"));
		
		return vo;
	}

}




















