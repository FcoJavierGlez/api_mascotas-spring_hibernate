package com.everis.mascotas.repository;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "T_OWNER")
public class Owner extends AbstractEntity {
	
	@JsonManagedReference
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "idPropietario")
	//@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private List<Pet> mascotas;

	@Column(name = "DNI", unique = true, nullable = false)
	private String dni;
	
	@Column(name = "NOMBRE", nullable = false)
	private String nombre;
	
	@Column(name = "APELLIDOS", nullable = false)
	private String apellidos;
	
	@Column(name = "TELEFONO", nullable = false)
	private String telefono;
	
	@Column(name = "MAIL", nullable = false)
	private String mail;

	public Owner() {
		super();
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public List<Pet> getMascotas() {
		return mascotas;
	}

	public void setMascotas(List<Pet> mascotas) {
		this.mascotas = mascotas;
	}

	@Override
	public String toString() {
		return "Owner [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", telefono=" + telefono
				+ ", mail=" + mail + "]";
	}
	
}
