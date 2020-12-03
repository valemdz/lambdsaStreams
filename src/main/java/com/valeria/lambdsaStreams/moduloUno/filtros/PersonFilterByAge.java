package com.valeria.lambdsaStreams.moduloUno.filtros;

import com.valeria.lambdsaStreams.moduloUno.Person;

public class PersonFilterByAge implements IFilter {
	
	private int  age;
	
	public PersonFilterByAge(int age) {	
		this.age = age;
	}

	@Override
	public boolean test( Person person ) {
		return this.age == person.getEdad();
					
	}

}
