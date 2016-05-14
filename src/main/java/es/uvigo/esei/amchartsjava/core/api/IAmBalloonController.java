package es.uvigo.esei.amchartsjava.core.api;


import es.uvigo.esei.amchartsjava.core.constants.TextAlign;
import es.uvigo.esei.amchartsjava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsjava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsjava.core.exceptions.OutOfRangeException;

/**
 * 
 * Interface for controller of AmBalloon. Details of AmBalloon and 
 *  its properties in AmCharts API.
 * 
 * @author Iago Fernández Cuñarro
 *
 */
public abstract interface IAmBalloonController {

	/**
	 * Get adjustBorderColor property.<br>
	 * Default: true
	 * @return Value of adjustBorderColor.
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
	 * @return Value of animationDuration.
	 */
	abstract Double getAnimationDuration();

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
	 * @return Value of borderAlpha.
	 */
	abstract Double getBorderAlpha();

	/**
	 * Set borderAlpha property.
	 * @param borderAlpha Value of borderAlpha.
	 * @throws OutOfRangeException Value out of range admitted: 0.0-1.0.
	 */
	abstract void setBorderAlpha(Number borderAlpha) throws OutOfRangeException;

	/**
	 * Get borderColor property.<br>
	 * Default: #ffffff
	 * @return Value of borderColor.
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
	 * @return Value of borderThickness.
	 */
	abstract Integer getBorderThickness();

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
	 * @return Value of Color.
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
	 * @return Value of cornerRadius.
	 */
	abstract Integer getCornerRadius();

	/**
	 * Set cornerRadius property.With improvedVisibility enabled range activated.
	 * @param cornerRadius Value for cornerRadius.
	 * @throws OutOfRangeException Value out of range admitted: 0-14.
	 */
	abstract void setCornerRadius(Number cornerRadius) throws OutOfRangeException;
	
	/**
	 * Get disableMouseEvents property.<br>
	 * Default: true
	 * @return Value of disableMouseEvents.
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
	 * @return Value of fadeOutDuration.
	 */
	abstract Double getFadeOutDuration();

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
	 * @return Value of fillAlpha.
	 */
	abstract Double getFillAlpha();

	/**
	 * Set fillAlpha property.
	 * @param fillAlpha Value for fillAlpha.
	 * @throws OutOfRangeException Value out of range admitted: 0.0-1.0.
	 */
	abstract void setFillAlpha(Number fillAlpha) throws OutOfRangeException;

	/**
	 * Get fillColor property.<br>
	 * Default: #ffffff
	 * @return Value of fillColor.
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
	 * @return Value of fixedPosition.
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
	 * @return Value of fontSize.
	 */
	abstract Integer getFontSize();

	/**
	 * Set fontSize property.With improvedVisibility enabled range activated.
	 * @param fontSize Value for fontSize.
	 * @throws OutOfRangeException Value out of range admitted: 10-16.
	 */
	abstract void setFontSize(Number fontSize) throws OutOfRangeException;

	/**
	 * Get horizontalPadding property.<br>
	 * Default: 8
	 * @return Value of horizontalPadding.
	 */
	abstract Integer getHorizontalPadding();

	/**
	 * Set horizontalPadding property.With improvedVisibility enabled range activated.
	 * @param horizontalPadding Value for horizontalPadding.
	 * @throws OutOfRangeException Value out of range admitted: 8-20.
	 */
	abstract void setHorizontalPadding(Number horizontalPadding)
			throws OutOfRangeException;

	/**
	 * Get maxWidth property.
	 * @return Value of maxWidth.
	 */
	abstract Integer getMaxWidth();

	/**
	 * Set maxWidth property.
	 * @param maxWidth Value for maxWidth as integer number.
	 * @throws IntegerException Value for maxWidth is not an integer number.
	 */
	abstract void setMaxWidth(Number maxWidth) throws IntegerException;

	/**
	 * Get offsetX property.<br>
	 * Default: 1
	 * @return Value of offsetX.
	 */
	abstract Integer getOffsetX();

	/**
	 * Set offsetX property.
	 * @param offsetX Value for offsetX as integer number.
	 * @throws IntegerException Value for offsetX is not an integer number.
	 */
	abstract void setOffsetX(Number offsetX) throws IntegerException;

	/**
	 * Get offsetY property.<br>
	 * Default: 6
	 * @return Value of offsetY.
	 */
	abstract Integer getOffsetY();

	/**
	 * Set offsetY property.
	 * @param offsetY Value for offsetY as integer number.
	 * @throws IntegerException Value for offsetY is not an integer number.
	 */
	abstract void setOffsetY(Number offsetY) throws IntegerException;

	/**
	 * Get pointerWidth property.<br>
	 * Default: 6
	 * @return Value of pointerWidth.
	 */
	abstract Integer getPointerWidth();

	/**
	 * Set pointerWidth property.With improvedVisibility enabled range activated.
	 * @param pointerWidth Value for pointerWidth.
	 * @throws OutOfRangeException Value out of range admitted: 0-36.
	 */
	abstract void setPointerWidth(Number pointerWidth) throws OutOfRangeException;

	/**
	 * Get shadowAlpha property.<br>
	 * Default: 0.4
	 * @return Value of shadowAlpha.
	 */
	abstract Double getShadowAlpha();

	/**
	 * Set shadowAlpha property.
	 * @param shadowAlpha Value for shadowAlpha.
	 * @throws OutOfRangeException Value out of range admitted: 0.0-1.0.
	 */
	abstract void setShadowAlpha(Number shadowAlpha) throws OutOfRangeException;

	/**
	 * Get shadowColor property.<br>
	 * Default: #000000
	 * @return Value of shadowColor.
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
	 * @return Value of showBullet.
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
	 * @return Value of textAlign.
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
	 * @return Value of verticalPadding.
	 */
	abstract Integer getVerticalPadding();

	/**
	 * Set verticalPadding property.With improvedVisibility enabled range activated.
	 * @param verticalPadding Value for verticalPadding.
	 * @throws OutOfRangeException Value out of range admitted: 0-10.
	 */
	abstract void setVerticalPadding(Number verticalPadding)
			throws OutOfRangeException;

}