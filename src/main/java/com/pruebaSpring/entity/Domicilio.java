package com.pruebaSpring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="domicilio")
public class Domicilio {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="id")
	private long id;
	
	@Column(name ="calle")
	private String calle;
	
	@Column(name="numero")
	private int numero; 
	
	public Domicilio() {
		// TODO Auto-generated constructor stub
	}

	public Domicilio(long id, String calle, int numero) {
		this.id = id;
		this.calle = calle;
		this.numero = numero;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

}
