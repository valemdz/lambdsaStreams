package com.valeria.lambdsaStreams.moduloTres.services;

import java.util.Arrays;
import java.util.List;

import com.valeria.lambdsaStreams.moduloTres.entidades.Documento;

public class DocumentoService {
	
	private static List<Documento> documentos = Arrays.asList(
			new Documento("Doc1",1),
			new Documento("Doc20",20),
			new Documento("Doc5",5),
			new Documento("Doc3",3)
			);
	
	
	public List<Documento> findAll(){
		return documentos;
	}
	

}
