package es.uvigo.esei.amchartsJava.validators;

import es.uvigo.esei.amchartsJava.constants.lang.I18n;
import es.uvigo.esei.amchartsJava.exceptions.FloatException;
import es.uvigo.esei.amchartsJava.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.exceptions.OutOfRangeException;

public class NumberValidator {

	private NumberValidator(){
		
	}
	
	public static boolean rangeFloatValidator(Number number,int lo, int hi) throws OutOfRangeException{
		if(number.floatValue()<lo || number.floatValue()>hi){
			throw new OutOfRangeException(I18n.get("RangeFloatException"));
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

	public static boolean floatValidator(Number number) throws FloatException {
		if(number instanceof Float || number instanceof Integer){
			return true;
		}
		throw new FloatException(I18n.get("FloatException"));
	}

}
