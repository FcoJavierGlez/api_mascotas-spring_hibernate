package com.everis.mascotas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.mascotas.repository.Pet;
import com.everis.mascotas.repository.PetRepository;

@Service("PetService")
public class PetService implements PetServiceInt {
	
	@Autowired
	private PetRepository petRepository;
	
	public Pet addPet(Pet pet) {
		return petRepository.save(pet);
	}

	public List<Pet> getAllPets() {
		return petRepository.findAll();
	}

	public Pet getPetById(int id) {
		return petRepository.getById(id);
	}

	public Pet getPetByName(String nombre) {
		return petRepository.findByNombre(nombre);
	}
	
	public Pet updatePet( final Pet pet ) {
		return petRepository.save(pet);
	}

	public void deletePet(int id) {
		petRepository.deleteById(id);
	}

}
