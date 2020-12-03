package com.valeria.lambdsaStreams.moduloTres;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

import com.valeria.lambdsaStreams.moduloTres.services.PersonService;
import com.valeria.lambdsaStreams.moduloUno.Person;

public class MainBiConsumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//BiConsumer<Person, Person> biConsumer = ( p1, p2) -> System.out.println( p1.getName() + " - " + p2.getName());
		
		//biConsumer.accept( new Person("Lola", "LolaApe",10), new Person( "Run", "RunApe", 30 ));
		
	    
		PersonService service = new PersonService();
		
		
		
		Map<String, Person> mapPersons = service.findAll()
												.stream()
												.collect( Collectors.toMap( Person::getName, p -> p ) );
		
		
		//mapPersons.forEach( (k,v) -> System.out.println( "K " + k + " - value: " + v  ) );
		
		mapPersons.forEach( MainBiConsumer:: imprimirMapaPerson);
		
		

	}
	
	public static void imprimirMapaPerson( String key, Person person ) {
		
		System.out.println( "K " + key + " - value: " + person  );
		
	}

}
