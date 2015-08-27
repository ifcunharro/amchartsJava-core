package es.uvigo.esei.amchartsJava.core.api.trendLines;

import es.uvigo.esei.amchartsJava.core.exceptions.ChartException;

public interface ITrendLineXyChartController extends ITrendLineSerialChartController {

	public Object getFinalXValue();

	public void setFinalXValue(Number finalXValue);

	public Object getInitialXValue();

	public void setInitialXValue(Number initialXValue);

	public Object getValueAxisX();

	public void setValueAxisX(String valueAxisX) throws ChartException;

}