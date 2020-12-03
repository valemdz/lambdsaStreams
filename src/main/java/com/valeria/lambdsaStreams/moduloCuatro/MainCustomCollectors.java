package com.valeria.lambdsaStreams.moduloCuatro;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Predicate;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

import com.valeria.lambdsaStreams.moduloUno.Person;
import com.valeria.lambdsaStreams.moduloUno.Sport;



public class MainCustomCollectors {

	public static void main(String[] args) {

		Person p1 = new Person("Valeria", "Torres", 42);
		p1.addSport(new Sport("Tennis", 5));
		p1.addSport(new Sport("Swimming", 10));
		//p1.addSport(new Sport("pin pong", 20));

		Person p2 = new Person("Francisco", "Torres", 71);
		p2.addSport(new Sport("Futbol", 8));
		p2.addSport(new Sport("Paddel", 5));

		Person p3 = new Person("Carmen", "Funez", 66);
		p3.addSport(new Sport("craftsmanship", 5));
		p3.addSport(new Sport("Swimming", 5));

		List<Person> persons = Arrays.asList(p1, p2, p3);

		//collectToList( persons );
		
		//collectToSet( persons );
		
		
		persons.forEach( System.out::println );
		
		TreeSet personsOrdenadas = persons.stream().collect( Collectors.toCollection( TreeSet::new )); 
		
		personsOrdenadas.forEach( System.out::println);
		
		String todosNombres = persons.stream().map(Person::getName).collect( Collectors.joining(",", "[", "]") );
		
		System.out.println(todosNombres);
		
	}
	
	

}
