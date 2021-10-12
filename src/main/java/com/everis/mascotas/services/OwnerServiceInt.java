package com.everis.mascotas.services;

import java.util.List;

import com.everis.mascotas.repository.Owner;
import com.everis.mascotas.repository.Pet;

public interface OwnerServiceInt {
	
	public List<Owner> getAllOwners();
	
	public List<Owner> searchOwnersByApellidos( final String apellidos );
	
	public Owner getOwnerById( final int id );
	
	public Owner getOwnerByDni( final String dni );
	
	public Owner addOwner( final Owner owner );
	
	public List<Pet> getOwnerPets( final int id );
	
	public void deleteOwner( final int id );

}
