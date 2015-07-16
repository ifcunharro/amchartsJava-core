package es.uvigo.esei.amchartsJava.constants.lang;

import java.util.HashMap;
import java.util.Map;


public class ES implements Idiom {

	private static Map<String,String> textsES = new HashMap<String,String>();
	
	static{
		textsES.put("RangeFloatException", "El número debe estar entre 0 y 1");
		textsES.put("LanguageException", "El idioma no es válido");
		textsES.put("ColorException", "El formato de color debe ser #000000");
		textsES.put("IntegerException", "El número debe ser un entero");
	}
	
	private ES(){
		
	}
	
	private static class InitSingleton{
		private static ES INSTANCE = new ES();
	}
	
	public static Idiom getInstance(){
		return InitSingleton.INSTANCE;
	}
	
	public String get(String key){
		return  textsES.get(key);
	}
	
}
