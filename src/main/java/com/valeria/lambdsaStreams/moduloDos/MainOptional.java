package com.valeria.lambdsaStreams.moduloDos;

import java.util.Optional;

import com.valeria.lambdsaStreams.moduloDos.services.PersonService;
import com.valeria.lambdsaStreams.moduloUno.Person;

public class MainOptional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Optional<Person> personOp = Optional.empty();
		
		Optional<Person> personOp = Optional.of( new Person("Lola", "Mento", 45 ));
		
		if( personOp.isPresent() ) {
			System.out.println( personOp.get().getName() );
		}
		
		PersonService service = new PersonService();
		
		Optional<Person> personFound = service.findByNameForEach("Carmen");
		
		if( personFound.isPresent() ) {
			System.out.println( personFound.get()  );
		}
	}

}
