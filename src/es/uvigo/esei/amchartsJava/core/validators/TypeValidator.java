package es.uvigo.esei.amchartsJava.core.validators;

import java.util.Arrays;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;

import es.uvigo.esei.amchartsJava.core.constants.AmchartsConstants;
import es.uvigo.esei.amchartsJava.core.constants.config.Config;
import es.uvigo.esei.amchartsJava.core.constants.lang.I18n;
import es.uvigo.esei.amchartsJava.core.controllers.PatternController;
import es.uvigo.esei.amchartsJava.core.exceptions.CoordException;

/**
 * This class contains especial type validators.
 * @author Iago Fernández Cuñarro
 *
 */
public class TypeValidator {
	
	private static final Logger logger = Logger.getLogger(TypeValidator.class.getName());

	
	private TypeValidator(){
		
	}
	
	/**
	 * Check string is integer or percent. Example: 100 or 100% is true.
	 * @param coord Value to check.
	 * @return boolean Value is an integer number or a percent.
	 * @throws CoordException Value is not an integer number or a percent.
	 */
	public static boolean pixelOrPercent(String coord) throws CoordException{
		if(Pattern.matches("[0-9]+%?", coord)){
			return true;
		}
		if(Config.getString("log").equals("file")){
			logger.info(I18n.get("CoordException"));
		}
		throw new CoordException(I18n.get("CoordException"));
		
	}
	
	/**
	 * Check string is correct format to date used by app.
	 * @param dateFormat Value to check.
	 * @return boolean Value is date format correct or incorrect.
	 */
	public static boolean checkDateFormat(String dateFormat){
		return Arrays.asList(AmchartsConstants.DATE_FORMAT).contains(dateFormat);
	}
	
	/**
	 * Check pattern have values to properties url, height and width.
	 * @param pattern Pattern to check
	 * @return boolean pattern correct or incorrect.
	 */
	public static boolean checkPattern(PatternController pattern){
		return pattern.getUrl() != null && pattern.getHeight() != null && pattern.getWidth() != null;
	}
	
	
}
