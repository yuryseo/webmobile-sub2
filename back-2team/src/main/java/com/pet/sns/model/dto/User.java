package com.pet.sns.model.dto;

public class User {
	private String email;
	private String password;
	private String nickname;
	private String phone;
	private String interest;

	@Override
	public String toString() {
		return "User [unum=" + unum + ", email=" + email + ", password=" + password + ", nickname=" + nickname
				+ ", phone=" + phone + ", interest=" + interest + "]";
	}

	public User() {
	}

	public User(String email, String password) {
		this.email = email;
		this.password = password;
	}

	public User(String email, String password, String nickname, String phone, String interest) {
		this.email = email;
		this.password = password;
		this.nickname = nickname;
		this.phone = phone;
		this.interest = interest;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public String getInterest() {
		return interest;
	}

	public void setInterest(String interest) {
		this.interest = interest;
	}
	
	

}
