package com.valeria.lambdsaStreams.moduloCuatro;

import com.valeria.lambdsaStreams.moduloCuatro.services.PersonService;
import com.valeria.lambdsaStreams.moduloDos.Main;
import com.valeria.lambdsaStreams.moduloUno.Person;

public class MainSkip {

	/**
	 * @param vargs
	 */
	public static void main( String ... vargs ) {
		
		PersonService service = new PersonService();
		
		/*
		 * service.findAll() .stream() .filter( p -> p.getName().equals("Valeria") )
		 * .map( p -> p.getName()) .forEach( System.out::println);
		 */
		
		/*
		 * service.findAll() .stream() .skip(2) .forEach( MainSkip::printPerson );
		 */
		
		
		service.findAll().stream().skip(1).limit(2).forEach( MainSkip::printPerson );
		
	}
	
	
	public static void printPerson( Person person ){
		System.out.println( person.getName().concat(" - " ).concat( person.getSurname() ) );
	}
	
}
