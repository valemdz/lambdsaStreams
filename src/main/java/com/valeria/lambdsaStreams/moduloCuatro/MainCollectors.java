package com.valeria.lambdsaStreams.moduloCuatro;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

import com.valeria.lambdsaStreams.moduloUno.Person;
import com.valeria.lambdsaStreams.moduloUno.Sport;



public class MainCollectors {

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
		
		Map<String, Person> mapPersons =  persons.stream()
												 .collect( Collectors.toMap( Person::getName , p->p) );
		
		
		mapPersons.forEach( (k,v) -> System.out.println( k ) );
		
		
	}
	
	public static void collectToSet( List<Person> persons ) {
		
		//Hay que implementar el metodo equal
		
		Set<Sport> sports =  persons.stream()
			   .flatMap( p -> p.getSports().stream() )
			   .collect( Collectors.toSet() );
		
		
		sports.forEach( System.out::println  );
	}
	
	
	public static void collectToList( List<Person> persons ) {
		//Filtrare los que hacen swimming
		
			List<Person> swimmers = persons.stream()
										   .filter( Person::practica )
										   .collect( Collectors.toList() );		
			
			
			//swimmers.stream().forEach(System.out::println);
			
			
			BiPredicate< Person,String> pracitaElDeporte = ( Person p , String sport )->{
				 Optional<Sport> sportOp = p.getSports().stream()
						  .filter( s -> s.getName().equalsIgnoreCase(sport))				 		
						  .findAny();

				return sportOp.isPresent()?true:false;
			};
			
			
			//Filtrare los que hacen swimming

			swimmers = persons.stream()
							   .filter( p -> pracitaElDeporte.test(p,"Futbol") )
							   .collect( Collectors.toList() );		
			
			
			swimmers.stream().forEach(System.out::println);
			
	}

}
