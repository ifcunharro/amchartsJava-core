package es.uvigo.esei.amchartsjava.core.controllers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import es.uvigo.esei.amchartsjava.core.constants.Align;
import es.uvigo.esei.amchartsjava.core.constants.AmchartsConstants;
import es.uvigo.esei.amchartsjava.core.constants.config.Config;
import es.uvigo.esei.amchartsjava.core.controllers.AmLegendController;
import es.uvigo.esei.amchartsjava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsjava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsjava.core.exceptions.OutOfRangeException;

public class AmLegendControllerTest {
	
	@Rule
	public final ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void property_boolean_must_return_boolean_value_if_is_setted(){
		AmLegendController legend = new AmLegendController();
		
		legend.setAutoMargins(true);
		
		assertTrue(legend.isAutoMargins());
	}
	
	@Test
	public void property_boolean_must_return_null_if_is_not_setted(){
		AmLegendController legend = new AmLegendController();
		
		assertNull(legend.isEnabled());
	}
	
	@Test
	public void property_numeric_with_value_double_in_range_must_return_double(){
		AmLegendController legend = new AmLegendController();
		
		try {
			legend.setBackgroundAlpha(1);
		} catch (OutOfRangeException e) {
			e.printStackTrace();
		}
		
		assertEquals(1.0, legend.getBackgroundAlpha(),0);
		
	}
	
	@Test
	public void property_numeric_with_value_double_out_range_launch_exception() throws OutOfRangeException{
		thrown.expect(OutOfRangeException.class);
		switch (Config.getString("lang")) {
			case "en":
				thrown.expectMessage("Number out of range: must be between 0 and 1");
				break;
			case "es":
				thrown.expectMessage("Número fuera de rango: debe estar entre 0 y 1");
				break;
		
		}
		
		AmLegendController legend = new AmLegendController();
		
		legend.setBackgroundAlpha(9);
		
	}
	
	@Test
	public void property_numeric_with_value_double_return_null_if_not_is_setted(){
		AmLegendController legend = new AmLegendController();
		
		assertNull(legend.getBackgroundAlpha());
	}
	
	@Test
	public void all_property_to_color_return_string_if_format_color_is_correct(){
		AmLegendController legend = new AmLegendController();
		
		try {
			legend.setMarkerBorderColor("#000000");
		} catch (ColorException e) {
			e.printStackTrace();
		}
		
		assertEquals("#000000", legend.getMarkerBorderColor());
		
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
		
		AmLegendController legend = new AmLegendController();
		
		legend.setMarkerDisabledColor("255,255,255");
		
	}
	
	@Test
	public void all_property_to_color_return_null_if_is_not_setted(){
		AmLegendController legend = new AmLegendController();
		
		assertNull(legend.getBorderColor());
		
	}
	
	@Test
	public void property_numeric_with_value_integer_in_range_must_return_integer(){
		AmLegendController legend = new AmLegendController();
		
		try {
			legend.setMarkerLabelGap(7);
		} catch (OutOfRangeException e) {
			e.printStackTrace();
		}
		
		assertEquals(7, (Object)legend.getMarkerLabelGap());
		
	}
	
	@Test
	public void property_numeric_with_value_integer_out_range_launch_exception_if_improvedVisibility_equals_true() throws OutOfRangeException{
		AmLegendController legend = new AmLegendController();
		if(AmchartsConstants.IMPROVED_VISIBILITY.equals("true")){
			thrown.expect(OutOfRangeException.class);
			switch (Config.getString("lang")) {
				case "en":
					thrown.expectMessage("Number out of range: must be between 1 and 36");
					break;
				case "es":
					thrown.expectMessage("Número fuera de rango: debe estar entre 1 y 36");
					break;
			}
			
			
			legend.setMarkerSize(0);
		}else{
			legend.setMarkerSize(0);
		}
		
	}
	
	@Test
	public void property_numeric_with_value_integer_return_null_if_is_not_setted(){
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
	public void horizontalGap_property_return_null_if_set_method_recive_negative_integer(){
		AmLegendController legend = new AmLegendController();
		
		try {
			legend.setHorizontalGap(-4);
		} catch (IntegerException e) {
			e.printStackTrace();
		}
		
		assertNull(legend.getHorizontalGap());
		
	}
	
	@Test
	public void property_numeric_with_value_integer_without_range_limit_return_integer_if_set_method_recive_integer_value(){
		AmLegendController legend = new AmLegendController();
		
		try {
			legend.setLabelWidth(100);
		} catch (IntegerException e) {
			e.printStackTrace();
		}
		
		assertEquals(100, (Object)legend.getLabelWidth());
		
	}
	
	@Test
	public void property_mumeric_with_value_integer_without_range_limit_launch_exception_if_set_method_recive_not_integer() throws IntegerException{
		thrown.expect(IntegerException.class);
		switch (Config.getString("lang")) {
			case "en":
				thrown.expectMessage("Number must be an integer");
				break;
			case "es":
				thrown.expectMessage("El número debe ser un entero");
				break;
		
		}
		
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
