package es.uvigo.esei.amchartsJava.core.validators;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import org.junit.Test;

import es.uvigo.esei.amchartsJava.core.controllers.charts.AmAngularGaugeController;
import es.uvigo.esei.amchartsJava.core.controllers.charts.AmChartController;
import es.uvigo.esei.amchartsJava.core.controllers.charts.AmFunnelChartController;
import es.uvigo.esei.amchartsJava.core.controllers.charts.AmPieChartController;
import es.uvigo.esei.amchartsJava.core.controllers.charts.AmRadarChartController;
import es.uvigo.esei.amchartsJava.core.controllers.charts.AmSerialChartController;
import es.uvigo.esei.amchartsJava.core.controllers.charts.AmXyChartController;
import es.uvigo.esei.amchartsJava.core.validators.ChartValidator;

public class ChartValidatorTest {
	
	@Test
	public void getChartClassName_return_name_of_implementation_of_AmchartController(){
		AmChartController<?> serial = new AmSerialChartController();
		AmChartController<?> xy = new AmXyChartController();
		AmChartController<?> funnel = new AmFunnelChartController();
		AmChartController<?> pie = new AmPieChartController();
		AmChartController<?> gauge = new AmAngularGaugeController();
		AmChartController<?> radar = new AmRadarChartController();
		
		assertEquals("AmSerialChartController",ChartValidator.getChartClassName(serial));
		assertEquals("AmXyChartController",ChartValidator.getChartClassName(xy));
		assertEquals("AmFunnelChartController",ChartValidator.getChartClassName(funnel));
		assertEquals("AmPieChartController",ChartValidator.getChartClassName(pie));
		assertEquals("AmAngularGaugeController",ChartValidator.getChartClassName(gauge));
		assertEquals("AmRadarChartController",ChartValidator.getChartClassName(radar));
		
	}
	
	@Test
	public void castToAmSerial_can_cast_AmChartController_to_AmSerial_if_is_AmSerial(){
		AmChartController<?> serial = new AmSerialChartController();
		
		AmSerialChartController serialCast = ChartValidator.castToAmSerial(serial);
		
		assertNotNull(serialCast);
	}
	
	@Test
	public void castToAmSerial_return_null_if_AmChartController_is_not_AmSerial(){
		AmChartController<?> pie = new AmPieChartController();
		
		AmSerialChartController serialCast = ChartValidator.castToAmSerial(pie);
		
		assertNull(serialCast);
	}
	
	@Test
	public void castToAmXY_can_cast_AmChartController_to_AmXy_if_is_AmXy(){
		AmChartController<?> xy = new AmXyChartController();
		
		AmXyChartController xyCast = ChartValidator.castToAmXY(xy);
		
		assertNotNull(xyCast);
	}
	
	@Test
	public void castToAmXY_return_null_if_AmChartController_is_not_AmXy(){
		AmChartController<?> pie = new AmPieChartController();
		
		AmXyChartController xyCast = ChartValidator.castToAmXY(pie);
		
		assertNull(xyCast);
	}
	
	@Test
	public void castToAmPie_can_cast_AmChartController_to_AmPie_if_is_AmPie(){
		AmChartController<?> pie = new AmPieChartController();
		
		AmPieChartController pieCast = ChartValidator.castToAmPie(pie);
		
		assertNotNull(pieCast);
	}
	
	@Test
	public void castToAmPie_return_null_if_AmChartController_is_not_AmPie(){
		AmChartController<?> funnel = new AmFunnelChartController();
		
		AmPieChartController pieCast = ChartValidator.castToAmPie(funnel);
		
		assertNull(pieCast);
	}
	
	@Test
	public void castToAmRadar_can_cast_AmChartController_to_AmRadar_if_is_AmRadar(){
		AmChartController<?> radar = new AmRadarChartController();
		
		AmRadarChartController radarCast = ChartValidator.castToAmRadar(radar);
		
		assertNotNull(radarCast);
	}
	
	@Test
	public void castToAmRadar_return_null_if_AmChartController_is_not_AmRadar(){
		AmChartController<?> pie = new AmPieChartController();
		
		AmRadarChartController radarCast = ChartValidator.castToAmRadar(pie);
		
		assertNull(radarCast);
	}
	
	@Test
	public void castToAmFunnel_can_cast_AmChartController_to_AmFunnel_if_is_AmFunnel(){
		AmChartController<?> funnel = new AmFunnelChartController();
		
		AmFunnelChartController funnelCast = ChartValidator.castToAmFunnel(funnel);
		
		assertNotNull(funnelCast);
	}
	
	@Test
	public void castToAmFunnel_return_null_if_AmChartController_is_not_AmFunnel(){
		AmChartController<?> pie = new AmPieChartController();
		
		AmFunnelChartController funnelCast = ChartValidator.castToAmFunnel(pie);
		
		assertNull(funnelCast);
	}
	
	@Test
	public void castToAmAngularGauge_can_cast_AmChartController_to_AmAngularGauge_if_is_AmAngularGauge(){
		AmChartController<?> gauge = new AmAngularGaugeController();
		
		AmAngularGaugeController gaugeCast = ChartValidator.castToAmAngularGauge(gauge);
		
		assertNotNull(gaugeCast);
	}
	
	@Test
	public void castToAmAngularGauge_return_null_if_AmChartController_is_not_AmAngularGauge(){
		AmChartController<?> pie = new AmPieChartController();
		
		AmAngularGaugeController gaugeCast = ChartValidator.castToAmAngularGauge(pie);
		
		assertNull(gaugeCast);
	}

}
