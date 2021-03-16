package com.pruebaSpring.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="persona")
public class Persona implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="id")
	private long id;
	
	@Column(name="nombre")
	private String nombre;

	@Column(name="apellido")
	private String apellido;
	
	@Column(name="dni")
	private int dni;
	 
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}


	public Persona(long id, String nombre, String apellido, int dni) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
	}

	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public int getDni() {
		return dni;
	}


	public void setDni(int dni) {
		this.dni = dni;
	}

}
