package com.valeria.lambdsaStreams.Extras.methods;

import java.util.Arrays;
import java.util.List;

public class Methods {
	
	public static void metodoEstatico() {
		System.out.println("Hello static Method");
	}
	
	public void metodoInstancia() {
		System.out.println("Hello instance method");
	}
	
	public static void main( String ...vargs ) {
		
		IHello interfaceRef = Methods::metodoEstatico;		
		interfaceRef.sayHello();
		
		
		Methods method = new Methods();		
		interfaceRef = method::metodoInstancia;		
		interfaceRef.sayHello();		
		
		
		 String[] names = new String[]{"Oscar", "Alex", "Maria", "Samuel", "Perla", "Fausto"};		 
		 Arrays.sort( names, String::compareToIgnoreCase );		 
		 System.out.println("arreglo ordenado" + Arrays.toString( names ) );
		 
		 ///Otra forma 
		 
		 
		 List<String> namesList = Arrays.asList(names);		 
		 namesList.sort( ( name1, name2  ) -> name1.compareToIgnoreCase(name2) );
		 System.out.println("Lista ordenado" + Arrays.toString( names ) );
		 

		 interfaceRef = Hello::new;		
		 interfaceRef.sayHello(); 
		 
		  
		
	}

}
