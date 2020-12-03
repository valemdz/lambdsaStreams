package com.valeria.lambdsaStreams.moduloUno;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Person implements Comparable<Person> {

	private String name;
	private String surname;
	private int edad;
	
	private List<Sport> sports = new ArrayList<>();

	public Person() {
	}

	public Person(String name, String surname, int edad) {	
		this.name = name;
		this.surname = surname;
		this.edad = edad;
	}
	
	public void addSport( Sport sport ) {
		this.sports.add( sport );
	}

	public List<Sport> getSports() {
		return sports;
	}

	public void setSports(List<Sport> sports) {
		this.sports = sports;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", surname=" + surname + ", edad=" + edad + "]";
	}

	/*@Override
	public int compareTo(Person arg0) {		
		
		if( getEdad() > arg0.getEdad() ) {
			return 1;
		}else if( getEdad() < arg0.getEdad()) {
			return -1;
		}else {
			return 0;
		}
		
	}*/
	
	@Override
	public int compareTo(Person arg0) {	
		
		return getName().compareTo(  arg0.getName()  );
		
		
		
	}
	
	public  boolean isJubilado( ) {
		return this.getEdad() > 65;
	}
	
	public boolean practica( ) {
		 Optional<Sport> sportOp =  this.sports.stream()
				 					  .filter( s -> s.getName().equalsIgnoreCase("Swimming"))				 		
				 					  .findAny();
		 
		 return sportOp.isPresent()?true:false;
		 
	}
	

}
