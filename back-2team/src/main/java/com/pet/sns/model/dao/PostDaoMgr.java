package com.pet.sns.model.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.pet.sns.model.dto.Post;

@Mapper
public interface PostDaoMgr {
	public Post selectone(int num);

	public List<Post> selectall();

	public List<Post> selectmine(int num);

	public void insert(Post post);

	public void update(Post post);

	public void delete(int num);

}
