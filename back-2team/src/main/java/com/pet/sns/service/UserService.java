package com.pet.sns.service;

import java.util.List;

import com.pet.sns.model.dto.User;

public interface UserService {
	public List<User> testAll();
	public User selectOne(String unum);
	public void insert(User u);
	public void updatePassword(User u);
	public void delete(String unum);
}
