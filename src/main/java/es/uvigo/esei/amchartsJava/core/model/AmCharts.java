package es.uvigo.esei.amchartsJava.core.model;

import java.util.LinkedList;
import java.util.List;

import es.uvigo.esei.amchartsJava.core.controllers.charts.AmChartController;

/**
 * Model class for AmCharts.
 * @author Iago Fernández Cuñarro
 *
 */
public class AmCharts extends IModel {
	
	
	@SuppressWarnings("rawtypes")
	private List<AmChartController> charts;

	/**
	 * Get charts.
	 * @return List of charts.
	 */
	@SuppressWarnings("rawtypes")
	public List<AmChartController> getCharts() {
		if(charts == null){
			return null;
		}else{
			return charts;
		}
	}

	/**
	 * Add a chart.
	 * @param <E> Type of chart.
	 * @param amchart New chart.
	 */
	@SuppressWarnings("rawtypes")
	public <E extends AmChartController>void addChart(E amchart) {
		if(charts == null){
			charts = new LinkedList<AmChartController>();
		}
		charts.add(amchart);
		
	}

	/**
	 * Remove all charts.
	 */
	public void clear() {
		charts.clear();
		charts = null;
		System.gc();
		
		
	}

}
