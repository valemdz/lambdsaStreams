package com.valeria.lambdsaStreams.moduloCuatro;

import java.util.OptionalInt;
import java.util.function.BinaryOperator;

import com.valeria.lambdsaStreams.moduloCuatro.services.PersonService;
import com.valeria.lambdsaStreams.moduloUno.Person;

public class MainMaxMinCount {
	
	public static void main( String ...vargs ) {
		
		operationsWithReduce();
		
		
		PersonService service = new PersonService();
		
		service.findAll().stream().mapToInt( p -> p.getEdad()).min().ifPresent( System.out::println); 
		
		service.findAll().stream().mapToInt( p -> p.getEdad()).max().ifPresent( System.out::println); 
		
		System.out.println( "Cantidad de personas" + service.findAll().stream().mapToInt( p -> p.getEdad()).count() ); 
		
		
	}
	
	
	
	
	public static void operationsWithReduce() {
		
		BinaryOperator<Person> mayorX = ( Person p1, Person p2 ) -> {
			if( p1.getEdad() > p2.getEdad()) {
				return p1;
			}
			return p2;		
		};
		
		
		
		
		Person cero = new Person();		
		
		PersonService service = new PersonService();
		
		
		System.out.println( service.findAll().stream().reduce( cero , mayorX  ) );
		
		
		System.out.println( service.findAll().stream().reduce( cero , MainMaxMinCount::mayorPerson  ) );
		
		System.out.println("mmm " + service.findAll()
											.stream()
											.reduce( cero , ( Person p1, Person p2 ) -> {
															if( p1.getEdad() > p2.getEdad()) {
																return p1;
															}
															return p2;} ) );
		
		
		int minor = service.findAll()
						   .stream().map( p -> p.getEdad() )
						   .reduce( Integer.MAX_VALUE , ( e1, e2) -> e1 < e2?e1:e2 );
		
		System.out.println("the minor xxx is ".concat( String.valueOf( minor )  ));
		
		
		int totalAge = service.findAll()
							  .stream()
							  .map( p -> p.getEdad() )
							  .reduce( 0, (p1,p2) -> p1+p2 ) ;
		
		System.out.println(" the totalAge is " + totalAge );
		
	}
	

	public static Person mayorPerson( Person p1, Person p2 ) {
		if( p1.getEdad() > p2.getEdad()) {
			return p1;
		}
		return p2;		
	}
	
	
	public static int minor( int edad1, int edad2 ) {
		
		if( edad1 < edad2 ) {
			return edad1;
		}
		return edad2;
	}
	
}


