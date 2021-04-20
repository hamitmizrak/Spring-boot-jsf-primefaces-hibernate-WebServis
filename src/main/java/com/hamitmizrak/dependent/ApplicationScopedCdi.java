package com.hamitmizrak.dependent;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;


@Named("applicationScopedCdi2")
@ApplicationScoped
public class ApplicationScopedCdi {

	@Inject
	DependentCdi dependentCdi;
	public String getDependentCdi() {
		return "application alani:"+ dependentCdi;
	}

}
