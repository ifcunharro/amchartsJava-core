package es.uvigo.esei.amchartsJava.core.constants.lang;

import java.util.HashMap;
import java.util.Map;

/**
 * This class contains all texts used by amcharts core in english idiom.
 * @author Iago Fernández Cuñarro
 *
 */
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
		
		textsEN.put("dayNames", "['Sunday', 'Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday'];");
		textsEN.put("shortDayNames", "['Sun', 'Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat'];");
		textsEN.put("monthNames", "['January', 'February', 'March', 'April', 'May', 'June', 'July', 'August', 'September', 'October', 'November', 'December'];");
		textsEN.put("shortMonthNames", "['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec'];");

	}
	
	
	private EN(){
		
	}
	
	private static class InitSingleton{
		private static EN INSTANCE = new EN();
	}
	
	/**
	 * Get a singleton of this class.
	 * @return Idiom Instance of app language.
	 */
	public static Idiom getInstance(){
		return InitSingleton.INSTANCE;
	}
	
	/**
	 * Get a text in english.
	 * @param key Key asociated to text searched.
	 * @return String Text searched.
	 */
	public String get(String key){
		return  textsEN.get(key);
	}
	
}
