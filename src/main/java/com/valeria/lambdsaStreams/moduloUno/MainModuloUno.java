package com.valeria.lambdsaStreams.moduloUno;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainModuloUno {
	
	public static void main( String ... args) {
		
		System.out.println("Ya estoy en el ruedo por suerte!!!!!");
		
		
		List<Person> persons = Arrays.asList(
					new Person("Vale", "Torres", 42),
					new Person("Francisco", "Torres", 71),
					new Person("Carmen", "Funez", 66)
				);	
		
		
		MainModuloUno instancia = new MainModuloUno();
		///instancia.ordenacionViejaEscuela(persons);
		instancia.ordenacionJavaOcho(persons);
	
		
	}
	
	private void ordenacionViejaEscuela( List<Person> persons ) {
		
		System.out.println( "============================== Vieja escuela ===============================");
		
		persons.stream().forEach( System.out::println );
		
		
		Collections.sort(persons);
		
		System.out.println( "===================================================================");
		
		persons.stream().forEach( System.out::println );
	}

	
	private void ordenacionJavaOcho( List<Person> persons ) {
		
		System.out.println( "======================== Java Ocho ============================");
		
		persons.stream().forEach( System.out::println );
		
		
		persons.sort( (p1,p2) -> p1.getEdad() - p2.getEdad() );
		
		System.out.println( "===================================================================");
		
		persons.stream().forEach( System.out::println );
		
		
		persons.sort( (p1,p2) -> p1.getName().compareTo(p2.getName()));
		
		System.out.println( "===================================================================");
		
		persons.stream().forEach( System.out::println );
	}
}
