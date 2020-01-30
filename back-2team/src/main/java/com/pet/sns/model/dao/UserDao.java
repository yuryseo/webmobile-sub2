package com.pet.sns.model.dao;

import java.util.List;

import com.pet.sns.model.dto.User;

public interface UserDao {
	public List<User> testAll();
	public User loginCheck(User u);
	public User selectOne(String unum);
	public String selectEmail(String email);
	public void insert(User u);
	public void updatePassword(User u);
	public void updateInterest(User u);
	public void delete(String unum);
}
