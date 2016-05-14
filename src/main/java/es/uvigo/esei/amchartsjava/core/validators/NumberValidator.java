package es.uvigo.esei.amchartsjava.core.validators;

import es.uvigo.esei.amchartsjava.core.constants.lang.I18n;
import es.uvigo.esei.amchartsjava.core.exceptions.DoubleException;
import es.uvigo.esei.amchartsjava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsjava.core.exceptions.OutOfRangeException;

/**
 * This class contains validators to numbers.
 * @author Iago Fernández Cuñarro
 *
 */
public final class NumberValidator {

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
	public static boolean rangeDoubleValidator(final Number number,final int lo,final int hi) throws OutOfRangeException{
		if(number == null){
			throw new OutOfRangeException(I18n.get("RangeException")+lo+I18n.get("and")+hi);
		}
		if(number.doubleValue()<lo || number.doubleValue()>hi){
			throw new OutOfRangeException(I18n.get("RangeException")+lo+I18n.get("and")+hi);

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
	public static boolean rangeIntegerValidator(final Number number,final int lo,final int hi) throws OutOfRangeException{
		if(number == null){
			throw new OutOfRangeException(I18n.get("RangeException")+lo+I18n.get("and")+hi);
		}
		if(number.intValue()<lo || number.intValue()>hi){
			throw new OutOfRangeException(I18n.get("RangeException")+lo+I18n.get("and")+hi);
		}
		return true;
	}
	
	/**
	 * Check number is an integer number.
	 * @param number Number to check.
	 * @return boolean Number is an integer number.
	 * @throws IntegerException Value is not an integer number.
	 */
	public static boolean integerValidator(final Number number) throws IntegerException{
		if(number == null){
			throw new IntegerException(I18n.get("IntegerException"));
		}
		if(number instanceof Integer){
			return true;
		}
		throw new IntegerException(I18n.get("IntegerException"));
	}

	/**
	 * Check number is a double number.
	 * @param number Number to check.
	 * @return boolean Number is a double number.
	 * @throws DoubleException Value is not a double number.
	 */
	public static boolean doubleValidator(final Number number) throws DoubleException {
		if(number == null){
			throw new DoubleException(I18n.get("DoubleException"));
		}
		if(number.getClass().getSimpleName().equals("Double")){
			return true;
		}
		throw new DoubleException(I18n.get("DoubleException"));
	}
	
	/**
	 * Check values for numbers are double numbers.
	 * @param array Values for numbers.
	 * @return boolean Numbers are all double numbers.
	 * @throws DoubleException Any value is not a double number.
	 */
	public static boolean checkArrayDoubles(final Number... array) throws DoubleException{
		if(array == null){
			throw new DoubleException(I18n.get("DoubleException"));
		}
		for(Number value: array){
			NumberValidator.doubleValidator(value);
		}
		return true;
	}
	
}
