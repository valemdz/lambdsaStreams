package com.valeria.lambdsaStreams.nadaQueVer;

public class MainHerencia {
	
	
	public static void main(String ...vargs) {
		
		Persona persona = new Persona();
		persona.setNombre("Valeria");
		
		persona.camina();
		
		
		persona = new Deportista();
		persona.setNombre("Valeria2");
		
		persona.camina();
		
		
		
	
	}

}
