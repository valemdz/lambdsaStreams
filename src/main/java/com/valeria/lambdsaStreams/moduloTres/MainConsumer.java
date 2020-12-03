package com.valeria.lambdsaStreams.moduloTres;

import java.util.function.Consumer;

import com.valeria.lambdsaStreams.moduloTres.services.PersonService;
import com.valeria.lambdsaStreams.moduloUno.Person;

public class MainConsumer {
	
	
	public static void main( String ...args ) {
		
		PersonService service = new PersonService();
		
		Consumer<Person> consumerNombre =  p -> System.out.println( p.getName() );
		
		service.findAll()
			   .stream()
			   .forEach( consumerNombre );
		
		
		service.findAll()
		   .stream()
		   .forEach( MainConsumer::imprimirApellido );
		
		Consumer<Person> consumerApellido = MainConsumer::imprimirApellido;
		
		service.findAll()
		   .stream()
		   .forEach( consumerApellido );
		
			
	}
	
	
	public static void imprimirApellido( Person person ) {
		System.out.println( person.getSurname() );
	}

}
