package com.nhnent.guest2.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.nhnent.guest2.vo.GuestVo;

public class GuestDao {
	private SqlSession sqlSession;

	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	public GuestVo getGuest(GuestVo guest) {
		return sqlSession.selectOne("GuestMapper.getGuest", guest);
	}
	
	public List<GuestVo> getGuests() {
		return sqlSession.selectList("GuestMapper.getGuests");
	}
	
	public void insertGuest(GuestVo guest) {
		sqlSession.insert("GuestMapper.insertGuest", guest);
	}
	
	public void updateGuest(GuestVo guest) {
		sqlSession.update("GuestMapper.updateGuest", guest);
	}
	
	public void deleteGuest(Integer guestId) {
		sqlSession.delete("GuestMapper.deleteGuest", guestId);
	}

}
