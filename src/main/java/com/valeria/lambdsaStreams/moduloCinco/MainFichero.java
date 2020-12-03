package com.valeria.lambdsaStreams.moduloCinco;

import java.io.File;

public class MainFichero {

	public static void main(String[] args) {
		
		System.out.println( System.getProperty("user.dir") );
		
		File file = new File("./src");
		
		listarDirectorio( file );

	}
	
	public static void listarDirectorio( File file ){
		
		System.out.println( file.getName() );
		
		if(  file.isDirectory()  ) {			
			
			File[] archivos =  file.listFiles();
			
			for( File a: archivos ) {
				listarDirectorio( a );
			}
			
		}		
	}

}
