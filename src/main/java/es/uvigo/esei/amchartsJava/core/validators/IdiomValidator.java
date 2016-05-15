package es.uvigo.esei.amchartsJava.core.validators;

import es.uvigo.esei.amchartsJava.core.constants.lang.EN;
import es.uvigo.esei.amchartsJava.core.constants.lang.ES;
import es.uvigo.esei.amchartsJava.core.constants.lang.I18n;
import es.uvigo.esei.amchartsJava.core.constants.lang.Idiom;
import es.uvigo.esei.amchartsJava.core.constants.lang.Idioms;
import es.uvigo.esei.amchartsJava.core.exceptions.LangException;

/**
 * This class contains validator to chose idiom.
 * @author Iago Fernández Cuñarro
 *
 */
public final class IdiomValidator {
	
	private IdiomValidator(){
		
	}
	
	/**
	 * Chose an idiom supported by app.
	 * @param language Value for language.
	 * @return Idiom Instance of language of app.
	 * @throws LangException Idiom is not supported by app.
	 */
	public static Idiom checkIdiom(final String language) throws LangException{
		if(language == null){
			return EN.getInstance();
		}
		try{
			switch(Idioms.valueOf(language)){
				case es:
					return ES.getInstance();
				case en:
					return EN.getInstance();
			}
			
		}catch(IllegalArgumentException e1){
			throw new LangException(I18n.get("LanguageException"));
		}
		return null;
		
		
	}

}
