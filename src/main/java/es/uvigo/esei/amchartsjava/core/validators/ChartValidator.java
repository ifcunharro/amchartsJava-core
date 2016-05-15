package es.uvigo.esei.amchartsjava.core.validators;

import es.uvigo.esei.amchartsjava.core.controllers.charts.AmAngularGaugeController;
import es.uvigo.esei.amchartsjava.core.controllers.charts.AmChartController;
import es.uvigo.esei.amchartsjava.core.controllers.charts.AmFunnelChartController;
import es.uvigo.esei.amchartsjava.core.controllers.charts.AmPieChartController;
import es.uvigo.esei.amchartsjava.core.controllers.charts.AmRadarChartController;
import es.uvigo.esei.amchartsjava.core.controllers.charts.AmSerialChartController;
import es.uvigo.esei.amchartsjava.core.controllers.charts.AmXyChartController;

/**
 * This class contains methods to cast AmChartController to concrete chart.
 * @author Iago Fernández Cuñarro
 *
 */
public final class ChartValidator {
	
	private ChartValidator(){
		
	}
	
	/**
	 * Get name of chart subclass.
	 * @param chart Some chart.
	 * @return Name of concrete chart.
	 */
	public static String getChartClassName(final AmChartController<?> chart){
		if(chart != null){
			return chart
					.getClass()
					.getSimpleName();
		}else{
			return null;
		}
	}
	
	/**
	 * Cast AmChartController to AmSerialChartController
	 * @param chart Generic chart.
	 * @return AmSerialChartController Chart type serial or null if can't cast.
	 */
	public static AmSerialChartController castToAmSerial(final AmChartController<?> chart){
		if(chart != null){
			return chart
				.getClass()
				.getSimpleName()
				.equals("AmSerialChartController")
				? (AmSerialChartController) chart
				: null;
		}
		return null;
		
		
	}
	
	/**
	 * Cast AmChartController to AmXyChartController.
	 * @param chart Generic chart.
	 * @return AmXyChartController Chart type xy or null if can't cast.
	 */
	public static AmXyChartController castToAmXY(final AmChartController<?> chart){
		if(chart != null){
			return chart
				.getClass()
				.getSimpleName()
				.equals("AmXyChartController")
				? (AmXyChartController) chart
				: null;
		}
		return null;
	
		
	}
	
	/**
	 * Cast AmChartController to AmPieChartController.
	 * @param chart Generic chart.
	 * @return AmPieChartController Chart type pie or null if can't cast.
	 */
	public static AmPieChartController castToAmPie(final AmChartController<?> chart){
		if(chart != null){
			return chart
				.getClass()
				.getSimpleName()
				.equals("AmPieChartController")
				? (AmPieChartController) chart
				: null;
		}
		return null;
		
		
	}
	
	/**
	 * Cast AmChartController to AmRadarChartController.
	 * @param chart Generic chart.
	 * @return AmRadarChartController Chart type radar or null if can't cast.
	 */
	public static AmRadarChartController castToAmRadar(final AmChartController<?> chart){
		if(chart != null){
			return chart
				.getClass()
				.getSimpleName()
				.equals("AmRadarChartController")
				? (AmRadarChartController) chart
				: null;
		}
		return null;
	
		
	}
	
	/**
	 * Cast AmChartController to AmFunnelChartController.
	 * @param chart Generic chart.
	 * @return AmFunnelChartController Chart type funnel or null if can't cast.
	 */
	public static AmFunnelChartController castToAmFunnel(final AmChartController<?> chart){
		if(chart != null){
			return chart
				.getClass()
				.getSimpleName()
				.equals("AmFunnelChartController")
				? (AmFunnelChartController) chart
				: null;
		}
		return null;
		
		
	}
	
	/**
	 * Cast AmChartController to AmAngularGaugeController.
	 * @param chart Generic chart.
	 * @return AmAngularGaugeController Chart type funnel or null if can't cast.
	 */
	public static AmAngularGaugeController castToAmAngularGauge(final AmChartController<?> chart){
		if(chart != null){
			return chart
				.getClass()
				.getSimpleName()
				.equals("AmAngularGaugeController")
				? (AmAngularGaugeController) chart
				: null;
		}
		return null;
	
		
	}

}
