package es.uvigo.esei.amchartsJava.controllers;

import es.uvigo.esei.amchartsJava.model.charts.AmCoordinateChart;
import es.uvigo.esei.amchartsJava.model.charts.AmSerialChart;

public class AmGraphSerialChartController extends AmCoordinateChartController<AmCoordinateChart> {

	public AmGraphSerialChartController() {
		super(new AmSerialChart());
	}
	
	//bulletAxis

}
