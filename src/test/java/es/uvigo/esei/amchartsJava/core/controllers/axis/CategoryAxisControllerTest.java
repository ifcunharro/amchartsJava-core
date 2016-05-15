package es.uvigo.esei.amchartsJava.core.controllers.axis;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.Map;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import es.uvigo.esei.amchartsJava.core.constants.CategoryPosition;
import es.uvigo.esei.amchartsJava.core.constants.ColorsAmCharts;
import es.uvigo.esei.amchartsJava.core.constants.config.Config;
import es.uvigo.esei.amchartsJava.core.controllers.axis.CategoryAxisController;
import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;

public class CategoryAxisControllerTest {
	
	@Rule
	public final ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void property_boolean_must_return_boolean_value_if_is_setted(){
		CategoryAxisController categoryAxis = new CategoryAxisController();
		
		categoryAxis.setBoldLabels(true);
		
		assertTrue(categoryAxis.isBoldLabels());
	}
	
	@Test
	public void property_boolean_must_return_null_if_is_not_setted(){
		CategoryAxisController categoryAxis = new CategoryAxisController();
		
		assertNull(categoryAxis.isCenterLabels());
	}
	
	@Test
	public void property_numeric_with_value_double_in_range_must_return_double(){
		CategoryAxisController categoryAxis = new CategoryAxisController();
		
		try {
			categoryAxis.setFillAlpha(1);
		} catch (OutOfRangeException e) {
			e.printStackTrace();
		}
		
		assertEquals(1.0, categoryAxis.getFillAlpha(),0);
		
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
		
		CategoryAxisController categoryAxis = new CategoryAxisController();
		
		categoryAxis.setAxisAlpha(9);
		
	}
	
	@Test
	public void property_numeric_with_value_double_return_null_if_not_is_setted(){
		CategoryAxisController categoryAxis = new CategoryAxisController();
		
		assertNull(categoryAxis.getFillAlpha());
	}
	
	@Test
	public void all_color_property_return_string_if_format_color_is_correct(){
		CategoryAxisController categoryAxis = new CategoryAxisController();
		
		categoryAxis.setColor(ColorsAmCharts.DARKGRAY);
		
		assertEquals(ColorsAmCharts.DARKGRAY.toString(), categoryAxis.getColor());
		
	}
	
	@Test
	public void all_color_property_launch_exception_if_format_color_is_incorrect() throws ColorException{
		thrown.expect(ColorException.class);
		switch (Config.getString("lang")) {
			case "en":
				thrown.expectMessage("Format color should be #000000");
				break;
			case "es":
				thrown.expectMessage("El formato de color debe ser #000000");
				break;
		}
		
		CategoryAxisController categoryAxis = new CategoryAxisController();
		
		categoryAxis.setAxisColor("255,255,255");
	}
	
	@Test
	public void all_color_property_return_null_if_is_not_setted(){
		CategoryAxisController categoryAxis = new CategoryAxisController();
		
		assertNull(categoryAxis.getColor());
		
	}
	
	@Test
	public void property_numeric_with_value_integer_in_range_must_return_integer(){
		CategoryAxisController categoryAxis = new CategoryAxisController();
		
		try {
			categoryAxis.setLabelRotation(-90);
		} catch (OutOfRangeException e) {
			e.printStackTrace();
		}
		
		assertEquals(-90, (Object)categoryAxis.getLabelRotation());
		
	}
	
	@Test
	public void property_numeric_with_value_integer_out_range_launch_exception() throws OutOfRangeException{
		thrown.expect(OutOfRangeException.class);
		switch (Config.getString("lang")) {
			case "en":
				thrown.expectMessage("Number out of range: must be between -90 and 90");
				break;
			case "es":
				thrown.expectMessage("Número fuera de rango: debe estar entre -90 y 90");
				break;
		}
		
		CategoryAxisController categoryAxis = new CategoryAxisController();
		
		categoryAxis.setLabelRotation(270);
		
	}
	
	@Test
	public void property_numeric_with_value_integer_return_null_if_is_not_setted(){
		CategoryAxisController categoryAxis = new CategoryAxisController();
		
		assertNull(categoryAxis.getFontSize());
	}
	
	@Test
	public void some_property_launch_exception_if_set_method_recive_not_integer_value() throws IntegerException{
		thrown.expect(IntegerException.class);
		switch (Config.getString("lang")) {
			case "en":
				thrown.expectMessage("Number must be an integer");
				break;
			case "es":
				thrown.expectMessage("El número debe ser un entero");
				break;
		}
		
		CategoryAxisController categoryAxis = new CategoryAxisController();
		
		categoryAxis.setMinVerticalGap(90.9);
		
	}
	
	@Test
	public void property_enum_must_return_string_if_is_setted(){
		CategoryAxisController categoryAxis = new CategoryAxisController();
		
		categoryAxis.setTickPosition(CategoryPosition.middle);
		
		assertEquals(CategoryPosition.middle.toString(), categoryAxis.getTickPosition());
	}
	
	@Test
	public void property_enum_must_return_null_if_is_not_setted(){
		CategoryAxisController categoryAxis = new CategoryAxisController();
		
		assertNull(categoryAxis.getMinPeriod());
	}
	
	@Test
	public void dateFormat_property_must_return_array_of_string_with_format_dates(){
		CategoryAxisController categoryAxis = new CategoryAxisController();
		
		String[] dateFormats = categoryAxis.getDateFormats();
		
		assertEquals(7, dateFormats.length);
		assertEquals("MMM DD,YYYY", dateFormats[0]);
		assertEquals("DD-MMM-YYYY", dateFormats[1]);
		assertEquals("MMM-DD-YYYY", dateFormats[2]);
		assertEquals("YYYY", dateFormats[3]);
		assertEquals("MMM", dateFormats[4]);
		assertEquals("hh", dateFormats[5]);
		assertEquals("DD/MMM/YYYY", dateFormats[6]);
	
	}
	
	@Test
	public void autoRotateCount_property_must_return_null_if_set_method_recive_negative_integer(){
		CategoryAxisController categoryAxis = new CategoryAxisController();
		
		try {
			categoryAxis.setAutoRotateCount(-1);
		} catch (IntegerException e) {
			e.printStackTrace();
		}
		assertNull(categoryAxis.getAutoRotateCount());
	}
	
	@Test
	public void fields_properties_must_return_string_if_are_setted(){
		CategoryAxisController categoryAxis = new CategoryAxisController();
		
		categoryAxis.setForceShowField("myForceShowFieldName");
		categoryAxis.setLabelColorField("myLabelColorFieldName");
		
		assertEquals("myLabelColorFieldName",categoryAxis.getLabelColorField());
		assertEquals("myForceShowFieldName",categoryAxis.getForceShowField());
	}
	
	@Test
	public void fields_properties_save_relation_user_nameField_amcharts_nameField_if_are_setted(){
		CategoryAxisController categoryAxis = new CategoryAxisController();
		
		categoryAxis.setForceShowField("myForceShowFieldName");
		categoryAxis.setLabelColorField("myLabelColorFieldName");
		
		Map<String, String> axesFields = categoryAxis.getAxesFields();
		assertEquals("myLabelColorFieldName",axesFields.get("labelColorField"));
		assertEquals("myForceShowFieldName",axesFields.get("forceShowField"));
	}
	
	@Test
	public void fields_properties_must_return_null_if_are_not_setted(){
		CategoryAxisController categoryAxis = new CategoryAxisController();
		
		assertNull(categoryAxis.getLabelColorField());
		assertNull(categoryAxis.getForceShowField());
	}
	
}
