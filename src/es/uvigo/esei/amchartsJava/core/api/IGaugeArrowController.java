package es.uvigo.esei.amchartsJava.core.api;

import es.uvigo.esei.amchartsJava.core.exceptions.ChartException;
import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.CoordException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsJava.core.model.charts.AmAngularGauge;

/**
 * Interface for controller of GaugeArrow. Details of GaugeArrow and 
 *  their properties in AmCharts API
 *  
 * @author Iago Fernández Cuñarro
 */
public abstract interface IGaugeArrowController {

	/**
	 * Set chart thar use gaugeArrow.
	 * @param chart Chart own of gaugeArrow.
	 */
	abstract void setChart(AmAngularGauge chart);

	/**
	 * Get alpha property.
	 * @return Object Value for alpha is a double number.
	 */
	abstract Object getAlpha();

	/**
	 * Set alpha property.
	 * @param alpha Value for alpha.
	 * @throws OutOfRangeException Value out of range admitted: 0.0-1.0.
	 */
	abstract void setAlpha(Number alpha) throws OutOfRangeException;

	/**
	 * Get axis property.
	 * @return String Id of gaugeAxis.
	 */
	abstract String getAxis();

	/**
	 * Set axis property.
	 * @param axis Id of gaugeAxis.
	 * @throws ChartException Chart doesn't contains gaugeAxis id equals to axis.
	 */
	abstract void addAxis(String axis) throws ChartException;

	/**
	 * Get borderAlpha property.
	 * @return Object Value for borderAlpha is a double number.
	 */
	abstract Object getBorderAlpha();

	/**
	 * Set borderAlpha property.
	 * @param borderAlpha Value for borderAlpha.
	 * @throws OutOfRangeException Value out of range admitted: 0.0-1.0.
	 */
	abstract void setBorderAlpha(Number borderAlpha) throws OutOfRangeException;

	/**
	 * Get clockWiseOnly property.
	 * @return Boolean Value for clockWiseOnly.
	 */
	abstract Boolean isClockWiseOnly();

	/**
	 * Set clockWiseOnly property.
	 * @param clockWiseOnly Enable or disable clock wise.
	 */
	abstract void setClockWiseOnly(Boolean clockWiseOnly);

	/**
	 * Get color property.
	 * @return String Value for color.
	 */
	abstract String getColor();

	/**
	 * Set color property.
	 * @param color Value for color.
	 * @throws ColorException Format of color doesn't admitted, format admitted: #ffffff
	 */
	abstract void setColor(String color) throws ColorException;

	/**
	 * Get id property.
	 * @return String Arrow id.
	 */
	abstract String getId();

	/**
	 * Get innerRadius property.
	 * @return String Value for innerRadius.
	 */
	abstract String getInnerRadius();

	/**
	 * Set innerRadius property.
	 * @param innerRadius Value for innerRadius.
	 * @throws CoordException Value for innerRadius is not an integer number or a percent.
	 */
	abstract void setInnerRadius(String innerRadius) throws CoordException;

	/**
	 * Get nailAlpha property.
	 * @return Object Value for nailAlpha is a double number.
	 */
	abstract Object getNailAlpha();

	/**
	 * Set nailAlpha property.
	 * @param nailAlpha Value for nailAlpha.
	 * @throws nailAlpha Value out of range admitted: 0.0-1.0.
	 */
	abstract void setNailAlpha(Number nailAlpha) throws OutOfRangeException;

	/**
	 * Get nailBorderAlpha property.
	 * @return Object Value for nailBorderAlpha is a double number.
	 */
	abstract Object getNailBorderAlpha();

	/**
	 * Set nailBorderAlpha property.
	 * @param nailBorderAlpha Value for nailBorderAlpha.
	 * @throws OutOfRangeException Value out of range admitted: 0.0-1.0.
	 */
	abstract void setNailBorderAlpha(Number nailBorderAlpha)
			throws OutOfRangeException;

	/**
	 * Get nailBorderThickness property.
	 * @return Object Value for nailBorderThickness is an integer number.
	 */
	abstract Object getNailBorderThickness();

	/**
	 * Set nailBorderThickness property.With improvedVisibility enabled range activated.
	 * @param nailBorderThickness Value for nailBorderThickness.
	 * @throws OutOfRangeException Value out of range admitted: 0-10.
	 */
	abstract void setNailBorderThickness(Number nailBorderThickness)
			throws OutOfRangeException;

	/**
	 * Get nailRadius property.
	 * @return Object Value for nailRadius is an integer number.
	 */
	abstract Object getNailRadius();

	/**
	 * Set nailRadius property.With improvedVisibility enabled range activated.
	 * @param nailRadius Value for nailRadius.
	 * @throws OutOfRangeException Value out of range admitted: 0-15. 
	 */
	abstract void setNailRadius(Number nailRadius) throws OutOfRangeException;

	/**
	 * Get radius property.
	 * @return String Value for radius.
	 */
	abstract String getRadius();

	/**
	 * Set radius property.
	 * @param radius Value for radius.
	 * @throws CoordException Value for radius is not an integer number or a percent.
	 */
	abstract void setRadius(String radius) throws CoordException;

	/**
	 * Get startWidth property.
	 * @return Object Value for startWidth.
	 */
	abstract Object getStartWidth();

	/**
	 * Set startWidth property.
	 * @param startWidth Value for startWidth.
	 */
	abstract void setStartWidth(Number startWidth);

	/**
	 * Get value property.
	 * @return Object Value for value is an integer number.
	 */
	abstract Object getValue();

	/**
	 * Set value property.
	 * @param value Value for value.
	 * @throws IntegerException Value for value is not an integer number.
	 */
	abstract void setValue(Number value) throws IntegerException;

}