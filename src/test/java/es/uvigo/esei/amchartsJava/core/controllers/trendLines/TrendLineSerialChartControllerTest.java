package es.uvigo.esei.amchartsJava.core.controllers.trendLines;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import es.uvigo.esei.amchartsJava.core.constants.AmchartsConstants;
import es.uvigo.esei.amchartsJava.core.constants.config.Config;
import es.uvigo.esei.amchartsJava.core.controllers.ImageController;
import es.uvigo.esei.amchartsJava.core.controllers.axis.ValueAxisController;
import es.uvigo.esei.amchartsJava.core.controllers.charts.AmSerialChartController;
import es.uvigo.esei.amchartsJava.core.exceptions.ChartException;
import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.NotSupportedException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;

public class TrendLineSerialChartControllerTest {
	
	@Rule
	public final ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void property_numeric_with_value_double_in_range_must_return_double(){
		TrendLineSerialChartController trendLine = new TrendLineSerialChartController();
		
		try {
			trendLine.setLineAlpha(1);
		} catch (OutOfRangeException e) {
			e.printStackTrace();
		}
		
		assertEquals(1.0, trendLine.getLineAlpha(),0);
		
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
		TrendLineSerialChartController trendLine = new TrendLineSerialChartController();
		
		trendLine.setLineAlpha(9);
		
	}
	
	@Test
	public void property_numeric_with_value_double_return_null_if_not_is_setted(){
		TrendLineSerialChartController trendLine = new TrendLineSerialChartController();
		
		assertNull(trendLine.getFinalValue());
	}
	
	@Test
	public void property_numeric_with_value_integer_in_range_must_return_integer(){
		TrendLineSerialChartController trendLine = new TrendLineSerialChartController();
		
		try {
			trendLine.setLineThickness(5);
		} catch (OutOfRangeException e) {
			e.printStackTrace();
		}
		
		assertEquals(5, (Object)trendLine.getLineThickness());
		
	}
	
	@Test
	public void property_numeric_with_value_integer_out_range_launch_exception_if_improvedVisibility_equals_true() throws OutOfRangeException{
		TrendLineSerialChartController trendLine = new TrendLineSerialChartController();
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
			
			trendLine.setLineThickness(14);
		}else{
			trendLine.setLineThickness(14);
		}
		
	}
	
	@Test
	public void property_numeric_with_value_integer_return_null_if_is_not_setted(){
		TrendLineSerialChartController trendLine = new TrendLineSerialChartController();
		
		assertNull(trendLine.getDashLength());
	}
	
	@Test
	public void valueAxis_property_launch_exception_if_trendLineSerialChart_is_not_added_to_chart() throws ChartException{
		thrown.expect(ChartException.class);
		switch (Config.getString("lang")) {
			case "en":
				thrown.expectMessage("TrendLineSerialChartController needs to be added to "
						+ "a chart to can be used that property");
				break;
			case "es":
				thrown.expectMessage("TrendLineSerialChartController necesita añadirse a "
						+ "un chart para poder usar esta propiedad");
				break;
		}
		TrendLineSerialChartController trendLine = new TrendLineSerialChartController();
		
		trendLine.setValueAxis("ValueAxis-1");
	}
	
	@Test
	public void valueAxis_property_must_return_null_if_chart_have_not_a_valueAxis_with_that_id(){
		AmSerialChartController serialChart = new AmSerialChartController();
		TrendLineSerialChartController trendLine = new TrendLineSerialChartController();
		
		try {
			serialChart.addTrendLine(trendLine);
		} catch (NotSupportedException e) {
			e.printStackTrace();
		}
		
		try {
			trendLine.setValueAxis("ValueAxis-1");
		} catch (ChartException e) {
			e.printStackTrace();
		}
		assertNull(trendLine.getValueAxis());
	}
	
	@Test
	public void valueAxis_property_must_return_string_if_chart_have_a_valueAxis_with_that_id(){
		AmSerialChartController serialChart = new AmSerialChartController();
		ValueAxisController axis = new ValueAxisController();
		TrendLineSerialChartController trendLine = new TrendLineSerialChartController();
		
		try {
			serialChart.addValueAxis(axis);
			serialChart.addTrendLine(trendLine);
		} catch (NotSupportedException e) {
			e.printStackTrace();
		}
		
		try {
			trendLine.setValueAxis("ValueAxis-1");
		} catch (ChartException e) {
			e.printStackTrace();
		}
		assertEquals("ValueAxis-1",trendLine.getValueAxis());
	}
	
	@Test 
	public void initialImage_and_finalImage_properties_must_return_image_if_are_setted(){
		TrendLineSerialChartController trendLine = new TrendLineSerialChartController();
		ImageController image = new ImageController();
		
		try {
			image.setColor("#00ff00");
			
		} catch (ColorException e) {
			e.printStackTrace();
		}
		trendLine.addInitialImage(image);
		trendLine.addFinalImage(image);
		
		ImageController imgI = trendLine.getInitialImage();
		ImageController imgF = trendLine.getFinalImage();
		
		assertTrue(imgI != null);
		assertTrue(imgF != null);
		assertEquals("#00ff00",imgI.getColor());
		assertEquals("#00ff00",imgF.getColor());
		
	}
	
	@Test
	public void trendLineSerialChart_recive_id_to_be_added_to_chart(){
		AmSerialChartController serialChart = new AmSerialChartController();
		TrendLineSerialChartController trendLine = new TrendLineSerialChartController();
		
		assertNull(trendLine.getId());
		try {
			serialChart.addTrendLine(trendLine);
		} catch (NotSupportedException e) {
			e.printStackTrace();
		}
		assertEquals("TrendLine-1",trendLine.getId());
	}

}
