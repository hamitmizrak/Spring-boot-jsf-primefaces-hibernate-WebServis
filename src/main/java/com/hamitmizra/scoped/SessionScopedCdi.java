package com.hamitmizra.scoped;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class SessionScopedCdi implements Serializable {
	private static final long serialVersionUID = 8832048959029853966L;
	
	//Ram kullanıyoruz. Ramde yer kalmazsa 
	
	private String kelime;

	
	public SessionScopedCdi ( ) {
		// TODO Auto-generated constructor stub
	}
	public SessionScopedCdi ( String kelime ) {
		super ( );
		this.kelime = kelime;
	}

	@Override
	public String toString ( ) {
		return "SessionScopedCdi [kelime=" + kelime + "]";
	}

	public String getKelime ( ) {
		return kelime;
	}
	
	public void setKelime ( String kelime ) {
		this.kelime = kelime;
	}
	
	
}
