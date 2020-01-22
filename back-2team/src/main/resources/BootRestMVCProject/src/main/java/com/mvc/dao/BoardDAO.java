﻿package com.mvc.dao;
//DAO(Data Access Object): jsp를 위해 db 작업 수행

//Create, Read, Update, Delete

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mvc.vo.Board;


@Component("bdao")
public class BoardDAO implements IBoard {
	
	@Autowired
	SqlSession session;
	
	public List<Board> selectAll() {
		return session.selectList("board.selectAll");
	}

	public Board selectOne(String num) {
		session.update("board.countUp",num);
		return session.selectOne("board.selectOne",num);
	}

	public void insert(Board b) {
		session.insert("board.insert",b);
	}

	public void delete(String num) {
		session.delete("board.delete",num);
	}

	public List<Board> findByName(String name) {
		return session.selectList("board.findName",name);
	}

	public List<Board> findByTitle(String title) {
		return session.selectList("board.findTitle",title);
	}

	public void countUp(String num) {
		session.update("board.countUp", num);
	}

	public void update(Board b) {
		session.update("board.update", b);
		
	}

}
