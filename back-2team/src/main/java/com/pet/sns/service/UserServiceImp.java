package com.pet.sns.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pet.sns.model.dao.UserDao;
import com.pet.sns.model.dto.User;

@Service("qservice")
public class UserServiceImp implements UserService{
	
	
	@Autowired
	private UserDao udao;

	@Override
	public List<User> testAll() {
		return udao.testAll();
	}

	@Override
	public User loginCheck(User u) {
		return udao.loginCheck(u);
	}
	
	@Override
	public User selectOne(String unum) {
		return udao.selectOne(unum);
	}

	@Override
	public void insert(User u) {
		udao.insert(u);
	}

	@Override
	public void updatePassword(User u) {
		udao.updatePassword(u);
	}
	@Override
	public void updateInterest(User u) {
		udao.updateInterest(u);
	}

	@Override
	public void delete(String unum) {
		udao.delete(unum);
	}

	@Override
	public String selectEmail(String email) {
		return udao.selectEmail(email);
	}

	


	
}
