package com.valeria.lambdsaStreams.moduloTresBis.entidades;

public class Documento  {

	private String titulo;
	private int version;

	public Documento() {
		this.titulo = "";
		this.version=-1;
	}

	public Documento(String titulo, int version) {
		super();
		this.titulo = titulo;
		this.version = version;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	
	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}
	
	

	@Override
	public String toString() {
		return "Documento [titulo=" + titulo + ", version=" + version + "]";
	}

}
