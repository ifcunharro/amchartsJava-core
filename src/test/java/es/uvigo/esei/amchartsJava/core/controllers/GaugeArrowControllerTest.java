package es.uvigo.esei.amchartsJava.core.controllers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import java.util.List;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import es.uvigo.esei.amchartsJava.core.controllers.GaugeArrowController;
import es.uvigo.esei.amchartsJava.core.controllers.GaugeAxisController;
import es.uvigo.esei.amchartsJava.core.controllers.charts.AmAngularGaugeController;
import es.uvigo.esei.amchartsJava.core.exceptions.ChartException;
import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.CoordException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;

public class GaugeArrowControllerTest {
	
	@Rule
	public final ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void property_boolean_must_return_boolean_value_if_is_setted(){
		GaugeArrowController gaugeArrow = new GaugeArrowController();
		
		gaugeArrow.setClockWiseOnly(true);
		
		assertEquals(true, gaugeArrow.isClockWiseOnly());
	}
	
	@Test
	public void property_boolean_must_return_null_if_is_not_setted(){
		GaugeArrowController gaugeArrow = new GaugeArrowController();
		
		assertNull(gaugeArrow.isClockWiseOnly());
	}
	
	@Test
	public void property_numeric_with_value_double_in_range_must_return_double() throws OutOfRangeException{
		GaugeArrowController gaugeArrow = new GaugeArrowController();
		
		gaugeArrow.setBorderAlpha(1);
		
		assertEquals(1.0, gaugeArrow.getBorderAlpha(),0);
		
	}
	
	@Test
	public void property_numeric_with_value_double_out_range_launch_exception() throws OutOfRangeException{
		thrown.expect(OutOfRangeException.class);
		thrown.expectMessage("Number must be between 0 and 1");
		GaugeArrowController gaugeArrow = new GaugeArrowController();
		
		gaugeArrow.setAlpha(9);
		
	}
	
	@Test
	public void property_numeric_with_value_double_return_null_if_not_is_setted() throws OutOfRangeException{
		GaugeArrowController gaugeArrow = new GaugeArrowController();
		
		assertNull(gaugeArrow.getBorderAlpha());
	}
	
	@Test
	public void color_property_return_string_if_format_color_is_correct() throws ColorException{
		GaugeArrowController gaugeArrow = new GaugeArrowController();
		
		gaugeArrow.setColor("#000000");
		
		assertEquals("#000000", gaugeArrow.getColor());
		
	}
	
	@Test
	public void color_property_launch_exception_if_format_color_is_incorrect() throws ColorException{
		thrown.expect(ColorException.class);
		thrown.expectMessage("Format color should be #000000");
		GaugeArrowController gaugeArrow = new GaugeArrowController();
		
		gaugeArrow.setColor("255,255,255");
		
	}
	
	@Test
	public void color_property_return_null_if_is_not_setted() throws ColorException{
		GaugeArrowController gaugeArrow = new GaugeArrowController();
		
		assertNull(gaugeArrow.getColor());
		
	}
	
	@Test
	public void property_numeric_with_value_integer_in_range_must_return_integer() throws OutOfRangeException{
		GaugeArrowController gaugeArrow = new GaugeArrowController();
		
		gaugeArrow.setNailBorderThickness(8);
		
		assertSame(8, gaugeArrow.getNailBorderThickness());
		
	}
	
	@Test
	public void property_numeric_with_value_integer_out_range_launch_exception() throws OutOfRangeException{
		thrown.expect(OutOfRangeException.class);
		thrown.expectMessage("Number out of range: must be between 0 and 10");
		GaugeArrowController gaugeArrow = new GaugeArrowController();
		
		gaugeArrow.setNailBorderThickness(37);
		
	}
	
	@Test
	public void property_numeric_with_value_integer_return_null_if_is_not_setted() throws OutOfRangeException{
		GaugeArrowController gaugeArrow = new GaugeArrowController();
		
		assertNull(gaugeArrow.getNailRadius());
		
	}
	
	@Test
	public void value_property_must_return_integer_if_set_method_recive_integer_value() throws IntegerException{
		GaugeArrowController gaugeArrow = new GaugeArrowController();
		
		gaugeArrow.setValue(90);
		assertSame(90, gaugeArrow.getValue());
		
	}
	
	@Test
	public void value_property_launch_excpetion_if_set_method_not_recive_integer_value() throws IntegerException{
		thrown.expect(IntegerException.class);
		thrown.expectMessage("Number must be an integer");
		GaugeArrowController gaugeArrow = new GaugeArrowController();
		
		gaugeArrow.setValue(90.0);
		
	}
	
	@Test
	public void startWidth_property_must_return_null_if_recive_value_lt_5(){
		GaugeArrowController gaugeArrow = new GaugeArrowController();
		
		gaugeArrow.setStartWidth(4);
		
		assertNull(gaugeArrow.getStartWidth());
	}
	
	@Test
	public void radius_property_must_return_string_if_set_method_recive_integer_value_as_string() throws CoordException{
		GaugeArrowController gaugeArrow = new GaugeArrowController();
		
		gaugeArrow.setRadius("500");
		assertEquals("500", gaugeArrow.getRadius());
	}
	
	@Test
	public void radius_property_must_return_string_if_set_method_recive_integer_percent_value_as_string() throws CoordException{
		GaugeArrowController gaugeArrow = new GaugeArrowController();
		
		gaugeArrow.setRadius("80%");
		assertEquals("80%", gaugeArrow.getRadius());
		
	}
	
