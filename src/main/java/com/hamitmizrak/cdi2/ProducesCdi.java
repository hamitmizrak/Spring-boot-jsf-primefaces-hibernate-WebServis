package com.hamitmizrak.cdi2;

import javax.enterprise.inject.New;
import javax.enterprise.inject.Produces;

public class ProducesCdi {

	@Produces
	private String[] producesObject( @New NewCdi cdi) {
		
		String[] dizi=new String[1];
		dizi[0]=cdi.getName ( );
		
		return dizi;
	}
}
