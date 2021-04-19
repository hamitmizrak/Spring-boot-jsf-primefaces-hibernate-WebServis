package com.hamitmizrak.cdi;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named(value = "malatya")
@RequestScoped
public class BeanDeneme {
	
	private String adi;

	
	public BeanDeneme ( ) {
		adi="Hamit Mızrak";
	}
	
	public String getAdi ( ) {
		return adi;
	}

	
	public void setAdi ( String adi ) {
		this.adi = adi;
	}
	

}
