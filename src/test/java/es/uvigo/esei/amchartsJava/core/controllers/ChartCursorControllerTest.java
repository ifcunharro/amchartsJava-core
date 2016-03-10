package es.uvigo.esei.amchartsJava.core.controllers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertNull;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import es.uvigo.esei.amchartsJava.core.constants.AmchartsConstants;
import es.uvigo.esei.amchartsJava.core.constants.Orientation;
import es.uvigo.esei.amchartsJava.core.controllers.ChartCursorController;
import es.uvigo.esei.amchartsJava.core.controllers.axis.ValueAxisController;
import es.uvigo.esei.amchartsJava.core.controllers.charts.AmSerialChartController;
import es.uvigo.esei.amchartsJava.core.exceptions.ChartException;
import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.NotSupportedException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;

public class ChartCursorControllerTest {
	
	@Rule
	public final ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void property_boolean_must_return_boolean_value_if_is_setted(){
		ChartCursorController cursor = new ChartCursorController();
		
		cursor.setAvoidBalloonOverlapping(true);;
		
		assertEquals(true, cursor.isAvoidBalloonOverlapping());
	}
	
	@Test
	public void property_boolean_must_return_null_if_is_not_setted(){
		ChartCursorController cursor = new ChartCursorController();
		
		assertNull(cursor.isEnabled());
	}
	
	@Test
	public void property_numeric_with_value_double_in_range_must_return_double() throws OutOfRangeException{
		ChartCursorController cursor = new ChartCursorController();
		
		cursor.setCategoryBalloonAlpha(1);
		
		assertEquals(1.0, cursor.getCategoryBalloonAlpha(),0);
		
	}
	
	@Test
	public void property_numeric_with_value_double_out_range_launch_exception() throws OutOfRangeException{
		thrown.expect(OutOfRangeException.class);
		thrown.expectMessage("Number must be between 0 and 1");
		ChartCursorController cursor = new ChartCursorController();
		
		cursor.setCursorAlpha(9);
		
	}
	
	@Test
	public void property_numeric_with_value_double_return_null_if_not_is_setted() throws OutOfRangeException{
		ChartCursorController cursor = new ChartCursorController();
		
		assertNull(cursor.getCategoryBalloonAlpha());
	}
	
	@Test
	public void all_property_to_color_return_string_if_format_color_is_correct() throws ColorException{
		ChartCursorController cursor = new ChartCursorController();
		
		cursor.setCategoryBalloonColor("#000000");
		
		assertEquals("#000000", cursor.getCategoryBalloonColor());
		
	}
	
	@Test
	public void all_property_to_color_launch_exception_if_format_color_is_incorrect() throws ColorException{
		thrown.expect(ColorException.class);
		thrown.expectMessage("Format color should be #000000");
		ChartCursorController cursor = new ChartCursorController();
		
		cursor.setColor("255,255,255");
		
	}
	
	@Test
	public void all_property_to_color_return_null_if_is_not_setted() throws ColorException{
		ChartCursorController cursor = new ChartCursorController();
		
		assertNull(cursor.getColor());
		
	}
	
	@Test
	public void property_numeric_with_value_integer_in_range_must_return_integer() throws OutOfRangeException{
		ChartCursorController cursor = new ChartCursorController();
		
		cursor.setBulletSize(10);
		
		assertSame(10, cursor.getBulletSize());
		
	}
	
	@Test
	public void property_numeric_with_value_integer_out_range_launch_exception() throws OutOfRangeException{
		thrown.expect(OutOfRangeException.class);
		thrown.expectMessage("Number out of range: must be between 8 and 20");
		ChartCursorController cursor = new ChartCursorController();
		
		cursor.setBulletSize(100);
		
	}
	
	@Test
	public void property_numeric_with_value_integer_return_null_if_is_not_setted() throws OutOfRangeException{
		ChartCursorController cursor = new ChartCursorController();
		
		assertNull(cursor.getAdjustment());
		
	}
	
	@Test
	public void property_date_return_string_if_date_format_is_correct(){
		ChartCursorController cursor = new ChartCursorController();
		
		for(String date: AmchartsConstants.DATE_FORMAT){
			cursor.setCategoryBalloonDateFormat(date);
			assertEquals(date, cursor.getCategoryBalloonDateFormat());
		}
	}
	
