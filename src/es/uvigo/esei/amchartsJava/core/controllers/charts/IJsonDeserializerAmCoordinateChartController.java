package es.uvigo.esei.amchartsJava.core.controllers.charts;

import java.util.List;

import es.uvigo.esei.amchartsJava.core.controllers.axis.ValueAxisRadarChartController;

public abstract interface IJsonDeserializerAmCoordinateChartController {

	abstract void setColors(List<String> colors);
	
	//abstract void setGraphs(List<AmGraphSerialController> graphs);
	
	abstract void setValueAxes(List<ValueAxisRadarChartController> axes);

}