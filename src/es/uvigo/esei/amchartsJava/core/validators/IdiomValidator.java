package es.uvigo.esei.amchartsJava.core.validators;

import org.apache.log4j.Logger;

import es.uvigo.esei.amchartsJava.core.constants.Config;
import es.uvigo.esei.amchartsJava.core.constants.lang.EN;
import es.uvigo.esei.amchartsJava.core.constants.lang.ES;
import es.uvigo.esei.amchartsJava.core.constants.lang.I18n;
import es.uvigo.esei.amchartsJava.core.constants.lang.Idiom;
import es.uvigo.esei.amchartsJava.core.constants.lang.Idioms;
import es.uvigo.esei.amchartsJava.core.exceptions.LangException;

public class IdiomValidator {
	
	private static final Logger logger = Logger.getLogger(IdiomValidator.class.getName());

	
	private IdiomValidator(){
		
	}
	
	public static Idiom checkIdiom(String language) throws LangException{
		
		try{
			switch(Idioms.valueOf(language)){
				case es:
					return ES.getInstance();
				case en:
					return EN.getInstance();
			}
			
		}catch(IllegalArgumentException e1){
			if(Config.getString("log").equals("file")){
				logger.error(I18n.get("LanguageException"));
			}
			throw new LangException(I18n.get("LanguageException"));
		}
		return null;
		
		
	}

}
