package es.uvigo.esei.amchartsjava.core.controllers.axis;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import es.uvigo.esei.amchartsjava.core.constants.ColorsAmCharts;
import es.uvigo.esei.amchartsjava.core.constants.Duration;
import es.uvigo.esei.amchartsjava.core.constants.config.Config;
import es.uvigo.esei.amchartsjava.core.controllers.axis.ValueAxisRadarChartController;
import es.uvigo.esei.amchartsjava.core.controllers.charts.AmRadarChartController;
import es.uvigo.esei.amchartsjava.core.exceptions.ChartException;
import es.uvigo.esei.amchartsjava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsjava.core.exceptions.DoubleException;
import es.uvigo.esei.amchartsjava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsjava.core.exceptions.NotSupportedException;
import es.uvigo.esei.amchartsjava.core.exceptions.OutOfRangeException;

public class ValueAxisRadarChartControllerTest {
	
	@Rule
	public final ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void property_boolean_must_return_boolean_value_if_is_setted(){
		ValueAxisRadarChartController valueAxis = new ValueAxisRadarChartController();
		
		valueAxis.setBoldLabels(true);
		
		assertTrue(valueAxis.isBoldLabels());
	}
	
	@Test
	public void property_boolean_must_return_null_if_is_not_setted(){
		ValueAxisRadarChartController valueAxis = new ValueAxisRadarChartController();
		
		assertNull(valueAxis.isCenterLabels());
	}
	
	@Test
	public void property_numeric_with_value_double_in_range_must_return_double(){
		ValueAxisRadarChartController valueAxis = new ValueAxisRadarChartController();
		
		try {
			valueAxis.setFillAlpha(1);
		} catch (OutOfRangeException e) {
			e.printStackTrace();
		}
		
		assertEquals(1.0, valueAxis.getFillAlpha(),0);
		
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
		ValueAxisRadarChartController valueAxis = new ValueAxisRadarChartController();
		
		valueAxis.setAxisAlpha(9);
		
	}
	
	@Test
	public void property_numeric_with_value_double_return_null_if_not_is_setted(){
		ValueAxisRadarChartController valueAxis = new ValueAxisRadarChartController();
		
		assertNull(valueAxis.getFillAlpha());
	}
	
	@Test
	public void all_color_property_return_string_if_format_color_is_correct(){
		ValueAxisRadarChartController valueAxis = new ValueAxisRadarChartController();
		
		valueAxis.setColor(ColorsAmCharts.DARKGRAY);
		
		assertEquals(ColorsAmCharts.DARKGRAY.toString(), valueAxis.getColor());
		
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
		
		ValueAxisRadarChartController valueAxis = new ValueAxisRadarChartController();
		
		valueAxis.setAxisColor("255,255,255");
	}
	
	@Test
	public void all_color_property_return_null_if_is_not_setted(){
		ValueAxisRadarChartController valueAxis = new ValueAxisRadarChartController();
		
		assertNull(valueAxis.getColor());
		
	}
	
	@Test
	public void property_numeric_with_value_integer_in_range_must_return_integer(){
		ValueAxisRadarChartController valueAxis = new ValueAxisRadarChartController();
		
		try {
			valueAxis.setLabelRotation(-90);
		} catch (OutOfRangeException e) {
			e.printStackTrace();
		}
		
		assertEquals(-90, (Object)valueAxis.getLabelRotation());
		
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
		ValueAxisRadarChartController valueAxis = new ValueAxisRadarChartController();
		
		valueAxis.setLabelRotation(270);
		
	}
	
	@Test
	public void property_numeric_with_value_integer_return_null_if_is_not_setted(){
		ValueAxisRadarChartController valueAxis = new ValueAxisRadarChartController();
		
		assertNull(valueAxis.getFontSize());
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
		ValueAxisRadarChartController valueAxis = new ValueAxisRadarChartController();
		
		valueAxis.setMinVerticalGap(90.9);
	}
	
	@Test
	public void some_property_launch_exception_if_set_method_recive_not_double_value() throws DoubleException{
		thrown.expect(DoubleException.class);
		switch (Config.getString("lang")) {
			case "en":
				thrown.expectMessage("Number must be a double");
				break;
			case "es":
				thrown.expectMessage("El número debe ser un real");
				break;
		}
		
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
		
		assertNotNull(valueAxis.getId());
		assertNotNull(valueAxis2.getId());
		assertEquals("ValueAxis-1", valueAxis.getId());
		assertEquals("ValueAxis-2", valueAxis2.getId());
		
	}
	
	@Test
	public void synchronizedWith_property_launch_exception_if_ValueAxisRadarChartController_is_not_added_to_chart() throws ChartException{
		thrown.expect(ChartException.class);
		switch (Config.getString("lang")) {
			case "en":
				thrown.expectMessage("ValueAxisRadarChartController needs to be added to "
						+ "a chart to can be used that property");
				break;
			case "es":
				thrown.expectMessage("ValueAxisRadarChartController necesita añadirse a "
						+ "un chart para poder usar esta propiedad");
				break;
		}
		ValueAxisRadarChartController valueAxis = new ValueAxisRadarChartController();
		
		valueAxis.setSynchronizeWith("ValueAxis-2");
	}
	
	@Test
	public void synchronizedWith_property_must_return_null_if_string_value_equals_to_id_ValueAxisRadarChartController(){
		AmRadarChartController radar = new AmRadarChartController();
		ValueAxisRadarChartController valueAxis = new ValueAxisRadarChartController();
		
		try {
			radar.addValueAxis(valueAxis);
		} catch (NotSupportedException e) {
		
			e.printStackTrace();
		}
		
		try {
			valueAxis.setSynchronizeWith("ValueAxis-1");
		} catch (ChartException e) {
			e.printStackTrace();
		}
		
		assertNull(valueAxis.getSynchronizeWith());
	}
	
	@Test
	public void synchronizedWith_property_must_return_string_if_string_value_belong_to_other_ValueAxisRadarChartController_added_to_chart(){
		AmRadarChartController radar = new AmRadarChartController();
		ValueAxisRadarChartController valueAxis = new ValueAxisRadarChartController();
		ValueAxisRadarChartController valueAxis2 = new ValueAxisRadarChartController();
		
		try {
			radar.addValueAxis(valueAxis);
			radar.addValueAxis(valueAxis2);
		} catch (NotSupportedException e) {
	
			e.printStackTrace();
		}
		
		try {
			valueAxis.setSynchronizeWith("ValueAxis-2");
		} catch (ChartException e) {
			e.printStackTrace();
		}
		
		assertEquals("ValueAxis-2",valueAxis.getSynchronizeWith());
	}
	
	@Test
	public void radarCategoriesEnabled_must_return_boolean_always(){
		ValueAxisRadarChartController valueAxis = new ValueAxisRadarChartController();
		
		assertNotNull(valueAxis.isRadarCategoriesEnabled());
		valueAxis.setRadarCategoriesEnabled(null);
		assertNotNull(valueAxis.isRadarCategoriesEnabled());
		valueAxis.setRadarCategoriesEnabled(false);
		assertFalse(valueAxis.isRadarCategoriesEnabled());
	}
	
}
