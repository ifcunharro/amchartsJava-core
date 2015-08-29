package es.uvigo.esei.amchartsJava.core.api;

import es.uvigo.esei.amchartsJava.core.constants.CategoryBalloonTextConstant.CategoryBalloonText;
import es.uvigo.esei.amchartsJava.core.constants.CursorPositionConstant.CursorPosition;
import es.uvigo.esei.amchartsJava.core.constants.OrientationConstant.Orientation;
import es.uvigo.esei.amchartsJava.core.exceptions.ChartException;
import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsJava.core.model.charts.AmRectangularChart;

public abstract interface IChartCursorController {

	abstract void setChart(AmRectangularChart c);

	abstract Object getAdjustment();

	//no se recomienda cambiar esta propiedad, es la distancia entre el cursor y
	//el mensaje del balloon que aparece
	abstract void setAdjustment(Number adjustment) throws IntegerException;

	abstract Object getAnimationDuration();

	abstract void setAnimationDuration(Number animationDuration)
			throws OutOfRangeException;

	abstract Boolean isAvoidBalloonOverlapping();

	abstract void setAvoidBalloonOverlapping(Boolean avoidBalloonOverlapping);

	abstract String getBalloonPointerOrientation();

	abstract void setBalloonPointerOrientation(
			Orientation balloonPointerOrientation);

	abstract Boolean isBulletsEnabled();

	abstract void setBulletsEnabled(Boolean bulletsEnabled);

	abstract Object getBulletSize();

	abstract void setBulletSize(Number bulletSize) throws OutOfRangeException;

	abstract Object getCategoryBallonAlpha();

	abstract void setCategoryBalloonAlpha(Number categoryBalloonAlpha)
			throws OutOfRangeException;

	abstract String getCategoryBalloonColor();

	abstract void setCategoryBallonColor(String categoryBalloonColor)
			throws ColorException;

	abstract String getCategoryBalloonDateFormat();

	abstract void setCategoryBalloonDateFormat(String categoryBalloonDateFormat);

	abstract Boolean isCategoryBalloonEnabled();

	abstract void setCategoryBalloonEnaled(Boolean categoryBalloonEnabled);

	abstract String getCategoryBalloonFunction();

	abstract void setCategoryBalloonFunction(String categoryBalloonFunction);
	
	abstract String getCategoryBalloonText();
	
	abstract void setCategoryBalloonText(CategoryBalloonText categoryBalloonText);

	abstract String getColor();

	abstract void setColor(String color) throws ColorException;

	abstract Object getCursorAlpha();

	abstract void setCursorAlpha(Number cursorAlpha) throws OutOfRangeException;

	abstract String getCursorColor();

	abstract void setCursorColor(String cursorColor) throws ColorException;

	abstract String getCursorPosition();

	abstract void setCursorPosition(CursorPosition cursorPosition);

	abstract Boolean isEnabled();

	abstract void setEnabled(Boolean enabled);

	abstract Boolean isFullWidth();

	abstract void setFullWidth(Boolean fullWidth);

	abstract Object getGraphBulletAlpha();

	abstract void setGraphBulletAlpha(Number graphBulletAlpha)
			throws OutOfRangeException;

	abstract Object getGraphBulletSize();

	abstract void setGraphBulletSize(Number graphBulletSize)
			throws OutOfRangeException;

	abstract Boolean isLeaveCursor();

	abstract void setLeaveCursor(Boolean leaveCursor);

	abstract Boolean isOneBalloonOnly();

	abstract void setOneBalloonOnly(Boolean oneBalloonOnly);

	abstract Boolean isPan();

	abstract void setPan(Boolean pan);

	abstract Object getSelectionAlpha();

	abstract void setSelectionAlpha(Number selectionAlpha)
			throws OutOfRangeException;

	abstract Boolean isSelectWithoutZooming();

	abstract void setSelectWithoutZooming(Boolean selectWithoutZooming);

	abstract Boolean isShowNextAvailable();

	abstract void setShowNextAvailable(Boolean showNextAvailable);

	abstract Boolean isValueBalloonsEnabled();

	abstract void setValueBalloonsEnabled(Boolean valueBalloonsEnabled);

	abstract Object getValueLineAlpha();

	abstract void setValueLineAlpha(Number valueLineAlpha)
			throws OutOfRangeException;

	abstract String getValueLineAxis();

	abstract void setValueLineAxis(String valueLineAxis) throws ChartException;

	abstract Boolean isValueLineBalloonEnabled();

	abstract void setValueLineBalloonEnabled(Boolean valueLineBalloonEnabled);

	abstract Boolean isValueLineEnabled();

	abstract void setValueLineEnabled(Boolean valueLineEnabled);

	abstract Boolean isZoomable();

	abstract void setZommable(Boolean zoomable);

}