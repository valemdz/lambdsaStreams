package com.valeria.lambdsaStreams.Extras;

public class MainExtras {

	public static void main(String[] args) {
		
		//La expresion lambda 	( name ) -> "Hello".concat(name); reemplaza el metodo abstracto
		//public String sayHello( String name ); de la interfaz IStrategy
		IStrategy strategy = ( name ) -> "Hello ".concat(name);
		
		System.out.println( strategy.sayHello("Valeria Torres") );		
		System.out.println( strategy.helloWorld() );

	}

}
