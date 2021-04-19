package com.hamitmizrak.cdi;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "injectProduces")
@SessionScoped
public class InjectCdi implements Serializable {
	private static final long serialVersionUID = 4519872140162674285L;
	
	//tüketici
	@Inject
	private String injectObject;

	
	public String getInjectObject ( ) {
		return injectObject;
	}
	
	
	
	
}
