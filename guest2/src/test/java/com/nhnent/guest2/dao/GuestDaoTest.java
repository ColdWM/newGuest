package com.nhnent.guest2.dao;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.junit.Test;
import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

import com.nhnent.guest2.test.GuestTestTemplate;
import com.nhnent.guest2.vo.GuestVo;

public class GuestDaoTest extends GuestTestTemplate {
	@Resource
	GuestDao guestDao;
	
	//private static Logger logger = (Logger)LoggerFactory.getLogger(GuestDaoTest.class);
	
	@Test
	public void 테스트_데이터_불러오는지() {
		//Given
		GuestVo guest = new GuestVo();
		guest.setGuestId(1);
		
		//When
		guest = guestDao.getGuest(guest);
		
		//Then
		assertNotNull(guest);
		assertEquals("테스트", guest.getGuestText());
	}

}
