package es.uvigo.esei.amchartsJava.core.controllers.charts;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.Map;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import es.uvigo.esei.amchartsJava.core.constants.AmchartsConstants;
import es.uvigo.esei.amchartsJava.core.controllers.axis.CategoryAxisController;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;

public class AmSerialChartControllerTest {
	
	@Rule
	public final ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void property_boolean_must_return_boolean_value_if_is_setted(){
		AmSerialChartController serial = new AmSerialChartController();
		
		serial.setRotate(true);
		
		assertEquals(true, serial.isRotate());
	}
	
	@Test
	public void property_boolean_must_return_null_if_is_not_setted(){
		AmSerialChartController serial = new AmSerialChartController();
		
		assertNull(serial.isRotate());
	}
	
	@Test
	public void property_numeric_with_value_double_in_range_must_return_double(){
		AmSerialChartController serial = new AmSerialChartController();
		
		try {
			serial.setColumnWidth(1);
		} catch (OutOfRangeException e) {
			e.printStackTrace();
		}
		
		assertEquals(1.0, serial.getColumnWidth(),0);
		
	}
	
	@Test
	public void property_numeric_with_value_double_out_range_launch_exception() throws OutOfRangeException{
		thrown.expect(OutOfRangeException.class);
		thrown.expectMessage("Number out of range: must be between 0 and 1");
		AmSerialChartController serial = new AmSerialChartController();
		
		serial.setColumnWidth(9);
		
	}
	
	@Test
	public void property_numeric_with_value_double_return_null_if_not_is_setted(){
		AmSerialChartController serial = new AmSerialChartController();
		
		assertNull(serial.getColumnWidth());
	}
	
	@Test
	public void property_numeric_with_value_integer_in_range_must_return_integer(){
		AmSerialChartController serial = new AmSerialChartController();
		
		try {
			serial.setMaxSelectedTime(200000);
		} catch (OutOfRangeException e) {
			e.printStackTrace();
		}
		
		assertEquals(200000, (Object)serial.getMaxSelectedTime());
		
	}
	
	@Test
	public void property_numeric_with_value_integer_out_range_launch_exception() throws OutOfRangeException{
		thrown.expect(OutOfRangeException.class);
		thrown.expectMessage("Number out of range: must be between 0 and 10000");
		AmSerialChartController serial = new AmSerialChartController();
		
		serial.setMinSelectedTime(11000);
		
	}
	
	@Test
	public void property_numeric_with_value_integer_return_null_if_is_not_setted(){
		AmSerialChartController serial = new AmSerialChartController();
		
		assertNull(serial.getColumnSpacing3D());
	}
	
	@Test
	public void some_property_launch_exception_if_set_method_recive_not_integer_value() throws IntegerException{
		thrown.expect(IntegerException.class);
		thrown.expectMessage("Number must be an integer");
		AmSerialChartController serial = new AmSerialChartController();
		
		serial.setColumnSpacing(90.9);
		
	}
	
	@Test
	public void maxSelectedSeries_must_return_null_if_recive_integer_le_zero(){
		AmSerialChartController serial = new AmSerialChartController();
		
		try {
			serial.setMaxSelectedSeries(0);
			assertNull(serial.getMaxSelectedSeries());
			serial.setMaxSelectedSeries(-90);
			assertNull(serial.getMaxSelectedSeries());
		} catch (IntegerException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void date_properties_must_return_string_if_recive_date_format_correct(){
		AmSerialChartController serial = new AmSerialChartController();
		
		for(String dateFormat:AmchartsConstants.DATE_FORMAT){
			serial.setDataDateFormat(dateFormat);
			assertEquals(dateFormat, serial.getDataDateFormat());
		}
	}
	
	@Test
	public void categoryAxis_can_be_added_and_retrieve(){
		AmSerialChartController serial = new AmSerialChartController();
		
		CategoryAxisController categoryAxis = new CategoryAxisController();
		
		assertNull(serial.getCategoryAxis());
		
		serial.addCategoryAxis(categoryAxis);
		CategoryAxisController catRecovery = serial.getCategoryAxis();
		assertTrue(catRecovery != null);
		
	}
	
	@Test
	public void field_property_must_return_string_if_is_setted(){
		AmSerialChartController serial = new AmSerialChartController();
		
		serial.setCategoryField("myCategoryFieldName");
		assertEquals("myCategoryFieldName",serial.getCategoryField());
		
	}
	
	@Test
	public void field_property_save_relation_user_nameField_amcharts_nameField_if_is_setted(){
		AmSerialChartController serial = new AmSerialChartController();
		
		serial.setCategoryField("myCategoryFieldName");
		
		Map<String, String> chartFields = serial.getChartFields();
		assertEquals("myCategoryFieldName",chartFields.get("categoryField"));
	}
	
	@Test
	public void field_property_must_return_null_if_is_not_setted(){
		AmSerialChartController serial = new AmSerialChartController();
		
		assertNull(serial.getCategoryField());
	}
	
	@Test
	public void type_property_must_return_serial_as_string(){
		AmSerialChartController serial = new AmSerialChartController();
		
		assertEquals("serial", serial.getType());
	}

}
