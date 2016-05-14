package es.uvigo.esei.amchartsjava.core.validators;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;

import org.junit.Test;

import es.uvigo.esei.amchartsjava.core.constants.paths.AmchartsJavaPaths;
import es.uvigo.esei.amchartsjava.core.controllers.PatternControllerTest;
import es.uvigo.esei.amchartsjava.core.validators.PathValidator;

public class PathValidatorTest {
	
	@Test
	public void imageExist_return_empty_string_if_recive_null_or_string_empty(){
		assertTrue(PathValidator.imageExist(null).isEmpty());
		assertTrue(PathValidator.imageExist("").isEmpty());
	}
	
	@Test
	public void imageExist_return_name_of_image_with_extension_if_exists(){
		URL imagesPath;
		String imageName = "";
		imagesPath = PathValidatorTest.class.getProtectionDomain()
				   .getCodeSource()
				   .getLocation();
		try {
			imagesPath = new URL(URLDecoder.decode(imagesPath.toString(), "UTF-8"));
			imagesPath = new URL(imagesPath,AmchartsJavaPaths.IMAGES_PATH);
		} catch (MalformedURLException | UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		File[] images = new File(imagesPath.getFile()).listFiles();
		for(File image: images){
			if(!image.isDirectory()){
				imageName = image.getName();
				assertEquals(imageName,PathValidator
						.imageExist(
								imageName
									.substring(
										0,imageName
											.indexOf(".")
									)
						)
				);
				assertEquals(imageName,PathValidator.imageExist(imageName));
				
			}
		}
	}
	
	@Test
	public void imageExist_return_empty_string_if_image_not_exists(){
		assertTrue(PathValidator.imageExist("?").isEmpty());
	}
	
	@Test
	public void dragIconExist_return_empty_string_if_recive_null_or_string_empty(){
		assertTrue(PathValidator.dragIconExist(null).isEmpty());
		assertTrue(PathValidator.dragIconExist("").isEmpty());
	}
	
	@Test
	public void dragIconExist_return_name_of_icon_without_extension_if_exists(){
		URL iconsPath;
		String imageName = "";
		iconsPath = PathValidatorTest.class.getProtectionDomain()
				   .getCodeSource()
				   .getLocation();
		try {
			iconsPath = new URL(URLDecoder.decode(iconsPath.toString(), "UTF-8"));
			iconsPath = new URL(iconsPath,AmchartsJavaPaths.IMAGES_PATH);
		} catch (MalformedURLException | UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		File[] images = new File(iconsPath.getFile()).listFiles();
		for(File image: images){
			if(!image.isDirectory()){
				imageName = image
						.getName()
						.substring(
								0, image
								.getName()
								.indexOf(".")
						);
				assertEquals(imageName,PathValidator.dragIconExist(image.getName()));
				assertEquals(imageName,PathValidator.dragIconExist(imageName));
				
			}
		}
	}
	
	@Test
	public void dragIconExist_return_empty_string_if_icon_not_exists(){
		assertTrue(PathValidator.imageExist("?").isEmpty());
	}
	
	@Test
	public void themeExist_return_false_if_recive_null_or_empty_string(){
		assertFalse(PathValidator.themeExist(null));
		assertFalse(PathValidator.themeExist(""));
	}
	
	@Test
	public void themeExist_return_true_if_theme_exists_and_recive_name_of_theme_without_extension(){
		URL themesPath;
		String themeName;
		themesPath = PathValidatorTest.class.getProtectionDomain()
									   .getCodeSource()
									   .getLocation();
		
		try {
			themesPath = new URL(URLDecoder.decode(themesPath.toString(),"UTF-8"));
			themesPath = new URL(themesPath,AmchartsJavaPaths.THEMES_PATH);			
		} catch (MalformedURLException | UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		File[] themes = new File(themesPath.getFile()).listFiles();
		for(File theme: themes){
			if(!theme.isDirectory()){
				themeName = theme
						.getName()
						.substring(
								0, theme
								.getName()
								.indexOf(".")
						);
				assertTrue(PathValidator.themeExist(themeName));
				assertFalse(PathValidator.themeExist(theme.getName()));
				
			}
		}
	
	}
	
	@Test
	public void themeExist_return_false_if_theme_not_exists(){
		assertFalse(PathValidator.themeExist("?"));
	}
	
	@Test
	public void patternExist_return_empty_string_if_recive_some_null_or_empty_string(){
		assertTrue(PathValidator.patternExist(null, "pattern").isEmpty());
		assertTrue(PathValidator.patternExist("patternFolder", null).isEmpty());
		assertTrue(PathValidator.patternExist("", "pattern").isEmpty());
		assertTrue(PathValidator.patternExist("patternFolder", "").isEmpty());
	}
	
	@Test
	public void patternExist_return_string_if_pattern_exists(){
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
					assertEquals(AmchartsJavaPaths.URL_PATTERNS+patternFolder.getName()
							+"/"+pattern,PathValidator.patternExist(patternFolder.getName(), pattern));
					
				}
			}
		}
	}
	
	@Test
	public void patternExist_return_empty_string_if_pattern_not_exists(){
		assertTrue(PathValidator.patternExist("black", "?").isEmpty());
	}
	
	@Test
	public void tempFileExist_return_empty_string_if_recive_null_or_empty_string(){
		assertTrue(PathValidator.tempFileExist(null).isEmpty());
		assertTrue(PathValidator.tempFileExist("").isEmpty());
	}
	
	
	@Test
	public void customBulletOrMarkerExist_return_empty_string_if_recive_null_or_empty_string(){
		assertTrue(PathValidator.customBulletOrMarkerExist(null).isEmpty());
		assertTrue(PathValidator.customBulletOrMarkerExist("").isEmpty());
	}
	
	@Test
	public void customBulletOrMarkerExist_return_string_if_exists(){
		URL customPath;
		String imageName = "";
		customPath = PathValidatorTest.class.getProtectionDomain()
				   .getCodeSource()
				   .getLocation();
		try {
			customPath = new URL(URLDecoder.decode(customPath.toString(), "UTF-8"));
			customPath = new URL(customPath,AmchartsJavaPaths.IMAGES_PATH);
		} catch (MalformedURLException | UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		File[] images = new File(customPath.getFile()).listFiles();
		for(File image: images){
			if(!image.isDirectory()){
				imageName = image
						.getName()
						.substring(
								0, image
								.getName()
								.indexOf(".")
						);
				assertEquals(customPath
						.toString()
						.substring(6)
						+image
						.getName()
						,PathValidator
						.customBulletOrMarkerExist(
								image
								.getName()
						)
				);
				assertEquals(customPath
						.toString()
						.substring(6)
						+image
						.getName()
						,PathValidator
						.customBulletOrMarkerExist(
								imageName
						)
				);
			}
		}
	}
	
	@Test
	public void customBulletOrMarkerExist_return_empty_string_if_not_exist(){
		assertTrue(PathValidator.customBulletOrMarkerExist("?").isEmpty());
	}
}
