package com.valeria.lambdsaStreams.moduloCuatro;

import java.util.Arrays;
import java.util.List;

import com.valeria.lambdsaStreams.moduloUno.Person;
import com.valeria.lambdsaStreams.moduloUno.Sport;

public class MainFlatMap {

	public static void main(String[] args) {

		Person p1 = new Person("Valeria", "Torres", 42);
		p1.addSport(new Sport("Tennis", 5));
		p1.addSport(new Sport("Swimming", 10));

		Person p2 = new Person("Francisco", "Torres", 71);
		p2.addSport(new Sport("Futbol", 8));
		p2.addSport(new Sport("Swimming", 5));

		Person p3 = new Person("Carmen", "Funez", 66);
		p3.addSport(new Sport("craftsmanship", 5));
		p3.addSport(new Sport("Swimming", 5));

		List<Person> persons = Arrays.asList(p1, p2, p3);

		persons.stream().flatMap(p -> p.getSports().stream()).forEach(System.out::println);
		
		persons.stream()
			   .flatMap( p -> p.getSports().stream() )
			   .map( Sport::getName)
			   .distinct()
			   .forEach( System.out::println );
		
		int totalSwimming = persons.stream()
			   .flatMap( p -> p.getSports().stream() )
			   .filter( s -> s.getName().equalsIgnoreCase("Swimming") )
			   .mapToInt( s -> s.getHours() )
			   .sum();
		
		System.out.println(" total Swimming " + totalSwimming);

	}

}
