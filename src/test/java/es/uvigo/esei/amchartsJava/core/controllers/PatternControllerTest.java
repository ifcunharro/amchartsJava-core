package es.uvigo.esei.amchartsJava.core.controllers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
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
import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;

public class PatternControllerTest {
	
	@Rule
	public final ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void color_property_return_string_if_format_color_is_correct(){
		PatternController pattern = new PatternController();
		
		try {
			pattern.setColor("#000000");
		} catch (ColorException e) {
			e.printStackTrace();
		}
		
		assertEquals("#000000", pattern.getColor());
		
	}
	
	@Test
	public void color_property_launch_exception_if_format_color_is_incorrect() throws ColorException{
		thrown.expect(ColorException.class);
		switch (Config.getString("lang")) {
			case "en":
				thrown.expectMessage("Format color should be #000000");
				break;
			case "es":
				thrown.expectMessage("El formato de color debe ser #000000");
				break;
		}
		
		PatternController pattern = new PatternController();
		
		pattern.setColor("255,255,255");
		
	}
	
	@Test
	public void color_property_return_null_if_is_not_setted(){
		PatternController pattern = new PatternController();
		
		assertNull(pattern.getColor());
		
	}
	
	@Test
	public void property_numeric_with_value_integer_in_range_must_return_integer(){
		PatternController pattern = new PatternController();
		
		try {
			pattern.setHeight(4);
			pattern.setWidth(6);
		} catch (OutOfRangeException e) {
			e.printStackTrace();
		}
		
		assertEquals(4, (Object)pattern.getHeight());
		assertEquals(6, (Object)pattern.getWidth());
		
	}
	
	@Test
	public void property_numeric_with_value_integer_out_range_launch_exception_if_improvedVisibility_equals_true() throws OutOfRangeException{
		PatternController pattern = new PatternController();
		if(AmchartsConstants.IMPROVED_VISIBILITY.equals("true")){
			thrown.expect(OutOfRangeException.class);
			switch (Config.getString("lang")) {
				case "en":
					thrown.expectMessage("Number out of range: must be between 2 and 6");
					break;
				case "es":
					thrown.expectMessage("Número fuera de rango: debe estar entre 2 y 6");
					break;
			}
			
			pattern.setHeight(37);
		}else{
			pattern.setHeight(37);
		}
		
	}
	
	@Test
	public void property_numeric_with_value_integer_return_null_if_is_not_setted(){
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
			patternsPath = new URL(URLDecoder.decode(patternsPath.toString(), "UTF-8"));
			patternsPath = new URL(patternsPath,AmchartsJavaPaths.URL_PATTERNS);
		} catch (MalformedURLException | UnsupportedEncodingException e) {
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
			patternsPath = new URL(URLDecoder.decode(patternsPath.toString(), "UTF-8"));
			patternsPath = new URL(patternsPath,AmchartsJavaPaths.URL_PATTERNS);
		} catch (MalformedURLException | UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		patternController.addUrl("black", ".png");
		assertNull(patternController.getUrl());
		
		File[] patternsFolders = new File(patternsPath.getFile()).listFiles();
		for(File patternFolder: patternsFolders){
			if(patternFolder.isDirectory()){
				for(String pattern: patternFolder.list()){
					assertTrue(AmchartsJavaPaths.URL_PATTERNS+patternFolder.getName() // NOPMD by iago on 14/05/16 11:59
							+"/"+pattern != patternController.getUrl());
					
				}
			}
		}
		
		
		
	}

}
