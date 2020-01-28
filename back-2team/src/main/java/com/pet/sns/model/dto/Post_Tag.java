package com.pet.sns.model.dto;

import java.util.List;

public class Post_Tag {
	private Post post;
	private List<String> tags;

	public Post_Tag(Post post, List<String> tags) {
		super();
		this.post = post;
		this.tags = tags;
	}

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	@Override
	public String toString() {
		return "Post_Tag [post=" + post + ", tags=" + tags + "]";
	}

}