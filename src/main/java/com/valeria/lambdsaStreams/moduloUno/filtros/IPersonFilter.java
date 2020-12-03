package com.valeria.lambdsaStreams.moduloUno.filtros;

import com.valeria.lambdsaStreams.moduloUno.Person;

public interface IPersonFilter {
	
	boolean test( Person person );
	
	
	default IPersonFilter or( IPersonFilter filter ) {
		return ( Person p ) -> test(p)  || filter.test(p);
	}

}
