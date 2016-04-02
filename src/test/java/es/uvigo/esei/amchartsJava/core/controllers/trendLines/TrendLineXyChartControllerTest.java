package es.uvigo.esei.amchartsJava.core.controllers.trendLines;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import es.uvigo.esei.amchartsJava.core.constants.config.Config;
import es.uvigo.esei.amchartsJava.core.controllers.axis.ValueAxisController;
import es.uvigo.esei.amchartsJava.core.controllers.charts.AmXyChartController;
import es.uvigo.esei.amchartsJava.core.exceptions.ChartException;
import es.uvigo.esei.amchartsJava.core.exceptions.NotSupportedException;

public class TrendLineXyChartControllerTest {
	
	@Rule
	public final ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void initialXValue_property_must_return_zero_if_is_not_setted(){
		TrendLineXyChartController trendLine = new TrendLineXyChartController();
		
		assertEquals(0.0,(Object)trendLine.getInitialXValue());
	}
	
	@Test
	public void valueAxisX_property_launch_exception_if_trendLineXyChart_is_not_added_to_chart() throws ChartException{
		thrown.expect(ChartException.class);
		switch (Config.getString("lang")) {
			case "en":
				thrown.expectMessage("TrendLineXyChartController needs to be added to "
						+ "a chart to can be used that property");
				break;
			case "es":
				thrown.expectMessage("TrendLineXyChartController necesita añadirse a "
						+ "un chart para poder usar esta propiedad");
				break;
		}
		
		TrendLineXyChartController trendLine = new TrendLineXyChartController();
		
		trendLine.setValueAxisX("ValueAxis-1");
	}
	
	@Test
	public void valueAxisX_property_must_return_null_if_chart_have_not_a_valueAxis_with_that_id(){
		AmXyChartController xyChart = new AmXyChartController();
		TrendLineXyChartController trendLine = new TrendLineXyChartController();
		
		try {
			xyChart.addTrendLine(trendLine);
		} catch (NotSupportedException e) {
			e.printStackTrace();
		}
		
		try {
			trendLine.setValueAxisX("ValueAxis-1");
		} catch (ChartException e) {
			e.printStackTrace();
		}
		assertNull(trendLine.getValueAxisX());
	}
	
	@Test
	public void valueAxisX_property_must_return_string_if_chart_have_a_valueAxis_with_that_id(){
		AmXyChartController xyChart = new AmXyChartController();
		ValueAxisController axis = new ValueAxisController();
		TrendLineXyChartController trendLine = new TrendLineXyChartController();
		
		try {
			xyChart.addValueAxis(axis);
			xyChart.addTrendLine(trendLine);
		} catch (NotSupportedException e) {
			e.printStackTrace();
		}
		
		try {
			trendLine.setValueAxisX("ValueAxis-1");
		} catch (ChartException e) {
			e.printStackTrace();
		}
		assertEquals("ValueAxis-1",trendLine.getValueAxisX());
	}

}
