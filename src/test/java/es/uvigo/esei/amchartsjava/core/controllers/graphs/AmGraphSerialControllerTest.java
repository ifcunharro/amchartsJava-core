package es.uvigo.esei.amchartsjava.core.controllers.graphs;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.Map;

import org.junit.Test;

import es.uvigo.esei.amchartsjava.core.controllers.graphs.AmGraphSerialController;

public class AmGraphSerialControllerTest {
	
	@Test
	public void property_boolean_must_return_boolean_value_if_is_setted(){
		AmGraphSerialController serial = new AmGraphSerialController();
		
		serial.setConnect(true);
		
		assertTrue(serial.isConnect());
	}
	
	@Test
	public void property_boolean_must_return_null_if_is_not_setted(){
		AmGraphSerialController serial = new AmGraphSerialController();
		
		assertNull(serial.isConnect());
	}
	
	@Test
	public void fields_properties_must_return_string_if_are_setted(){
		AmGraphSerialController serial = new AmGraphSerialController();
		
		serial.setGapField("myGapFieldName");
		serial.setFillColorsField("myFillColorsFieldName");
		
		assertEquals("myGapFieldName",serial.getGapField());
		assertEquals("myFillColorsFieldName",serial.getFillColorsField());
	}
	
	@Test
	public void fields_properties_save_relation_user_nameField_amcharts_nameField_if_are_setted(){
		AmGraphSerialController serial = new AmGraphSerialController();
		
		serial.setGapField("myGapFieldName");
		serial.setFillColorsField("myFillColorsFieldName");
		
		Map<String, String> graphFields = serial.getGraphFields();
		assertEquals("myGapFieldName",graphFields.get("gapField"));
		assertEquals("myFillColorsFieldName",graphFields.get("fillColorsField"));
	}
	
	@Test
	public void fields_properties_must_return_null_if_are_not_setted(){
		AmGraphSerialController serial = new AmGraphSerialController();
		
		assertNull(serial.getGapField());
		assertNull(serial.getFillColorsField());
	}

}
