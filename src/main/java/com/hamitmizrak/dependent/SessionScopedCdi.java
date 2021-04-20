package com.hamitmizrak.dependent;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;


@Named("sessionScopedCdi2")
@SessionScoped
public class SessionScopedCdi implements Serializable {
	private static final long serialVersionUID = -3574017754253524156L;
	
	@Inject
	DependentCdi dependentCdi;
	public String getDependentCdi() {
		return "session alani: "+ dependentCdi;
	}

}
