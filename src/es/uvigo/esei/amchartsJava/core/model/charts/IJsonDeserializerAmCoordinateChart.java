package es.uvigo.esei.amchartsJava.core.model.charts;

import java.util.List;

import es.uvigo.esei.amchartsJava.core.controllers.axis.ValueAxisRadarChartController;

public abstract interface IJsonDeserializerAmCoordinateChart {
	
	abstract void setColors(List<String> c);
	
	//abstract void setGraphs(List<AmGraphSerialController> graphs);
	
	abstract void setValueAxes(List<ValueAxisRadarChartController> axes);
	
	abstract void deserializeType(String amchartType);

}
