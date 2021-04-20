package com.hamitmizrak.cdi2;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "newProducesInject")
@RequestScoped
public class InjectCdi {

	@Inject
	private String[] injectObject;

	
	public String[] getInjectObject ( ) {
		return injectObject;
	}
	
	
}
