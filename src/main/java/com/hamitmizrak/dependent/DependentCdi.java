package com.hamitmizrak.dependent;

import java.io.Serializable;

import javax.enterprise.context.Dependent;
import javax.inject.Named;

@Named
@Dependent
public class DependentCdi implements Serializable {
	private static final long serialVersionUID = 6834678312558001070L;
	
	private String dependentField;

	
	public String getDependentField ( ) {
		return dependentField;
	}

	
	public void setDependentField ( String dependentField ) {
		this.dependentField = dependentField;
	}

	
	public static long getSerialversionuid ( ) {
		return serialVersionUID;
	}
	

}
