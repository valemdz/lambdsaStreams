package com.valeria.lambdsaStreams.moduloDos;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

import com.valeria.lambdsaStreams.moduloUno.Person;

public class MainCollectors {

	public static void main(String[] args) {	
		
		// TODO Auto-generated method stub		
		
		List<Person> persons = Arrays.asList(
				new Person("Vale", "Torres", 42),
				new Person("Francisco", "Torres", 71),
				new Person("Carmen", "Funez", 66)
			);				
					
		
		List< String > names = persons.stream().map( p -> p.getName() ).collect(Collectors.toList());
		
		
		names.stream().forEach( System.out::println );

	}
	
	
	

}
