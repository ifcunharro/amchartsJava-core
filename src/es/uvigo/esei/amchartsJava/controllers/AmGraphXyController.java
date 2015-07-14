package es.uvigo.esei.amchartsJava.controllers;

import es.uvigo.esei.amchartsJava.model.charts.AmCoordinateChart;
import es.uvigo.esei.amchartsJava.model.charts.AmXychart;

public class AmGraphXyController extends AmCoordinateChartController<AmCoordinateChart> {

	public AmGraphXyController(){
		super(new AmXychart());
	}
	
	//bulletAxis
}
