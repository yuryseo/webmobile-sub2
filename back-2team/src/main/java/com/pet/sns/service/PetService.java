package com.pet.sns.service;

import java.util.List;

import com.pet.sns.model.dto.Pet;

public interface PetService {
	public List<Pet> testAll();
	public List<Pet> selectAll(String unum);
	public Pet selectOne(String petnum);
	public void insert(Pet p);
	public void update(Pet p);
	public void delete(String petnum);
}
