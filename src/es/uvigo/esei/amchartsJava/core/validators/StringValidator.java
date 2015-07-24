package es.uvigo.esei.amchartsJava.core.validators;

import java.util.regex.Pattern;

import es.uvigo.esei.amchartsJava.core.exceptions.CoordException;

public class StringValidator {
	
	private StringValidator(){
		
	}
	
	public static boolean pixelOrPercent(String coord) throws CoordException{
		if(Pattern.matches("[0-9]+%?", coord)){
			return true;
		}
		throw new CoordException("");
		
	}
	

}
