package es.uvigo.esei.amchartsJava.controllers;

import es.uvigo.esei.amchartsJava.model.charts.AmCoordinateChart;


public class AmCoordinateChartController extends AmChartController<AmCoordinateChart>{

	
	
	public AmCoordinateChartController(){
		super(new AmCoordinateChart());

	}
	
	
	
	//chartData solo lectura
	
	//colors problema tipo prefixes
	
	public Object getColors(){
		return amchart.getColors();
	}
	
	public void changeColorsDefault(String... newColors){
		amchart.changeColorsDefault(newColors);
	}
	
	public void addColor(String color){
		amchart.addColor(color);
	}
	
	
	
	//graphs

	
}
