package es.uvigo.esei.amchartsJava.core.api.trendLines;

public interface ITrendLineXyChartController extends ITrendLineController {

	public Object getFinalXValue();

	public void setFinalXValue(Number finalXValue);

	public Object getInitialXValue();

	public void setInitialXValue(Number initialXValue);

	public Object getValueAxisX();

	public void setValueAxisX(String valueAxisX);

}