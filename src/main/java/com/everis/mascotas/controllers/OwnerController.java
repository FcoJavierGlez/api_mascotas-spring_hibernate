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

import com.everis.mascotas.repository.Owner;
import com.everis.mascotas.repository.Pet;
import com.everis.mascotas.services.OwnerServiceInt;

@RestController
@RequestMapping("/api/owner")
public class OwnerController {
	
	@Autowired
	@Qualifier("OwnerService")
	private OwnerServiceInt ownerService;
	
	@GetMapping("/")
	@ResponseBody
	public List<Owner> getAllOwners() {
		return ownerService.getAllOwners();
	}
	
	@PostMapping("/")
	@ResponseBody
	public Owner addOwners( @RequestBody final Owner owner ) {
		return ownerService.addOwner(owner);
	}
	
	@GetMapping("/{id}")
	@ResponseBody
	public Owner getOwnerById( @PathVariable final int id ) {
		return ownerService.getOwnerById(id);
	}
	
	@GetMapping("/{id}/petlist")
	@ResponseBody
	public List<Pet> getOwnerPets( @PathVariable final int id ) {
		return ownerService.getOwnerPets(id);
	}
	
}
