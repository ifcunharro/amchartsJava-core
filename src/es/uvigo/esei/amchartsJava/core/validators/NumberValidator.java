package es.uvigo.esei.amchartsJava.core.validators;

import es.uvigo.esei.amchartsJava.core.constants.lang.I18n;
import es.uvigo.esei.amchartsJava.core.exceptions.DoubleException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;

public class NumberValidator {

	private NumberValidator(){
		
	}
	
	public static boolean rangeDoubleValidator(Number number,int lo, int hi) throws OutOfRangeException{
		if(number.doubleValue()<lo || number.doubleValue()>hi){
			throw new OutOfRangeException(I18n.get("RangeDoubleException"));
		}
		return true;
	}
	
	public static boolean rangeIntegerValidator(Number number,int lo, int hi) throws OutOfRangeException{
		if(number.intValue()<lo || number.intValue()>hi){
			throw new OutOfRangeException(I18n.get("RangeIntegerException")+lo+I18n.get("and")+hi);
		}
		return true;
	}
	
	public static boolean integerValidator(Number number) throws IntegerException{
		if(number instanceof Integer){
			return true;
		}
		throw new IntegerException(I18n.get("IntegerException"));
	}

	public static boolean doubleValidator(Number number) throws DoubleException {
		if(number instanceof Double || number instanceof Integer){
			return true;
		}
		throw new DoubleException(I18n.get("DoubleException"));
	}

}
