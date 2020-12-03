package com.valeria.lambdsaStreams.moduloTres;

import com.valeria.lambdsaStreams.moduloTres.services.PersonService;
import com.valeria.lambdsaStreams.moduloUno.Person;

import java.util.function.*;

public class MainPredicatesCombinados {
	
	
	public static void main( String ...args) {
		
		
		PersonService service = new PersonService();
		
		
		Predicate<Person> nombre =  p -> p.getName().equalsIgnoreCase("Valeria");
		
		Predicate<Person> nuevo = nombre.or( p -> p.getSurname().equalsIgnoreCase("Torres") )
										.negate();
		
		
		service.findAll().stream().filter( nuevo ).map( p -> p.getName() ).forEach( System.out::println);
		
	}

}
