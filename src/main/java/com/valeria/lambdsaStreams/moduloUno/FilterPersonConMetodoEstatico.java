package com.valeria.lambdsaStreams.moduloUno;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.valeria.lambdsaStreams.moduloUno.filtros.IFilter;
import com.valeria.lambdsaStreams.moduloUno.filtros.IPersonFilter;
import com.valeria.lambdsaStreams.moduloUno.filtros.PersonFilterByAge;
import com.valeria.lambdsaStreams.moduloUno.filtros.PersonFilterByName;

public class FilterPersonConMetodoEstatico {

	public static void main(String[] args) {

		
		System.out.println("Filtrados!!!!!");
		
		
		List<Person> persons = Arrays.asList(
					new Person("Valeria", "Torres", 42),
					new Person("Francisco", "Torres", 71),
					new Person("Carmen", "Funez", 66)
				);	
		
		
		
		Predicate<Person> filterName = new PersonFilterByName("Valeria");
		
		//Predicate<Person> filterNameOrApellido = filterName.or( p -> p.getSurname().equalsIgnoreCase("Funez") );
		
		Predicate<Person> filterApellido =  p -> p.getSurname().equalsIgnoreCase("Funez") ;
		
		
		
		filterPerson( IFilter.multiply( filterApellido, filterName ),  persons ).stream().forEach( System.out::println);
		
	}
	
	
	public static  List<Person>  filterPerson( Predicate<Person>  filter, List<Person> persons ){
		
		List<Person> result = new ArrayList<>();
		
		for( Person person: persons) {
			if( filter.test(person)  ) {
				result.add( person );
			}
		}
		
		return result;
	}

}
