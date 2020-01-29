package com.pet.sns.model.dto;

import java.util.List;

public class Tag {
	private int pnum;
	private int tnum;
	private List<String> word;

	public Tag() {
	}

	public Tag(int pnum, int tnum) {
		this.pnum = pnum;
		this.tnum = tnum;
	}

	public Tag(int tnum, List<String> word) {
		this.tnum = tnum;
		this.word = word;
	}

	public int getTnum() {
		return tnum;
	}

	public void setTnum(int tnum) {
		this.tnum = tnum;
	}

	public List<String> getWord() {
		return word;
	}

	public void setWord(List<String> word) {
		this.word = word;
	}

	public int getPnum() {
		return pnum;
	}

	public void setPnum(int pnum) {
		this.pnum = pnum;
	}

	@Override
	public String toString() {
		return "Tag [tnum=" + tnum + ", word=" + word + "]";
	}

}
