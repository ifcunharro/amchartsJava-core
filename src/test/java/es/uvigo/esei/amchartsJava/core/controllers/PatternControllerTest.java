package es.uvigo.esei.amchartsJava.core.controllers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import es.uvigo.esei.amchartsJava.core.constants.paths.AmchartsJavaPaths;
import es.uvigo.esei.amchartsJava.core.controllers.PatternController;
import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;

public class PatternControllerTest {
	
	@Rule
	public final ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void color_property_return_string_if_format_color_is_correct() throws ColorException{
		PatternController pattern = new PatternController();
		
		pattern.setColor("#000000");
		
		assertEquals("#000000", pattern.getColor());
		
	}
	
	@Test
	public void color_property_launch_exception_if_format_color_is_incorrect() throws ColorException{
		thrown.expect(ColorException.class);
		thrown.expectMessage("Format color should be #000000");
		PatternController pattern = new PatternController();
		
		pattern.setColor("255,255,255");
		
	}
	
	@Test
	public void color_property_return_null_if_is_not_setted() throws ColorException{
		PatternController pattern = new PatternController();
		
		assertNull(pattern.getColor());
		
	}
	
	@Test
	public void property_numeric_with_value_integer_in_range_must_return_integer() throws OutOfRangeException{
		PatternController pattern = new PatternController();
		
		pattern.setHeight(4);
		pattern.setWidth(6);
		
		assertSame(4, pattern.getHeight());
		assertSame(6, pattern.getWidth());
		
	}
	
	@Test
	public void property_numeric_with_value_integer_out_range_launch_exception() throws OutOfRangeException{
		thrown.expect(OutOfRangeException.class);
		thrown.expectMessage("Number out of range: must be between 2 and 6");
		PatternController pattern = new PatternController();
		
		pattern.setHeight(37);
		
	}
	
	@Test
	public void property_numeric_with_value_integer_return_null_if_is_not_setted() throws OutOfRangeException{
		PatternController pattern = new PatternController();
		
		assertNull(pattern.getHeight());
		assertNull(pattern.getWidth());
	}
	
	@Test
	public void url_property_must_return_string_if_pattern_exist_in_pattern_folder(){
		PatternController patternController = new PatternController();
		URL patternsPath;
		patternsPath = PatternControllerTest.class.getProtectionDomain()
				   .getCodeSource()
				   .getLocation();
		try {
			patternsPath = new URL(patternsPath,AmchartsJavaPaths.URL_PATTERNS);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		File[] patternsFolders = new File(patternsPath.getFile()).listFiles();
		for(File patternFolder: patternsFolders){
			if(patternFolder.isDirectory()){
				for(String pattern: patternFolder.list()){
					patternController.addUrl(patternFolder.getName(), pattern);
					assertEquals(AmchartsJavaPaths.URL_PATTERNS+patternFolder.getName()
							+"/"+pattern, patternController.getUrl());
					
				}
			}
		}
		
	}
	
	@Test
	public void url_property_must_return_null_if_pattern_not_exist_in_pattern_folder(){
		PatternController patternController = new PatternController();
		URL patternsPath;
		patternsPath = PatternControllerTest.class.getProtectionDomain()
				   .getCodeSource()
				   .getLocation();
		try {
			patternsPath = new URL(patternsPath,AmchartsJavaPaths.URL_PATTERNS);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
		patternController.addUrl("black", ".png");
		assertNull(patternController.getUrl());
		
		File[] patternsFolders = new File(patternsPath.getFile()).listFiles();
		for(File patternFolder: patternsFolders){
			if(patternFolder.isDirectory()){
				for(String pattern: patternFolder.list()){
					assertTrue(AmchartsJavaPaths.URL_PATTERNS+patternFolder.getName()
							+"/"+pattern != patternController.getUrl());
					
				}
			}
		}
		
		
		
	}

}
