package es.uvigo.esei.amchartsJava.core.api;

import es.uvigo.esei.amchartsJava.core.constants.CategoryBalloonText;
import es.uvigo.esei.amchartsJava.core.constants.CursorPosition;
import es.uvigo.esei.amchartsJava.core.constants.Orientation;
import es.uvigo.esei.amchartsJava.core.exceptions.ChartException;
import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsJava.core.model.charts.AmRectangularChart;

/**
 * Interface for controller of ChartCursor. Details of ChartCursor and 
 *  its properties in AmCharts API
 *  
 * @author Iago Fernández Cuñarro
 *
 */
public abstract interface IChartCursorController {

	/**
	 * Set chart that use chartCursor.
	 * @param chart Chart own of chartCursor.
	 */
	abstract void setChart(AmRectangularChart chart);

	/**
	 * Get adjustment property.<br>
	 * Default: 0.
	 * @return Value of adjustment.
	 */
	abstract Integer getAdjustment();

	/**
	 * Set adjustment property.<br>
	 * Adjustment property control the distance between cursor and balloon. 
	 * @param adjustment Value for adjustment.
	 * @throws IntegerException Value for adjustment is not an integer number.
	 */
	abstract void setAdjustment(Number adjustment) throws IntegerException;

	/**
	 * Get animationDuration property.<br>
	 * Default: 0.3.
	 * @return Value of animationDuration.
	 */
	abstract Double getAnimationDuration();

	/**
	 * Set animationDuration property.
	 * @param animationDuration Value for animationDuration.
	 * @throws OutOfRangeException Value out of range admitted: 0.0-1.0.
	 */
	abstract void setAnimationDuration(Number animationDuration)
			throws OutOfRangeException;

	/**
	 * Get avoidBalloonOverlapping property.<br>
	 * Default: true.
	 * @return Value of avoidBalloonOverlapping.
	 */
	abstract Boolean isAvoidBalloonOverlapping();

	/**
	 * Set avoidBalloonOverlapping property.
	 * @param avoidBalloonOverlapping Enable or disable balloonOverlapping.
	 */
	abstract void setAvoidBalloonOverlapping(Boolean avoidBalloonOverlapping);

	/**
	 * Get balloonPointerOrientation property.<br>
	 * Default: horizontal.
	 * @return Value of balloonPointerOrientation.
	 */
	abstract String getBalloonPointerOrientation();

	/**
	 * Set balloonPointerOrientation property.
	 * @param balloonPointerOrientation Value for balloonPointerOrientation.
	 */
	abstract void setBalloonPointerOrientation(
			Orientation balloonPointerOrientation);

	/**
	 * Get bulletsEnabled property.<br>
	 * Default: false.
	 * @return Value of bulletsEnabled.
	 */
	abstract Boolean isBulletsEnabled();

	/**
	 * Set bulletsEnabled property.
	 * @param bulletsEnabled Show or hide bullets.
	 */
	abstract void setBulletsEnabled(Boolean bulletsEnabled);

	/**
	 * Get bulletSize property.<br>
	 * Default: 8.
	 * @return Value of bulletSize.
	 */
	abstract Integer getBulletSize();

	/**
	 * Set bulletSize property.With improvedVisibility enabled range activated.
	 * @param bulletSize Value for bulletSize.
	 * @throws OutOfRangeException Value out of range admitted: 8-20.
	 */
	abstract void setBulletSize(Number bulletSize) throws OutOfRangeException;

	/**
	 * Get categoryBalloonAlpha property.<br>
	 * Default: 1.
	 * @return Value of categoryBalloonAlpha.
	 */
	abstract Double getCategoryBalloonAlpha();

	/**
	 * Set categoryBalloonAlpha property.
	 * @param categoryBalloonAlpha Value for categoryBalloonAlpha.
	 * @throws OutOfRangeException Value out of range admitted: 0.0-1.0.
	 */
	abstract void setCategoryBalloonAlpha(Number categoryBalloonAlpha)
			throws OutOfRangeException;

	/**
	 * Get categoryBalloonColor property.<br>
	 * Default: color of categoryBalloon
	 * @return Value of categoryBalloonColor.
	 */
	abstract String getCategoryBalloonColor();

	/**
	 * Set categoryBalloon property.
	 * @param categoryBalloonColor Value for categoryBalloonColor.
	 * @throws ColorException Format of color doesn't admitted, format admitted: #ffffff
	 */
	abstract void setCategoryBalloonColor(String categoryBalloonColor)
			throws ColorException;

	/**
	 * Get categoryBalloonDateFormat property.<br>
	 * Default: MMM DD, YYYY
	 * @return Value of categoryBalloonDateFormat.
	 */
	abstract String getCategoryBalloonDateFormat();

