package com.valeria.lambdsaStreams.moduloDos;

import java.util.Arrays;
import java.util.List;

import com.valeria.lambdsaStreams.moduloUno.Person;

public class MainPeek {

	public static void main(String[] args) {	
		
		// TODO Auto-generated method stub		
		
		List<Person> persons = Arrays.asList(
				new Person("Vale", "Torres", 42),
				new Person("Francisco", "Torres", 71),
				new Person("Carmen", "Funez", 66)
			);	
						
		
		persons.stream()
				//.filter( p -> p.getEdad() > 20 )	
				.peek(System.out::println)
				.filter( Person::isJubilado )
				.forEach( MainPeek::imprimirPerson );

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
