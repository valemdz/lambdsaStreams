package com.valeria.lambdsaStreams.moduloDos;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

import com.valeria.lambdsaStreams.moduloUno.Person;

public class MainReduce {

	public static void main(String[] args) {	
		
		// TODO Auto-generated method stub		
		
		List<Person> persons = Arrays.asList(
				new Person("Vale", "Torres", 42),
				new Person("Francisco", "Torres", 71),
				new Person("Carmen", "Funez", 66)
			);	
						
		
		/*int totalEdades = persons.stream()				
				.mapToInt( p -> p.getEdad())
				.sum();*/
		
		/*int totalEdades = persons.stream()				
		.mapToInt( p -> p.getEdad())
		.reduce( 0, ( edad1, edad2 ) -> edad1 + edad2 );*/
		
		
		OptionalInt totalEdades = persons.stream()				
				.mapToInt( p -> p.getEdad())
				.reduce( ( edad1, edad2 ) -> edad1 + edad2 );
		
		
		System.out.println( "totalEdades " + totalEdades.getAsInt() );

	}
	
	
	static void listarPersonas( List<Person> persons ) {
		
		persons.stream().forEach( System.out::println );
		
	}
	
	static void imprimirPerson( Person person ) {
		System.out.println( "================  Metodo Estatico =======================");
		System.out.println( person);
		System.out.println( "=========================================================");
	}

}
