package com.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mvc.dao.IBoard;
import com.mvc.vo.Board;

@Component("bo")
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	IBoard dao;
	
	public List<Board> selectAll() {
		return dao.selectAll();
	}

	public Board selectOne(String num) {
//		dao.countUp(num);
		return dao.selectOne(num);
	}

	public void insert(Board b) {
		dao.insert(b);
	}

	public void delete(String num) {
		dao.delete(num);
	}

	public List<Board> findByTitle(String title) {
		return dao.findByTitle(title);
	}

	public List<Board> findByName(String name) {
		return dao.findByName(name);
	}

	public void update(Board b) {
		dao.update(b);
	}

	public Board select(String num) {
		return dao.selectOne(num);
	}

}
