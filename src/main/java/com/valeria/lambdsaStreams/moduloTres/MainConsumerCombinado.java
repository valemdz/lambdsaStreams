package com.valeria.lambdsaStreams.moduloTres;

import java.util.function.Consumer;

import com.valeria.lambdsaStreams.moduloTres.services.PersonService;
import com.valeria.lambdsaStreams.moduloUno.Person;

public class MainConsumerCombinado {
	
	
	public static void main( String ...args ) {
		
		PersonService service = new PersonService();
		
		Consumer<Person> consumerNombre =  p -> System.out.println( p.getName() );		
		
		Consumer<Person> consumerApellido = MainConsumerCombinado::imprimirApellido;
		
		
		Consumer<Person> consumerCombinado = consumerApellido.andThen(consumerNombre);
		
		service.findAll()
		   .stream()
		   .forEach(consumerCombinado);
		
		
		consumerNombre.accept( new Person("Lola", "Ponde", 70 ) );
		
			
	}
	
	
	public static void imprimirApellido( Person person ) {
		System.out.println( person.getSurname() );
	}

}
