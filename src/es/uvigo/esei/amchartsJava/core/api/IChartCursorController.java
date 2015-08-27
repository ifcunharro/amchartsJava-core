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

	abstract Object isAvoidBalloonOverlapping();

	abstract void setAvoidBalloonOverlapping(Boolean avoidBalloonOverlapping);

	abstract Object getBalloonPointerOrientation();

	abstract void setBalloonPointerOrientation(
			Orientation balloonPointerOrientation);

	abstract Object isBulletsEnabled();

	abstract void setBulletsEnabled(Boolean bulletsEnabled);

	abstract Object getBulletSize();

	abstract void setBulletSize(Number bulletSize) throws OutOfRangeException;

	abstract Object getCategoryBallonAlpha();

	abstract void setCategoryBalloonAlpha(Number categoryBalloonAlpha)
			throws OutOfRangeException;

	abstract Object getCategoryBalloonColor();

	abstract void setCategoryBallonColor(String categoryBalloonColor)
			throws ColorException;

	abstract Object getCategoryBalloonDateFormat();

	abstract void setCategoryBalloonDateFormat(String categoryBalloonDateFormat);

	abstract Object isCategoryBalloonEnabled();

	abstract void setCategoryBalloonEnaled(Boolean categoryBalloonEnabled);

	abstract Object getCategoryBalloonFunction();

	abstract void setCategoryBalloonFunction(String categoryBalloonFunction);
	
	abstract Object getCategoryBalloonText();
	
	abstract void setCategoryBalloonText(CategoryBalloonText categoryBalloonText);

	abstract Object getColor();

	abstract void setColor(String color) throws ColorException;

	abstract Object getCursorAlpha();

	abstract void setCursorAlpha(Number cursorAlpha) throws OutOfRangeException;

	abstract Object getCursorColor();

	abstract void setCursorColor(String cursorColor) throws ColorException;

	abstract Object getCursorPosition();

	abstract void setCursorPosition(CursorPosition cursorPosition);

	abstract Object isEnabled();

	abstract void setEnabled(Boolean enabled);

	abstract Object isFullWidth();

	abstract void setFullWidth(Boolean fullWidth);

	abstract Object getGraphBulletAlpha();

	abstract void setGraphBulletAlpha(Number graphBulletAlpha)
			throws OutOfRangeException;

	abstract Object getGraphBulletSize();

	abstract void setGraphBulletSize(Number graphBulletSize)
			throws OutOfRangeException;

	abstract Object isLeaveCursor();

	abstract void setLeaveCursor(Boolean leaveCursor);

	abstract Object isOneBalloonOnly();

	abstract void setOneBalloonOnly(Boolean oneBalloonOnly);

	abstract Object isPan();

	abstract void setPan(Boolean pan);

	abstract Object getSelectionAlpha();

	abstract void setSelectionAlpha(Number selectionAlpha)
			throws OutOfRangeException;

	abstract Object isSelectWithoutZooming();

	abstract void setSelectWithoutZooming(Boolean selectWithoutZooming);

	abstract Object isShowNextAvailable();

	abstract void setShowNextAvailable(Boolean showNextAvailable);

	abstract Object isValueBalloonsEnabled();

	abstract void setValueBalloonsEnabled(Boolean valueBalloonsEnabled);

	abstract Object getValueLineAlpha();

	abstract void setValueLineAlpha(Number valueLineAlpha)
			throws OutOfRangeException;

	abstract Object getValueLineAxis();

	abstract void setValueLineAxis(String valueLineAxis) throws ChartException;

	abstract Object isValueLineBalloonEnabled();

	abstract void setValueLineBalloonEnabled(Boolean valueLineBalloonEnabled);

	abstract Object isValueLineEnabled();

	abstract void setValueLineEnabled(Boolean valueLineEnabled);

	abstract Object isZoomable();

	abstract void setZommable(Boolean zoomable);

}