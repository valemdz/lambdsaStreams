package com.valeria.lambdsaStreams.moduloTres;

import java.util.function.BinaryOperator;

import com.valeria.lambdsaStreams.moduloTres.entidades.Documento;
import com.valeria.lambdsaStreams.moduloTres.services.DocumentoService;

public class MainBiOperator {
	
	
	public static void  main(String ...args) {
	
		DocumentoService service =  new DocumentoService();		
		//service.findAll().forEach( System.out::println );
		
		BinaryOperator<Documento> biOperator= ( d1,d2) -> {
			 if( d1.getVersion() > d2.getVersion() ) {
				return d1;
			 }else {
				 return d2;
			 }
		 } ; 
		
		 Documento cero = new Documento();
		
		 //System.out.println( service.findAll().stream().reduce( cero, biOperator ) );		 
		 //Utilizamos un acumulador para ir conteniendo el documento con version mayor 
		 //Usamos un bioperator que es una especializacion de bifunction nada mas 
		 // que los parametros de entrada y salida son del mismo tipo en este caso Documento
		 //System.out.println( service.findAll().stream().reduce( cero, Documento::esMayorVersion ) );
		 
		
	}

}
