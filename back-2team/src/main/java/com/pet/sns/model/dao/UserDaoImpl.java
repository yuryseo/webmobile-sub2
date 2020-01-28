package com.pet.sns.model.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pet.sns.model.dto.User;

@Repository("udao")
public class UserDaoImpl implements UserDao{

	@Autowired
	SqlSession session;

	@Override
	public List<User> testAll() {
		return session.selectList("user.testAll");
	}
	
	@Override
	public User selectOne(String unum) {
		return session.selectOne("user.selectOne",unum);
	}

	@Override
	public void insert(User u) {
		session.insert("user.insert",u);
	}

	@Override
	public void updatePassword(User u) {
		session.update("user.updatepassword", u);
	}

	@Override
	public void delete(String unum) {
		session.delete("user.delete",unum);
	}

	
	
	
	
}
