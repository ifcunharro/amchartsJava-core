package es.uvigo.esei.amchartsJava.core.model.charts;

import java.util.List;

import es.uvigo.esei.amchartsJava.core.controllers.trendLines.TrendLineXyChartController;

public abstract interface IJsonDeserializerAmRectangularChart {
	
	abstract void setTrendLines(List<TrendLineXyChartController> trendLineControllers);

}
