package test.es.uvigo.esei.amchartsJava.core.controllers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertNull;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import es.uvigo.esei.amchartsJava.core.constants.Align;
import es.uvigo.esei.amchartsJava.core.controllers.AmLegendController;
import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;

public class AmLegendControllerTest {
	
	@Rule
	public final ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void property_boolean_must_return_boolean_value_if_is_setted(){
		AmLegendController legend = new AmLegendController();
		
		legend.setAutoMargins(true);
		
		assertEquals(true, legend.isAutoMargins());
	}
	
	@Test
	public void property_boolean_must_return_null_if_is_not_setted(){
		AmLegendController legend = new AmLegendController();
		
		assertNull(legend.isEnabled());
	}
	
	@Test
	public void property_numeric_with_value_double_in_range_must_return_double() throws OutOfRangeException{
		AmLegendController legend = new AmLegendController();
		
		legend.setBackgroundAlpha(1);
		
		assertEquals(1.0, legend.getBackgroundAlpha(),0);
		
	}
	
	@Test
	public void property_numeric_with_value_double_out_range_launch_exception() throws OutOfRangeException{
		thrown.expect(OutOfRangeException.class);
		thrown.expectMessage("Number must be between 0 and 1");
		AmLegendController legend = new AmLegendController();
		
		legend.setBackgroundAlpha(9);
		
	}
	
	@Test
	public void property_numeric_with_value_double_return_null_if_not_is_setted() throws OutOfRangeException{
		AmLegendController legend = new AmLegendController();
		
		assertNull(legend.getBackgroundAlpha());
	}
	
	@Test
	public void all_property_to_color_return_string_if_format_color_is_correct() throws ColorException{
		AmLegendController legend = new AmLegendController();
		
		legend.setMarkerBorderColor("#000000");
		
		assertEquals("#000000", legend.getMarkerBorderColor());
		
	}
	
	@Test
	public void all_property_to_color_launch_exception_if_format_color_is_incorrect() throws ColorException{
		thrown.expect(ColorException.class);
		thrown.expectMessage("Format color should be #000000");
		AmLegendController legend = new AmLegendController();
		
		legend.setMarkerDisabledColor("255,255,255");
		
	}
	
	@Test
	public void all_property_to_color_return_null_if_is_not_setted() throws ColorException{
		AmLegendController legend = new AmLegendController();
		
		assertNull(legend.getBorderColor());
		
	}
	
	@Test
	public void property_numeric_with_value_integer_in_range_must_return_integer() throws OutOfRangeException{
		AmLegendController legend = new AmLegendController();
		
		legend.setMarkerLabelGap(7);
		
		assertSame(7, legend.getMarkerLabelGap());
		
	}
	
	@Test
	public void property_numeric_with_value_integer_out_range_launch_exception() throws OutOfRangeException{
		thrown.expect(OutOfRangeException.class);
		thrown.expectMessage("Number out of range: must be between 1 and 36");
		AmLegendController legend = new AmLegendController();
		
		legend.setMarkerSize(0);
		
	}
	
	@Test
	public void property_numeric_with_value_integer_return_null_if_is_not_setted() throws OutOfRangeException{
		AmLegendController legend = new AmLegendController();
		
		assertNull(legend.getMarkerSize());
		
	}
	
	@Test
	public void property_with_string_value_and_not_color_property_return_string_if_is_setted(){
		AmLegendController legend = new AmLegendController();
		
		legend.setDivId("legenddiv");
		
		assertEquals("legenddiv", legend.getDivId());
	}
	
	@Test
	public void property_with_string_value_and_not_color_property_return_null_if_is_not_setted(){
		AmLegendController legend = new AmLegendController();
		
		assertNull(legend.getDivId());
	}
	
	@Test
	public void horizontalGap_property_return_null_if_set_method_recive_negative_integer() throws IntegerException{
		AmLegendController legend = new AmLegendController();
		
		legend.setHorizontalGap(-4);
		
		assertNull(legend.getHorizontalGap());
		
	}
	
	@Test
	public void property_numeric_with_value_integer_without_range_limit_return_integer_if_set_method_recive_integer_value() throws IntegerException{
		AmLegendController legend = new AmLegendController();
		
		legend.setLabelWidth(100);
		
		assertSame(100, legend.getLabelWidth());
		
	}
	
	@Test
	public void property_mumeric_with_value_integer_without_range_limit_launch_exception_if_set_method_recive_not_integer() throws IntegerException{
		thrown.expect(IntegerException.class);
		thrown.expectMessage("Number must be an integer");
		AmLegendController legend = new AmLegendController();
		
		legend.setLabelWidth(9.6);
		
	}
	
	@Test
	public void property_enum_must_return_string_if_is_setted(){
		AmLegendController legend = new AmLegendController();
		
		legend.setAlign(Align.center);
		
		assertEquals(Align.center.toString(), legend.getAlign());
	}
	
	@Test
	public void property_enum_must_return_null_if_is_not_setted(){
		AmLegendController legend = new AmLegendController();
		
		assertNull(legend.getAlign());
	}
	
}
