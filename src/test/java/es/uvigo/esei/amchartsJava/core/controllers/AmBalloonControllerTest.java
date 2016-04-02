package es.uvigo.esei.amchartsJava.core.controllers;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import es.uvigo.esei.amchartsJava.core.constants.AmchartsConstants;
import es.uvigo.esei.amchartsJava.core.constants.TextAlign;
import es.uvigo.esei.amchartsJava.core.constants.config.Config;
import es.uvigo.esei.amchartsJava.core.controllers.AmBalloonController;
import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;

public class AmBalloonControllerTest {
	
	@Rule
	public final ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void property_boolean_must_return_boolean_value_if_is_setted(){
		AmBalloonController balloon = new AmBalloonController();
		
		balloon.setAdjustBorderColor(true);
		
		assertEquals(true, balloon.isAdjustBorderColor());
	}
	
	@Test
	public void property_boolean_must_return_null_if_is_not_setted(){
		AmBalloonController balloon = new AmBalloonController();
		
		assertNull(balloon.isDisableMouseEvents());
	}
	
	@Test
	public void property_numeric_with_value_double_in_range_must_return_double(){
		AmBalloonController balloon = new AmBalloonController();
		
		try {
			balloon.setAnimationDuration(2);
		} catch (OutOfRangeException e) {
			e.printStackTrace();
		}
		
		assertEquals(2.0, balloon.getAnimationDuration(),0);
		
	}
	
	@Test
	public void property_numeric_with_value_double_out_range_launch_exception_if_improvedVisibility_equals_true() throws OutOfRangeException{
		AmBalloonController balloon = new AmBalloonController();
		if(AmchartsConstants.IMPROVED_VISIBILITY.equals("true")){
			thrown.expect(OutOfRangeException.class);
			switch (Config.getString("lang")) {
				case "en":
						thrown.expectMessage("Number out of range: must be between 0 and 2");
						break;
				case "es":
						thrown.expectMessage("Número fuera de rango: debe estar entre 0 y 2");
						break;
			}
			
			balloon.setAnimationDuration(9);
		}else{
			balloon.setAnimationDuration(9);
		}
		
	}
	
	@Test
	public void property_numeric_with_value_double_return_null_if_not_is_setted(){
		AmBalloonController balloon = new AmBalloonController();
		
		assertNull(balloon.getAnimationDuration());
		
	}
	
	@Test
	public void all_property_to_color_return_string_if_format_color_is_correct(){
		AmBalloonController balloon = new AmBalloonController();
		
		try {
			balloon.setBorderColor("#000000");
		} catch (ColorException e) {
			e.printStackTrace();
		}
		
		assertEquals("#000000", balloon.getBorderColor());
		
	}
	
	@Test
	public void all_property_to_color_launch_exception_if_format_color_is_incorrect() throws ColorException{
		thrown.expect(ColorException.class);
		switch (Config.getString("lang")) {
			case "en":
				thrown.expectMessage("Format color should be #000000");
				break;
			case "es":
				thrown.expectMessage("El formato de color debe ser #000000");
				break;
		}
		
		AmBalloonController balloon = new AmBalloonController();
		
		balloon.setBorderColor("255,255,255");
		
	}
	
	@Test
	public void all_property_to_color_return_null_if_is_not_setted(){
		AmBalloonController balloon = new AmBalloonController();
		
		assertNull(balloon.getBorderColor());
		
	}
	
	@Test
	public void property_numeric_with_value_integer_in_range_must_return_integer(){
		AmBalloonController balloon = new AmBalloonController();
		
		try {
			balloon.setBorderThickness(5);
		} catch (OutOfRangeException e) {
			e.printStackTrace();
		}
		
		assertEquals(5, (Object)balloon.getBorderThickness());
		
	}
	
