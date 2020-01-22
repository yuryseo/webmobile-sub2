package com.mvc.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mvc.service.BoardService;
import com.mvc.vo.Board;

@RestController
public class BoardRestController {
	//db작업을 할 dao 주입
	@Autowired
	BoardService service;
	
	@RequestMapping(value="/boards", method=RequestMethod.GET)
	public List<Board> selectAll(){
		return service.selectAll();
	}
	
	//http://localhost:8080/rest/customers/111/
	@RequestMapping(value="/boards/{num}", method=RequestMethod.GET)
	public Board selectOne(@PathVariable String num){
		return service.selectOne(num);
	}
	
	//http://localhost:8080/rest/customers/111/
	@RequestMapping(value="/boards/{num}", method=RequestMethod.DELETE)
	public Map delete(@PathVariable String num){
		service.delete(num);
		HashMap<String, String> map = new HashMap();
		map.put("result", "삭제성공");
		return map;
	}

	//POST(insert)-http://localhost:8080/rest/customers/
	@RequestMapping(value="/boards", method=RequestMethod.POST)
	public Map insert(@RequestBody Board b){
		//@RequestBody(json->java):RequestBody에 담겨져 온 json 객체가 vo인 Customer에 맵핑됨
		service.insert(b);
		HashMap<String, String> map = new HashMap();
		map.put("result", "추가성공");
		return map;
	}

	//POST(insert)-http://localhost:8080/rest/customers/
	@RequestMapping(value="/boards", method=RequestMethod.PUT)
	public Map update(@RequestBody Board b){
		//@RequestBody(json->java):RequestBody에 담겨져 온 json 객체가 vo인 Customer에 맵핑됨
		service.update(b);
		HashMap<String, String> map = new HashMap();
		map.put("result", "수정성공");
		return map;
	}
	
}
