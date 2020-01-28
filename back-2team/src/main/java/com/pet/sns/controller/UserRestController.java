package com.pet.sns.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pet.sns.model.dto.User;
import com.pet.sns.service.UserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin("*")
@RestController
@Api("User Rest API")
public class UserRestController {
	@Autowired
	UserService uservice;
	@RequestMapping(value = "/user/test", method = RequestMethod.GET)
	@ApiOperation("Frontend용 모든 DB를 볼 수 있는 test")
	public List<User> testAll() {
		return uservice.testAll();
	}
	
	@RequestMapping(value = "/user/{unum}", method = RequestMethod.GET)
	@ApiOperation("회원정보 검색")
	public User selectOne(@PathVariable String unum) {
		return uservice.selectOne(unum);
	}
	
	@RequestMapping(value = "/user", method = RequestMethod.POST)
	@ApiOperation("회원 추가")
	public Map<String, String> insert(@RequestBody User u) {
		HashMap<String, String> map = new HashMap<String, String>();
		uservice.insert(u);
		map.put("result", "추가성공");
		return map;
	}
	
	@RequestMapping(value = "/user/updatepassword", method = RequestMethod.PUT)
	@ApiOperation("비밀번호 수정")
	public Map<String, String> updatePassword(@RequestBody User u) {
		HashMap<String, String> map = new HashMap<String, String>();
		System.out.println(u);
		uservice.updatePassword(u);
		map.put("result", "수정성공");
		return map;
	}
	
	@RequestMapping(value = "/deleteuser/{unum}", method = RequestMethod.DELETE)
	@ApiOperation("회원 삭제")
	public Map<String, String> delete(@PathVariable String unum) {
		System.out.println(unum);
		uservice.delete(unum);
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("result", "삭제성공");
		return map;
	}

}