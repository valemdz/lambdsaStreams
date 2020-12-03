package com.valeria.lambdsaStreams.moduloCinco;

import java.util.stream.Stream;

public class MainBuilder {

	public static void main( String[] args ) {
		
		Stream<Integer> numero = generarNumeros( 100 );		
		numero.forEach( System.out::println );

	}
	
	public static Stream<Integer>  generarNumeros( int cantidad ) {
		
		Stream.Builder<Integer> builder = Stream.builder();
		
		for( int i=0; i < cantidad; i++ ) {
			builder.add( i );
		}
		
		return builder.build();		
		
	}

}
