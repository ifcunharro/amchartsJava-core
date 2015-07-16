package es.uvigo.esei.amchartsJava.validators;

import es.uvigo.esei.amchartsJava.constants.lang.EN;
import es.uvigo.esei.amchartsJava.constants.lang.ES;
import es.uvigo.esei.amchartsJava.constants.lang.I18n;
import es.uvigo.esei.amchartsJava.constants.lang.Idiom;
import es.uvigo.esei.amchartsJava.constants.lang.Idioms;
import es.uvigo.esei.amchartsJava.exceptions.LangException;

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
