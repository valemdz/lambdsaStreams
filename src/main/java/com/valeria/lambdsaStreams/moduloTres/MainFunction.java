package com.valeria.lambdsaStreams.moduloTres;

import java.util.function.Function;

import com.valeria.lambdsaStreams.moduloTres.services.PersonService;
import com.valeria.lambdsaStreams.moduloUno.Person;

public class MainFunction {
	
	
	public static void main( String ...args ) {
		
		PersonService service = new PersonService();
		
		
		service.findAll()
		   .stream()
		   //map recibe una function
		   .map( p -> p.getName() )
		   .forEach( System.out::println );
		
		
		// Definiendo explicitamente una function				
		
		Function<Person,String> mapNombre = p -> p.getName();
		
		

		service.findAll()
		   .stream()
		   //map recibe una function
		   .map( mapNombre )
		   .forEach( System.out::println );
		
		System.out.println( mapNombre.apply( new Person("Marthita", "Caceres", 80 ) ) );
			
	}
	
	
	
}
