package com.valeria.lambdsaStreams.moduloUno.filtros;

import java.util.function.Predicate;

import com.valeria.lambdsaStreams.moduloUno.Person;

public interface IFilter extends Predicate<Person> {
	
	public static Predicate<Person> multiply( Predicate<Person>  ...filters ) {
		
		Predicate<Person> combinado = filters[0];
		
		for( Predicate<Person>  filter: filters ) {
			combinado  = combinado.or(filter);
		}
		
		return combinado;
	} 

}
