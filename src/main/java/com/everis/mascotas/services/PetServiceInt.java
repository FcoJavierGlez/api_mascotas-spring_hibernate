package com.everis.mascotas.services;

import java.util.List;

import com.everis.mascotas.repository.Pet;

public interface PetServiceInt {
	
	public List<Pet> getAllPets();
	
	public Pet addPet( final Pet pet );
	
	public Pet getPetById( final int id );
	
	public Pet getPetByName( final String name );
	
	public Pet updatePet( final Pet pet );
	
	public void deletePet( final int id );
	
}
