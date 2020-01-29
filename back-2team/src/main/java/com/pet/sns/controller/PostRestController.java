package com.pet.sns.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pet.sns.model.dto.Post;
import com.pet.sns.model.dto.Post_Tag;
import com.pet.sns.model.dto.Tag;
import com.pet.sns.service.PostService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = { "*" }, maxAge = 6000)
@RestController
@Api("Post Rest API")
public class PostRestController {

	@Autowired
	private PostService postservice;

	@ExceptionHandler
	public ResponseEntity<Map<String, Object>> handle(Exception e) {
		return handleFail(e.getMessage(), HttpStatus.OK);
	}

	public ResponseEntity<Map<String, Object>> handleSuccess(Object data) {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("state", "ok");
		resultMap.put("data", data);
		return new ResponseEntity<Map<String, Object>>(resultMap, HttpStatus.OK);
	}

	public ResponseEntity<Map<String, Object>> handleFail(Object data, HttpStatus state) {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("state", "fail");
		resultMap.put("data", data);
		return new ResponseEntity<Map<String, Object>>(resultMap, state);
	}

	@GetMapping("/post/selectone/{num}")
	@ApiOperation("선택한 게시물의 정보  return / 게시물 상세")
	public ResponseEntity<Map<String, Object>> selectone(@PathVariable int num) {
		System.out.println("selectone...........");
		return handleSuccess(postservice.selectone(num));

	}

	@GetMapping("/post/selectmine/{num}")
	@ApiOperation("나의 모든 게시물 리스트 return / 내피드")
	public ResponseEntity<Map<String, Object>> selectmine(@PathVariable int num) {
		System.out.println("selectmine...........");
		return handleSuccess(postservice.selectmine(num));

	}

	@GetMapping("/post/selectall")
	@ApiOperation("모든 게시물 리스트 받아오기 ")
	public ResponseEntity<Map<String, Object>> selectall() {
		System.out.println("Search All...........");
		List<Post> find = postservice.selectall();
		return handleSuccess(find);

	}
	@PostMapping("post/insert")
	@ApiOperation("게시물 등록")
	public ResponseEntity<Map<String, Object>> insert(@RequestBody Post post) {
		// 해시태그 테이블에 넣어주는거 필요
		System.out.println("post insert..........."+post);
		
		System.out.println("unum..........." + post.getUnum());
		postservice.insert(post);
		
		return handleSuccess("게시물 등록 완료");
	}
	/*
	 * @PostMapping("post/insert")
	 * 
	 * @ApiOperation("게시물 등록") public ResponseEntity<Map<String, Object>>
	 * insert(@RequestBody Post_Tag pt) { // 해시태그 테이블에 넣어주는거 필요
	 * System.out.println("post insert..........."+pt); Post post = pt.getPost();
	 * int pnum = post.getPnum(); List<String> tags = pt.getTags();
	 * System.out.println("unum..........." + post.getUnum());
	 * postservice.insert(post); if (!tags.isEmpty()) {
	 * System.out.println("tags 배열"+tags); for (int i = 0; i < tags.size(); i++) {
	 * postservice.inserttag(tags.get(i)); int tnum =
	 * postservice.selecttnum(tags.get(i));
	 * 
	 * postservice.posttag(new Tag(pnum,tnum)); } }
	 * 
	 * return handleSuccess("게시물 등록 완료"); }
	 */

	@PutMapping("post/update")
	@ApiOperation("게시물 수정")
	public ResponseEntity<Map<String, Object>> update(@RequestBody Post_Tag pt) {
		System.out.println("post update...........");
		// 해시태그도
		//postservice.update(pt.getPost());
		return handleSuccess("게시물 수정 완료");
	}

	@PutMapping("post/hitup/{num}")
	@ApiOperation("게시물 조회수 증가")
	public ResponseEntity<Map<String, Object>> hitup(@PathVariable int num) {
		System.out.println("post hitup...........");
		postservice.hitup(num);
		return handleSuccess("게시물  hitup 완료");
	}

	@DeleteMapping("post/delete/{num}")
	@ApiOperation("게시물 삭제")
	public ResponseEntity<Map<String, Object>> delete(@PathVariable int num) {
		System.out.println("post delete...........");
		// 해시태그도 같이 삭제
		postservice.delete(num);
		return handleSuccess("게시물 삭제 완료");
	}

	/*
	 * @PostMapping("post/insert/tag")
	 * 
	 * @ApiOperation("태그 입력") public ResponseEntity<Map<String, Object>>
	 * insert(@RequestBody List<String> tags) { // 해시태그 테이블에 넣어주는거 필요
	 * System.out.println("tag insert..........."); int postnum =4;
	 * System.out.println(tags); postservice.inserttag(tags); return
	 * handleSuccess("게시물 등록 완료"); }
	 */

}
