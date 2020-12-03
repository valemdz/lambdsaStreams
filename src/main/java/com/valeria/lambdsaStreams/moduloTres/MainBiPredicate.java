package com.valeria.lambdsaStreams.moduloTres;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

import com.valeria.lambdsaStreams.moduloTres.entidades.Documento;

public class MainBiPredicate {
	
	public static void main( String ...vargs ) {
		
		Documento d1=new Documento("Doc1",1);
		Documento d2=new Documento("Doc20",20);
		Documento d3=new Documento("Doc5",5);
		Documento d4=new Documento("Doc3",3);
		
		
		List<Documento> documentos = Arrays.asList(d1,d2,d3,d4 );
		
		
		BiPredicate<Documento, Documento> predicateMayor = MainBiPredicate::esMayor;
		
		List<Documento> fitrados  = documentos.stream()
				  				    .filter( docuInicial -> predicateMayor.test(docuInicial, d4) )
				  				    .collect( Collectors.toList() );
		
		
		fitrados.stream().map( d -> d.getTitulo() ).forEach( System.out::println  );
		
	}
	
	//Bi predicate
	static boolean esMayor( Documento d1, Documento d2 ) {
		if( d1.getVersion() > d2.getVersion() ) {
			return true;
		}
		return false;
	}

}
