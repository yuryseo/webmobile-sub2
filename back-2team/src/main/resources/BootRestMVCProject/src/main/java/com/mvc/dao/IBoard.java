package com.mvc.dao;

import java.util.List;

import com.mvc.vo.Board;


public interface IBoard {
	public List<Board> selectAll();
	public Board selectOne(String num);
	public void insert(Board b);
	public void update(Board b);
	public void countUp(String num);
	public void delete(String num);
	public List<Board> findByTitle(String title);
	public List<Board> findByName(String name);
}
