package es.uvigo.esei.amchartsjava.core.controllers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import es.uvigo.esei.amchartsjava.core.constants.AmchartsConstants;
import es.uvigo.esei.amchartsjava.core.constants.config.Config;
import es.uvigo.esei.amchartsjava.core.controllers.GaugeArrowController;
import es.uvigo.esei.amchartsjava.core.controllers.GaugeAxisController;
import es.uvigo.esei.amchartsjava.core.controllers.charts.AmAngularGaugeController;
import es.uvigo.esei.amchartsjava.core.exceptions.ChartException;
import es.uvigo.esei.amchartsjava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsjava.core.exceptions.CoordException;
import es.uvigo.esei.amchartsjava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsjava.core.exceptions.OutOfRangeException;

public class GaugeArrowControllerTest {
	
	@Rule
	public final ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void property_boolean_must_return_boolean_value_if_is_setted(){
		GaugeArrowController gaugeArrow = new GaugeArrowController();
		
		gaugeArrow.setClockWiseOnly(true);
		
		assertTrue(gaugeArrow.isClockWiseOnly());
	}
	
	@Test
	public void property_boolean_must_return_null_if_is_not_setted(){
		GaugeArrowController gaugeArrow = new GaugeArrowController();
		
		assertNull(gaugeArrow.isClockWiseOnly());
	}
	
	@Test
	public void property_numeric_with_value_double_in_range_must_return_double(){
		GaugeArrowController gaugeArrow = new GaugeArrowController();
		
		try {
			gaugeArrow.setBorderAlpha(1);
		} catch (OutOfRangeException e) {
			e.printStackTrace();
		}
		
		assertEquals(1.0, gaugeArrow.getBorderAlpha(),0);
		
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
		
		GaugeArrowController gaugeArrow = new GaugeArrowController();
		
		gaugeArrow.setAlpha(9);
		
	}
	
	@Test
	public void property_numeric_with_value_double_return_null_if_not_is_setted(){
		GaugeArrowController gaugeArrow = new GaugeArrowController();
		
		assertNull(gaugeArrow.getBorderAlpha());
	}
	
	@Test
	public void color_property_return_string_if_format_color_is_correct(){
		GaugeArrowController gaugeArrow = new GaugeArrowController();
		
		try {
			gaugeArrow.setColor("#000000");
		} catch (ColorException e) {
			e.printStackTrace();
		}
		
		assertEquals("#000000", gaugeArrow.getColor());
		
	}
	
	@Test
	public void color_property_launch_exception_if_format_color_is_incorrect() throws ColorException{
		thrown.expect(ColorException.class);
		switch (Config.getString("lang")) {
			case "en":
				thrown.expectMessage("Format color should be #000000");
				break;
			case "es":
				thrown.expectMessage("El formato de color debe ser #000000");
				break;
	
		}
		
		GaugeArrowController gaugeArrow = new GaugeArrowController();
		
		gaugeArrow.setColor("255,255,255");
		
	}
	
	@Test
	public void color_property_return_null_if_is_not_setted(){
		GaugeArrowController gaugeArrow = new GaugeArrowController();
		
		assertNull(gaugeArrow.getColor());
		
	}
	
	@Test
	public void property_numeric_with_value_integer_in_range_must_return_integer(){
		GaugeArrowController gaugeArrow = new GaugeArrowController();
		
		try {
			gaugeArrow.setNailBorderThickness(8);
		} catch (OutOfRangeException e) {
			e.printStackTrace();
		}
		
		assertEquals(8, (Object)gaugeArrow.getNailBorderThickness());
		
	}
	
	@Test
	public void property_numeric_with_value_integer_out_range_launch_exception_if_improvedVisibility_equals_true() throws OutOfRangeException{
		GaugeArrowController gaugeArrow = new GaugeArrowController();
		if(AmchartsConstants.IMPROVED_VISIBILITY.equals("true")){
			thrown.expect(OutOfRangeException.class);
			switch (Config.getString("lang")) {
				case "en":
					thrown.expectMessage("Number out of range: must be between 0 and 10");
					break;
				case "es":
					thrown.expectMessage("Número fuera de rango: debe estar entre 0 y 10");
					break;
			}
			
			
			gaugeArrow.setNailBorderThickness(37);
		}else{
			gaugeArrow.setNailBorderThickness(37);
		}
		
	}
	
	@Test
	public void property_numeric_with_value_integer_return_null_if_is_not_setted(){
		GaugeArrowController gaugeArrow = new GaugeArrowController();
		
		assertNull(gaugeArrow.getNailRadius());
		
	}
	
	@Test
	public void value_property_must_return_integer_if_set_method_recive_integer_value(){
		GaugeArrowController gaugeArrow = new GaugeArrowController();
		
		try {
			gaugeArrow.setValue(90);
		} catch (IntegerException e) {
			e.printStackTrace();
		}
		assertEquals(90, (Object)gaugeArrow.getValue());
		
	}
	
