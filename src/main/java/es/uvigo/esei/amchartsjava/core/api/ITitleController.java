package es.uvigo.esei.amchartsjava.core.api;


import es.uvigo.esei.amchartsjava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsjava.core.exceptions.OutOfRangeException;

/**
 * 
 * Interface for controller of Title. Details of Title and 
 *  its properties in AmCharts API
 * 
 * @author Iago Fernández Cuñarro
 *
 */
public abstract interface ITitleController {

	/**
	 * Get alpha property.<br>
	 * Default: 1.
	 * @return Value of alpha.
	 */
	abstract Double getAlpha();

	/**
	 * Set alpha property.
	 * @param alpha Value for alpha.
	 * @throws OutOfRangeException Value out of range admitted: 0.0-1.0.
	 */
	abstract void setAlpha(Number alpha) throws OutOfRangeException;

	/**
	 * Get bold property.<br>
	 * Default: false.
	 * @return Value of bold.
	 */
	abstract Boolean isBold();

	/**
	 * Set bold property.
	 * @param bold Enable or disable bold.
	 */
	abstract void setBold(Boolean bold);

	/**
	 * Get color property.
	 * @return Value of color.
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
	 * @return Title id.
	 */
	abstract String getId();

	/**
	 * Get size property.
	 * @return Value of size.
	 */
	abstract Integer getSize();

	/**
	 * Set size property.With improvedVisibility enabled range activated.
	 * @param size Value for size.
	 * @throws OutOfRangeException Value out of range admitted: 8-36.
	 */
	abstract void setSize(Number size) throws OutOfRangeException;

	/**
	 * Get text property.
	 * @return Value of text.
	 */
	abstract String getText();

	/**
	 * Set text property.
	 * @param text Value for text.
	 */
	abstract void setText(String text);

}