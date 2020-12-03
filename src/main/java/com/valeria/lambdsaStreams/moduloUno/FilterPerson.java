package com.valeria.lambdsaStreams.moduloUno;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import com.valeria.lambdsaStreams.moduloUno.filtros.IPersonFilter;
import com.valeria.lambdsaStreams.moduloUno.filtros.PersonFilterByAge;
import com.valeria.lambdsaStreams.moduloUno.filtros.PersonFilterByName;

public class FilterPerson {

	public static void main(String[] args) {

		
		System.out.println("Filtrados!!!!!");
		
		
		List<Person> persons = Arrays.asList(
					new Person("Vale", "Torres", 42),
					new Person("Francisco", "Torres", 71),
					new Person("Carmen", "Funez", 66)
				);	
		
		
		
		//filters.stream().forEach( System.out::println );

	}
	
	
	public static  List<Person>  filterPerson( IPersonFilter filter, List<Person> persons ){
		
		List<Person> result = new ArrayList<>();
		
		for( Person person: persons) {
			if( filter.test(person)  ) {
				result.add( person );
			}
		}
		
		return result;
	}

}
