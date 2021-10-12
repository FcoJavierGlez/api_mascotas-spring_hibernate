package com.everis.mascotas.repository;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "T_PET")
public class Pet extends AbstractEntity {
	
	@JsonBackReference
	@ManyToOne
	@JoinColumn(name = "ID_PROPIETARIO")
	private Owner idPropietario;
	
	@Column(name = "NOMBRE")
	private String nombre;
	
	@Column(name = "RAZA")
	private String raza;
	
	@Column(name = "EDAD")
	private int edad;

	public Pet() {
		super();
	}

	public Owner getIdPropietario() {
		return idPropietario;
	}

	public void setIdPropietario(Owner idPropietario) {
		this.idPropietario = idPropietario;
	}



	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Pet [idPropietario=" + idPropietario + ", nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + "]";
	}

}