	/**
	 * Set categoryBalloonDateFormat property.
	 * @param categoryBalloonDateFormat Value for categoryBalloonDateFormat.
	 * @see es.uvigo.esei.amchartsJava.core.constants.DateFormatConstant
	 */
	abstract void setCategoryBalloonDateFormat(String categoryBalloonDateFormat);

	/**
	 * Get categoryBalloonEnabled property.<br>
	 * Default: true.
	 * @return Value of categoryBalloonEnabled.
	 */
	abstract Boolean isCategoryBalloonEnabled();

	/**
	 * Set categoryBalloonEnabled property.
	 * @param categoryBalloonEnabled Enable or disable categoryBalloon.
	 */
	abstract void setCategoryBalloonEnaled(Boolean categoryBalloonEnabled);

	/**
	 * Get categoryBalloonFunction property.
	 * @return Value of categoryBalloonFunction.
	 */
	abstract String getCategoryBalloonFunction();

	/**
	 * Set categoryBalloonFunction property.
	 * @param categoryBalloonFunction Value for categoryBalloonFunction.
	 */
	abstract void setCategoryBalloonFunction(String categoryBalloonFunction);
	
	/**
	 * Get categoryBalloonText property.<br>
	 * Default: [[category]]
	 * @return Value of categoryBalloonText.
	 */
	abstract String getCategoryBalloonText();
	
	/**
	 * Set categoryBalloonText property.
	 * @param categoryBalloonText Value for categoryBalloonText
	 */
	abstract void setCategoryBalloonText(CategoryBalloonText categoryBalloonText);

	/**
	 * Get color property.<br>
	 * Default: #ffffff
	 * @return Value of color.
	 */
	abstract String getColor();

	/**
	 * Set color property.
	 * @param color Value for color.
	 * @throws ColorException Format of color doesn't admitted, format admitted: #ffffff
	 */
	abstract void setColor(String color) throws ColorException;

	/**
	 * Get cursorAlpha property.<br>
	 * Default: 1.
	 * @return Value of cursorAlpha.
	 */
	abstract Double getCursorAlpha();

	/**
	 * Set cursorAlpha property.
	 * @param cursorAlpha Value for cursorAlpha.
	 * @throws OutOfRangeException Value out of range admitted: 0.0-1.0.
	 */
	abstract void setCursorAlpha(Number cursorAlpha) throws OutOfRangeException;

	/**
	 * Get cursorColor property.<br>
	 * Default: #cc0000
	 * @return Value of cursorColor.
	 */
	abstract String getCursorColor();

	/**
	 * Set cursorColor property.
	 * @param cursorColor Value for cursorColor.
	 * @throws ColorException Format of color doesn't admitted, format admitted: #ffffff
	 */
	abstract void setCursorColor(String cursorColor) throws ColorException;

	/**
	 * Get cursorPosition property.<br>
	 * Default: middle.
	 * @return Value of cursorPosition.
	 */
	abstract String getCursorPosition();

	/**
	 * Set cursorPosition property.
	 * @param cursorPosition Value for cursorPosition.
	 */
	abstract void setCursorPosition(CursorPosition cursorPosition);

	/**
	 * Get enabled property.<br>
	 * Default: true.
	 * @return Value of enabled.
	 */
	abstract Boolean isEnabled();

	/**
	 * Set enabled property.
	 * @param enabled Enable or disable chartCursor.
	 */
	abstract void setEnabled(Boolean enabled);

	/**
	 * Get fullWidth property.<br>
	 * Default: false.
	 * @return Value of fullWidth.
	 */
	abstract Boolean isFullWidth();

	/**
	 * Set fullWidth property.
	 * @param fullWidth Enable or disable fullWidth.
	 */
	abstract void setFullWidth(Boolean fullWidth);

	/**
	 * Get graphBulletAlpha property.
	 * @return Value of graphBulletAlpha.
	 */
	abstract Double getGraphBulletAlpha();

	/**
	 * Set graphBulletAlpha property.
	 * @param graphBulletAlpha Value for graphBulletAlpha.
	 * @throws OutOfRangeException Value out of range admitted: 0.0-1.0.
	 */
	abstract void setGraphBulletAlpha(Number graphBulletAlpha)
			throws OutOfRangeException;

	/**
	 * Get graphBulletSize property.<br>
	 * Default: 1.7(amcharts default, app only admitted integer number for this size)
	 * @return Value of graphBulletSize.
	 */
	abstract Integer getGraphBulletSize();

	/**
	 * Set graphBulletSize property.With improvedVisibility enabled range activated.
	 * @param graphBulletSize Value for graphBulletSize.
	 * @throws OutOfRangeException Value out of range admitted: 1-20.
	 */
	abstract void setGraphBulletSize(Number graphBulletSize)
			throws OutOfRangeException;

