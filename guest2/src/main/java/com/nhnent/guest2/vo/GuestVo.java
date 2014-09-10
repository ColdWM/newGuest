package com.nhnent.guest2.vo;

import javax.validation.constraints.NotNull;

public class GuestVo {
	@NotNull
	private Integer guestId;
	@NotNull
	private String guestName;
	@NotNull
	private String guestPassword;
	@NotNull
	private String guestText;
	@Override
	public String toString() {
		return "GuestVo [guestId=" + guestId + ", guestName=" + guestName
				+ ", guestPassword=" + guestPassword + ", guestText="
				+ guestText + "]";
	}
	public Integer getGuestId() {
		return guestId;
	}
	public void setGuestId(Integer guestId) {
		this.guestId = guestId;
	}
	public String getGuestName() {
		return guestName;
	}
	public void setGuestName(String guestName) {
		this.guestName = guestName;
	}
	public String getGuestPassword() {
		return guestPassword;
	}
	public void setGuestPassword(String guestPassword) {
		this.guestPassword = guestPassword;
	}
	public String getGuestText() {
		return guestText;
	}
	public void setGuestText(String guestText) {
		this.guestText = guestText;
	}
	
	

}
