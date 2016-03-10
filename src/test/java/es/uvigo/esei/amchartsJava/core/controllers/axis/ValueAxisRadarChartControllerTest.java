package es.uvigo.esei.amchartsJava.core.controllers.axis;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import es.uvigo.esei.amchartsJava.core.constants.ColorsAmCharts;
import es.uvigo.esei.amchartsJava.core.constants.Duration;
import es.uvigo.esei.amchartsJava.core.controllers.axis.ValueAxisRadarChartController;
import es.uvigo.esei.amchartsJava.core.controllers.charts.AmRadarChartController;
import es.uvigo.esei.amchartsJava.core.exceptions.ChartException;
import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.DoubleException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.NotSupportedException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;

public class ValueAxisRadarChartControllerTest {
	
	@Rule
	public final ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void property_boolean_must_return_boolean_value_if_is_setted(){
		ValueAxisRadarChartController valueAxis = new ValueAxisRadarChartController();
		
		valueAxis.setBoldLabels(true);
		
		assertEquals(true, valueAxis.isBoldLabels());
	}
	
	@Test
	public void property_boolean_must_return_null_if_is_not_setted(){
		ValueAxisRadarChartController valueAxis = new ValueAxisRadarChartController();
		
		assertNull(valueAxis.isCenterLabels());
	}
	
	@Test
	public void property_numeric_with_value_double_in_range_must_return_double() throws OutOfRangeException{
		ValueAxisRadarChartController valueAxis = new ValueAxisRadarChartController();
		
		valueAxis.setFillAlpha(1);
		
		assertEquals(1.0, valueAxis.getFillAlpha(),0);
		
	}
	
	@Test
	public void property_numeric_with_value_double_out_range_launch_exception() throws OutOfRangeException{
		thrown.expect(OutOfRangeException.class);
		thrown.expectMessage("Number must be between 0 and 1");
		ValueAxisRadarChartController valueAxis = new ValueAxisRadarChartController();
		
		valueAxis.setAxisAlpha(9);
		
	}
	
	@Test
	public void property_numeric_with_value_double_return_null_if_not_is_setted() throws OutOfRangeException{
		ValueAxisRadarChartController valueAxis = new ValueAxisRadarChartController();
		
		assertNull(valueAxis.getFillAlpha());
	}
	
	@Test
	public void all_color_property_return_string_if_format_color_is_correct() throws ColorException{
		ValueAxisRadarChartController valueAxis = new ValueAxisRadarChartController();
		
		valueAxis.setColor(ColorsAmCharts.DARKGRAY);
		
		assertEquals(ColorsAmCharts.DARKGRAY.toString(), valueAxis.getColor());
		
	}
	
	@Test
	public void all_color_property_launch_exception_if_format_color_is_incorrect() throws ColorException{
		thrown.expect(ColorException.class);
		thrown.expectMessage("Format color should be #000000");
		ValueAxisRadarChartController valueAxis = new ValueAxisRadarChartController();
		
		valueAxis.setAxisColor("255,255,255");
	}
	
	@Test
	public void all_color_property_return_null_if_is_not_setted() throws ColorException{
		ValueAxisRadarChartController valueAxis = new ValueAxisRadarChartController();
		
		assertNull(valueAxis.getColor());
		
	}
	
	@Test
	public void property_numeric_with_value_integer_in_range_must_return_integer() throws OutOfRangeException{
		ValueAxisRadarChartController valueAxis = new ValueAxisRadarChartController();
		
		valueAxis.setLabelRotation(-90);
		
		assertSame(-90, valueAxis.getLabelRotation());
		
	}
	
	@Test
	public void property_numeric_with_value_integer_out_range_launch_exception() throws OutOfRangeException{
		thrown.expect(OutOfRangeException.class);
		thrown.expectMessage("Number out of range: must be between -90 and 90");
		ValueAxisRadarChartController valueAxis = new ValueAxisRadarChartController();
		
		valueAxis.setLabelRotation(270);
		
	}
	
	@Test
	public void property_numeric_with_value_integer_return_null_if_is_not_setted() throws OutOfRangeException{
		ValueAxisRadarChartController valueAxis = new ValueAxisRadarChartController();
		
		assertNull(valueAxis.getFontSize());
	}
	
	@Test
	public void some_property_launch_exception_if_set_method_recive_not_integer_value() throws IntegerException{
		thrown.expect(IntegerException.class);
		thrown.expectMessage("Number must be an integer");
		ValueAxisRadarChartController valueAxis = new ValueAxisRadarChartController();
		
		valueAxis.setMinVerticalGap(90.9);
	}
	
