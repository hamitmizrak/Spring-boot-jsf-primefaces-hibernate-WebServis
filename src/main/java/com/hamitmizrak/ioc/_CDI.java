package com.hamitmizrak.ioc;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "cdiIOC")
@RequestScoped
public class _CDI {
	
	@Inject
	IBilgisayar iBilgisayar;
	
	public String getAnakartCdi() {
		return iBilgisayar.anakart ( "Anakart Xfx250" );
	}

}
