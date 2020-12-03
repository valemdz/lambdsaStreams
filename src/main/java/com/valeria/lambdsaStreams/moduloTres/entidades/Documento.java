package com.valeria.lambdsaStreams.moduloTres.entidades;

import com.valeria.lambdsaStreams.moduloTresBis.entidades.Versionable;

public class Documento implements Versionable<Documento>{

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

	@Override
	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}
	
	public static Documento esMayorVersion(Documento doc1, Documento doc2 ){
		if( doc1.getVersion() > doc2.getVersion() ) {
			return doc1;
		}else {
			return doc2;
		}
	}

	@Override
	public String toString() {
		return "Documento [titulo=" + titulo + ", version=" + version + "]";
	}

}
