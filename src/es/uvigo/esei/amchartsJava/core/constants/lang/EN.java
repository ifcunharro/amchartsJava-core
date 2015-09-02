package es.uvigo.esei.amchartsJava.core.constants.lang;

import java.util.HashMap;
import java.util.Map;


public class EN implements Idiom {

	private static Map<String,String> textsEN = new HashMap<String,String>();
	
	static{
		textsEN.put("RangeDoubleException", "Number must be between 0 and 1");
		textsEN.put("RangeIntegerException", "Number out of range: must be between ");
		textsEN.put("LanguageException", "Language not valid");
		textsEN.put("ColorException", "Format color should be #000000");
		textsEN.put("IntegerException", "Number must be an integer");
		textsEN.put("DoubleException", "Number must be a double");
		textsEN.put("and"," and ");
		textsEN.put("CoordException","Format coords must be an integer number or a percent");
		textsEN.put("NotSupportedException", " isn't supported by ");
		textsEN.put("ChartException", " needs to be added to a chart to can be used that property");
		textsEN.put("PatternException", "Pattern must have values to height, width and url");
		textsEN.put("JsonFileNotFoundException", "Json file not found in temp directory");
		textsEN.put("PropertiesException", "Not found configuration.properties into resources folder");
		textsEN.put("ConfigKeyException", "not found in configuration file.");



	}
	
	
	private EN(){
		
	}
	
	
	
	private static class InitSingleton{
		private static EN INSTANCE = new EN();
	}
	
	public static Idiom getInstance(){
		return InitSingleton.INSTANCE;
	}
	
	public String get(String key){
		return  textsEN.get(key);
	}
	
}
