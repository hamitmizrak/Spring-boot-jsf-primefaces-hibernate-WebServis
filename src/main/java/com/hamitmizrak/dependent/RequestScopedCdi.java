package com.hamitmizrak.dependent;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;


@Named("requestScopedCdi2")
@RequestScoped
public class RequestScopedCdi {

	@Inject
	DependentCdi dependentCdi;
	public String getDependentCdi() {
		return "request alani:"+ dependentCdi;
	}

}
