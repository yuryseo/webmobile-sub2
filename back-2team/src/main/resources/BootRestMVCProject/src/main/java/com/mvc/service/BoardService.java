package com.mvc.service;

import java.util.List;

import com.mvc.vo.Board;


//client(BoardApp.java)를 위한 인터페이스
public interface BoardService {
	public List<Board> selectAll();
	public Board selectOne(String num);
	public Board select(String num);
	public void insert(Board b);
	public void update(Board b);
	public void delete(String num);
	public List<Board> findByTitle(String title);
	public List<Board> findByName(String name);
}
