package com.pruebaSpring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="localidad")
public class Localidad {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="id")
	private long id; 
	
	@Column(name="denominacion")
	private String denominacion; 
	
	
	public Localidad() {
		// TODO Auto-generated constructor stub
	}

	public Localidad(long id, String denominacion) {
		this.id = id;
		this.denominacion = denominacion;
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDenominacion() {
		return denominacion;
	}

	public void setDenominacion(String denominacion) {
		this.denominacion = denominacion;
	}
	
}
