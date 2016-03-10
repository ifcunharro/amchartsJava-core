package es.uvigo.esei.amchartsJava.core.api;

import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;

/**
 * 
 * Interface for controller of Image. Details of Image and 
 *  its properties in AmCharts API
 * 
 * @author Iago Fernández Cuñarro
 *
 */
public abstract interface IImageController {

	/**
	 * Get balloonColor property.<br>
	 * Default: #000000.
	 * @return Value of balloonColor.
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
	 * @return Value of balloonText.
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
	 * Get height property.<br>
	 * Default: 20.
	 * @return Value of height.
	 */
	abstract Integer getHeight();

	/**
	 * Set height property.With improvedVisibility enabled range activated.
	 * @param height Value for height.
	 * @throws OutOfRangeException Value out of range admitted: 20-50.
	 */
	abstract void setHeight(Number height) throws OutOfRangeException;

	/**
	 * Get offsetX property.<br>
	 * Default: 0.
	 * @return Value of offsetX.
	 */
	abstract Integer getOffsetX();

	/**
	 * Set offsetX property.
	 * @param offsetX Value for offsetX.
	 * @throws IntegerException Value for offsetX is not an integer number.
	 */
	abstract void setOffsetX(Number offsetX) throws IntegerException;

	/**
	 * Get offsetY property.<br>
	 * Default: 0.
	 * @return Value of offsetY.
	 */
	abstract Integer getOffsetY();

	/**
	 * Set offsetY property.
	 * @param offsetY Value for offsetY.
	 * @throws IntegerException Value for offsetY is not an integer number.
	 */
	abstract void setOffsetY(Number offsetY) throws IntegerException;

	/**
	 * Get outlineColor property.
	 * @return Value of outlineColor.
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
	 * @return Value of rotation.
	 */
	abstract Integer getRotation();

	/**
	 * Set rotation property.
	 * @param rotation Value for rotation.
	 * @throws OutOfRangeException Value out of range admitted: 0-360.
	 */
	abstract void setRotation(Number rotation) throws OutOfRangeException;

	/**
	 * Get url property.
	 * @return Value for url.
	 */
	abstract String getUrl();

	/**
	 * Set url property.<br>
	 * Image with name equals to nameImage must to exist in images folder, if exist 
	 * two images with same name, nameImage must to carry file extension.
	 * @param nameImage Name of image file with or without file extension.
	 * @see es.uvigo.esei.amchartsJava.core.constants.ImageExtensions
	 */
	abstract void setUrl(String nameImage);

	/**
	 * Get width property.<br>
	 * Default: 20.
	 * @return Value for width.
	 */
	abstract Integer getWidth();

	/**
	 * Set width property.With improvedVisibility enabled range activated.
	 * @param width Value for width.
	 * @throws OutOfRangeException Value out of range admitted: 20-50.
	 */
	abstract void setWidth(Number width) throws OutOfRangeException;

}