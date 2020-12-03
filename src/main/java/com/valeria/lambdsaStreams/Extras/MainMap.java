package com.valeria.lambdsaStreams.Extras;

import java.util.HashMap;
import java.util.Map;

public class MainMap {

	public static void main(String[] args) {
		
		String cadena = "la duda es el la mayor castigo mayor la" ;
		
		String[] palabras = cadena.split(" "); 
		
		
		Map<String,Integer> contador = new HashMap<>(); 
		
		
		for( String palabra: palabras ) {
			if( contador.containsKey(palabra) ) {
				contador.put(palabra, contador.get(palabra) + 1 );
			}else {
				contador.put(palabra, 1 );
			}
		}
		
		contador.forEach( (k,v ) -> System.out.println( k + ": " + v ) );

	}

}
