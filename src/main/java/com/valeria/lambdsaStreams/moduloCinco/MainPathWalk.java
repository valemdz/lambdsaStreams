package com.valeria.lambdsaStreams.moduloCinco;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class MainPathWalk {

	public static void main(String[] args) {
		
		
		try {
			
			/*Stream<Path> paths = Files.walk(  Paths.get("./src"));
			paths.forEach( System.out::println );*/
			
			//Listar solo los archivos 
			
			           Files.walk( Paths.get("./src") )
					 	  .map( Path::toFile )
					 	  .filter(File::isFile )
					 	  .map(File::getName)
					 	  .forEach(System.out::println );
			 
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
