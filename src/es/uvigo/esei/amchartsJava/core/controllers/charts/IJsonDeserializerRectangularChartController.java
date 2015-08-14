package es.uvigo.esei.amchartsJava.core.controllers.charts;

import java.util.List;

import es.uvigo.esei.amchartsJava.core.controllers.trendLines.TrendLineXyChartController;

public abstract interface IJsonDeserializerRectangularChartController {
	
	abstract void setTrendLines(List<TrendLineXyChartController> trendLineControllers); 

}
