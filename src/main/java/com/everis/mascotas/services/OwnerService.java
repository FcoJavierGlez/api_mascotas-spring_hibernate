package com.everis.mascotas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.mascotas.repository.Owner;
import com.everis.mascotas.repository.OwnerRepository;
import com.everis.mascotas.repository.Pet;

@Service("OwnerService")
public class OwnerService implements OwnerServiceInt {
	
	@Autowired
	private OwnerRepository ownerRepository;

	public List<Owner> getAllOwners() {
		return ownerRepository.findAll();
	}
	
	public List<Owner> searchOwnersByApellidos(String apellidos) {
		return ownerRepository.findByApellidos(apellidos);
	}

	public Owner getOwnerById(int id) {
		return ownerRepository.getById(id);
	}

	public Owner getOwnerByDni(String dni) {
		return ownerRepository.findByDni(dni);
	}
	
	public Owner addOwner(Owner owner) {
		return ownerRepository.save(owner);
	}

	public List<Pet> getOwnerPets(int id) {
		return ownerRepository.getById(id).getMascotas();
	}
	
	public void deleteOwner( final int id ) {
		ownerRepository.deleteById(id);
	}

}
