package com.valeria.lambdsaStreams.nadaQueVer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MainMatrices {
	
	private static final String[] colores = { "MAGENTA", "ROJO", "BLANCO", "AZUL", "CYAN" };
	private static final String[] eliminarColores =	{ "ROJO", "BLANCO", "AZUL" };
	
	private static final String palos[] = { "Corazones", "Diamantes", "Bastos", "Espadas" };

	public static void main(String[] args) {

		//List<String> coloresList = Arrays.asList( colores );
		
		List<String> coloresList = new ArrayList<>( Arrays.asList( colores ) );
		
		/*List<String> coloresList = new ArrayList<>();
		Collections.addAll(coloresList, colores );*/
		
		
		List<String> eliminarList  = Arrays.asList( eliminarColores ); 
		
		Iterator<String> iterator = coloresList.iterator();
		
		while( iterator.hasNext() ) {
			if( eliminarList.contains(  iterator.next() )) {
				iterator.remove();
			}
		}
		
		//coloresList.stream().forEach(  System.out::println );	

		//ordenamientoAscendente();
		
		 ordenamientoDecendente();
	}
	
	public static void ordenamientoAscendente() {
		
		List palosList = Arrays.asList( palos );		
		Collections.sort( palosList , String::compareToIgnoreCase );
		
		
		palosList.stream().forEach( System.out::println);
	}
	
	public static void ordenamientoDecendente() {
		
		List palosList = Arrays.asList( palos );		
		Collections.sort( palosList , String::compareToIgnoreCase );
		
		Collections.reverse(  palosList );
		
		palosList.stream().forEach( System.out::println);
	}

}
