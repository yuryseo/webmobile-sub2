package com.pet.sns.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pet.sns.model.dao.IUserMgr;

@Service
public class UserServiceImp implements UserService{

	@Autowired
	private IUserMgr dao;
	
	
	
}
