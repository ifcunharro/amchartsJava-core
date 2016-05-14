package es.uvigo.esei.amchartsjava.core.controllers.charts;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.Map;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import es.uvigo.esei.amchartsjava.core.constants.config.Config;
import es.uvigo.esei.amchartsjava.core.controllers.charts.AmAngularGaugeController;
import es.uvigo.esei.amchartsjava.core.controllers.charts.AmPieChartController;
import es.uvigo.esei.amchartsjava.core.exceptions.CoordException;
import es.uvigo.esei.amchartsjava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsjava.core.exceptions.OutOfRangeException;

public class AmPieChartControllerTest {
	
	@Rule
	public final ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void property_boolean_must_return_boolean_value_if_is_setted(){
		AmPieChartController amPie = new AmPieChartController();
		
		amPie.setAdjustPrecision(true);
		
		assertTrue(amPie.isAdjustPrecision());
	}
	
	@Test
	public void property_boolean_must_return_null_if_is_not_setted(){
		AmPieChartController amPie = new AmPieChartController();
		
		assertNull(amPie.isAdjustPrecision());
	}
	
	@Test
	public void property_numeric_with_value_double_in_range_must_return_double(){
		AmPieChartController amPie = new AmPieChartController();
		
		try {
			amPie.setPieAlpha(1);
		} catch (OutOfRangeException e) {
			e.printStackTrace();
		}
		
		assertEquals(1.0, amPie.getPieAlpha(),0);
		
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
		AmPieChartController amPie = new AmPieChartController();
		
		amPie.setPieAlpha(9);
		
	}
	
	@Test
	public void property_numeric_with_value_double_return_null_if_not_is_setted(){
		AmPieChartController amPie = new AmPieChartController();
		
		assertNull(amPie.getPieAlpha());
	}
	
	@Test
	public void property_numeric_with_value_integer_in_range_must_return_integer(){
		AmPieChartController amPie = new AmPieChartController();
		
		try {
			amPie.setStartAngle(50);
		} catch (OutOfRangeException e) {
			e.printStackTrace();
		}
		
		assertEquals(50, (Object)amPie.getStartAngle());
		
	}
	
	@Test
	public void property_numeric_with_value_integer_out_range_launch_exception() throws OutOfRangeException{
		thrown.expect(OutOfRangeException.class);
		switch (Config.getString("lang")) {
			case "en":
				thrown.expectMessage("Number out of range: must be between 0 and 360");
				break;
			case "es":
				thrown.expectMessage("Número fuera de rango: debe estar entre 0 y 360");
				break;
		}
		AmPieChartController amPie = new AmPieChartController();
		
		amPie.setStartAngle(-270);
		
	}
	
	@Test
	public void property_numeric_with_value_integer_return_null_if_is_not_setted(){
		AmPieChartController amPie = new AmPieChartController();
		
		assertNull(amPie.getLabelRadius());
	}
	
	@Test
	public void minRadius_property_launch_exception_if_set_method_recive_not_integer_value() throws IntegerException{
		thrown.expect(IntegerException.class);
		switch (Config.getString("lang")) {
			case "en":
				thrown.expectMessage("Number must be an integer");
				break;
			case "es":
				thrown.expectMessage("El número debe ser un entero");
				break;
		}
		AmAngularGaugeController amGauge = new AmAngularGaugeController();
		
		amGauge.setGaugeX(90.9);
		
	}
	
	@Test
	public void minRadius_property_must_return_null_if_set_method_recive_integer_value_lt_10(){
		AmPieChartController amPie = new AmPieChartController();
		
		try {
			amPie.setMinRadius(9);
		} catch (IntegerException e) {
			e.printStackTrace();
		}
		
		assertNull(amPie.getMinRadius());
		
	}
	
	@Test
	public void some_properties_launch_exception_if_set_method_no_recive_integer_value_or_integer_percent_as_string() throws CoordException{
		thrown.expect(CoordException.class);
		switch (Config.getString("lang")) {
			case "en":
				thrown.expectMessage("Format coords must be an integer number or a percent");
				break;
			case "es":
				thrown.expectMessage("Las coordenadas deben ser un entero o porcentaje");
				break;
		}
		AmPieChartController amPie = new AmPieChartController();
		
		amPie.setPieX("90.9%");
	}
	
	@Test
	public void field_property_must_return_string_if_is_setted(){
		AmPieChartController amPie = new AmPieChartController();
		
		amPie.setLabelRadiusField("myLabelRadiusFieldName");
		assertEquals("myLabelRadiusFieldName",amPie.getLabelRadiusField());
		
	}
	
	@Test
	public void field_property_save_relation_user_nameField_amcharts_nameField_if_is_setted(){
		AmPieChartController amPie = new AmPieChartController();
		
		amPie.setLabelRadiusField("myLabelRadiusFieldName");
		
		
		Map<String, String> chartFields = amPie.getChartFields();
		assertEquals("myLabelRadiusFieldName",chartFields.get("labelRadiusField"));
		
	}
	
	@Test
	public void field_property_must_return_null_if_is_not_setted(){
		AmPieChartController amPie = new AmPieChartController();
		
		assertNull(amPie.getLabelRadiusField());
		
	}
	
	@Test
	public void type_property_must_return_pie_as_string(){
		AmPieChartController amPie = new AmPieChartController();
		
		assertEquals("pie", amPie.getType());
	}

}
