package com.pet.sns.model.dto;

public class Pet {
	private String petnum;
	private String unum;
	private String name;
	private String animal;
	private String gender;
	private String breed;
	private String birthday;

	public Pet() {
	}

	public Pet(String petnum, String unum, String name, String animal, String gender, String breed, String birthday) {
		this.petnum = petnum;
		this.unum = unum;
		this.name = name;
		this.animal = animal;
		this.gender = gender;
		this.breed = breed;
		this.birthday = birthday;
	}

	public String getPetnum() {
		return petnum;
	}

	public void setPetnum(String petnum) {
		this.petnum = petnum;
	}

	public String getUnum() {
		return unum;
	}

	public void setUnum(String unum) {
		this.unum = unum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAnimal() {
		return animal;
	}

	public void setAnimal(String animal) {
		this.animal = animal;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
}
