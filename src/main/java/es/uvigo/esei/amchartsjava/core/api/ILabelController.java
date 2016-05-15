package es.uvigo.esei.amchartsjava.core.api;


import es.uvigo.esei.amchartsjava.core.constants.Align;
import es.uvigo.esei.amchartsjava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsjava.core.exceptions.CoordException;
import es.uvigo.esei.amchartsjava.core.exceptions.OutOfRangeException;

/**
 * 
 * Interface for controller of Label. Details of Label and 
 *  its properties in AmCharts API
 * 
 * @author Iago Fernández Cuñarro
 *
 */
public abstract interface ILabelController  {

	/**
	 * Get align property.<br>
	 * Default: left.
	 * @return Value of align.
	 */
	abstract String getAlign();

	/**
	 * Set align property.
	 * @param labelAlign Value for align.
	 */
	abstract void setAlign(Align labelAlign);

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
	 * @return Label id.
	 */
	abstract String getId();

	/**
	 * Get rotation property.<br>
	 * Default: 0.
	 * @return Value of rotation.
	 */
	abstract Integer getRotation();

	/**
	 * Set rotation property.
	 * @param rotation Value for rotation.
	 * @throws OutOfRangeException Value out of range admitted: -90 to 90.
	 */
	abstract void setRotation(Number rotation) throws OutOfRangeException;

	/**
	 * Get size property.
	 * @return Value of size.
	 */
	abstract Integer getSize();

	/**
	 * Set size property.With improvedVisibility enabled range activated.
	 * @param size Value for size.
	 * @throws OutOfRangeException Value out of range admitted: 10-24.
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

	/**
	 * Get url property.
	 * @return Value of url.
	 */
	abstract String getUrl();

	/**
	 * Set url property.
	 * @param url Value for url.
	 */
	abstract void setUrl(String url);

	/**
	 * Get X property.
	 * @return Value of X.
	 */
	abstract String getX();

	/**
	 * Set X property.
	 * @param xCoord Value for X.
	 * @throws CoordException Value for X is not an integer number or a percent.
	 */
	abstract void setX(String xCoord) throws CoordException;

	/**
	 * Get Y property.
	 * @return Value of Y.
	 */
	abstract String getY();

	/**
	 * Set Y property.
	 * @param yCoord Value for Y.
	 * @throws CoordException Value for Y is not an integer number or a percent.
	 */
	abstract void setY(String yCoord) throws CoordException;

}