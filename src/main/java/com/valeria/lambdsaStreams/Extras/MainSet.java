package com.valeria.lambdsaStreams.Extras;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainSet {
	
	private static final String colores[] = { "rojo", "blanco", "azul",
	 "verde", "gris", "naranja", "carne", "blanco", "cyan",
	 "durazno", "gris", "naranja" };

	public static void main(String ...vargs ){
		
		List<String> lista = Arrays.asList(  colores );		
		
		
		Set<String> sinRepetir = new HashSet<>( lista );
		
		
		sinRepetir.stream().forEach( System.out::println );
	}  
}
