package com.pet.sns.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pet.sns.model.dto.Result;
import com.pet.sns.model.dto.User;
import com.pet.sns.service.JwtService;
//import com.pet.sns.service.JwtService;
import com.pet.sns.service.UserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin("*")
@RestController
@Api("User Rest API")
public class UserRestController {
	@Autowired
	UserService uservice;
	@Autowired
    private JwtService jwtService;
	
	@RequestMapping(value = "/user/test", method = RequestMethod.GET)
	@ApiOperation("Frontend용 모든 DB를 볼 수 있는 test")
	public List<User> testAll() {
		return uservice.testAll();
	}
	
	@RequestMapping(value = "/userlogin", method = RequestMethod.POST)
	@ApiOperation("email과 password 입력으로 로그인 체크")
	public boolean loginCheck(@RequestBody User u) {
		User temp = uservice.loginCheck(u);
		if(temp==null) {
			return false;
		}else {
			return true;
		}
	}
	
	@RequestMapping(value = "/signin", method = RequestMethod.POST)
	@ApiOperation("email과 password 입력으로 로그인 체크")
    public Result signin(@RequestBody User u, HttpServletResponse response){
    	Result result = Result.successInstance();
        User user = uservice.loginCheck(u);
        String token = jwtService.create(user.getUnum(),user,user.getNickname());
        response.setHeader("Authorization", token);
        result.setData(user);
        return result;
    }
	
	@RequestMapping(value = "/tokentest/{token}", method = RequestMethod.GET)
	@ApiOperation("토큰이 옳은지 검증")
	public void tokenTest(@PathVariable String token) {
		System.out.println(token);
		jwtService.isUsable(token);
	}
	
	@RequestMapping(value = "/user/{unum}", method = RequestMethod.GET)
	@ApiOperation("unum으로 회원정보 검색")
	public User selectOne(@PathVariable String unum) {
		return uservice.selectOne(unum);
	}
	
	@RequestMapping(value = "/user", method = RequestMethod.POST)
	@ApiOperation("회원 추가(unum은 자동부여, interest는 추가 안됨.)")
	public Map<String, String> insert(@RequestBody User u) {
		HashMap<String, String> map = new HashMap<String, String>();
		String tempemail = uservice.selectEmail(u.getEmail());
		if(tempemail==null) {
			uservice.insert(u);
			map.put("result", "추가성공");
			return map;
		}else {
			map.put("result", "존재하는 Email");
			return map;
		}
	}
	
	@RequestMapping(value = "/user/updatepassword", method = RequestMethod.PUT)
	@ApiOperation("unum을 입력받아서 password 수정")
	public Map<String, String> updatePassword(@RequestBody User u) {
		HashMap<String, String> map = new HashMap<String, String>();
		uservice.updatePassword(u);
		map.put("result", "수정성공");
		return map;
	}

	@RequestMapping(value = "/user/updateinterest", method = RequestMethod.PUT)
	@ApiOperation("unum을 입력받아서 interest 수정 (관심동물 수정)")
	public Map<String, String> updateInterest(@RequestBody User u) {
		HashMap<String, String> map = new HashMap<String, String>();
		uservice.updateInterest(u);
		map.put("result", "수정성공");
		return map;
	}
	
	@RequestMapping(value = "/deleteuser/{unum}", method = RequestMethod.DELETE)
	@ApiOperation("unum을 입력 받아서 회원 삭제")
	public Map<String, String> delete(@PathVariable String unum) {
		System.out.println(unum);
		uservice.delete(unum);
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("result", "삭제성공");
		return map;
	}
}