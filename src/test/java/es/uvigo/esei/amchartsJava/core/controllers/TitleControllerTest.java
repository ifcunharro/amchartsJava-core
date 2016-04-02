package es.uvigo.esei.amchartsJava.core.controllers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import es.uvigo.esei.amchartsJava.core.constants.AmchartsConstants;
import es.uvigo.esei.amchartsJava.core.constants.config.Config;
import es.uvigo.esei.amchartsJava.core.controllers.TitleController;
import es.uvigo.esei.amchartsJava.core.controllers.charts.AmSerialChartController;
import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;

public class TitleControllerTest {
	
	@Rule
	public final ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void property_boolean_must_return_boolean_value_if_is_setted(){
		TitleController title = new TitleController();
		
		title.setBold(true);
		
		assertEquals(true, title.isBold());
	}
	
	@Test
	public void property_boolean_must_return_null_if_is_not_setted(){
		TitleController title = new TitleController();
		
		assertNull(title.isBold());
	}
	
	@Test
	public void property_numeric_with_value_double_in_range_must_return_double(){
		TitleController title = new TitleController();
		
		try {
			title.setAlpha(1);
		} catch (OutOfRangeException e) {
			e.printStackTrace();
		}
		
		assertEquals(1.0, title.getAlpha(),0);
		
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
		
		TitleController title = new TitleController();
		
		title.setAlpha(9);
		
	}
	
	@Test
	public void property_numeric_with_value_double_return_null_if_not_is_setted(){
		TitleController title = new TitleController();
		
		assertNull(title.getAlpha());
	}
	
	@Test
	public void color_property_return_string_if_format_color_is_correct(){
		TitleController title = new TitleController();
		
		try {
			title.setColor("#000000");
		} catch (ColorException e) {
			e.printStackTrace();
		}
		
		assertEquals("#000000", title.getColor());
		
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
		
		TitleController title = new TitleController();
		
		title.setColor("255,255,255");
		
	}
	
	@Test
	public void color_property_return_null_if_is_not_setted(){
		TitleController title = new TitleController();
		
		assertNull(title.getColor());
		
	}
	
	@Test
	public void property_numeric_with_value_integer_in_range_must_return_integer(){
		TitleController title = new TitleController();
		
		try {
			title.setSize(10);
		} catch (OutOfRangeException e) {
			e.printStackTrace();
		}
		
		assertEquals(10, (Object)title.getSize());
		
	}
	
	@Test
	public void property_numeric_with_value_integer_out_range_launch_exception_if_improvedVisibility_equals_true() throws OutOfRangeException{
		TitleController title = new TitleController();
		if(AmchartsConstants.IMPROVED_VISIBILITY.equals("true")){
			thrown.expect(OutOfRangeException.class);
			switch (Config.getString("lang")) {
				case "en":
					thrown.expectMessage("Number out of range: must be between 8 and 36");
					break;
				case "es":
					thrown.expectMessage("Número fuera de rango: debe estar entre 8 y 36");
					break;
			}
			
			title.setSize(48);
		}else{
			title.setSize(48);
		}
		
	}
	
	@Test
	public void property_numeric_with_value_integer_return_null_if_is_not_setted(){
		TitleController title = new TitleController();
		
		assertNull(title.getSize());
	}
	
	@Test
	public void titleController_recive_id_when_is_added_to_chart(){
		AmSerialChartController serial = new AmSerialChartController();
		TitleController title = new TitleController();
		TitleController title2 = new TitleController();
		
		assertNull(title.getId());
		serial.addTitle(title);
		serial.addTitle(title2);
	
		assertTrue(title.getId()!=null);
		assertTrue(title2.getId()!=null);
		assertEquals("Title-1", title.getId());
		assertEquals("Title-2", title2.getId());
		
	}

}
