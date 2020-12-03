package com.valeria.lambdsaStreams.Extras.BoxingUnBoxing;

public class Boxing {

	public static void main(String[] args) {		
		//syso atajo System.out.print
		//Se desestima el uso de constructores 
		//Boxing
		Integer numero = Integer.valueOf("150");
		//Unboxing;
		int valorInt = numero.intValue(); 
		
		System.out.println( valorInt + " - " + numero);
		
		 autoBoxing();
	}
	
	public static void autoBoxing() {
		
		Integer nuevo = 200;
		int nuevoInteger = nuevo;
		
		System.out.println( nuevo + " - " + nuevoInteger );
	}

}
