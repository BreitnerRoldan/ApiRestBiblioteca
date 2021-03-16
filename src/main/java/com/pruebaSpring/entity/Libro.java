package com.pruebaSpring.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="libro")
public class Libro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private long id;
	
	@Column(name="titulo")
	private String titulo;
	
	@Column(name="fecha")
	private Date fecha;
	
	@Column(name ="genero")
	private String genero; 
	
	@Column(name="paginas")
	private int paginas;
	
	@Column(name="autor")
	private String autor; 
	
	public Libro() {
		// TODO Auto-generated constructor stub
	}

	public Libro(long id, String titulo, Date fecha, String genero, int paginas, String autor) {
		this.id = id;
		this.titulo = titulo;
		this.fecha = fecha;
		this.genero = genero;
		this.paginas = paginas;
		this.autor = autor;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
}
