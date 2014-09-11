package com.nhnent.guest2.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.nhnent.guest2.dao.GuestDao;
import com.nhnent.guest2.vo.GuestVo;

@Service
public class GuestService {
	@Resource
	private GuestDao guestDao;
	
	public GuestVo getGuest(GuestVo guest) {
		return guestDao.getGuest(guest);
	}
	
	public List<GuestVo> getGuests() {
		return guestDao.getGuests();
	}
	
	public void insertGuest(GuestVo guest) {
		guestDao.insertGuest(guest);
	}
	
	public void updateGuest(GuestVo guest) {
		guestDao.updateGuest(guest);
	}
	
	public void deleteGuest(int guestId) {
		guestDao.deleteGuest(guestId);
	}
}
