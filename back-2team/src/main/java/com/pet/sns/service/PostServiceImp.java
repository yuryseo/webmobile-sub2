package com.pet.sns.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pet.sns.model.dao.PostDaoMgr;
import com.pet.sns.model.dto.InfoNotFoundException;
import com.pet.sns.model.dto.PetsnsException;
import com.pet.sns.model.dto.Post;

@Service
public class PostServiceImp implements PostService {

	@Autowired
	private PostDaoMgr dao;

	@Override
	public Post selectone(int num) {
		try {
			System.out.println("Post selectone ");
			Post find = dao.selectone(num);
			if (find == null) {
				throw new InfoNotFoundException();
			} else {
				return find;
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new PetsnsException("Post selectone 오류 발생");
		}

	}

	@Override
	public List<Post> selectall() {

		try {
			System.out.println("Post selectall ");
			List<Post> find = dao.selectall();
			if (find == null) {
				throw new InfoNotFoundException();
			} else {
				return find;
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new PetsnsException("Post selectall 오류 발생");
		}

	}

	@Override
	public List<Post> selectmine(int num) {
		try {
			System.out.println("Post selectmine ");
			List<Post> find = dao.selectmine(num);
			if (find == null) {
				throw new InfoNotFoundException();
			} else {
				return find;
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new PetsnsException("Post selectmine 오류 발생");
		}
	}

	@Override
	public void insert(Post post) {
		try {

			System.out.println("Post insert ");
			dao.insert(post);

		} catch (Exception e) {
			e.printStackTrace();
			throw new PetsnsException("Post insert 오류 발생");
		}
	}

	@Override
	public void update(Post post) {
		try {

			System.out.println("Post update ");
			dao.update(post);

		} catch (Exception e) {
			e.printStackTrace();
			throw new PetsnsException("Post update 오류 발생");
		}
	}

	@Override
	public void delete(int num) {
		try {

			System.out.println("Post delete ");
			dao.delete(num);

		} catch (Exception e) {
			e.printStackTrace();
			throw new PetsnsException("Post delete 오류 발생");
		}

	}

}
