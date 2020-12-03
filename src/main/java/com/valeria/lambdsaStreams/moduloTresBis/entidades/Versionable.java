package com.valeria.lambdsaStreams.moduloTresBis.entidades;

public interface Versionable< T extends  Versionable< T > > {

	int  getVersion();

	//Un metodo estatico a nivel de interfaz
	/*static < T extends  Versionable< T >> T  esMayorVersion(  T  t1, T  t2 ) {
		
		if( t1.getVersion() > t2.getVersion() ) {
			return t1;
		}else {
			return t2;
		}
	}*/
	
	
	public default T esMayorVersion( T t1 ) {
		
		if( this.getVersion() > t1.getVersion() ) {
			return (T)this;
		}else {
			return t1;
		}
		
	}

}