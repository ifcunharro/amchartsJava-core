package es.uvigo.esei.amchartsjava.core.api.guides;

import es.uvigo.esei.amchartsjava.core.exceptions.OutOfRangeException;

/**
 * 
 * Interface for GuideRadarChartController. This interface contains properties of guide only used by radarChart. 
 * Details of Guide and its properties in AmCharts API.
 * 
 * @author Iago Fernández Cuñarro
 *
 */
public abstract interface IGuideRadarChartController extends IGuideController {

	/**
	 * Get angle property.
	 * @return Value of angle.
	 */
	abstract Integer getAngle();

	/**
	 * Set angle property.
	 * @param angle Value for angle.
	 * @throws OutOfRangeException Value out of range admitted: 0-360.
	 */
	abstract void setAngle(Number angle) throws OutOfRangeException;

	/**
	 * Get toAngle property.
	 * @return Value of toAngle.
	 */
	abstract Integer getToAngle();

	/**
	 * Set toAngle property.
	 * @param toAngle Value for toAngle.
	 * @throws OutOfRangeException Value out of range admitted: 0-360
	 */
	abstract void setToAngle(Number toAngle) throws OutOfRangeException;

}