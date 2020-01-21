package com.team2.vo;

public class Member {
	private String email;
	private String pw;
	private String nickname;
	private String phone;
	
	public Member() {
	}

	public Member(String email, String pw, String nickname, String phone) {
		this.email = email;
		this.pw = pw;
		this.nickname = nickname;
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
