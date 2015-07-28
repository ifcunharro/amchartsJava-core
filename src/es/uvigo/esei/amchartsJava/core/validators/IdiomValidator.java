package es.uvigo.esei.amchartsJava.core.validators;

import es.uvigo.esei.amchartsJava.core.constants.lang.EN;
import es.uvigo.esei.amchartsJava.core.constants.lang.ES;
import es.uvigo.esei.amchartsJava.core.constants.lang.I18n;
import es.uvigo.esei.amchartsJava.core.constants.lang.Idiom;
import es.uvigo.esei.amchartsJava.core.constants.lang.Idioms;
import es.uvigo.esei.amchartsJava.core.exceptions.LangException;

public class IdiomValidator {
	
	private IdiomValidator(){
		
	}
	
	public static Idiom checkIdiom(String language) throws LangException{
		
		try{
			switch(Idioms.valueOf(language)){
				case ES:
					return ES.getInstance();
				case EN:
					return EN.getInstance();
			}
			
		}catch(IllegalArgumentException e1){
			throw new LangException(I18n.get("LanguageException"));
		}
		return null;
		
		
	}

}
