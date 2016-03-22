package es.uvigo.esei.amchartsJava.core.validators;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import es.uvigo.esei.amchartsJava.core.constants.paths.AmchartsJavaPaths;
import es.uvigo.esei.amchartsJava.core.controllers.PatternControllerTest;

public class PathValidatorTest {
	
	@Rule
	public TemporaryFolder folder = new TemporaryFolder();
	
	@Test
	public void imageExist_return_empty_string_if_recive_null_or_string_empty(){
		assertEquals(true,PathValidator.imageExist(null).isEmpty());
		assertEquals(true,PathValidator.imageExist("").isEmpty());
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
		assertEquals(true,PathValidator.imageExist("?").isEmpty());
	}
	
	@Test
	public void dragIconExist_return_empty_string_if_recive_null_or_string_empty(){
		assertEquals(true,PathValidator.dragIconExist(null).isEmpty());
		assertEquals(true,PathValidator.dragIconExist("").isEmpty());
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
		assertEquals(true,PathValidator.imageExist("?").isEmpty());
	}
	
	@Test
	public void themeExist_return_false_if_recive_null_or_empty_string(){
		assertEquals(false,PathValidator.themeExist(null));
		assertEquals(false,PathValidator.themeExist(""));
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
				assertEquals(true,PathValidator.themeExist(themeName));
				assertEquals(false,PathValidator.themeExist(theme.getName()));
				
			}
		}
	
	}
	
	@Test
	public void themeExist_return_false_if_theme_not_exists(){
		assertEquals(false,PathValidator.themeExist("?"));
	}
	
	@Test
	public void patternExist_return_empty_string_if_recive_some_null_or_empty_string(){
		assertEquals(true,PathValidator.patternExist(null, "pattern").isEmpty());
		assertEquals(true,PathValidator.patternExist("patternFolder", null).isEmpty());
		assertEquals(true,PathValidator.patternExist("", "pattern").isEmpty());
		assertEquals(true,PathValidator.patternExist("patternFolder", "").isEmpty());
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
		assertEquals(true,PathValidator.patternExist("black", "?").isEmpty());
	}
	
	@Test
	public void tempFileExist_return_empty_string_if_recive_null_or_empty_string(){
		assertEquals(true,PathValidator.tempFileExist(null).isEmpty());
		assertEquals(true,PathValidator.tempFileExist("").isEmpty());
	}
	
	
	@Test
	public void customBulletOrMarkerExist_return_empty_string_if_recive_null_or_empty_string(){
		assertEquals(true,PathValidator.customBulletOrMarkerExist(null).isEmpty());
		assertEquals(true,PathValidator.customBulletOrMarkerExist("").isEmpty());
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
		assertEquals(true,PathValidator.customBulletOrMarkerExist("?").isEmpty());
	}
}
