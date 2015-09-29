package es.uvigo.esei.amchartsJava.core.model;

import java.util.HashMap;
import java.util.Map;

import es.uvigo.esei.amchartsJava.core.controllers.PatternController;


public class AmGraph extends IModel  {
	private PatternController pattern;
	//guarda todos los fields activados para graph y el nombre asociado
	private Map<String,String> graphFields;

	public void addGraphField(String nameField,String valueField){
		if(graphFields == null){
			graphFields = new HashMap<String, String>();
		}
		graphFields.put(nameField, valueField);
	}
	
	public PatternController getPattern() {
		return pattern;
	}
	
	public void addPattern(PatternController patternController){
		pattern = patternController;
	}

}
