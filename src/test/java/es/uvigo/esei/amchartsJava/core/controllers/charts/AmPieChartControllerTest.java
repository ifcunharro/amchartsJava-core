package es.uvigo.esei.amchartsJava.core.controllers.charts;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.Map;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import es.uvigo.esei.amchartsJava.core.controllers.charts.AmAngularGaugeController;
import es.uvigo.esei.amchartsJava.core.controllers.charts.AmPieChartController;
import es.uvigo.esei.amchartsJava.core.exceptions.CoordException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;

public class AmPieChartControllerTest {
	
	@Rule
	public final ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void property_boolean_must_return_boolean_value_if_is_setted(){
		AmPieChartController amPie = new AmPieChartController();
		
		amPie.setAdjustPrecision(true);
		
		assertEquals(true, amPie.isAdjustPrecision());
	}
	
	@Test
	public void property_boolean_must_return_null_if_is_not_setted(){
		AmPieChartController amPie = new AmPieChartController();
		
		assertNull(amPie.isAdjustPrecision());
	}
	
	@Test
	public void property_numeric_with_value_double_in_range_must_return_double() throws OutOfRangeException{
		AmPieChartController amPie = new AmPieChartController();
		
		amPie.setPieAlpha(1);
		
		assertEquals(1.0, amPie.getPieAlpha(),0);
		
	}
	
	@Test
	public void property_numeric_with_value_double_out_range_launch_exception() throws OutOfRangeException{
		thrown.expect(OutOfRangeException.class);
		thrown.expectMessage("Number must be between 0 and 1");
		AmPieChartController amPie = new AmPieChartController();
		
		amPie.setPieAlpha(9);
		
	}
	
	@Test
	public void property_numeric_with_value_double_return_null_if_not_is_setted() throws OutOfRangeException{
		AmPieChartController amPie = new AmPieChartController();
		
		assertNull(amPie.getPieAlpha());
	}
	
	@Test
	public void property_numeric_with_value_integer_in_range_must_return_integer() throws OutOfRangeException{
		AmPieChartController amPie = new AmPieChartController();
		
		amPie.setStartAngle(50);
		
		assertEquals(50, (Object)amPie.getStartAngle());
		
	}
	
	@Test
	public void property_numeric_with_value_integer_out_range_launch_exception() throws OutOfRangeException{
		thrown.expect(OutOfRangeException.class);
		thrown.expectMessage("Number out of range: must be between 0 and 360");
		AmPieChartController amPie = new AmPieChartController();
		
		amPie.setStartAngle(-270);
		
	}
	
	@Test
	public void property_numeric_with_value_integer_return_null_if_is_not_setted() throws OutOfRangeException{
		AmPieChartController amPie = new AmPieChartController();
		
		assertNull(amPie.getLabelRadius());
	}
	
	@Test
	public void minRadius_property_launch_exception_if_set_method_recive_not_integer_value() throws IntegerException{
		thrown.expect(IntegerException.class);
		thrown.expectMessage("Number must be an integer");
		AmAngularGaugeController amGauge = new AmAngularGaugeController();
		
		amGauge.setGaugeX(90.9);
		
	}
	
	@Test
	public void minRadius_property_must_return_null_if_set_method_recive_integer_value_lt_10() throws IntegerException{
		AmPieChartController amPie = new AmPieChartController();
		
		amPie.setMinRadius(9);
		
		assertNull(amPie.getMinRadius());
		
	}
	
	@Test
	public void some_properties_launch_exception_if_set_method_no_recive_integer_value_or_integer_percent_as_string() throws CoordException{
		thrown.expect(CoordException.class);
		thrown.expectMessage("Format coords must be an integer number or a percent");
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
