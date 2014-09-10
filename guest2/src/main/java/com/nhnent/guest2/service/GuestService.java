package com.nhnent.guest2.service;

import javax.annotation.Resource;

import com.nhnent.guest2.dao.GuestDao;
import com.nhnent.guest2.vo.GuestVo;

public class GuestService {
	@Resource
	private GuestDao guestDao;
	
	public GuestVo getGuest(GuestVo guest) {
		GuestVo result = new GuestVo();
		result = guestDao.getBoard(guest);
		System.out.println(result.toString());
		return result;
	}
}
