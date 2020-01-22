package com.pet.sns.service;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.pet.sns.model.dto.Post;

@Mapper
public interface PostService {
	public Post selectone(String num);

	public List<Post> selectall();

	public List<Post> selectmine();
	public void insert(Post post);

	public void update(String num);

	public void updateprivacy(String num, String privacy);

	public void delete(String num);
}
