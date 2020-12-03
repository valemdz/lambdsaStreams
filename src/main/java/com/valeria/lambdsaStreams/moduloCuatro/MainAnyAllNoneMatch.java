package com.valeria.lambdsaStreams.moduloCuatro;

import java.util.Arrays;
import java.util.List;

import com.valeria.lambdsaStreams.moduloUno.Person;
import com.valeria.lambdsaStreams.moduloUno.Sport;

public class MainAnyAllNoneMatch {

	public static void main(String[] args) {

		Person p1 = new Person("Valeria", "Torres", 42);
		p1.addSport(new Sport("Tennis", 5));
		p1.addSport(new Sport("Swimming", 10));
		//p1.addSport(new Sport("pin pong", 20));

		Person p2 = new Person("Francisco", "Torres", 71);
		p2.addSport(new Sport("Futbol", 8));
		p2.addSport(new Sport("Swimming", 5));

		Person p3 = new Person("Carmen", "Funez", 66);
		p3.addSport(new Sport("craftsmanship", 5));
		p3.addSport(new Sport("Swimming", 5));

		List<Person> persons = Arrays.asList(p1, p2, p3);

	    persons.stream()
	    		.flatMap( p -> p.getSports().stream() )
	    		.peek( System.out::println )
	    		.anyMatch( d -> d.getHours() == 5  );
	    
	    
	    
	    persons.stream()
	    	   .peek( System.out::println )	
	    	   .anyMatch( p -> p.getName().equalsIgnoreCase("Francisco") );
	    
	}

}
