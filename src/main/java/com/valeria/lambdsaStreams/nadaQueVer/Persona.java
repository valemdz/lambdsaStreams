package com.valeria.lambdsaStreams.nadaQueVer;

public class Persona {
	
	String nombre;
	
	public Persona() {
		
	}
	
	void quienCamina() {
		
		System.out.print( getNombre().concat(" camina a ") );
		
	}
	
	public void camina() {
		quienCamina();
		System.out.println( "5 km" );
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
}
