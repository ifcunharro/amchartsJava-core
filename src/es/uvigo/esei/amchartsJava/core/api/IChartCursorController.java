package es.uvigo.esei.amchartsJava.core.api;

import es.uvigo.esei.amchartsJava.core.constants.CategoryBalloonTextConstant.CategoryBalloonText;
import es.uvigo.esei.amchartsJava.core.constants.CursorPositionConstant.CursorPosition;
import es.uvigo.esei.amchartsJava.core.constants.OrientationConstant.Orientation;
import es.uvigo.esei.amchartsJava.core.exceptions.ChartException;
import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsJava.core.model.charts.AmRectangularChart;

/**
 * Interface for controller of ChartCursor. Details of ChartCursor and 
 *  their properties in AmCharts API
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
	 * Get adjustment property.
	 * @return Object Value for adjustment is an integer number.
	 */
	abstract Object getAdjustment();

	//no se recomienda cambiar esta propiedad, es la distancia entre el cursor y
	//el mensaje del balloon que aparece
	/**
	 * Set adjustment property.
	 * @param adjustment Value for adjustment.
	 * @throws IntegerException Value for adjustment is not an integer number.
	 */
	abstract void setAdjustment(Number adjustment) throws IntegerException;

	/**
	 * Get animationDuration property.
	 * @return Object Value for animationDuration is a double number.
	 */
	abstract Object getAnimationDuration();

	/**
	 * Set animationDuration property.
	 * @param animationDuration Value for animationDuration.
	 * @throws OutOfRangeException Value out of range admitted: 0.0-1.0.
	 */
	abstract void setAnimationDuration(Number animationDuration)
			throws OutOfRangeException;

	/**
	 * Get avoidBalloonOverlapping property.
	 * @return Boolean Value for avoidBalloonOverlapping.
	 */
	abstract Boolean isAvoidBalloonOverlapping();

	/**
	 * Set avoidBalloonOverlapping property.
	 * @param avoidBalloonOverlapping Enable or disable balloonOverlapping.
	 */
	abstract void setAvoidBalloonOverlapping(Boolean avoidBalloonOverlapping);

	/**
	 * Get balloonPointerOrientation property.
	 * @return String Value for balloonPointerOrientation.
	 */
	abstract String getBalloonPointerOrientation();

	/**
	 * Set balloonPointerOrientation property.
	 * @param balloonPointerOrientation Value for balloonPointerOrientation.
	 */
	abstract void setBalloonPointerOrientation(
			Orientation balloonPointerOrientation);

	/**
	 * Get bulletsEnabled property.
	 * @return Boolean Value for bulletsEnabled.
	 */
	abstract Boolean isBulletsEnabled();

	/**
	 * Set bulletsEnabled property.
	 * @param bulletEnabled Show or don't show bullets.
	 */
	abstract void setBulletsEnabled(Boolean bulletsEnabled);

	/**
	 * Get bulletSize property.
	 * @return Object Value for bulletSize is an integer number.
	 */
	abstract Object getBulletSize();

	/**
	 * Set bulletSize property.With improvedVisibility enabled range activated.
	 * @param bulletSize Value for bulletSize.
	 * @throws OutOfRangeException Value out of range admitted: 8-20.
	 */
	abstract void setBulletSize(Number bulletSize) throws OutOfRangeException;

	/**
	 * Get categoryBalloonAlpha property.
	 * @return Object Value for categoryBalloonAlpha is a double number.
	 */
	abstract Object getCategoryBalloonAlpha();

	/**
	 * Set categoryBalloonAlpha property.
	 * @param categoryBalloonAlpha Value for categoryBalloonAlpha.
	 * @throws OutOrRangeException Value out of range admitted: 0.0-1.0.
	 */
	abstract void setCategoryBalloonAlpha(Number categoryBalloonAlpha)
			throws OutOfRangeException;

	/**
	 * Get categoryBalloonColor property.
	 * @return String Value for categoryBalloonColor.
	 */
	abstract String getCategoryBalloonColor();

	/**
	 * Set categoryBalloon property.
	 * @param categoryBalloonColor Value for categoryBalloonColor.
	 * @throws ColorException Format of color don't admitted, format admitted: #ffffff
	 */
	abstract void setCategoryBalloonColor(String categoryBalloonColor)
			throws ColorException;

	/**
	 * Get categoryBalloonDateFormat property.
	 * @return String Value for categoryBalloonDateFormat.
	 */
	abstract String getCategoryBalloonDateFormat();

	/**
	 * Set categoryBalloonDateFormat property.
	 * @param categoryBalloonDateFormat Value for categoryBalloonDateFormat.
	 * @see DateFormatConstant
	 */
	abstract void setCategoryBalloonDateFormat(String categoryBalloonDateFormat);

	/**
	 * Get categoryBalloonEnabled property.
	 * @return Boolean Value for categoryBalloonEnabled.
	 */
	abstract Boolean isCategoryBalloonEnabled();

	/**
	 * Set categoryBalloonEnabled property.
	 * @param categoryBalloonEnabled Enable or disable categoryBalloon.
	 */
	abstract void setCategoryBalloonEnaled(Boolean categoryBalloonEnabled);

	/**
	 * Get categoryBalloonFunction property.
	 * @return String Value for categoryBalloonFunction.
	 */
	abstract String getCategoryBalloonFunction();

	/**
	 * Set categoryBalloonFunction property.
	 * @param categoryBalloonFunction Value for categoryBalloonFunction.
	 */
	abstract void setCategoryBalloonFunction(String categoryBalloonFunction);
	
	/**
	 * Get categoryBalloonText property.
	 * @return String Value for categoryBalloonText.
	 */
	abstract String getCategoryBalloonText();
	
	/**
	 * Set categoryBalloonText property.
	 * @param categoryBalloonText Value for categoryBalloonText
	 */
	abstract void setCategoryBalloonText(CategoryBalloonText categoryBalloonText);

	/**
	 * Get color property.
	 * @return Value for color.
	 */
	abstract String getColor();

	/**
	 * Set color property.
	 * @param color Value for color.
	 * @throws ColorException Format of color don't admitted, format admitted: #ffffff
	 */
	abstract void setColor(String color) throws ColorException;

	/**
	 * Get cursorAlpha property.
	 * @return Object Value for cursorAlpha is a double number.
	 */
	abstract Object getCursorAlpha();

	/**
	 * Set cursorAlpha property.
	 * @param cursorAlpha Value for cursorAlpha.
	 * @throws OutOfRangeException Value out of range admitted: 0.0-1.0.
	 */
	abstract void setCursorAlpha(Number cursorAlpha) throws OutOfRangeException;

	/**
	 * Get cursorColor property.
	 * @return String Value for cursorColor.
	 */
	abstract String getCursorColor();

	/**
	 * Set cursorColor property.
	 * @param cursorColor Value for cursorColor.
	 * @throws ColorException Format of color don't admitted, format admitted: #ffffff
	 */
	abstract void setCursorColor(String cursorColor) throws ColorException;

	/**
	 * Get cursorPosition property.
	 * @return String Value for cursorPosition.
	 */
	abstract String getCursorPosition();

	/**
	 * Set cursorPosition property.
	 * @param cursorPosition Value for cursorPosition.
	 */
	abstract void setCursorPosition(CursorPosition cursorPosition);

	/**
	 * Get enabled property.
	 * @return Boolean Value for enabled.
	 */
	abstract Boolean isEnabled();

	/**
	 * Set enabled property.
	 * @param enabled Enable or disable chartCursor.
	 */
	abstract void setEnabled(Boolean enabled);

	/**
	 * Get fullWidth property.
	 * @return Boolean Value for fullWidth.
	 */
	abstract Boolean isFullWidth();

	/**
	 * Set fullWidth property.
	 * @param fullWidth Enable or disable fullWidth.
	 */
	abstract void setFullWidth(Boolean fullWidth);

	/**
	 * Get graphBulletAlpha property.
	 * @return graphBulletAlpha Value for graphBulletAlpha is a double number.
	 */
	abstract Object getGraphBulletAlpha();

	/**
	 * Set graphBulletAlpha property.
	 * @param graphBulletAlpha Value for graphBulletAlpha.
	 * @throws OutOfRangeException Value out of range admitted: 0.0-1.0.
	 */
	abstract void setGraphBulletAlpha(Number graphBulletAlpha)
			throws OutOfRangeException;

	/**
	 * Get graphBulletSize property.
	 * @return Object Value for graphBulletSize is an integer number.
	 */
	abstract Object getGraphBulletSize();

	/**
	 * Set graphBulletSize property.
	 * @param graphBulletSize Value for graphBulletSize.
	 * @throws OutOfRangeException Value out of range admitted: 1-20.
	 */
	abstract void setGraphBulletSize(Number graphBulletSize)
			throws OutOfRangeException;

	/**
	 * Get leaveCursor property.
	 * @return Boolean Value for leaveCursor.
	 */
	abstract Boolean isLeaveCursor();

	/**
	 * Set leaveCursor property.
	 * @param leaveCursor Enable or disable leaveCursor.
	 */
	abstract void setLeaveCursor(Boolean leaveCursor);

	/**
	 * Get oneBalloonOnly property.
	 * @return Boolean Value for oneBalloonOnly.
	 */
	abstract Boolean isOneBalloonOnly();

	/**
	 * Set oneBalloonOnly property.
	 * @param oneBalloonOnly Enable or disable oneBalloonOnly.
	 */
	abstract void setOneBalloonOnly(Boolean oneBalloonOnly);

	/**
	 * Get pan property.
	 * @return Boolean Value for pan.
	 */
	abstract Boolean isPan();

	/**
	 * Set pan property.
	 * @param pan Enable or disable pan.
	 */
	abstract void setPan(Boolean pan);

	/**
	 * Get selectionAlpha property.
	 * @return Object Value for selectionAlpha is a double number.
	 */
	abstract Object getSelectionAlpha();

	/**
	 * Set selectionAlpha property.
	 * @param selectionAlpha Value for selectionAlpha
	 * @throws OutOfRangeException Value out of range admitted: 0.0-1.0.
	 */
	abstract void setSelectionAlpha(Number selectionAlpha)
			throws OutOfRangeException;

	/**
	 * Get selectWithoutZooming property.
	 * @return Boolean Value for selectWithoutZooming
	 */
	abstract Boolean isSelectWithoutZooming();

	/**
	 * Set selectWithoutZooming property.
	 * @param selectWithoutZooming Enable or disable select without zooming.
	 */
	abstract void setSelectWithoutZooming(Boolean selectWithoutZooming);

	/**
	 * Get showNextAvailable property.
	 * @return Boolean Value for showNextAvailable.
	 */
	abstract Boolean isShowNextAvailable();

	/**
	 * Set showNextAvailable property.
	 * @param showNextAvailable Show or don't show next available.
	 */
	abstract void setShowNextAvailable(Boolean showNextAvailable);

	/**
	 * Get valueBalloonsEnabled property.
	 * @return Boolean Value for valueBalloonsEnabled.
	 */
	abstract Boolean isValueBalloonsEnabled();

	/**
	 * Set valueBalloonsEnabled property.
	 * @param valueBalloonsEnabled Enable or disable valueBalloons
	 */
	abstract void setValueBalloonsEnabled(Boolean valueBalloonsEnabled);

	/**
	 * Get valueLineAlpha property.
	 * @return Object Value for valueLineAlpha is a double number.
	 */
	abstract Object getValueLineAlpha();

	/**
	 * Set valueLineAlpha property.
	 * @param valueLineAlpha Value for valueLineAlpha.
	 * @throws OutOfRangeException Value out of range admitted: 0.0-1.0.
	 */
	abstract void setValueLineAlpha(Number valueLineAlpha)
			throws OutOfRangeException;

	/**
	 * Get valueLineAxis property.
	 * @return String Value for valueLineAxis.
	 */
	abstract String getValueLineAxis();

	/**
	 * Set valueLineAxis property.
	 * @param valueLineAxis Id of valueAxis that contains values of valueLine used by chartCursor.
	 * @throws ChartException Chart that use chartCursor not contains a valueAxis with id equal to valueLineAxis.
	 */
	abstract void setValueLineAxis(String valueLineAxis) throws ChartException;

	/**
	 * Get valueLineBalloonEnabled property.
	 * @return Boolean Value for valueLineBalloonEnabled.
	 */
	abstract Boolean isValueLineBalloonEnabled();

	/**
	 * Set valueLineBalloonEnabled property.
	 * @param valueLineBalloonEnabled Enable or disable valueLineBalloon.
	 */
	abstract void setValueLineBalloonEnabled(Boolean valueLineBalloonEnabled);

	/**
	 * Get valueLineEnabled property.
	 * @return Boolean Value for valueLineEnabled.
	 */
	abstract Boolean isValueLineEnabled();

	/**
	 * Set valueLineEnabled property.
	 * @param valueLineEnabled Enable or disable valueLine.
	 */
	abstract void setValueLineEnabled(Boolean valueLineEnabled);

	/**
	 * Get zoomable property.
	 * @return Boolean Value for zoomable.
	 */
	abstract Boolean isZoomable();

	/**
	 * Set zoomable property.
	 * @param zoomable Enable or disable zoom.
	 */
	abstract void setZommable(Boolean zoomable);

}