package es.uvigo.esei.amchartsJava.core.validators;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import es.uvigo.esei.amchartsJava.core.constants.AmchartsConstants;
import es.uvigo.esei.amchartsJava.core.constants.config.Config;
import es.uvigo.esei.amchartsJava.core.constants.paths.AmchartsJavaPaths;
import es.uvigo.esei.amchartsJava.core.controllers.PatternController;
import es.uvigo.esei.amchartsJava.core.exceptions.CoordException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsJava.core.validators.PropertyValidator;

public class PropertyValidatorTest {
	
	@Rule
	public final ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void pixelOrPercent_return_true_if_recive_integer_or_integer_percent_as_string(){
		try {
			assertTrue(PropertyValidator.pixelOrPercent("100"));
			assertTrue(PropertyValidator.pixelOrPercent("59%"));
		} catch (CoordException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void pixelOrPercent_launch_exception_if_recive_null() throws CoordException{
		thrown.expect(CoordException.class);
		switch (Config.getString("lang")) {
			case "en":
				thrown.expectMessage("Format coords must be an integer number or a percent");
				break;
			case "es":
				thrown.expectMessage("Las coordenadas deben ser un entero o porcentaje");
				break;
		}
		PropertyValidator.pixelOrPercent(null);
	}
	
	@Test
	public void pixelOrPercent_launch_exception_if_not_recive_integer_or_integer_percent() throws CoordException{
		thrown.expect(CoordException.class);
		switch (Config.getString("lang")) {
			case "en":
				thrown.expectMessage("Format coords must be an integer number or a percent");
				break;
			case "es":
				thrown.expectMessage("Las coordenadas deben ser un entero o porcentaje");
				break;
		}
		PropertyValidator.pixelOrPercent("90.8%");
	}
	
	@Test
	public void checkDateFormat_return_true_if_format_of_date_is_valid(){
		assertTrue(PropertyValidator.checkDateFormat(AmchartsConstants.DATE_FORMAT[0]));
	}
	
	@Test
	public void checkDateFormat_return_false_if_format_of_date_is_invalid(){
		assertFalse(PropertyValidator.checkDateFormat(" "));
	}
	
	@Test
	public void isValidString_return_true_if_string_is_not_null_and_nor_empty(){
		assertTrue(PropertyValidator.isValidString("valid"));
	}
	
	@Test
	public void isValidString_return_false_if_string_is_null(){
		assertFalse(PropertyValidator.isValidString(null));
	}
	
	@Test
	public void isValidString_return_false_if_string_is_empty(){
		assertFalse(PropertyValidator.isValidString(""));
	}
	
	@Test
	public void checkPattern_return_false_if_recive_null(){
		assertFalse(PropertyValidator.checkPattern(null));
	}
	
	@Test
	public void checkPattern_return_false_if_pattern_is_invalid(){
		PatternController pattern = new PatternController();
		
		assertFalse(PropertyValidator.checkPattern(pattern));
	}
	
	//patterns folder must contain some pattern folder and doesn't be empty to pass
	//this test
	@Test
	public void checkPattern_return_true_if_pattern_is_valid(){
		URL patternsPath;
		String url = "";
		String folder = "";
		patternsPath = PropertyValidatorTest.class.getProtectionDomain()
				   .getCodeSource()
				   .getLocation();
		try {
			patternsPath = new URL(URLDecoder.decode(patternsPath.toString(), "UTF-8"));
			patternsPath = new URL(patternsPath,AmchartsJavaPaths.URL_PATTERNS);
		} catch (MalformedURLException | UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		File[] patternsFolders = new File(patternsPath.getFile()).listFiles();
		for(File patternFolder: patternsFolders){
			if(patternFolder.isDirectory()){
				folder = patternFolder.getName();
				url = patternFolder.list()[0];
				
			}
		}
		
		PatternController pattern = new PatternController();
		pattern.addUrl(folder, url);
		try {
			pattern.setHeight(4);
			pattern.setWidth(4);
		} catch (OutOfRangeException e) {
			e.printStackTrace();
		}
		
		assertTrue(PropertyValidator.checkPattern(pattern));
		
	}

}