	@Test
	public void property_numeric_with_value_integer_out_range_launch_exception_if_improvedVisibility_equals_true() throws OutOfRangeException{
		AmBalloonController balloon = new AmBalloonController();
		if(AmchartsConstants.IMPROVED_VISIBILITY.equals("true")){
			thrown.expect(OutOfRangeException.class);
			switch (Config.getString("lang")) {
				case "en":
					thrown.expectMessage("Number out of range: must be between 0 and 10");
					break;
				case "es":
					thrown.expectMessage("Número fuera de rango: debe estar entre 0 y 10");
			
			}
		
			
			balloon.setBorderThickness(900);
			
		}else{
			balloon.setBorderThickness(900);
		}
		
	}
	
	@Test
	public void property_numeric_with_value_integer_return_null_if_is_not_setted(){
		AmBalloonController balloon = new AmBalloonController();
		
		assertNull(balloon.getBorderThickness());
		
	}
	
	@Test
	public void maxWidth_property_return_integer_if_set_method_recive_gt_zero_integer(){
		AmBalloonController balloon = new AmBalloonController();
		
		try {
			balloon.setMaxWidth(90);
		} catch (IntegerException e) {
			e.printStackTrace();
		}
		
		assertEquals(90, (Object)balloon.getMaxWidth());
		
	}
	
	@Test
	public void maxWidth_property_launch_exception_if_set_method_recive_not_integer_value() throws IntegerException{
		thrown.expect(IntegerException.class);
		switch (Config.getString("lang")) {
			case "en":
				thrown.expectMessage("Number must be an integer");
				break;
			case "es":
				thrown.expectMessage("El número debe ser un entero");
				break;
		
		}
		
		AmBalloonController balloon = new AmBalloonController();
		
		balloon.setMaxWidth(90.9);
		
	}
	
	@Test
	public void maxWidth_property_return_null_if_set_method_recive_integer_lt_1(){
		AmBalloonController balloon = new AmBalloonController();
		
		try {
			balloon.setMaxWidth(-30);
		} catch (IntegerException e) {
			e.printStackTrace();
		}
		
		assertNull(balloon.getMaxWidth());
		try {
			balloon.setMaxWidth(0);
		} catch (IntegerException e) {
			e.printStackTrace();
		}
		assertNull(balloon.getMaxWidth());
	}
	
	@Test
	public void offsetX_and_offsetY_properties_launch_exception_if_set_method_recive_not_integer_value() throws IntegerException{
		thrown.expect(IntegerException.class);
		switch (Config.getString("lang")) {
			case "en":
				thrown.expectMessage("Number must be an integer");
				break;
			case "es":
				thrown.expectMessage("El número debe ser un entero");
				break;
		}
		
		AmBalloonController balloon = new AmBalloonController();
		
		balloon.setOffsetX(90.88);
		
	}
	
	@Test
	public void offsetX_and_offsetY_properties_return_integer_if_set_method_recive_integer(){
		AmBalloonController balloon = new AmBalloonController();
		
		try {
			balloon.setOffsetY(90);
			balloon.setOffsetX(20);
		} catch (IntegerException e) {
			e.printStackTrace();
		}
		
		assertEquals(90, (Object)balloon.getOffsetY());
		assertEquals(20, (Object)balloon.getOffsetX());
	}
	
	@Test
	public void offsetX_and_offsetY_properties_return_null_if_are_not_setted(){
		AmBalloonController balloon = new AmBalloonController();
		
		assertNull(balloon.getOffsetY());
		assertNull(balloon.getOffsetX());
	}
	
	@Test
	public void property_enum_must_return_string_if_is_setted(){
		AmBalloonController balloon = new AmBalloonController();
		
		balloon.setTextAlign(TextAlign.left);
		
		assertEquals(TextAlign.left.toString(), balloon.getTextAlign());
	}
	
	@Test
	public void property_enum_must_return_null_if_is_not_setted(){
		AmBalloonController balloon = new AmBalloonController();
		
		assertNull(balloon.getTextAlign());
	}
		
}
