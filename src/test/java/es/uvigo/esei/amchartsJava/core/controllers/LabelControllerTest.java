package es.uvigo.esei.amchartsJava.core.controllers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import es.uvigo.esei.amchartsJava.core.constants.Align;
import es.uvigo.esei.amchartsJava.core.constants.AmchartsConstants;
import es.uvigo.esei.amchartsJava.core.constants.config.Config;
import es.uvigo.esei.amchartsJava.core.controllers.LabelController;
import es.uvigo.esei.amchartsJava.core.controllers.charts.AmSerialChartController;
import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.CoordException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;

public class LabelControllerTest {
	
	@Rule
	public final ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void property_boolean_must_return_boolean_value_if_is_setted(){
		LabelController label = new LabelController();
		
		label.setBold(true);
		
		assertTrue(label.isBold());
	}
	
	@Test
	public void property_boolean_must_return_null_if_is_not_setted(){
		LabelController label = new LabelController();
		
		assertNull(label.isBold());
	}
	
	@Test
	public void property_numeric_with_value_double_in_range_must_return_double(){
		LabelController label = new LabelController();
		
		try {
			label.setAlpha(1);
		} catch (OutOfRangeException e) {
			e.printStackTrace();
		}
		
		assertEquals(1.0, label.getAlpha(),0);
		
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
		
		LabelController label = new LabelController();
		
		label.setAlpha(9);
		
	}
	
	@Test
	public void property_numeric_with_value_double_return_null_if_not_is_setted(){
		LabelController label = new LabelController();
		
		assertNull(label.getAlpha());
	}
	
	@Test
	public void color_property_return_string_if_format_color_is_correct(){
		LabelController label = new LabelController();
		
		try {
			label.setColor("#000000");
		} catch (ColorException e) {
			e.printStackTrace();
		}
		
		assertEquals("#000000", label.getColor());
		
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
		
		LabelController label = new LabelController();
		
		label.setColor("255,255,255");
		
	}
	
	@Test
	public void color_property_return_null_if_is_not_setted(){
		LabelController label = new LabelController();
		
		assertNull(label.getColor());
		
	}
	
	@Test
	public void property_numeric_with_value_integer_in_range_must_return_integer(){
		LabelController label = new LabelController();
		
		try {
			label.setRotation(-90);
		} catch (OutOfRangeException e) {
			e.printStackTrace();
		}
		
		assertEquals(-90, (Object)label.getRotation());
		
	}
	
	@Test
	public void size_property_with_value_integer_out_range_launch_exception_if_improvedVisibility_equals_true() throws OutOfRangeException{
		LabelController label = new LabelController();
		if(AmchartsConstants.IMPROVED_VISIBILITY.equals("true")){
			thrown.expect(OutOfRangeException.class);
			switch (Config.getString("lang")) {
				case "en":
					thrown.expectMessage("Number out of range: must be between 10 and 24");
					break;
				case "es":
					thrown.expectMessage("Número fuera de rango: debe estar entre 10 y 24");
					break;
			}
			
			
			label.setSize(36);
		}else{
			label.setSize(36);
		}
		
	}
	
	@Test
	public void property_numeric_with_value_integer_return_null_if_is_not_setted(){
		LabelController label = new LabelController();
		
		assertNull(label.getSize());
	}
	
	@Test
	public void x_and_y_properties_must_return_string_if_set_method_recive_integer_value_as_string(){
		LabelController label = new LabelController();
		
		try {
			label.setX("500");
		} catch (CoordException e) {
			e.printStackTrace();
		}
		assertEquals("500", label.getX());
		try {
			label.setY("200");
		} catch (CoordException e) {
			e.printStackTrace();
		}
		assertEquals("200", label.getY());
	}
	
	@Test
	public void x_and_y_properties_must_return_string_if_set_method_recive_integer_percent_value_as_string(){
		LabelController label = new LabelController();
		
		try {
			label.setX("180%");
		} catch (CoordException e) {
			e.printStackTrace();
		}
		assertEquals("180%", label.getX());
		try {
			label.setY("150%");
		} catch (CoordException e) {
			e.printStackTrace();
		}
		assertEquals("150%", label.getY());
		
	}
	
	@Test
	public void x_and_y_properties_launch_exception_if_set_methot_not_recive_integer_or_integer_percent_as_string() throws CoordException{
		thrown.expect(CoordException.class);
		switch (Config.getString("lang")) {
			case "en":
				thrown.expectMessage("Format coords must be an integer number or a percent");
				break;
			case "es":
				thrown.expectMessage("Las coordenadas deben ser un entero o porcentaje");
				break;
		}
		LabelController label = new LabelController();
		
		label.setX("120%2");
		
	}
	
	@Test
	public void align_property_must_return_string_if_is_setted(){
		LabelController label = new LabelController();
		
		label.setAlign(Align.center);
		
		assertEquals("center", label.getAlign());
	}
	
	@Test
	public void align_property_must_return_null_if_is_not_setted(){
		LabelController label = new LabelController();
		
		assertNull(label.getAlign());
	}
	
	@Test
	public void labelController_recive_id_when_is_added_to_chart(){
		AmSerialChartController serial = new AmSerialChartController();
		LabelController label = new LabelController();
		LabelController label2 = new LabelController();
		
		assertNull(label.getId());
		serial.addLabel(label);
		serial.addLabel(label2);
	
		assertNotNull(label.getId());
		assertNotNull(label2.getId());
		assertEquals("Label-1", label.getId());
		assertEquals("Label-2", label2.getId());
		
	}
	
}
