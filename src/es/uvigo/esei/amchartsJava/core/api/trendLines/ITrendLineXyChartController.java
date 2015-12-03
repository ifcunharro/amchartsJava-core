package es.uvigo.esei.amchartsJava.core.api.trendLines;

import es.uvigo.esei.amchartsJava.core.exceptions.ChartException;

/**
 * 
 * Interface for TrendLineXyChartController. This interface contains properties of TrendLine only used by xy charts. 
 * Details of TrendLine and its properties in AmCharts API.
 * 
 * @author Iago Fernández Cuñarro
 *
 */
public abstract interface ITrendLineXyChartController extends ITrendLineSerialChartController {

	/**
	 * Get finalXValue property.
	 * @return Double Value for finalXValue.
	 */
	abstract Double getFinalXValue();

	/**
	 * Set finalXValue property.
	 * @param finalXValue Value for finalXValue.
	 */
	abstract void setFinalXValue(Number finalXValue);

	/**
	 * Get initialXValue property.
	 * @return Double Value for initialXValue.
	 */
	abstract Double getInitialXValue();

	/**
	 * Set initialXValue property.
	 * @param initialXValue Value for initialXValue.
	 */
	abstract void setInitialXValue(Number initialXValue);

	/**
	 * Get valueAxisX property.
	 * @return String Value for valueAxisX.
	 */
	abstract String getValueAxisX();

	/**
	 * Set valueAxisX property.
	 * @param valueAxisX ValueAxis id.
	 * @throws ChartException Chart that use trendLine doesn't contains a ValueAxis with id equals to valueAxisX.
	 */
	abstract void setValueAxisX(String valueAxisX) throws ChartException;

}