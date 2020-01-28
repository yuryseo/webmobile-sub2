package com.pet.sns.service;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.pet.sns.model.dto.Post;

public interface PostService {
	public Post selectone(int num);

	public List<Post> selectall();

	public List<Post> selectmine(int num);

	public void insert(Post post);

	public void update(Post post);

	public void delete(int num);

}
