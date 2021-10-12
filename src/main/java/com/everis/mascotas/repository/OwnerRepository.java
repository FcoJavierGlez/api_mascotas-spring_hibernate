package com.everis.mascotas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerRepository extends JpaRepository<Owner, Integer> {
	
	public Owner findByDni( final String dni );
	
	public List<Owner> findByApellidos( final String apellidos );

}
