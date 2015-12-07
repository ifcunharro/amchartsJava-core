package es.uvigo.esei.amchartsJava.core.validators;

import org.apache.log4j.Logger;

import es.uvigo.esei.amchartsJava.core.constants.config.Config;
import es.uvigo.esei.amchartsJava.core.constants.lang.I18n;
import es.uvigo.esei.amchartsJava.core.exceptions.DoubleException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;

/**
 * This class contains validators to numbers.
 * @author Iago Fernández Cuñarro
 *
 */
public class NumberValidator {

	private static final Logger logger = Logger.getLogger(NumberValidator.class.getName());

	
	private NumberValidator(){
		
	}
	
	/**
	 * Check number in range of double numbers.
	 * @param number Number to check.
	 * @param lo Value inferior of range.
	 * @param hi Value superior of range.
	 * @return boolean Number in range of values.
	 * @throws OutOfRangeException Value out of range admitted, range admitted: lo-hi
	 */
	public static boolean rangeDoubleValidator(Number number,int lo, int hi) throws OutOfRangeException{
		if(number.doubleValue()<lo || number.doubleValue()>hi){
			if(Config.getString("log").equals("file")){
				logger.info(I18n.get("RangeIntegerException")+lo+I18n.get("and")+hi);
			}
			throw new OutOfRangeException(I18n.get("RangeDoubleException")+lo+I18n.get("and")+hi);

		}
		return true;
	}
	
	/**
	 * Check number in range of integer numbers.
	 * @param number Number to check.
	 * @param lo Value inferior of range.
	 * @param hi Value superior of range.
	 * @return boolean Value in range of values.
	 * @throws OutOfRangeException Value out of range admitted, range admitted: lo-hi.
	 */
	public static boolean rangeIntegerValidator(Number number,int lo, int hi) throws OutOfRangeException{
		if(number.intValue()<lo || number.intValue()>hi){
			if(Config.getString("log").equals("file")){
				logger.info(I18n.get("RangeIntegerException")+lo+I18n.get("and")+hi);
			}
			throw new OutOfRangeException(I18n.get("RangeIntegerException")+lo+I18n.get("and")+hi);
		}
		return true;
	}
	
	/**
	 * Check number is an integer number.
	 * @param number Number to check.
	 * @return boolean Number is an integer number.
	 * @throws IntegerException Value is not an integer number.
	 */
	public static boolean integerValidator(Number number) throws IntegerException{
		if(number instanceof Integer){
			return true;
		}
		if(Config.getString("log").equals("file")){
			logger.info(I18n.get("IntegerException"));
		}
		throw new IntegerException(I18n.get("IntegerException"));
	}

	/**
	 * Check number is a double number.
	 * @param number Number to check.
	 * @return boolean Number is a double number.
	 * @throws DoubleException Value is not a double number.
	 */
	public static boolean doubleValidator(Number number) throws DoubleException {
		if(number instanceof Double){
			return true;
		}

		if(Config.getString("log").equals("file")){
			logger.info(I18n.get("DoubleException"));
		}
		throw new DoubleException(I18n.get("DoubleException"));
	}
	
	/**
	 * Check values for numbers are double numbers.
	 * @param array Values for numbers.
	 * @return boolean Numbers are all double numbers.
	 * @throws DoubleException Any value is not a double number.
	 */
	public static boolean checkArrayDoubles(Number... array) throws DoubleException{
		for(Number value: array){
			NumberValidator.doubleValidator(value);
		}
		return true;
	}
	
}
