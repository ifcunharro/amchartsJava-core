package es.uvigo.esei.amchartsJava.core.constants.lang;

import java.util.HashMap;
import java.util.Map;


public class ES implements Idiom {

	private static Map<String,String> textsES = new HashMap<String,String>();
	
	static{
		textsES.put("RangeFloatException", "El número debe estar entre 0 y 1");
		textsES.put("RangeIntegerException", "Número fuera de rango: debe estar entre ");
		textsES.put("LanguageException", "El idioma no es válido");
		textsES.put("ColorException", "El formato de color debe ser #000000");
		textsES.put("IntegerException", "El número debe ser un entero");
		textsES.put("FloatException", "El número debe ser un real");
		textsES.put("and"," y ");
		textsES.put("CoordException","Las coordenadas deben ser un entero o porcentaje");
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
