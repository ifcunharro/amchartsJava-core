package amcharts.controller;

import model.charts.AmCoordinateChart;


public class AmCoordinateChartController extends AmChartController<AmCoordinateChart>{

	
	
	public AmCoordinateChartController(){
		super(new AmCoordinateChart());

	}
	
	
	
	//chartData solo lectura
	
	//colors problema tipo prefixes
	
	public Object getColors(){
		return amchart.getColors();
	}
	
	
	
	//graphs

	
}
