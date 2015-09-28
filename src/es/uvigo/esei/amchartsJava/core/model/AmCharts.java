package es.uvigo.esei.amchartsJava.core.model;

import java.util.ArrayList;
import java.util.List;

import es.uvigo.esei.amchartsJava.core.controllers.charts.AmChartController;

public class AmCharts extends IModel {
	
	@SuppressWarnings("rawtypes")
	private List<AmChartController> charts;

	@SuppressWarnings("rawtypes")
	public List<AmChartController> getCharts() {
		if(charts == null){
			return null;
		}else{
			return charts;
		}
	}

	@SuppressWarnings("rawtypes")
	public <E extends AmChartController>void addChart(E amchart) {
		if(charts == null){
			charts = new ArrayList<AmChartController>();
		}
		charts.add(amchart);
		
	}

	public void clear() {
		charts.clear();
		charts = null;
		
		
	}

}
