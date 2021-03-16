package com.pruebaSpring.model;

import java.util.Date;

public class LibroModel {
	
	private long id;
	private String titulo; 
	private Date fecha;
	private String genero; 
	private int paginas;
	private String autor; 
	
	public LibroModel() {
		// TODO Auto-generated constructor stub
	}

	public LibroModel(long id, String titulo, Date fecha, String genero, int paginas, String autor) {
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
