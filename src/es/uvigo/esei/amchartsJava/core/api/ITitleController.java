package es.uvigo.esei.amchartsJava.core.api;


import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;

/**
 * 
 * Interface for controller of Title. Details of Title and 
 *  their properties in AmCharts API
 * 
 * @author Iago Fernández Cuñarro
 *
 */
public abstract interface ITitleController {

	/**
	 * Get alpha property.<br>
	 * Default: 1.
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
	 * Get bold property.<br>
	 * Default: false.
	 * @return Boolean Value for bold.
	 */
	abstract Boolean isBold();

	/**
	 * Set bold property.
	 * @param bold Enable or disable bold.
	 */
	abstract void setBold(Boolean bold);

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
	 * Get id property.
	 * @return String Title id.
	 */
	abstract String getId();

	/**
	 * Get size property.
	 * @return Object Value for size is an integer number.
	 */
	abstract Object getSize();

	/**
	 * Set size property.With improvedVisibility enabled range activated.
	 * @param size Value for size.
	 * @throws OutOfRangeException Value out of range admitted: 8-36.
	 */
	abstract void setSize(Number size) throws OutOfRangeException;

	/**
	 * Get text property.
	 * @return String Value for text.
	 */
	abstract String getText();

	/**
	 * Set text property.
	 * @param text Value for text.
	 */
	abstract void setText(String text);

}