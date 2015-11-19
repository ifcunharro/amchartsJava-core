package es.uvigo.esei.amchartsJava.core.api;

import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;

/**
 * 
 * Interface for controller of Image. Details of Image and 
 *  their properties in AmCharts API
 * 
 * @author Iago Fernández Cuñarro
 *
 */
public abstract interface IImageController {

	/**
	 * Get balloonColor property.<br>
	 * Default: #000000.
	 * @return String Value for balloonColor.
	 */
	abstract String getBalloonColor();

	/**
	 * Set balloonColor property.
	 * @param balloonColor Value for balloonColor.
	 * @throws ColorException Format color doesn't admitted, format admitted: #ffffff
	 */
	abstract void setBalloonColor(String balloonColor) throws ColorException;

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
	 * Get color property.<br>
	 * Default: #000000
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
	 * Get height property.<br>
	 * Default: 20.
	 * @return Object Value for height is an integer number.
	 */
	abstract Object getHeight();

	/**
	 * Set height property.With improvedVisibility enabled range activated.
	 * @param height Value for height.
	 * @throws OutOfRangeException Value out of range admitted: 20-50.
	 */
	abstract void setHeight(Number height) throws OutOfRangeException;

	/**
	 * Get offsetX property.<br>
	 * Default: 0.
	 * @return Object Value for offsetX is an integer number.
	 */
	abstract Object getOffsetX();

	/**
	 * Set offsetX property.
	 * @param offsetX Value for offsetX.
	 * @throws IntegerException Value for offsetX is not an integer number.
	 */
	abstract void setOffsetX(Number offsetX) throws IntegerException;

	/**
	 * Get offsetY property.<br>
	 * Default: 0.
	 * @return Object Value for offsetY is an integer number.
	 */
	abstract Object getOffsetY();

	/**
	 * Set offsetY property.
	 * @param offsetY Value for offsetY.
	 * @throws IntegerException Value for offsetY is not an integer number.
	 */
	abstract void setOffsetY(Number offsetY) throws IntegerException;

	/**
	 * Get outlineColor property.
	 * @return String Value for outlineColor.
	 */
	abstract String getOutlineColor();

	/**
	 * Set outlineColor property.
	 * @param outlineColor Value for outlineColor.
	 * @throws ColorException Format color doesn't admitted, format admitted: #ffffff
	 */
	abstract void setOutlineColor(String outlineColor) throws ColorException;

	/**
	 * Get rotation property.<br>
	 * Default: 0.
	 * @return Object Value for rotation is an integer number.
	 */
	abstract Object getRotation();

	/**
	 * Set rotation property.With improvedVisibility enabled range activated.
	 * @param rotation Value for rotation.
	 * @throws OutOfRangeException Value out of range admitted: 0-360.
	 */
	abstract void setRotation(Number rotation) throws OutOfRangeException;

	/**
	 * Get url property.
	 * @return String Value for url.
	 */
	abstract String getUrl();

	//en vez de url, introduce solo nombre imagen con su extensión, la url se completa con
	//IMAGES_PATH definido en AmchartsJavaPaths
	/**
	 * Set url property.
	 * @param nameImage Name of image file with extension.
	 */
	abstract void setUrl(String nameImage);

	/**
	 * Get width property.<br>
	 * Default: 20.
	 * @return Object Value for width is an integer number.
	 */
	abstract Object getWidth();

	/**
	 * Set width property.With improvedVisibility enabled range activated.
	 * @param width Value for width.
	 * @throws OutOfRangeException Value out of range admitted: 20-50.
	 */
	abstract void setWidth(Number width) throws OutOfRangeException;

}