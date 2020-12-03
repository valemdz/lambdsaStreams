package com.valeria.lambdsaStreams.moduloTres.services;

import com.valeria.lambdsaStreams.moduloUno.Person;

public class FirmService {
	
	private Person person;
	
	public FirmService( Person person ){
		this.person = person;
	}

	
	public String getFirm() {
		return " Firma de " + this.person.getName();
	}
	
}