	@Test
	public void property_date_return_null_if_date_format_is_incorrect(){
		ChartCursorController cursor = new ChartCursorController();
		
		cursor.setCategoryBalloonDateFormat("DD-MM-YY");
		assertNull(cursor.getCategoryBalloonDateFormat());
		cursor.setCategoryBalloonDateFormat("Y");
		assertNull(cursor.getCategoryBalloonDateFormat());
		cursor.setCategoryBalloonDateFormat("M");
		assertNull(cursor.getCategoryBalloonDateFormat());
	}
	
	@Test
	public void categoryBalloonFunction_property_return_string_if_is_setted(){
		ChartCursorController cursor = new ChartCursorController();
		
		cursor.setCategoryBalloonFunction("nameFunction");
		
		assertEquals("nameFunction", cursor.getCategoryBalloonFunction());
	}
	
	@Test
	public void categoryBalloonFunction_property_return_null_if_is_not_setted(){
		ChartCursorController cursor = new ChartCursorController();
		
		assertNull(cursor.getCategoryBalloonFunction());
	}
	
	@Test
	public void valueLineAxis_property_launch_exception_if_ChartCursorController_not_added_to_chart() throws ChartException{
		thrown.expect(ChartException.class);
		thrown.expectMessage("ChartCursorController needs to be added to "
				+ "a chart to can be used that property");
		ChartCursorController cursor = new ChartCursorController();
		
		cursor.setValueLineAxis("ValueAxis-1");
	}
	
	@Test
	public void valueLineAxis_property_return_null_if_chart_not_contains_valueAxis_with_that_id() throws ChartException{
		AmSerialChartController serial = new AmSerialChartController();
		ValueAxisController valueAxis = new ValueAxisController();
		try {
			serial.addValueAxis(valueAxis);
		} catch (NotSupportedException e) {
			e.printStackTrace();
		}
		ChartCursorController cursor = new ChartCursorController();
		
		serial.addChartCursor(cursor);
		
		cursor.setValueLineAxis("ValueAxis-2");
		assertNull(cursor.getValueLineAxis());
		assertEquals("ValueAxis-1", valueAxis.getId());
	}
	
	@Test
	public void valueLineAxis_property_return_string_if_chart_contains_valueAxis_with_that_id() throws ChartException{
		
		
		AmSerialChartController serial = new AmSerialChartController();
		ValueAxisController valueAxis = new ValueAxisController();
		ValueAxisController valueAxis2 = new ValueAxisController();
		try {
			serial.addValueAxis(valueAxis);
			serial.addValueAxis(valueAxis2);
		} catch (NotSupportedException e) {
			e.printStackTrace();
		}
		ChartCursorController cursor = new ChartCursorController();
		
		serial.addChartCursor(cursor);
		
		cursor.setValueLineAxis("ValueAxis-2");
		assertEquals("ValueAxis-2",cursor.getValueLineAxis());
		assertEquals("ValueAxis-1", valueAxis.getId());
		assertEquals("ValueAxis-2", valueAxis2.getId());
	}
	
	@Test
	public void property_numeric_with_value_integer_without_range_limit_return_integer_if_set_method_recive_integer_value() throws IntegerException{
		ChartCursorController cursor = new ChartCursorController();
		
		cursor.setAdjustment(100);
		
		assertSame(100, cursor.getAdjustment());
		
	}
	
	@Test
	public void property_mumeric_with_value_integer_without_range_limit_launch_exception_if_set_method_recive_not_integer() throws IntegerException{
		thrown.expect(IntegerException.class);
		thrown.expectMessage("Number must be an integer");
		ChartCursorController cursor = new ChartCursorController();
		
		cursor.setAdjustment(9.6);
		
	}
	
	@Test
	public void property_enum_must_return_string_if_is_setted(){
		ChartCursorController cursor = new ChartCursorController();
		
		cursor.setBalloonPointerOrientation(Orientation.horizontal);
		
		assertEquals(Orientation.horizontal.toString(), cursor.getBalloonPointerOrientation());
	}
	
	@Test
	public void property_enum_must_return_null_if_is_not_setted(){
		ChartCursorController cursor = new ChartCursorController();
		
		assertNull(cursor.getBalloonPointerOrientation());
	}
	
}
