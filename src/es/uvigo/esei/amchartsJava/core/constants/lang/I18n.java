package es.uvigo.esei.amchartsJava.core.constants.lang;

import es.uvigo.esei.amchartsJava.core.constants.config.Config;
import es.uvigo.esei.amchartsJava.core.exceptions.LangException;
import es.uvigo.esei.amchartsJava.core.validators.IdiomValidator;

public final class I18n {
	
	private static Idiom lang = ES.getInstance();
	
	static{
		try {
			lang = IdiomValidator.checkIdiom(Config.getString("lang"));
		} catch (LangException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Idiom getLanguage() {
		return lang;
	}
	
	public static void setLanguage(String language){
		try {
			lang = IdiomValidator.checkIdiom(language);
		} catch (LangException e) {
			//muestra mensaje pero conserva el idioma actual del sistema
			e.printStackTrace();
		}
	}
	
	public static String get(String key) {
		return lang.get(key);
	}
	
	

}
