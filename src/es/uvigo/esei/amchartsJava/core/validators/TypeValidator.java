package es.uvigo.esei.amchartsJava.core.validators;

import java.util.Arrays;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;

import es.uvigo.esei.amchartsJava.core.constants.DateFormatConstant;
import es.uvigo.esei.amchartsJava.core.constants.config.Config;
import es.uvigo.esei.amchartsJava.core.constants.lang.I18n;
import es.uvigo.esei.amchartsJava.core.controllers.PatternController;
import es.uvigo.esei.amchartsJava.core.exceptions.CoordException;

public class TypeValidator {
	
	private static final Logger logger = Logger.getLogger(TypeValidator.class.getName());

	
	private TypeValidator(){
		
	}
	
	public static boolean pixelOrPercent(String coord) throws CoordException{
		if(Pattern.matches("[0-9]+%?", coord)){
			return true;
		}
		if(Config.getString("log").equals("file")){
			logger.info(I18n.get("CoordException"));
		}
		throw new CoordException(I18n.get("CoordException"));
		
	}
	
	public static boolean checkDateFormat(String dateFormat){
		return Arrays.asList(DateFormatConstant.getDateFormat()).contains(dateFormat);
	}
	
	public static boolean checkPattern(PatternController pattern){
		return pattern.getUrl() != null && pattern.getHeight() != null && pattern.getWidth() != null;
	}
	
	
}
