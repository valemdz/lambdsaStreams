package com.valeria.lambdsaStreams.moduloUno;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import com.valeria.lambdsaStreams.moduloUno.filtros.PersonFilterByName;

public class MainFilterGeneric {

	public static void main(String[] args) {
		
        System.out.println("Filtrados!!!!!");
		
		
		List<Person> persons = Arrays.asList(
					new Person("Vale", "Torres", 42),
					new Person("Francisco", "Torres", 71),
					new Person("Carmen", "Funez", 66)
				);	
					
		
		Predicate<Person> filterVale = new PersonFilterByName("Vale");		
		
		Predicate<Person> filterValeAndFunez = filterVale.or( p -> p.getSurname().equalsIgnoreCase("Torres") );
		
	
		
		List<Person> filters =  filterPerson( filterValeAndFunez,  persons );	
	

		
		filters.stream().forEach( System.out::println );

	}
	
	
	public static  List<Person>  filterPerson( Predicate<Person> filter, List<Person> persons ){
		
		List<Person> result = new ArrayList<>();
		
		for( Person person: persons) {
			if( filter.test(person)  ) {
				result.add( person );
			}
		}
		
		return result;
	}
}
