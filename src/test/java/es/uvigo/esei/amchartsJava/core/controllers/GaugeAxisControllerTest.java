package es.uvigo.esei.amchartsJava.core.controllers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import es.uvigo.esei.amchartsJava.core.constants.AmchartsConstants;
import es.uvigo.esei.amchartsJava.core.constants.Position;
import es.uvigo.esei.amchartsJava.core.controllers.GaugeAxisController;
import es.uvigo.esei.amchartsJava.core.controllers.GaugeBandController;
import es.uvigo.esei.amchartsJava.core.controllers.charts.AmAngularGaugeController;
import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.CoordException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;

public class GaugeAxisControllerTest {
	
	@Rule
	public final ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void property_boolean_must_return_boolean_value_if_is_setted(){
		GaugeAxisController gaugeAxis = new GaugeAxisController();
		
		gaugeAxis.setBottomTextBold(true);
		
		assertEquals(true, gaugeAxis.isBottomTextBold());
	}
	
	@Test
	public void property_boolean_must_return_null_if_is_not_setted(){
		GaugeAxisController gaugeAxis= new GaugeAxisController();
		
		assertNull(gaugeAxis.isGridInside());
	}
	
	@Test
	public void property_numeric_with_value_double_in_range_must_return_double(){
		GaugeAxisController gaugeAxis = new GaugeAxisController();
		
		try {
			gaugeAxis.setAxisAlpha(1);
		} catch (OutOfRangeException e) {
			e.printStackTrace();
		}
		
		assertEquals(1.0, gaugeAxis.getAxisAlpha(),0);
		
	}
	
	@Test
	public void property_numeric_with_value_double_out_range_launch_exception() throws OutOfRangeException{
		thrown.expect(OutOfRangeException.class);
		thrown.expectMessage("Number out of range: must be between 0 and 1");
		GaugeAxisController gaugeAxis = new GaugeAxisController();
		
		gaugeAxis.setBandAlpha(9);
		
	}
	
	@Test
	public void property_numeric_with_value_double_return_null_if_not_is_setted(){
		GaugeAxisController gaugeAxis = new GaugeAxisController();
		
		assertNull(gaugeAxis.getTickAlpha());
	}
	
	@Test
	public void all_color_property_return_string_if_format_color_is_correct(){
		GaugeAxisController gaugeAxis = new GaugeAxisController();
		
		try {
			gaugeAxis.setAxisColor("#000000");
		} catch (ColorException e) {
			e.printStackTrace();
		}
		
		assertEquals("#000000", gaugeAxis.getAxisColor());
		
	}
	
	@Test
	public void all_color_property_launch_exception_if_format_color_is_incorrect() throws ColorException{
		thrown.expect(ColorException.class);
		thrown.expectMessage("Format color should be #000000");
		GaugeAxisController gaugeAxis = new GaugeAxisController();
		
		gaugeAxis.setTopTextColor("255,255,255");
		
	}
	
	@Test
	public void all_color_property_return_null_if_is_not_setted(){
		GaugeAxisController gaugeAxis = new GaugeAxisController();
		
		assertNull(gaugeAxis.getTickColor());
		
	}
	
	@Test
	public void property_numeric_with_value_integer_in_range_must_return_integer(){
		GaugeAxisController gaugeAxis = new GaugeAxisController();
		
		try {
			gaugeAxis.setAxisThickness(4);
		} catch (OutOfRangeException e) {
			e.printStackTrace();
		}
		
		assertEquals(4, (Object)gaugeAxis.getAxisThickness());
		
	}
	
	@Test
	public void property_numeric_with_value_integer_out_range_launch_exception_if_improvedVisibility_equals_true() throws OutOfRangeException{
		GaugeAxisController gaugeAxis = new GaugeAxisController();
		if(AmchartsConstants.IMPROVED_VISIBILITY.equals("true")){
			thrown.expect(OutOfRangeException.class);
			thrown.expectMessage("Number out of range: must be between 0 and 5");
			
			gaugeAxis.setAxisThickness(37);
		}else{
			gaugeAxis.setAxisThickness(37);
		}
		
	}
	
	@Test
	public void property_numeric_with_value_integer_return_null_if_is_not_setted(){
		GaugeAxisController gaugeAxis = new GaugeAxisController();
		
		assertNull(gaugeAxis.getAxisThickness());
	}
	
	@Test
	public void some_properties_launch_IntegerException_if_set_method_not_recive_integer_value() throws IntegerException{
		thrown.expect(IntegerException.class);
		thrown.expectMessage("Number must be an integer");
		GaugeAxisController gaugeAxis = new GaugeAxisController();
		
		gaugeAxis.setEndValue(90.9);
		
	}
	
