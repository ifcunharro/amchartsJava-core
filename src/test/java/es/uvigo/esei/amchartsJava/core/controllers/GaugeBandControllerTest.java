package es.uvigo.esei.amchartsJava.core.controllers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import es.uvigo.esei.amchartsJava.core.controllers.GaugeAxisController;
import es.uvigo.esei.amchartsJava.core.controllers.GaugeBandController;
import es.uvigo.esei.amchartsJava.core.controllers.charts.AmAngularGaugeController;
import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.CoordException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;

public class GaugeBandControllerTest {
	
	@Rule
	public final ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void property_numeric_with_value_double_in_range_must_return_double(){
		GaugeBandController gaugeBand = new GaugeBandController();
		
		try {
			gaugeBand.setAlpha(1);
		} catch (OutOfRangeException e) {
			e.printStackTrace();
		}
		
		assertEquals(1.0, gaugeBand.getAlpha(),0);
		
	}
	
	@Test
	public void property_numeric_with_value_double_out_range_launch_exception() throws OutOfRangeException{
		thrown.expect(OutOfRangeException.class);
		thrown.expectMessage("Number out of range: must be between 0 and 1");
		GaugeBandController gaugeBand = new GaugeBandController();
		
		gaugeBand.setAlpha(9);
		
	}
	
	@Test
	public void property_numeric_with_value_double_return_null_if_not_is_setted(){
		GaugeBandController gaugeBand = new GaugeBandController();
		
		assertNull(gaugeBand.getAlpha());
	}
	
	@Test
	public void color_property_return_string_if_format_color_is_correct(){
		GaugeBandController gaugeBand = new GaugeBandController();
		
		try {
			gaugeBand.setColor("#000000");
		} catch (ColorException e) {
			e.printStackTrace();
		}
		
		assertEquals("#000000", gaugeBand.getColor());
		
	}
	
	@Test
	public void color_property_launch_exception_if_format_color_is_incorrect() throws ColorException{
		thrown.expect(ColorException.class);
		thrown.expectMessage("Format color should be #000000");
		GaugeBandController gaugeBand = new GaugeBandController();
		
		gaugeBand.setColor("255,255,255");
		
	}
	
	@Test
	public void color_property_return_null_if_is_not_setted(){
		GaugeBandController gaugeBand = new GaugeBandController();
		
		assertNull(gaugeBand.getColor());
		
	}
	
	@Test
	public void endValue_and_startValue_properties_must_return_double_value_if_set_method_recive_number_ge_1(){
		GaugeBandController gaugeBand = new GaugeBandController();
		
		gaugeBand.setEndValue(1.2);
		gaugeBand.setStartValue(1);
		
		assertEquals(1.2, gaugeBand.getEndValue(),0);
		assertEquals(1.0, gaugeBand.getStartValue(),0);
	}
	
	@Test
	public void radius_and_innerRadius_properties_must_return_string_if_set_method_recive_integer_value_as_string(){
		GaugeBandController gaugeBand = new GaugeBandController();
		
		try {
			gaugeBand.setRadius("500");
		} catch (CoordException e) {
			e.printStackTrace();
		}
		try {
			gaugeBand.setInnerRadius("200");
		} catch (CoordException e) {
			e.printStackTrace();
		}
		assertEquals("500", gaugeBand.getRadius());
		assertEquals("200", gaugeBand.getInnerRadius());
	}
	
	@Test
	public void radius_and_innerRadius_properties_must_return_string_if_set_method_recive_integer_percent_value_as_string(){
		GaugeBandController gaugeBand = new GaugeBandController();
		
		try {
			gaugeBand.setRadius("80%");
		} catch (CoordException e) {
			e.printStackTrace();
		}
		try {
			gaugeBand.setInnerRadius("120%");
		} catch (CoordException e) {
			e.printStackTrace();
		}
		assertEquals("80%", gaugeBand.getRadius());
		assertEquals("120%", gaugeBand.getInnerRadius());
		
	}
	
	@Test
	public void radius_and_innerRaidus_properties_launch_exception_if_set_methot_not_recive_integer_or_integer_percent_as_string() throws CoordException{
		thrown.expect(CoordException.class);
		thrown.expectMessage("Format coords must be an integer number or a percent");
		GaugeBandController gaugeBand = new GaugeBandController();
		
		gaugeBand.setRadius("120%%");
		
	}
	
	@Test
	public void gaugeBandController_recive_id_when_is_added_to_chart_its_GaugeAxisController(){
		AmAngularGaugeController gaugeChart = new AmAngularGaugeController();
		GaugeAxisController gaugeAxis = new GaugeAxisController();
		GaugeBandController gaugeBand = new GaugeBandController();
		
		gaugeAxis.addBand(gaugeBand);
		
		assertNull(gaugeBand.getId());
		gaugeChart.addAxis(gaugeAxis);
		
		assertTrue(gaugeBand.getId()!=null);
		assertEquals("GaugeBand-1", gaugeBand.getId());
	}

}
