package com.valeria.lambdsaStreams.moduloCinco;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ForkJoinPool;

import com.valeria.lambdsaStreams.moduloCinco.entities.Factura;

public class MainForkJoinPool {

	public static void main(String[] args) {
		
		List<Factura> facturas = new ArrayList<>();
		
		Factura f = null;
		
		for( int i = 0; i < 10; i++ ) {
			f = new Factura( i, "Concepto" + i, Math.round( Math.random() * 10000 ) );
			facturas.add(f);
		}
		
		// Quiero tener el control de los hilos creados
		ForkJoinPool pool = new ForkJoinPool(4);
		
		long t1 = System.currentTimeMillis();
		
		Optional<Double> total = null;
				
		try {	
			
			//Mando un trabajo 
			total = pool.submit(
						() -> {	return facturas
									.parallelStream()
									.map( Factura::getImporte )
									.map( MainForkJoinPool::duplicar )
									.reduce( Double::sum );	}	).get();
		}catch(Exception ex ) {
			ex.printStackTrace();
		}		
				

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
