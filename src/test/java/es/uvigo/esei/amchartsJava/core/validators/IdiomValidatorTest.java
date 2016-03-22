package es.uvigo.esei.amchartsJava.core.validators;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import es.uvigo.esei.amchartsJava.core.constants.lang.Idiom;
import es.uvigo.esei.amchartsJava.core.constants.lang.Idioms;
import es.uvigo.esei.amchartsJava.core.exceptions.LangException;

public class IdiomValidatorTest {
	
	@Rule
	public final ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void checkIdiom_return_EN_instance_if_recive_null(){
		Idiom lang = null;
		try {
			lang = IdiomValidator.checkIdiom(null);
		} catch (LangException e) {
			e.printStackTrace();
		}
		
		assertEquals("EN",lang.getClass().getSimpleName());
	}
	
	@Test
	public void checkIdiom_return_idiom_instance_if_recive_en_or_es(){
		Idiom lang = null;
		for(Idioms idioms:Idioms.values()){
			try {
				lang = IdiomValidator.checkIdiom(idioms.toString());
			} catch (LangException e) {
				e.printStackTrace();
			}
			assertTrue(lang != null);
		}
	}
	
	@Test
	public void checkIdiom_launch_exception_if_recive_idiom_not_supported() throws LangException{
		thrown.expect(LangException.class);
		thrown.expectMessage("Language not valid");
		IdiomValidator.checkIdiom("pt");
	}

}
