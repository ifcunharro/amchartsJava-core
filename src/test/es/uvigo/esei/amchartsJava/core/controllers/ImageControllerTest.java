package test.es.uvigo.esei.amchartsJava.core.controllers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import es.uvigo.esei.amchartsJava.core.constants.paths.AmchartsJavaPaths;
import es.uvigo.esei.amchartsJava.core.controllers.ImageController;
import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;

public class ImageControllerTest {
	
	@Rule
	public final ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void all_color_property_return_string_if_format_color_is_correct() throws ColorException{
		ImageController image = new ImageController();
		
		image.setColor("#000000");
		
		assertEquals("#000000", image.getColor());
		
	}
	
	@Test
	public void all_color_property_launch_exception_if_format_color_is_incorrect() throws ColorException{
		thrown.expect(ColorException.class);
		thrown.expectMessage("Format color should be #000000");
		ImageController image = new ImageController();
		
		image.setColor("255,255,255");
		
	}
	
	@Test
	public void all_color_property_return_null_if_is_not_setted() throws ColorException{
		ImageController image = new ImageController();
		
		assertNull(image.getBalloonColor());
		
	}
	
	@Test
	public void property_numeric_with_value_integer_in_range_must_return_integer() throws OutOfRangeException{
		ImageController image = new ImageController();
		
		image.setHeight(24);
		
		assertSame(24, image.getHeight());
		
	}
	
	@Test
	public void property_numeric_with_value_integer_out_range_launch_exception() throws OutOfRangeException{
		thrown.expect(OutOfRangeException.class);
		thrown.expectMessage("Number out of range: must be between 20 and 50");
		ImageController image = new ImageController();
		
		image.setHeight(370);
		
	}
	
	@Test
	public void property_numeric_with_value_integer_return_null_if_is_not_setted() throws OutOfRangeException{
		ImageController image = new ImageController();
		
		assertNull(image.getWidth());
	}
	
	@Test
	public void some_properties_launch_IntegerException_if_set_method_not_recive_integer_value() throws IntegerException{
		thrown.expect(IntegerException.class);
		thrown.expectMessage("Number must be an integer");
		ImageController image = new ImageController();
		
		image.setOffsetX(90.9);
		
	}
	
	@Test
	public void url_property_must_return_string_if_image_exist_in_images_folder(){
		ImageController image = new ImageController();
		URL imagesPath;
		imagesPath = ImageControllerTest.class.getProtectionDomain()
				   .getCodeSource()
				   .getLocation();
		try {
			imagesPath = new URL(imagesPath,AmchartsJavaPaths.IMAGES_PATH);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		File[] images = new File(imagesPath.getFile()).listFiles();
		for(File imageName: images){
			if(!imageName.isDirectory()){
				image.setUrl(imageName.getName());
				assertEquals(AmchartsJavaPaths.IMAGES_PATH+imageName.getName(), image.getUrl());
			}
		}
		
	}
	
	@Test
	public void url_property_must_return_null_if_image_not_exist_in_images_folder(){
		ImageController image = new ImageController();
		URL imagesPath;
		imagesPath = ImageControllerTest.class.getProtectionDomain()
				   .getCodeSource()
				   .getLocation();
		try {
			imagesPath = new URL(imagesPath,AmchartsJavaPaths.IMAGES_PATH);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		String[] images = new File(imagesPath.getFile()).list();
		image.setUrl("");
		assertNull(image.getUrl());
		assertFalse(Arrays.asList(images).contains(""));
		
	}

}
