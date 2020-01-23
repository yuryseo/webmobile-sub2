package com.mvc.controller;

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

import com.mvc.service.CustomerService;
import com.mvc.vo.Customer;

import io.swagger.annotations.ApiOperation;

@CrossOrigin("*")
@RestController
public class CustomerRestController {
	//db작업을 할 dao 주입
	@Autowired
	CustomerService service;
	
	//http://localhost:8080/rest/customers/
	@RequestMapping(value="/customers", method=RequestMethod.GET)
	@ApiOperation("모든 고객 정보")
	public List<Customer> selectAll(){
		return service.selectAll();
	}
	
	//http://localhost:8080/rest/customers/address/la
	//http://localhost:8080/rest/customers/name/kim
	@RequestMapping(value="/customers/{condition}/{value}", method=RequestMethod.GET)
	@ApiOperation("조건별 검색")
	public List<Customer> find(@PathVariable String condition, @PathVariable String value){
		if(condition.equals("address")) {
			return service.findByAddress(value);
		}else {
//			return service.findByName(value);
			return null;
		}
	}

	//http://localhost:8080/rest/customers/111/
	@RequestMapping(value="/customers/{num}", method=RequestMethod.GET)
	@ApiOperation("해당 번호의 고객 정보")
	public Customer selectOne(@PathVariable String num){
		return service.selectOne(num);
	}
	
	//http://localhost:8080/rest/customers/111/
	@RequestMapping(value="/customers/{num}", method=RequestMethod.DELETE)
	@ApiOperation("해당 번호의 고객 정보 삭제")
	public Map delete(@PathVariable String num){
		service.delete(num);
		HashMap<String, String> map = new HashMap();
		map.put("result", "삭제성공");
		return map;
	}

	//POST(insert)-http://localhost:8080/rest/customers/
	@RequestMapping(value="/customers", method=RequestMethod.POST)
	@ApiOperation("새 고객 등록")
	public Map insert(@RequestBody Customer c){
		//@RequestBody(json->java):RequestBody에 담겨져 온 json 객체가 vo인 Customer에 맵핑됨
		service.insert(c);
		HashMap<String, String> map = new HashMap();
		map.put("result", "추가성공");
		return map;
	}

	//POST(insert)-http://localhost:8080/rest/customers/
	@RequestMapping(value="/customers", method=RequestMethod.PUT)
	@ApiOperation("고객 정보 수정")
	public Map update(@RequestBody Customer c){
		//@RequestBody(json->java):RequestBody에 담겨져 온 json 객체가 vo인 Customer에 맵핑됨
		service.update(c);
		HashMap<String, String> map = new HashMap();
		map.put("result", "수정성공");
		return map;
	}
	
}
