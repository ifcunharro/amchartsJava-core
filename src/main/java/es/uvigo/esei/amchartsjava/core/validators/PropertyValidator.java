package es.uvigo.esei.amchartsjava.core.validators;

import java.util.Arrays;
import java.util.regex.Pattern;

import es.uvigo.esei.amchartsjava.core.constants.AmchartsConstants;
import es.uvigo.esei.amchartsjava.core.constants.lang.I18n;
import es.uvigo.esei.amchartsjava.core.controllers.PatternController;
import es.uvigo.esei.amchartsjava.core.exceptions.CoordException;

/**
 * This class contains string and pattern validators.
 * @author Iago Fernández Cuñarro
 *
 */
public final class PropertyValidator {
	

	private PropertyValidator(){
		
	}
	
	/**
	 * Check string is integer or percent. Example: 100 or 100% is true.
	 * @param coord Value to check.
	 * @return boolean Value is an integer number or a percent.
	 * @throws CoordException Value is not an integer number or a percent.
	 */
	public static boolean pixelOrPercent(final String coord) throws CoordException{
		if(coord == null){
			throw new CoordException(I18n.get("CoordException"));
		}
		if(Pattern.matches("[0-9]+%?", coord)){
			return true;
		}
		throw new CoordException(I18n.get("CoordException"));
		
	}
	
	/**
	 * Check string is correct format to date used by app.
	 * @param dateFormat Value to check.
	 * @return boolean Value is date format correct or incorrect.
	 */
	public static boolean checkDateFormat(final String dateFormat){
		return Arrays.asList(AmchartsConstants.DATE_FORMAT).contains(dateFormat);
	}
	
	/**
	 * Check value valid to property.
	 * @param value value property to check
	 * @return true if valid, false if invalid
	 */
	public static boolean isValidString(final String value){
		return value != null && !value.isEmpty();
	}
	
	/**
	 * Check pattern have values to properties url, height and width.
	 * @param pattern Pattern to check
	 * @return boolean pattern correct or incorrect.
	 */
	public static boolean checkPattern(final PatternController pattern){
		if(pattern == null){
			return false;
		}
		return pattern.getUrl() != null && pattern.getHeight() != null && pattern.getWidth() != null;
	}
	
	
}
