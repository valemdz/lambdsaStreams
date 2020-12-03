package com.valeria.lambdsaStreams.moduloTres;

import java.util.Optional;
import java.util.function.Supplier;

import com.valeria.lambdsaStreams.moduloTres.services.FirmService;
import com.valeria.lambdsaStreams.moduloUno.Person;

public class MainSupplier {

	public static void main(String[] args) {

		Supplier<Person> obtenerPerson = () -> new Person( "Susana","Lopez",40);
		
		Optional<Person> personOp = Optional.ofNullable( obtenerPerson.get());
		
		personOp.ifPresent( System.out :: println );
		
		
		FirmService firmaService = new FirmService( new Person("Lonchita","Funez",72));
		
		Supplier<String> firma = firmaService::getFirm; 
		
		System.out.println( "Imprmiedo pagina 1"  );
		System.out.println( firma.get()  );
		

		System.out.println( "Imprmiedo pagina 2"  );
		System.out.println( firma.get()  );
		
		System.out.println( "Imprmiedo pagina 3"  );
		System.out.println( firma.get()  );
		
		
		System.out.println( "Imprmiedo pagina 4"  );
		System.out.println( firma.get()  );
		
		

	}

}
