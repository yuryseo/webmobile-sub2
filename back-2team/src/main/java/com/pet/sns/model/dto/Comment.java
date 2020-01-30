package com.pet.sns.model.dto;

public class Comment {
	/*
	 * create table comment( no int primary key auto_increment, postnum int, date
	 * datetime, contents varchar(150) not null, constraint fk_pnum foreign
	 * key(postnum) references post(pnum) on delete cascade );
	 */

	private int no;
	private int postnum;
	private String date;
	private String contents;

	public Comment() {
	}

	public Comment(int no, String contents) {
		super();
		this.no = no;
		this.contents = contents;
	}

	public Comment(int no, int postnum, String contents) {
		this.no = no;
		this.postnum = postnum;
		this.contents = contents;
	}

	public Comment(int no, int postnum, String date, String contents) {
		this.no = no;
		this.postnum = postnum;
		this.date = date;
		this.contents = contents;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getPostnum() {
		return postnum;
	}

	public void setPostnum(int postnum) {
		this.postnum = postnum;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	@Override
	public String toString() {
		return "Comment [no=" + no + ", postnum=" + postnum + ", date=" + date + ", contents=" + contents + "]";
	}
	
	
}
