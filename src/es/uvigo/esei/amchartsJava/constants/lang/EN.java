package es.uvigo.esei.amchartsJava.constants.lang;

import java.util.HashMap;
import java.util.Map;


public class EN implements Idiom {

	private static Map<String,String> textsEN = new HashMap<String,String>();
	
	static{
		textsEN.put("RangeFloatException", "Number must be between 0 and 1");
		textsEN.put("RangeIntegerException", "Number out of range: must be between ");
		textsEN.put("LanguageException", "Language not valid");
		textsEN.put("ColorException", "Format color should be #000000");
		textsEN.put("IntegerException", "Number must be an integer");
		textsEN.put("and"," and ");
		textsEN.put("CoordException","Format coords must be a number integer or a percent");
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
