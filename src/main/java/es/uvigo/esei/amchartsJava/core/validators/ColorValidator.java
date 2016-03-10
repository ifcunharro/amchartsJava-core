package es.uvigo.esei.amchartsJava.core.validators;

import java.util.regex.Pattern;

import es.uvigo.esei.amchartsJava.core.constants.lang.I18n;
import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;

/**
 * This class contains validators to format of color.
 * @author Iago Fernández Cuñarro
 *
 */
public class ColorValidator {
	
	private ColorValidator(){
		
	}
	
	/**
	 * Check correct format color.
	 * @param color Value for color.
	 * @return boolean Correct or incorrect format color.
	 * @throws ColorException Format color doesn't admitted, format admitted: #ffffff
	 */
	public static boolean checkFormatColor(String color) throws ColorException{
		if(color != null){
			if(Pattern.matches("#[0-9A-Fa-f]{6}", color) == false){
				throw new ColorException(I18n.get("ColorException"));
			}else{
				return true;
			}
		}else{
			throw new ColorException(I18n.get("ColorException"));
		}
	}
	
	/**
	 * Check correct format color to multiple colors.
	 * @param colors Values for colors.
	 * @return boolean Correct or incorrect format color.
	 * @throws ColorException Format color doesn't admitted, format admitted: #ffffff
	 */
	public static boolean checkFormatColors(String... colors) throws ColorException{
		for(String color: colors){
			ColorValidator.checkFormatColor(color);
		}
		return true;
	}
	
	/**
	 * Check graphType that permit negativeColor.
	 * @param graphType AmGraph type.
	 * @return boolean Permitted or forbidden use of negativeColor.
	 */
	public static boolean canActivateNegativeColor(String graphType){
		if("line".equals(graphType) || "column".equals(graphType) || "step".equals(graphType)){
			return true;
		}
		return false;
	}

}
