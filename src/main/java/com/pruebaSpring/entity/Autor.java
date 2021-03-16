package com.pruebaSpring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="autor")
public class Autor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private long id;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name ="apellido")
	private String apellido;
	
	@Column(name="biografia")
	private String biografia;
	
	public Autor() {
		// TODO Auto-generated constructor stub
	}

	public Autor(long id, String nombre, String apellido, String biografia) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.biografia = biografia;
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

	public String getBiografia() {
		return biografia;
	}

	public void setBiografia(String biografia) {
		this.biografia = biografia;
	}

}
