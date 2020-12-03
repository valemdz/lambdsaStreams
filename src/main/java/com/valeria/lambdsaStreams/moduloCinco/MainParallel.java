package com.valeria.lambdsaStreams.moduloCinco;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import com.valeria.lambdsaStreams.moduloCinco.entities.Factura;

public class MainParallel {

	public static void main(String[] args) {
		
		List<Factura> facturas = new ArrayList<>();
		
		Factura f = null;
		
		for( int i = 0; i < 10; i++ ) {
			f = new Factura( i, "Concepto" + i, Math.round( Math.random() * 10000 ) );
			facturas.add(f);
		}
		
		
		long t1 = System.currentTimeMillis();
		
		Optional<Double> total = facturas
								.parallelStream()
								.map( Factura::getImporte )
								.map( MainParallel::duplicar )
								.reduce( Double::sum );

		long t2 = System.currentTimeMillis();
		
		total.ifPresent( System.out::println );
		
		System.out.println("Tiempo Total " + (t2 - t1) );
		
	}
	
	
	public static double duplicar( double importe ) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return importe * 2;
	}

}
