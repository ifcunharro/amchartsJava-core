package es.uvigo.esei.amchartsJava.core.validators;

import java.util.regex.Pattern;

import org.apache.log4j.Logger;

import es.uvigo.esei.amchartsJava.core.constants.Config;
import es.uvigo.esei.amchartsJava.core.constants.lang.I18n;
import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;

public class ColorValidator {
	
	private static final Logger logger = Logger.getLogger(ColorValidator.class.getName());

	
	private ColorValidator(){
		
	}
	
	public static boolean checkFormatColor(String color) throws ColorException{
		if(Pattern.matches("#[0-9A-Fa-f]{6}", color) == false){
			if(Config.getString("log").equals("file")){
				logger.info(I18n.get("ColorException"));
			}
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
	
	public static boolean canActivateNegativeColor(String graphType){
		if("line".equals(graphType) || "column".equals(graphType) || "step".equals(graphType)){
			return true;
		}
		return false;
	}

}
