package com.pet.sns.model.dao;

import com.pet.sns.model.dto.User;

public interface UserDao {
	public User selectOne(String unum);
	public void insert(User u);
	public void updatePassword(User u);
	public void delete(String unum);
}
