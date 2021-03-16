package com.pruebaSpring.model;

public class LocalidadModel {
	
	private long id; 
	private String denominacion; 
	
	public LocalidadModel() {
		// TODO Auto-generated constructor stub
	}

	public LocalidadModel(long id, String denominacion) {
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
