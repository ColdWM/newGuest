package com.nhnent.guest2.dao;

import org.apache.ibatis.session.SqlSession;

import com.nhnent.guest2.vo.GuestVo;

public class GuestDao {
	private SqlSession sqlSession;

	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	public GuestVo getBoard(GuestVo guest) {
		return sqlSession.selectOne("GuestMapper.getGuest", guest);
	}

}