	@Test
	public void centerX_and_centerY_properties_must_return_string_if_set_method_recive_integer_value_as_string(){
		GaugeAxisController gaugeAxis = new GaugeAxisController();
		
		try {
			gaugeAxis.setCenterX("500");
		} catch (CoordException e) {
			e.printStackTrace();
		}
		assertEquals("500", gaugeAxis.getCenterX());
		try {
			gaugeAxis.setCenterY("200");
		} catch (CoordException e) {
			e.printStackTrace();
		}
		assertEquals("200", gaugeAxis.getCenterY());
	}
	
	@Test
	public void centerX_and_centerY_properties_must_return_string_if_set_method_recive_integer_percent_value_as_string(){
		GaugeAxisController gaugeAxis = new GaugeAxisController();
		
		try {
			gaugeAxis.setCenterX("180%");
		} catch (CoordException e) {
			e.printStackTrace();
		}
		assertEquals("180%", gaugeAxis.getCenterX());
		try {
			gaugeAxis.setCenterY("150%");
		} catch (CoordException e) {
			e.printStackTrace();
		}
		assertEquals("150%", gaugeAxis.getCenterY());
		
	}
	
	@Test
	public void centerX_and_centerY_properties_launch_exception_if_set_methot_not_recive_integer_or_integer_percent_as_string() throws CoordException{
		thrown.expect(CoordException.class);
		thrown.expectMessage("Format coords must be an integer number or a percent");
		GaugeAxisController gaugeAxis = new GaugeAxisController();
		
		gaugeAxis.setCenterX("120%2");
		
	}
	
	@Test
	public void radius_property_must_return_string_if_set_method_recive_integer_value_as_string(){
		GaugeAxisController gaugeAxis = new GaugeAxisController();
		
		try {
			gaugeAxis.setRadius("500");
		} catch (CoordException e) {
			e.printStackTrace();
		}
		assertEquals("500", gaugeAxis.getRadius());
	}
	
	@Test
	public void radius_property_must_return_string_if_set_method_recive_integer_percent_value_as_string(){
		GaugeAxisController gaugeAxis = new GaugeAxisController();
		
		try {
			gaugeAxis.setRadius("80%");
		} catch (CoordException e) {
			e.printStackTrace();
		}
		assertEquals("80%", gaugeAxis.getRadius());
		
	}
	
	@Test
	public void radius_property_must_return_100_percent_as_string_if_set_method_recive_percent_gt_100(){
		GaugeAxisController gaugeAxis = new GaugeAxisController();
		
		try {
			gaugeAxis.setRadius("120%");
		} catch (CoordException e) {
			e.printStackTrace();
		}
		assertEquals("100%",gaugeAxis.getRadius());
		
	}
	
	@Test
	public void radius_property_launch_exception_if_set_methot_not_recive_integer_or_integer_percent_as_string() throws CoordException{
		thrown.expect(CoordException.class);
		thrown.expectMessage("Format coords must be an integer number or a percent");
		GaugeAxisController gaugeAxis = new GaugeAxisController();
		
		gaugeAxis.setRadius("120%2");
		
	}
	
	@Test
	public void unitPosition_property_must_return_string_if_is_setted(){
		GaugeAxisController gaugeAxis = new GaugeAxisController();
		
		gaugeAxis.setUnitPosition(Position.left);
		
		assertEquals("left", gaugeAxis.getUnitPosition());
	}
	
	@Test
	public void unitPosition_property_must_return_null_if_is_not_setted(){
		GaugeAxisController gaugeAxis = new GaugeAxisController();
		
		
		assertNull( gaugeAxis.getUnitPosition());
	}
	
	@Test
	public void valueInterval_property_must_return_double_value_if_set_method_recive_number_gt_1(){
		GaugeAxisController gaugeAxis = new GaugeAxisController();
		
		gaugeAxis.setValueInterval(6);
		
		assertEquals(6.0, gaugeAxis.getValueInterval(),0);
	}
	
	@Test
	public void valueInterval_property_must_return_null_if_set_method_recive_number_le_1(){
		GaugeAxisController gaugeAxis = new GaugeAxisController();
		
		gaugeAxis.setValueInterval(1);
		
		assertNull(gaugeAxis.getValueInterval());
	}
	
	@Test
	public void gaugeBand_added_to_gaugeAxis_recive_id_when_is_added_to_chart(){
		AmAngularGaugeController gaugeChart = new AmAngularGaugeController();
		GaugeAxisController gaugeAxis = new GaugeAxisController();
		GaugeBandController gaugeBand = new GaugeBandController();
		GaugeBandController gaugeBand2 = new GaugeBandController();
		
		assertNull(gaugeBand.getId());
		assertNull(gaugeBand2.getId());
		
		gaugeAxis.addBand(gaugeBand);
		gaugeAxis.addBand(gaugeBand2);
		
		gaugeChart.addAxis(gaugeAxis);
		
		List<GaugeBandController> bands = gaugeAxis.getBands();
		for(GaugeBandController band:bands){
			assertTrue(band.getId()!=null);
		}
		
	}

}