	@Test
	public void value_property_launch_excpetion_if_set_method_not_recive_integer_value() throws IntegerException{
		thrown.expect(IntegerException.class);
		switch (Config.getString("lang")) {
			case "en":
				thrown.expectMessage("Number must be an integer");
				break;
			case "es":
				thrown.expectMessage("El número debe ser un entero");
				break;
		
		}
		
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
	public void radius_property_must_return_string_if_set_method_recive_integer_value_as_string(){
		GaugeArrowController gaugeArrow = new GaugeArrowController();
		
		try {
			gaugeArrow.setRadius("500");
		} catch (CoordException e) {
			e.printStackTrace();
		}
		assertEquals("500", gaugeArrow.getRadius());
	}
	
	@Test
	public void radius_property_must_return_string_if_set_method_recive_integer_percent_value_as_string(){
		GaugeArrowController gaugeArrow = new GaugeArrowController();
		
		try {
			gaugeArrow.setRadius("80%");
		} catch (CoordException e) {
			e.printStackTrace();
		}
		assertEquals("80%", gaugeArrow.getRadius());
		
	}
	
	@Test
	public void radius_property_must_return_100_percent_as_string_if_set_method_recive_percent_gt_100(){
		GaugeArrowController gaugeArrow = new GaugeArrowController();
		
		try {
			gaugeArrow.setRadius("120%");
		} catch (CoordException e) {
			e.printStackTrace();
		}
		assertEquals("100%",gaugeArrow.getRadius());
		
	}
	
	@Test
	public void radius_property_launch_exception_if_set_methot_not_recive_integer_or_integer_percent_as_string() throws CoordException{
		thrown.expect(CoordException.class);
		switch (Config.getString("lang")) {
			case "en":
				thrown.expectMessage("Format coords must be an integer number or a percent");
				break;
			case "es":
				thrown.expectMessage("Las coordenadas deben ser un entero o porcentaje");
				break;
		}
		GaugeArrowController gaugeArrow = new GaugeArrowController();
		
		gaugeArrow.setRadius("120%2");
		
	}
	
	@Test
	public void innerRadius_property_must_return_string_if_set_method_recive_integer_value_as_string(){
		GaugeArrowController gaugeArrow = new GaugeArrowController();
		
		try {
			gaugeArrow.setInnerRadius("500");
		} catch (CoordException e) {
			e.printStackTrace();
		}
		assertEquals("500", gaugeArrow.getInnerRadius());
	}
	
	@Test
	public void innerRadius_property_must_return_string_if_set_method_recive_integer_percent_value_as_string(){
		GaugeArrowController gaugeArrow = new GaugeArrowController();
		
		try {
			gaugeArrow.setInnerRadius("180%");
		} catch (CoordException e) {
			e.printStackTrace();
		}
		assertEquals("180%", gaugeArrow.getInnerRadius());
		
	}
	
	@Test
	public void innerRadius_property_launch_exception_if_set_methot_not_recive_integer_or_integer_percent_as_string() throws CoordException{
		thrown.expect(CoordException.class);
		switch (Config.getString("lang")) {
			case "en":
				thrown.expectMessage("Format coords must be an integer number or a percent");
				break;
			case "es":
				thrown.expectMessage("Las coordenadas deben ser un entero o porcentaje");
				break;
		}
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
		
		assertEquals(1, (Object)arrows.size());
		
	}
	
	@Test
	public void axis_property_must_return_string_if_chart_has_GaugeAxis_that_id(){
		AmAngularGaugeController gaugeChart = new AmAngularGaugeController();
		GaugeAxisController gaugeAxis = new GaugeAxisController();
		GaugeArrowController gaugeArrow = new GaugeArrowController();
		
		gaugeChart.addAxis(gaugeAxis);
		gaugeChart.addArrow(gaugeArrow);
		
		assertEquals("GaugeAxis-1", gaugeAxis.getId());
		
		try {
			gaugeArrow.addAxis("GaugeAxis-1");
		} catch (ChartException e) {
			e.printStackTrace();
		}
		
		assertEquals("GaugeAxis-1", gaugeArrow.getAxis());
		
		
	}
	
	@Test
	public void axis_property_launch_exception_if_GaugeArrowController_is_not_added_to_chart() throws ChartException{
		thrown.expect(ChartException.class);
		switch (Config.getString("lang")) {
			case "en":
				thrown.expectMessage("GaugeArrowController needs to be added to "
						+ "a chart to can be used that property");
				break;
			case "es":
				thrown.expectMessage("GaugeArrowController necesita añadirse a "
						+ "un chart para poder usar esta propiedad");
				break;
		}
		AmAngularGaugeController gaugeChart = new AmAngularGaugeController();
		GaugeAxisController gaugeAxis = new GaugeAxisController();
		GaugeArrowController gaugeArrow = new GaugeArrowController();
		
		gaugeChart.addAxis(gaugeAxis);
		
		gaugeArrow.addAxis("GaugeAxis-1");
		
	}
	
	@Test
	public void axis_property_must_return_null_if_chart_not_contains_GaugeAxis_with_that_id(){
		AmAngularGaugeController gaugeChart = new AmAngularGaugeController();
		GaugeAxisController gaugeAxis = new GaugeAxisController();
		GaugeArrowController gaugeArrow = new GaugeArrowController();
		
		gaugeChart.addAxis(gaugeAxis);
		gaugeChart.addArrow(gaugeArrow);
		
		try {
			gaugeArrow.addAxis("GaugeAxis-2");
		} catch (ChartException e) {
			e.printStackTrace();
		}
		assertNull(gaugeArrow.getAxis());
		
	}	
}
