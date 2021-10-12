package com.everis.mascotas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.everis.mascotas.repository.Pet;
import com.everis.mascotas.services.PetServiceInt;

@RestController
@RequestMapping("/api/pet")
public class PetController {
	
	@Autowired
	@Qualifier("PetService")
	private PetServiceInt petService;
	
	@GetMapping("/")
	@ResponseBody
	public List<Pet> getPetList() {
		return petService.getAllPets();
	}
	
	@PostMapping("/")
	@ResponseBody
	public Pet addPet( @RequestBody Pet pet ) {
		return petService.addPet(pet);
	}
	
	@GetMapping("/{id}")
	@ResponseBody
	public Pet addPet( @PathVariable final int id ) {
		return petService.getPetById(id);
	}

}
