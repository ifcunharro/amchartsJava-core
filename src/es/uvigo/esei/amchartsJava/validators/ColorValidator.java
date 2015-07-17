package es.uvigo.esei.amchartsJava.validators;

import java.util.regex.Pattern;

import es.uvigo.esei.amchartsJava.constants.lang.I18n;
import es.uvigo.esei.amchartsJava.exceptions.ColorException;

public class ColorValidator {
	
	private ColorValidator(){
		
	}
	
	public static boolean checkFormatColor(String color) throws ColorException{
		if(Pattern.matches("#[0-9A-Fa-f]{6}", color) == false){
			throw new ColorException(I18n.get("ColorException"));
		};
		return true;
	}
	
	public static boolean checkFormatColors(String... colors) throws ColorException{
		for(String color: colors){
			ColorValidator.checkFormatColor(color);
		}
		return true;
	}

}
