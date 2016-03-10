package es.uvigo.esei.amchartsJava.core.controllers.charts;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import es.uvigo.esei.amchartsJava.core.controllers.charts.AmAngularGaugeController;
import es.uvigo.esei.amchartsJava.core.controllers.charts.AmChartController;
import es.uvigo.esei.amchartsJava.core.controllers.charts.AmChartsController;
import es.uvigo.esei.amchartsJava.core.controllers.charts.AmFunnelChartController;
import es.uvigo.esei.amchartsJava.core.controllers.charts.AmPieChartController;
import es.uvigo.esei.amchartsJava.core.controllers.charts.AmRadarChartController;
import es.uvigo.esei.amchartsJava.core.controllers.charts.AmSerialChartController;
import es.uvigo.esei.amchartsJava.core.controllers.charts.AmXyChartController;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;

public class AmChartsControllerTest {
	
	@Rule
	public final ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void enabledBaseHref_must_return_custom_string_if_recive_boolean_value(){
		AmChartsController amcharts = new AmChartsController();
		
		assertEquals("AmCharts.baseHref = true;",amcharts.enabledBaseHref(true));
		assertEquals("AmCharts.baseHref = false;",amcharts.enabledBaseHref(false));
		assertNull(amcharts.enabledBaseHref(null));
		
	}
	
	@Test
	public void enabledUseUTC_must_return_custom_string_if_recive_boolean_value(){
		AmChartsController amcharts = new AmChartsController();
		
		assertEquals("AmCharts.useUTC = true;",amcharts.enabledUseUTC(true));
		assertEquals("AmCharts.useUTC = false;",amcharts.enabledUseUTC(false));
		assertNull(amcharts.enabledUseUTC(null));
		
	}
	
	@Test
	public void property_numeric_must_return_string_if_recive_integer_value() throws IntegerException{
		AmChartsController amcharts = new AmChartsController();
		
		amcharts.setBezierX(10);
		amcharts.setBezierY(20);
		amcharts.setProcessDelay(30);
		
		assertEquals("AmCharts.bezierX = 10;",amcharts.getBezierX());
		assertEquals("AmCharts.bezierY = 20;",amcharts.getBezierY());
		assertEquals("AmCharts.processDelay = 30;",amcharts.getProcessDelay());
				
	}
	
	@Test
	public void property_numeric_with_value_integer_return_null_if_is_not_setted() throws OutOfRangeException{
		AmChartsController amcharts = new AmChartsController();
		
		assertNull(amcharts.getBezierX());
		assertNull(amcharts.getBezierY());
		assertNull(amcharts.getProcessDelay());
	}
	
	@Test
	public void some_property_launch_exception_if_set_method_recive_not_integer_value() throws IntegerException{
		thrown.expect(IntegerException.class);
		thrown.expectMessage("Number must be an integer");
		AmChartsController amcharts = new AmChartsController();
		
		amcharts.setBezierX(90.8);
		
	}
	
	@Test
	public void charts_property_must_return_null_if_no_chart_is_added(){
		AmChartsController amcharts = new AmChartsController();
		
		assertNull(amcharts.getCharts());
	}
	
	@Test
	public void charts_property_must_return_list_of_AmChartController_if_some_chart_is_added(){
		AmChartsController amcharts = new AmChartsController();
		AmSerialChartController serial = new AmSerialChartController();
		AmXyChartController xy = new AmXyChartController();
		AmPieChartController pie = new AmPieChartController();
		AmFunnelChartController funnel = new AmFunnelChartController();
		AmAngularGaugeController gauge = new AmAngularGaugeController();
		AmRadarChartController radar = new AmRadarChartController();
		
		amcharts.addChart(serial);
		amcharts.addChart(xy);
		amcharts.addChart(pie);
		amcharts.addChart(funnel);
		amcharts.addChart(gauge);
		amcharts.addChart(radar);
		
		@SuppressWarnings("rawtypes")
		List<AmChartController> charts = amcharts.getCharts();
		assertTrue(charts != null);
		
		assertEquals(6,(Object)charts.size());
	}
	
	@Test
	public void clear_must_delete_all_charts_added(){
		AmChartsController amcharts = new AmChartsController();
		AmSerialChartController serial = new AmSerialChartController();
		AmXyChartController xy = new AmXyChartController();
		AmPieChartController pie = new AmPieChartController();
		AmFunnelChartController funnel = new AmFunnelChartController();
		AmAngularGaugeController gauge = new AmAngularGaugeController();
		AmRadarChartController radar = new AmRadarChartController();
		
		amcharts.addChart(serial);
		amcharts.addChart(xy);
		amcharts.addChart(pie);
		amcharts.addChart(funnel);
		amcharts.addChart(gauge);
		amcharts.addChart(radar);
		
		amcharts.clear();
		
		assertNull(amcharts.getCharts());
		
		
	}

}
