package com.nhnent.guest2.service;

import java.util.List;

import javax.annotation.Resource;

import com.nhnent.guest2.dao.GuestDao;
import com.nhnent.guest2.vo.GuestVo;

public class GuestService {
	@Resource
	private GuestDao guestDao;
	
	public GuestVo getGuest(GuestVo guest) {
		return guestDao.getGuest(guest);
	}
	
	public List<GuestVo> getGuests() {
		return guestDao.getGuests();
	}
}
