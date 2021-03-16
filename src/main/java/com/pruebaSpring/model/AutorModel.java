package com.pruebaSpring.model;

public class AutorModel {
	

	private long id;
	private String nombre; 
	private String apellido;
	private String biografia;
	
	public AutorModel() {
		// TODO Auto-generated constructor stub
	}

	public AutorModel(long id, String nombre, String apellido, String biografia) {
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
