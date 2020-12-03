package com.valeria.lambdsaStreams.moduloUno.filtros;

import com.valeria.lambdsaStreams.moduloUno.Person;

public class PersonFilterByName implements IFilter{

	String name;

	public PersonFilterByName(String name) {
		super();
		this.name = name;
	}

	@Override
	public boolean test(Person person) {
		return this.name.equals( person.getName() );
	}

	
	
	
	
}
