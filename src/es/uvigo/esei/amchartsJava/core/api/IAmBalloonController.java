package es.uvigo.esei.amchartsJava.core.api;


import es.uvigo.esei.amchartsJava.core.constants.TextAlignConstant.TextAlign;
import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;

/**
 * 
 * Interface for controller of AmBalloon. Details of AmBalloon and 
 *  their properties in AmCharts API.
 * 
 * @author Iago Fernández Cuñarro
 *
 */
public abstract interface IAmBalloonController {

	/**
	 * Get adjustBorderColor property.<br>
	 * Default: true
	 * @return Boolean 
	 */
	abstract Boolean isAdjustBorderColor();

	/**
	 * Set adjustBorderColor property.
	 * @param adjustBorderColor Enable or disable adjustBorderColor.
	 */
	abstract void setAdjustBorderColor(Boolean adjustBorderColor);

	/**
	 * Get animationDuration property.<br>
	 * Default: 0.3
	 * @return Object Value for animationDuration is a double number.
	 */
	abstract Object getAnimationDuration();

	/**
	 * Set animationDuration property.With improvedVisibility enabled range activated.
	 * @param animationDuration Value for animationDuration.
	 * @throws OutOfRangeException Value out of range admitted: 0.0-2.0.
	 */
	abstract void setAnimationDuration(Number animationDuration)
			throws OutOfRangeException;

	/**
	 * Get borderAlpha property.<br>
	 * Default: 1
	 * @return Object Value of borderAlpha is a double number.
	 */
	abstract Object getBorderAlpha();

	/**
	 * Set borderAlpha property.
	 * @param borderAlpha Value of borderAlpha.
	 * @throws OutOfRangeException Value out of range admitted: 0.0-1.0.
	 */
	abstract void setBorderAlpha(Number borderAlpha) throws OutOfRangeException;

	/**
	 * Get borderColor property.<br>
	 * Default: #ffffff
	 * @return String Value of borderColor.
	 */
	abstract String getBorderColor();

	/**
	 * Set borderColor property.
	 * @param borderColor Value for borderColor.
	 * @throws ColorException Format of color doesn't admitted, format admitted: #ffffff.
	 */
	abstract void setBorderColor(String borderColor) throws ColorException;

	/**
	 * Get borderThickness property.<br>
	 * Default: 2
	 * @return Object Value for borderThickness is an integer number.
	 */
	abstract Object getBorderThickness();

	/**
	 * Set borderThickness property.With improvedVisibility enabled range activated.
	 * @param borderThickness Value for borderThickness.
	 * @throws OutOfRangeException Value out of range admitted: 0-10.
	 */
	abstract void setBorderThickness(Number borderThickness)
			throws OutOfRangeException;

	/**
	 * Get color property.<br>
	 * Default: #000000
	 * @return String Value of Color.
	 */
	abstract String getColor();

	/**
	 * Set color property.
	 * @param color Value for color.
	 * @throws ColorException Format of color doesn't admitted, format admitted: #ffffff.
	 */
	abstract void setColor(String color) throws ColorException;

	/**
	 * Get cornerRadius property.<br>
	 * Default: 0
	 * @return Object Value of corneRadius is an integer number.
	 */
	abstract Object getCornerRadius();

	/**
	 * Set cornerRadius property.With improvedVisibility enabled range activated.
	 * @param cornerRadius Value for cornerRadius.
	 * @throws OutOfRangeException Value out of range admitted: 0-14.
	 */
	abstract void setCornerRadius(Number cornerRadius) throws OutOfRangeException;
	
	/**
	 * Get disableMouseEvents property.<br>
	 * Default: true
	 * @return Boolean
	 */
	abstract Boolean isDisableMouseEvents();
	
	/**
	 * Set disableMouseEvents property.
	 * @param disableMouseEvents Enable or disable mouse events.
	 */
	abstract void setDisableMouseEvents(Boolean disableMouseEvents);

	/**
	 * Get fadeOutDuration property.<br>
	 * Default: 0.3
	 * @return Object Value for fadeOutDuration is a double number.
	 */
	abstract Object getFadeOutDuration();

	/**
	 * Set fadeOutDuration property.With improvedVisibility enabled range activated.
	 * @param fadeOutDuration Value for fadeOutDuration in seconds.
	 * @throws OutOfRangeException Value out of range admitted: 0.0-2.0.
	 */
	abstract void setFadeOutDuration(Number fadeOutDuration)
			throws OutOfRangeException;

	/**
	 * Get fillAlpha property.<br>
	 * Default: 0.8
	 * @return Object Value of fillAlpha is a double number.
	 */
	abstract Object getFillAlpha();

	/**
	 * Set fillAlpha property.
	 * @param fillAlpha Value for fillAlpha.
	 * @throws OutOfRangeException Value out of range admitted: 0.0-1.0.
	 */
	abstract void setFillAlpha(Number fillAlpha) throws OutOfRangeException;

	/**
	 * Get fillColor property.<br>
	 * Default: #ffffff
	 * @return String Value for fillColor.
	 */
	abstract String getFillColor();
	
