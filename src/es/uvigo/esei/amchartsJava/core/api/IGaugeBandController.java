package es.uvigo.esei.amchartsJava.core.api;

import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.CoordException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;

/**
 * 
 * Interface for controller of GaugeBand. Details of GaugeBand and 
 *  their properties in AmCharts API
 * 
 * @author Iago Fernández Cuñarro
 *
 */
public abstract interface IGaugeBandController {

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
	 * Get balloonText property.
	 * @return String Value for balloonText.
	 */
	abstract String getBalloonText();

	/**
	 * Set balloonText property.
	 * @param balloonText Value for balloonText.
	 */
	abstract void setBalloonText(String balloonText);

	/**
	 * Get color property.
	 * @return String Value for color.
	 */
	abstract String getColor();

	/**
	 * Set color property.
	 * @param color Value for color.
	 * @throws ColorException Format color doesn't admitted, format admitted: #ffffff
	 */
	abstract void setColor(String color) throws ColorException;

	/**
	 * Get endValue property.
	 * @return Object Value for endValue.
	 */
	abstract Object getEndValue();

	/**
	 * Set endValue property.
	 * @param endValue Value for endValue.
	 */
	abstract void setEndValue(Number endValue);

	/**
	 * Get id property.
	 * @return String GaugeBand id.
	 */
	abstract String getId();

	/**
	 * Get innerRadius property.
	 * @return String Value for innerRadius is an integer number or a percent.
	 */
	abstract String getInnerRadius();

	/**
	 * Set innerRadius property.
	 * @param innerRadius Value for innerRadius.
	 * @throws CoordException Value for innerRadius is not an integer number or a percent.
	 */
	abstract void setInnerRadius(String innerRadius) throws CoordException;

	/**
	 * Get radius property.
	 * @return String Value for radius is an integer number or a percent.
	 */
	abstract String getRadius();

	/**
	 * Set radius property.
	 * @param radius Value for radius.
	 * @throws CoordException Value for radius is not an integer number or a percent.
	 */
	abstract void setRadius(String radius) throws CoordException;

	/**
	 * Get startValue property.
	 * @return Object Value for startValue.
	 */
	abstract Object getStartValue();

	/**
	 * Set startValue property.
	 * @param startValue Value for startValue.
	 */
	abstract void setStartValue(Number startValue);

}