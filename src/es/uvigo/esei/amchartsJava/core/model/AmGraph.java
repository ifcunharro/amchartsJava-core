package es.uvigo.esei.amchartsJava.core.model;

import es.uvigo.esei.amchartsJava.core.controllers.PatternController;


public class AmGraph extends IModel  {
	private PatternController pattern;

	public Object getPattern() {
		return pattern;
	}
	
	public void addPattern(PatternController patternController){
		pattern = patternController;
	}

}