	/**
	 * Set fillColor property. 
	 * @param fillColor Value for fillColor.
	 * @throws ColorException Format of color doesn't admitted, format admitted: #ffffff.
	 */
	abstract void setFillColor(String fillColor) throws ColorException;

	/**
	 * Get fixedPosition property.<br>
	 * Default: false
	 * @return Boolean
	 */
	abstract Boolean isFixedPosition();

	/**
	 * Set fixedPosition property.
	 * @param fixedPosition Enable or disable fixedPosition.
	 */
	abstract void setFixedPosition(Boolean fixedPosition);

	/**
	 * Get fontSize property.<br>
	 * Default: fontSize of chart
	 * @return Object Value of fontSize is an integer number.
	 */
	abstract Object getFontSize();

	/**
	 * Set fontSize property.With improvedVisibility enabled range activated.
	 * @param fontSize Value for fontSize.
	 * @throws OutOfRangeException Value out of range admitted: 10-16.
	 */
	abstract void setFontSize(Number fontSize) throws OutOfRangeException;

	/**
	 * Get horizontalPadding property.<br>
	 * Default: 8
	 * @return Object Value of horizontalPadding is an integer number.
	 */
	abstract Object getHorizontalPadding();

	/**
	 * Set horizontalPadding property.With improvedVisibility enabled range activated.
	 * @param horizontalPadding Value for horizontalPadding.
	 * @throws OutOfRangeException Value out of range admitted: 8-20.
	 */
	abstract void setHorizontalPadding(Number horizontalPadding)
			throws OutOfRangeException;

	/**
	 * Get maxWidth property.
	 * @return Object Value for maxWidth is an integer number.
	 */
	abstract Object getMaxWidth();

	/**
	 * Set maxWidth property.
	 * @param maxWidth Value for maxWidth as integer number.
	 * @throws IntegerException Value for maxWidth is not an integer number.
	 */
	abstract void setMaxWidth(Number maxWidth) throws IntegerException;

	/**
	 * Get offsetX property.<br>
	 * Default: 1
	 * @return Object Value of offsetX is an integer number.
	 */
	abstract Object getOffsetX();

	/**
	 * Set offsetX property.
	 * @param offsetX Value for offsetX as integer number.
	 * @throws IntegerException Value for offsetX is not an integer number.
	 */
	abstract void setOffsetX(Number offsetX) throws IntegerException;

	/**
	 * Get offsetY property.<br>
	 * Default: 6
	 * @return Object Value for offsetY is an integer number.
	 */
	abstract Object getOffsetY();

	/**
	 * Set offsetY property.
	 * @param offsetY Value for offsetY as integer number.
	 * @throws IntegerException Value for offsetY is not an integer number.
	 */
	abstract void setOffsetY(Number offsetY) throws IntegerException;

	/**
	 * Get pointerWidth property.<br>
	 * Default: 6
	 * @return Object Value for pointerWidth is an integer number.
	 */
	abstract Object getPointerWidth();

	/**
	 * Set pointerWidth property.With improvedVisibility enabled range activated.
	 * @param pointerWidth Value for pointerWidth.
	 * @throws OutOfRangeException Value out of range admitted: 0-36.
	 */
	abstract void setPointerWidth(Number pointerWidth) throws OutOfRangeException;

	/**
	 * Get shadowAlpha property.<br>
	 * Default: 0.4
	 * @return Object Value for shadowAlpha is a double number.
	 */
	abstract Object getShadowAlpha();

	/**
	 * Set shadowAlpha property.
	 * @param shadowAlpha Value for shadowAlpha.
	 * @throws OutOfRangeException Value out of range admitted: 0.0-1.0.
	 */
	abstract void setShadowAlpha(Number shadowAlpha) throws OutOfRangeException;

	/**
	 * Get shadowColor property.<br>
	 * Default: #000000
	 * @return String Value for shadowColor
	 */
	abstract String getShadowColor();

	/**
	 * Set shadowColor property. 
	 * @param shadowColor Value for shadowColor.
	 * @throws ColorException Format of color doesn't admitted, format admitted: #ffffff.
	 */
	abstract void setShadowColor(String shadowColor) throws ColorException;

	/**
	 * Get showBullet property.<br>
	 * Default: false
	 * @return Boolean
	 */
	abstract Boolean isShowBullet();

	/**
	 * Set showBullet property.
	 * @param showBullet Show or hide bullet.
	 */
	abstract void setShowBullet(Boolean showBullet);

	/**
	 * Get textAlign property.<br>
	 * Default: middle
	 * @return String Value for textAlign.
	 */
	abstract String getTextAlign();

	/**
	 * Set textAlign property.
	 * @param textAlign Value for textAlign.
	 */
	abstract void setTextAlign(TextAlign textAlign);

	/**
	 * Get verticalPadding property.<br>
	 * Default: 4
	 * @return Object Value for verticalPadding is an integer number.
	 */
	abstract Object getVerticalPadding();

	/**
	 * Set verticalPadding property.With improvedVisibility enabled range activated.
	 * @param verticalPadding Value for verticalPadding.
	 * @throws OutOfRangeException Value out of range admitted: 0-10.
	 */
	abstract void setVerticalPadding(Number verticalPadding)
			throws OutOfRangeException;

}