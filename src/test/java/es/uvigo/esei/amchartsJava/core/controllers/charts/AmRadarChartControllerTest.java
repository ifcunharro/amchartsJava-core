package es.uvigo.esei.amchartsJava.core.controllers.charts;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.Map;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import es.uvigo.esei.amchartsJava.core.constants.config.Config;
import es.uvigo.esei.amchartsJava.core.controllers.charts.AmRadarChartController;
import es.uvigo.esei.amchartsJava.core.exceptions.CoordException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;

public class AmRadarChartControllerTest {
	
	@Rule
	public final ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void property_numeric_with_value_integer_return_null_if_is_not_setted(){
		AmRadarChartController radar = new AmRadarChartController();
		
		assertNull(radar.getMarginBottom());
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
		AmRadarChartController radar = new AmRadarChartController();
		
		radar.setMarginLeft(90.9);
		
	}
	
	@Test
	public void radius_property_launch_exception_if_set_method_no_recive_integer_value_or_integer_percent_as_string() throws CoordException{
		thrown.expect(CoordException.class);
		switch (Config.getString("lang")) {
			case "en":
				thrown.expectMessage("Format coords must be an integer number or a percent");
				break;
			case "es":
				thrown.expectMessage("Las coordenadas deben ser un entero o porcentaje");
				break;
		}
		AmRadarChartController radar = new AmRadarChartController();
		
		radar.setRadius("90.9%");
	}
	
	@Test
	public void radius_property_return_null_if_is_not_setted(){
		AmRadarChartController radar = new AmRadarChartController();
		
		assertNull(radar.getRadius());
	}
	
	@Test
	public void radius_property_must_return_string_if_recive_integer_number_or_integer_percent_value_as_string(){
		AmRadarChartController radar = new AmRadarChartController();
		
		try {
			radar.setRadius("90%");
			assertEquals("90%",radar.getRadius());
			radar.setRadius("40");
			assertEquals("40",radar.getRadius());
		} catch (CoordException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void field_property_must_return_string_if_is_setted(){
		AmRadarChartController radar = new AmRadarChartController();
		
		radar.setCategoryField("myCategoryFieldName");
		assertEquals("myCategoryFieldName",radar.getCategoryField());
		
	}
	
	@Test
	public void field_property_save_relation_user_nameField_amcharts_nameField_if_is_setted(){
		AmRadarChartController radar = new AmRadarChartController();
		
		radar.setCategoryField("myCategoryFieldName");
		
		
		Map<String, String> chartFields = radar.getChartFields();
		assertEquals("myCategoryFieldName",chartFields.get("categoryField"));
		
	}
	
	@Test
	public void field_property_must_return_null_if_is_not_setted(){
		AmRadarChartController radar = new AmRadarChartController();
		
		assertNull(radar.getCategoryField());
		
	}
	
	@Test
	public void type_property_must_return_radar_as_string(){
		AmRadarChartController radar = new AmRadarChartController();
		
		assertEquals("radar", radar.getType());
	}

}
