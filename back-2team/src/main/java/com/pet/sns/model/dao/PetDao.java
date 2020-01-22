package com.pet.sns.model.dao;

import com.pet.sns.model.dto.Pet;

public interface PetDao {
	public Pet selectAll(String unum);
	public Pet selectOne(String petnum);
	public void insert(Pet p);
	public void update(Pet p);
	public void delete(String petnum);
}
