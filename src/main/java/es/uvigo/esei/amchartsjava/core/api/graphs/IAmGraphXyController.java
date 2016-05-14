package es.uvigo.esei.amchartsjava.core.api.graphs;

import es.uvigo.esei.amchartsjava.core.exceptions.ChartException;
import es.uvigo.esei.amchartsjava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsjava.core.exceptions.OutOfRangeException;

/**
 * 
 * Interface for AmGraphXyController.This interface contains methods used only by xy charts.
 * Details of AmGraph and its methods in AmCharts API.
 * 
 * @author Iago Fernández Cuñarro
 *
 */
public abstract interface IAmGraphXyController extends IAmGraphController {

	/**
	 * Get bulletAxis property.
	 * @return ValueAxis id.
	 */
	abstract String getBulletAxis();
	
	/**
	 * Set bulletAxis property.
	 * @param bulletAxis ValueAxis id.
	 * @throws ChartException Chart that use this graph doesn't contain a ValueAxis with id equals to bulletAxis.
	 */
	abstract void setBulletAxis(String bulletAxis) throws ChartException;
	
	/**
	 * Get fillToAxis property.
	 * @return ValueAxis id.
	 */
	abstract String getFillToAxis();
	
	/**
	 * Set fillToAxis property.
	 * @param fillToAxis ValueAxis id.
	 * @throws ChartException Chart that use this graph doesn't contain a ValueAxis with id equals to fillToAxis.
	 */
	abstract void setFillToAxis(String fillToAxis) throws ChartException;
	
	/**
	 * Get maxBulletSize property.<br>
	 * Default: 50.
	 * @return Value of maxBulletSize.
	 */
	abstract Integer getMaxBulletSize();

	/**
	 * Set maxBulletSize property.With improvedVisibility enabled, range activated.
	 * @param maxBulletSize Value for maxBulletSize.
	 * @throws OutOfRangeException Value out of range admitted: 50-100.
	 */
	abstract void setMaxBulletSize(Number maxBulletSize) throws OutOfRangeException;

	/**
	 * Get minBulletSize property.<br>
	 * Default: 0.
	 * @return Value of minBulletSize.
	 */
	abstract Integer getMinBulletSize();

	/**
	 * Set minBulletSize property.
	 * @param minBulletSize Value for minBulletSize.
	 * @throws IntegerException Value for minBulletSize is not an integer number.
	 */
	abstract void setMinBulletSize(Number minBulletSize) throws IntegerException;
	
	/**
	 * Get xAxis property.
	 * @return ValueAxis id.
	 */
	abstract String getXAxis();
	
	/**
	 * Set xAxis property.
	 * @param xAxis ValueAxis id.
	 * @throws ChartException Chart that use this graph doesn't contain a ValueAxis with id equals to xAxis.
	 */
	abstract void setXAxis(String xAxis) throws ChartException;
	
	/**
	 * Get xField property.
	 * @return Value of xField.
	 */
	abstract String getXField();

	/**
	 * Set xField property.
	 * @param xField Value for xField.
	 */
	abstract void setXField(String xField);
	
	/**
	 * Get yAxis property.
	 * @return ValueAxis id.
	 */
	abstract String getYAxis();
	
	/**
	 * Set yAxis property.
	 * @param yAxis ValueAxis id.
	 * @throws ChartException Chart that use this graph doesn't contain a ValueAxis with id equals to yAxis.
	 */
	abstract void setYAxis(String yAxis) throws ChartException;

	/**
	 * Get yField property.
	 * @return Value of yField.
	 */
	abstract String getYField();

	/**
	 * Set yField property.
	 * @param yField Value for yField.
	 */
	abstract void setYField(String yField);

}