	@Test
	public void some_property_launch_exception_if_set_method_recive_not_double_value() throws DoubleException{
		thrown.expect(DoubleException.class);
		thrown.expectMessage("Number must be a double");
		ValueAxisRadarChartController valueAxis = new ValueAxisRadarChartController();
		
		valueAxis.setMaximum(9);
	}
	
	@Test
	public void property_enum_must_return_string_if_is_setted(){
		ValueAxisRadarChartController valueAxis = new ValueAxisRadarChartController();
		
		valueAxis.setDuration(Duration.DD);
		
		assertEquals(Duration.DD.toString(), valueAxis.getDuration());
	}
	
	@Test
	public void property_enum_must_return_null_if_is_not_setted(){
		ValueAxisRadarChartController valueAxis = new ValueAxisRadarChartController();
		
		assertNull(valueAxis.getDuration());
	}
	
	@Test
	public void dateFormat_property_must_return_array_of_string_with_format_dates(){
		ValueAxisRadarChartController valueAxis = new ValueAxisRadarChartController();
		
		String[] dateFormats = valueAxis.getDateFormats();
		
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
	public void ValueAxisRadarChartController_recive_id_when_is_added_to_chart(){
		AmRadarChartController radar = new AmRadarChartController();
		ValueAxisRadarChartController valueAxis = new ValueAxisRadarChartController();
		ValueAxisRadarChartController valueAxis2 = new ValueAxisRadarChartController();
		
		assertNull(valueAxis.getId());
		try {
			radar.addValueAxis(valueAxis);
			radar.addValueAxis(valueAxis2);
		} catch (NotSupportedException e) {
			e.printStackTrace();
		}
		
		assertTrue(valueAxis.getId()!=null);
		assertTrue(valueAxis2.getId()!=null);
		assertEquals("ValueAxis-1", valueAxis.getId());
		assertEquals("ValueAxis-2", valueAxis2.getId());
		
	}
	
	@Test
	public void synchronizedWith_property_launch_exception_if_ValueAxisRadarChartController_is_not_added_to_chart() throws ChartException{
		thrown.expect(ChartException.class);
		thrown.expectMessage("ValueAxisRadarChartController needs to be added to a chart to can be used that property");
		ValueAxisRadarChartController valueAxis = new ValueAxisRadarChartController();
		
		valueAxis.setSynchronizeWith("ValueAxis-2");
	}
	
	@Test
	public void synchronizedWith_property_must_return_null_if_string_value_equals_to_id_ValueAxisRadarChartController() throws ChartException{
		AmRadarChartController radar = new AmRadarChartController();
		ValueAxisRadarChartController valueAxis = new ValueAxisRadarChartController();
		
		try {
			radar.addValueAxis(valueAxis);
		} catch (NotSupportedException e) {
		
			e.printStackTrace();
		}
		
		valueAxis.setSynchronizeWith("ValueAxis-1");
		
		assertNull(valueAxis.getSynchronizeWith());
	}
	
	@Test
	public void synchronizedWith_property_must_return_string_if_string_value_belong_to_other_ValueAxisRadarChartController_added_to_chart() throws ChartException{
		AmRadarChartController radar = new AmRadarChartController();
		ValueAxisRadarChartController valueAxis = new ValueAxisRadarChartController();
		ValueAxisRadarChartController valueAxis2 = new ValueAxisRadarChartController();
		
		try {
			radar.addValueAxis(valueAxis);
			radar.addValueAxis(valueAxis2);
		} catch (NotSupportedException e) {
	
			e.printStackTrace();
		}
		
		valueAxis.setSynchronizeWith("ValueAxis-2");
		
		assertEquals("ValueAxis-2",valueAxis.getSynchronizeWith());
	}
	
	@Test
	public void radarCategoriesEnabled_must_return_boolean_always(){
		ValueAxisRadarChartController valueAxis = new ValueAxisRadarChartController();
		
		assertTrue(valueAxis.isRadarCategoriesEnabled() != null);
		valueAxis.setRadarCategoriesEnabled(null);
		assertTrue(valueAxis.isRadarCategoriesEnabled() != null);
		valueAxis.setRadarCategoriesEnabled(false);
		assertEquals(false, valueAxis.isRadarCategoriesEnabled());
	}
	
}