	@Test
	public void radius_property_must_return_100_percent_as_string_if_set_method_recive_percent_gt_100() throws CoordException{
		GaugeArrowController gaugeArrow = new GaugeArrowController();
		
		gaugeArrow.setRadius("120%");
		assertEquals("100%",gaugeArrow.getRadius());
		
	}
	
	@Test
	public void radius_property_launch_exception_if_set_methot_not_recive_integer_or_integer_percent_as_string() throws CoordException{
		thrown.expect(CoordException.class);
		thrown.expectMessage("Format coords must be an integer number or a percent");
		GaugeArrowController gaugeArrow = new GaugeArrowController();
		
		gaugeArrow.setRadius("120%2");
		
	}
	
	@Test
	public void innerRadius_property_must_return_string_if_set_method_recive_integer_value_as_string() throws CoordException{
		GaugeArrowController gaugeArrow = new GaugeArrowController();
		
		gaugeArrow.setInnerRadius("500");
		assertEquals("500", gaugeArrow.getInnerRadius());
	}
	
	@Test
	public void innerRadius_property_must_return_string_if_set_method_recive_integer_percent_value_as_string() throws CoordException{
		GaugeArrowController gaugeArrow = new GaugeArrowController();
		
		gaugeArrow.setInnerRadius("180%");
		assertEquals("180%", gaugeArrow.getInnerRadius());
		
	}
	
	@Test
	public void innerRadius_property_launch_exception_if_set_methot_not_recive_integer_or_integer_percent_as_string() throws CoordException{
		thrown.expect(CoordException.class);
		thrown.expectMessage("Format coords must be an integer number or a percent");
		GaugeArrowController gaugeArrow = new GaugeArrowController();
		
		gaugeArrow.setInnerRadius("120.9");
		
	}
	
	@Test
	public void id_property_is_setted_if_GaugeArrowController_is_added_to_chart(){
		AmAngularGaugeController gaugeChart = new AmAngularGaugeController();
		GaugeArrowController gaugeArrow = new GaugeArrowController();
		
		assertNull(gaugeArrow.getId());
		gaugeChart.addArrow(gaugeArrow);
		
		assertEquals("GaugeArrow-1", gaugeArrow.getId());
		
		
	}
	
	@Test
	public void id_property_is_changed_if_same_GaugeArrowController_is_added_to_chart(){
		AmAngularGaugeController gaugeChart = new AmAngularGaugeController();
		GaugeArrowController gaugeArrow = new GaugeArrowController();
		GaugeArrowController g2 = new GaugeArrowController();
		assertNull(gaugeArrow.getId());
		
		gaugeChart.addArrow(gaugeArrow);
		gaugeChart.addArrow(gaugeArrow);
		
		assertEquals("GaugeArrow-2", gaugeArrow.getId());
		
		gaugeChart.addArrow(g2);
		gaugeChart.addArrow(gaugeArrow);
		
		assertEquals("GaugeArrow-4", gaugeArrow.getId());
		assertEquals("GaugeArrow-3", g2.getId());
	}
	
	@Test
	public void if_same_GaugeArrowController_is_added_to_chart_it_has_a_unique_instance_of_GaugeArrowController(){
		AmAngularGaugeController gaugeChart = new AmAngularGaugeController();
		GaugeArrowController gaugeArrow = new GaugeArrowController();
		
		gaugeArrow.setClockWiseOnly(false);
		gaugeChart.addArrow(gaugeArrow);
		gaugeArrow.setClockWiseOnly(true);
		gaugeChart.addArrow(gaugeArrow);
		
		List<GaugeArrowController> arrows = gaugeChart.getArrows();
		
		assertSame(1, arrows.size());
		
	}
	
	@Test
	public void axis_property_must_return_string_if_chart_has_GaugeAxis_that_id() throws ChartException{
		AmAngularGaugeController gaugeChart = new AmAngularGaugeController();
		GaugeAxisController gaugeAxis = new GaugeAxisController();
		GaugeArrowController gaugeArrow = new GaugeArrowController();
		
		gaugeChart.addAxis(gaugeAxis);
		gaugeChart.addArrow(gaugeArrow);
		
		assertEquals("GaugeAxis-1", gaugeAxis.getId());
		
		gaugeArrow.addAxis("GaugeAxis-1");
		
		assertEquals("GaugeAxis-1", gaugeArrow.getAxis());
		
		
	}
	
	@Test
	public void axis_property_launch_exception_if_GaugeArrowController_is_not_added_to_chart() throws ChartException{
		thrown.expect(ChartException.class);
		thrown.expectMessage("GaugeArrowController needs to be added to a chart to can be used that property");
		AmAngularGaugeController gaugeChart = new AmAngularGaugeController();
		GaugeAxisController gaugeAxis = new GaugeAxisController();
		GaugeArrowController gaugeArrow = new GaugeArrowController();
		
		gaugeChart.addAxis(gaugeAxis);
		
		gaugeArrow.addAxis("GaugeAxis-1");
		
	}
	
	@Test
	public void axis_property_must_return_null_if_chart_not_contains_GaugeAxis_with_that_id() throws ChartException{
		AmAngularGaugeController gaugeChart = new AmAngularGaugeController();
		GaugeAxisController gaugeAxis = new GaugeAxisController();
		GaugeArrowController gaugeArrow = new GaugeArrowController();
		
		gaugeChart.addAxis(gaugeAxis);
		gaugeChart.addArrow(gaugeArrow);
		
		gaugeArrow.addAxis("GaugeAxis-2");
		assertNull(gaugeArrow.getAxis());
		
	}
	
	
	
}
