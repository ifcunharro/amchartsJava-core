package es.uvigo.esei.amchartsJava.core.api.trendLines;

import es.uvigo.esei.amchartsJava.core.exceptions.ChartException;

public abstract interface ITrendLineXyChartController extends ITrendLineSerialChartController {

	abstract Object getFinalXValue();

	abstract void setFinalXValue(Number finalXValue);

	abstract Object getInitialXValue();

	abstract void setInitialXValue(Number initialXValue);

	abstract String getValueAxisX();

	abstract void setValueAxisX(String valueAxisX) throws ChartException;

}