	/**
	 * Get leaveCursor property.<br>
	 * Default: false.
	 * @return Value of leaveCursor.
	 */
	abstract Boolean isLeaveCursor();

	/**
	 * Set leaveCursor property.
	 * @param leaveCursor Enable or disable leaveCursor.
	 */
	abstract void setLeaveCursor(Boolean leaveCursor);

	/**
	 * Get oneBalloonOnly property.<br>
	 * Default: false.
	 * @return Value of oneBalloonOnly.
	 */
	abstract Boolean isOneBalloonOnly();

	/**
	 * Set oneBalloonOnly property.
	 * @param oneBalloonOnly Enable or disable oneBalloonOnly.
	 */
	abstract void setOneBalloonOnly(Boolean oneBalloonOnly);

	/**
	 * Get pan property.<br>
	 * Default: false.
	 * @return Value of pan.
	 */
	abstract Boolean isPan();

	/**
	 * Set pan property.
	 * @param pan Enable or disable pan.
	 */
	abstract void setPan(Boolean pan);

	/**
	 * Get selectionAlpha property.<br>
	 * Default: 0.2.
	 * @return Value of selectionAlpha.
	 */
	abstract Double getSelectionAlpha();

	/**
	 * Set selectionAlpha property.
	 * @param selectionAlpha Value for selectionAlpha
	 * @throws OutOfRangeException Value out of range admitted: 0.0-1.0.
	 */
	abstract void setSelectionAlpha(Number selectionAlpha)
			throws OutOfRangeException;

	/**
	 * Get selectWithoutZooming property.<br>
	 * Default: false.
	 * @return Value of selectWithoutZooming
	 */
	abstract Boolean isSelectWithoutZooming();

	/**
	 * Set selectWithoutZooming property.
	 * @param selectWithoutZooming Enable or disable select without zooming.
	 */
	abstract void setSelectWithoutZooming(Boolean selectWithoutZooming);

	/**
	 * Get showNextAvailable property.<br>
	 * Default: false.
	 * @return Value of showNextAvailable.
	 */
	abstract Boolean isShowNextAvailable();

	/**
	 * Set showNextAvailable property.
	 * @param showNextAvailable Show or hide next available.
	 */
	abstract void setShowNextAvailable(Boolean showNextAvailable);

	/**
	 * Get valueBalloonsEnabled property.<br>
	 * Default: true.
	 * @return Value of valueBalloonsEnabled.
	 */
	abstract Boolean isValueBalloonsEnabled();

	/**
	 * Set valueBalloonsEnabled property.
	 * @param valueBalloonsEnabled Enable or disable valueBalloons
	 */
	abstract void setValueBalloonsEnabled(Boolean valueBalloonsEnabled);

	/**
	 * Get valueLineAlpha property.<br>
	 * Default: cursorAlpha.
	 * @return Value of valueLineAlpha.
	 */
	abstract Double getValueLineAlpha();

	/**
	 * Set valueLineAlpha property.
	 * @param valueLineAlpha Value for valueLineAlpha.
	 * @throws OutOfRangeException Value out of range admitted: 0.0-1.0.
	 */
	abstract void setValueLineAlpha(Number valueLineAlpha)
			throws OutOfRangeException;

	/**
	 * Get valueLineAxis property.
	 * @return Value of valueLineAxis.
	 */
	abstract String getValueLineAxis();

	/**
	 * Set valueLineAxis property.
	 * @param valueLineAxis ValueAxis id that contains values of valueLine used by chartCursor.
	 * @throws ChartException Chart that use chartCursor doesn't contains a valueAxis with id equals to valueLineAxis.
	 */
	abstract void setValueLineAxis(String valueLineAxis) throws ChartException;

	/**
	 * Get valueLineBalloonEnabled property.<br>
	 * Default: false.
	 * @return Value of valueLineBalloonEnabled.
	 */
	abstract Boolean isValueLineBalloonEnabled();

	/**
	 * Set valueLineBalloonEnabled property.
	 * @param valueLineBalloonEnabled Enable or disable valueLineBalloon.
	 */
	abstract void setValueLineBalloonEnabled(Boolean valueLineBalloonEnabled);

	/**
	 * Get valueLineEnabled property.<br>
	 * Default: false.
	 * @return Value of valueLineEnabled.
	 */
	abstract Boolean isValueLineEnabled();

	/**
	 * Set valueLineEnabled property.
	 * @param valueLineEnabled Enable or disable valueLine.
	 */
	abstract void setValueLineEnabled(Boolean valueLineEnabled);

	/**
	 * Get zoomable property.<br>
	 * Default: true.
	 * @return Value of zoomable.
	 */
	abstract Boolean isZoomable();

	/**
	 * Set zoomable property.
	 * @param zoomable Enable or disable zoom.
	 */
	abstract void setZommable(Boolean zoomable);

}