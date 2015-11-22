package es.uvigo.esei.amchartsJava.core.validators;

import org.apache.log4j.Logger;

import es.uvigo.esei.amchartsJava.core.constants.config.Config;
import es.uvigo.esei.amchartsJava.core.constants.lang.I18n;
import es.uvigo.esei.amchartsJava.core.exceptions.DoubleException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;

public class NumberValidator {

	private static final Logger logger = Logger.getLogger(NumberValidator.class.getName());

	
	private NumberValidator(){
		
	}
	
	public static boolean rangeDoubleValidator(Number number,int lo, int hi) throws OutOfRangeException{
		if(number.doubleValue()<lo || number.doubleValue()>hi){
			if(Config.getString("log").equals("file")){
				logger.info(I18n.get("RangeIntegerException")+lo+I18n.get("and")+hi);
			}
			throw new OutOfRangeException(I18n.get("RangeDoubleException")+lo+I18n.get("and")+hi);

		}
		return true;
	}
	
	public static boolean rangeIntegerValidator(Number number,int lo, int hi) throws OutOfRangeException{
		if(number.intValue()<lo || number.intValue()>hi){
			if(Config.getString("log").equals("file")){
				logger.info(I18n.get("RangeIntegerException")+lo+I18n.get("and")+hi);
			}
			throw new OutOfRangeException(I18n.get("RangeIntegerException")+lo+I18n.get("and")+hi);
		}
		return true;
	}
	
	public static boolean integerValidator(Number number) throws IntegerException{
		if(number instanceof Integer){
			return true;
		}
		if(Config.getString("log").equals("file")){
			logger.info(I18n.get("IntegerException"));
		}
		throw new IntegerException(I18n.get("IntegerException"));
	}

	public static boolean doubleValidator(Number number) throws DoubleException {
		if(number instanceof Double){
			return true;
		}

		if(Config.getString("log").equals("file")){
			logger.info(I18n.get("DoubleException"));
		}
		throw new DoubleException(I18n.get("DoubleException"));
	}
	
	public static boolean checkArrayDoubles(Number... array) throws DoubleException{
		for(Number value: array){
			NumberValidator.doubleValidator(value);
		}
		return true;
	}
	
}
