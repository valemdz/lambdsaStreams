package com.valeria.lambdsaStreams.moduloCinco;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.valeria.lambdsaStreams.moduloCinco.entities.Factura;

public class MainSorting {

	public static void main(String[] args) {
		
		List<Factura> facturas = new ArrayList<>();
		
		Factura f = null;
		
		for( int i = 0; i < 1_000_000; i++ ) {
			f = new Factura( i, "Concepto" + i, Math.round( Math.random() * 10000 ) );
			facturas.add(f);
		}
		
		/*facturas.stream()
		.limit(10)		
		.forEach(System.out::println);*/
		
				
		/*facturas.stream()
				.limit(10)
				.sorted(  ( f1,  f2 ) ->  f1.getNumero() - f2.getNumero()  )
				.forEach(System.out::println);*/
		
		/*Collections.sort( facturas , ( f1,  f2 ) -> (int) ( f1.getImporte() - f2.getImporte() ) );
		facturas.stream().limit(1000).forEach( System.out::println ); */
		
		facturas.stream()
				.limit(1000)
				.sorted( Comparator.comparing( Factura::getImporte)
								   .thenComparing( Factura::getConcepto ) )
				.forEach( System.out::println );

	}

}
