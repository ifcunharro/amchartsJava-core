package es.uvigo.esei.amchartsJava.core.controllers;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import es.uvigo.esei.amchartsJava.core.constants.TextAlign;
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
	public void property_numeric_with_value_double_in_range_must_return_double() throws OutOfRangeException{
		AmBalloonController balloon = new AmBalloonController();
		
		balloon.setAnimationDuration(2);
		
		assertEquals(2.0, balloon.getAnimationDuration(),0);
		
	}
	
	@Test
	public void property_numeric_with_value_double_out_range_launch_exception() throws OutOfRangeException{
		thrown.expect(OutOfRangeException.class);
		thrown.expectMessage("Number must be between 0 and 2");
		AmBalloonController balloon = new AmBalloonController();
		
		balloon.setAnimationDuration(9);
		
	}
	
	@Test
	public void property_numeric_with_value_double_return_null_if_not_is_setted() throws OutOfRangeException{
		AmBalloonController balloon = new AmBalloonController();
		
		assertNull(balloon.getAnimationDuration());
		
	}
	
	@Test
	public void all_property_to_color_return_string_if_format_color_is_correct() throws ColorException{
		AmBalloonController balloon = new AmBalloonController();
		
		balloon.setBorderColor("#000000");
		
		assertEquals("#000000", balloon.getBorderColor());
		
	}
	
	@Test
	public void all_property_to_color_launch_exception_if_format_color_is_incorrect() throws ColorException{
		thrown.expect(ColorException.class);
		thrown.expectMessage("Format color should be #000000");
		AmBalloonController balloon = new AmBalloonController();
		
		balloon.setBorderColor("255,255,255");
		
	}
	
	@Test
	public void all_property_to_color_return_null_if_is_not_setted() throws ColorException{
		AmBalloonController balloon = new AmBalloonController();
		
		assertNull(balloon.getBorderColor());
		
	}
	
	@Test
	public void property_numeric_with_value_integer_in_range_must_return_integer() throws OutOfRangeException{
		AmBalloonController balloon = new AmBalloonController();
		
		balloon.setBorderThickness(5);
		
		assertEquals(5, (Object)balloon.getBorderThickness());
		
	}
	
	@Test
	public void property_numeric_with_value_integer_out_range_launch_exception() throws OutOfRangeException{
		thrown.expect(OutOfRangeException.class);
		thrown.expectMessage("Number out of range: must be between 0 and 10");
		AmBalloonController balloon = new AmBalloonController();
		
		balloon.setBorderThickness(900);
		
	}
	
	@Test
	public void property_numeric_with_value_integer_return_null_if_is_not_setted() throws OutOfRangeException{
		AmBalloonController balloon = new AmBalloonController();
		
		assertNull(balloon.getBorderThickness());
		
	}
	
	@Test
	public void maxWidth_property_return_integer_if_set_method_recive_gt_zero_integer() throws IntegerException{
		AmBalloonController balloon = new AmBalloonController();
		
		balloon.setMaxWidth(90);
		
		assertEquals(90, (Object)balloon.getMaxWidth());
		
	}
	
	@Test
	public void maxWidth_property_launch_exception_if_set_method_recive_not_integer_value() throws IntegerException{
		thrown.expect(IntegerException.class);
		thrown.expectMessage("Number must be an integer");
		AmBalloonController balloon = new AmBalloonController();
		
		balloon.setMaxWidth(90.9);
		
	}
	
	@Test
	public void maxWidth_property_return_null_if_set_method_recive_integer_lt_1() throws IntegerException{
		AmBalloonController balloon = new AmBalloonController();
		
		balloon.setMaxWidth(-30);
		
		assertNull(balloon.getMaxWidth());
		balloon.setMaxWidth(0);
		assertNull(balloon.getMaxWidth());
	}
	
	@Test
	public void offsetX_and_offsetY_properties_launch_exception_if_set_method_recive_not_integer_value() throws IntegerException{
		thrown.expect(IntegerException.class);
		thrown.expectMessage("Number must be an integer");
		AmBalloonController balloon = new AmBalloonController();
		
		balloon.setOffsetX(90.88);
	}
	
	@Test
	public void offsetX_and_offsetY_properties_return_integer_if_set_method_recive_integer() throws IntegerException{
		AmBalloonController balloon = new AmBalloonController();
		
		balloon.setOffsetY(90);
		balloon.setOffsetX(20);
		
		assertEquals(90, (Object)balloon.getOffsetY());
		assertEquals(20, (Object)balloon.getOffsetX());
	}
	
	@Test
	public void offsetX_and_offsetY_properties_return_null_if_are_not_setted() throws IntegerException{
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
