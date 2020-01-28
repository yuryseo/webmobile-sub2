package com.pet.sns.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pet.sns.model.dto.User;
import com.pet.sns.service.UserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin
@RestController
@Api("User Rest API")
public class UserRestController {
	// 디비 셋팅 후 주석을 푸세요.
	@Autowired
	UserService uservice;

//	@ExceptionHandler
//	public ResponseEntity<Map<String, Object>> handle(Exception e) {
//		return handleFail(e.getMessage(), HttpStatus.OK);
//	}
//
//	public ResponseEntity<Map<String, Object>> handleSuccess(Object data) {
//		Map<String, Object> resultMap = new HashMap<String, Object>();
//		resultMap.put("state", "ok");
//		resultMap.put("data", data);
//		return new ResponseEntity<Map<String, Object>>(resultMap, HttpStatus.OK);
//	}
//
//	public ResponseEntity<Map<String, Object>> handleFail(Object data, HttpStatus state) {
//		Map<String, Object> resultMap = new HashMap<String, Object>();
//		resultMap.put("state", "fail");
//		resultMap.put("data", data);
//		return new ResponseEntity<Map<String, Object>>(resultMap, state);
//	}
//
//	@PostMapping("/petsns/login")
//	@ApiOperation("새로운 QnA 질문 등록")
//	public ResponseEntity<Map<String, Object>> login(@RequestParam String email, @RequestParam String password) {
//		// userservice.insert(qboard);;
//		System.out.println(email);
//		System.out.println(password);
//
//		return handleSuccess("로그인 완료");
//	}
//
//	@PostMapping("/petsns/signup")
//	@ApiOperation("가입하기")
//	public Object signup(@RequestBody User user) {
//		// 이메일, 닉네임 중복처리 필수 //회원가입단을 생성해 보세요.
//
//		System.out.println(user.getEmail());
//		System.out.println(user.getPassword());
//
//		/*
//		 * final BasicResponse result = new BasicResponse(); result.status = true;
//		 * result.data = "success";
//		 */
//
//		return  handleSuccess("회원가입 완료");
//	}

	@RequestMapping(value = "/user/{num}", method = RequestMethod.GET)
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
		uservice.updatePassword(u);
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("result", "수정성공");
		return map;
	}
	
	@RequestMapping(value = "/user/delete", method = RequestMethod.DELETE)
	@ApiOperation("회원 삭제")
	public Map<String, String> delete(@PathVariable String unum) {
		uservice.delete(unum);
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("result", "삭제성공");
		return map;
	}

}