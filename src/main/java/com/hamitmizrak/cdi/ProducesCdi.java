package com.hamitmizrak.cdi;

import javax.enterprise.inject.Produces;

public class ProducesCdi {

	//üretici
	@Produces
	private String producesObject="Produces Yapısından geldim";

	public String getProducesObject ( ) {
		return producesObject;
	}

	
	public void setProducesObject ( String producesObject ) {
		this.producesObject = producesObject;
	}


	
	
	
	
}
