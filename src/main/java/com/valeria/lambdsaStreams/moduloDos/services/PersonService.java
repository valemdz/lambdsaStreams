package com.valeria.lambdsaStreams.moduloDos.services;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.valeria.lambdsaStreams.moduloUno.Person;

public class PersonService {

	static List<Person> persons;
	
	static {
		
		  persons = Arrays.asList(
				new Person("Vale", "Torres", 42),
				new Person("Francisco", "Torres", 71),
				new Person("Carmen", "Funez", 66)
			);	
	}
	
	public Optional<Person> findByName( String name ) {
	
		Optional<Person> person = persons.stream()
										 .filter( p -> p.getName()
										 .equalsIgnoreCase(name) )
										 .findFirst();		
		return person;
	}
	
	
	public Optional<Person> findByNameForEach( String name ) {
		
		Optional<Person>  personOp = Optional.empty();
		
		for( Person person : persons ) {
			if( person.getName().equalsIgnoreCase(name) ) {
				personOp = Optional.of(person);
			}
		}
		
		return personOp;	
	}
}
