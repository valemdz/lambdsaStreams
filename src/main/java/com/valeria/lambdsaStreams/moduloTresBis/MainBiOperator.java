package com.valeria.lambdsaStreams.moduloTresBis;

import java.util.function.BinaryOperator;

import com.valeria.lambdsaStreams.moduloTres.entidades.Documento;
import com.valeria.lambdsaStreams.moduloTres.services.DocumentoService;
import com.valeria.lambdsaStreams.moduloTresBis.entidades.Versionable;

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
		
		 System.out.println( service.findAll().stream().reduce( cero, Versionable::esMayorVersion ) );
		 
		// System.out.println( service.findAll().stream().reduce( );
		
	}

}
