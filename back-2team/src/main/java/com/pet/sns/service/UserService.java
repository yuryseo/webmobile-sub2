package com.pet.sns.service;

import com.pet.sns.model.dto.User;

public interface UserService {
	public User selectOne(String unum);
	public void insert(User u);
	public void updatePassword(User u);
	public void delete(String unum);
}
