package es.uvigo.esei.amchartsJava.core.controllers.charts;

import java.util.List;

import es.uvigo.esei.amchartsJava.core.controllers.axis.ValueAxisRadarChartController;
import es.uvigo.esei.amchartsJava.core.controllers.graphs.AmGraphController;

public abstract interface IJsonDeserializerAmCoordinateChartController {

	abstract void setColors(List<String> colors);
	
	abstract void setGraphs(List<AmGraphController> graphs);
	
	abstract void setValueAxes(List<ValueAxisRadarChartController> axes);

}