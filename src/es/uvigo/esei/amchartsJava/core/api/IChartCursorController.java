package es.uvigo.esei.amchartsJava.core.api;

import es.uvigo.esei.amchartsJava.core.constants.CategoryBalloonTextConstant.CategoryBalloonText;
import es.uvigo.esei.amchartsJava.core.constants.CursorPositionConstant.CursorPosition;
import es.uvigo.esei.amchartsJava.core.constants.OrientationConstant.Orientation;
import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsJava.core.model.charts.AmRectangularChart;

public interface IChartCursorController {

	public void setChart(AmRectangularChart c);

	public Object getAdjustment();

	//no se recomienda cambiar esta propiedad, es la distancia entre el cursor y
	//el mensaje del balloon que aparece
	public void setAdjustment(Number adjustment) throws IntegerException;

	public Object getAnimationDuration();

	public void setAnimationDuration(Number animationDuration)
			throws OutOfRangeException;

	public Object isAvoidBalloonOverlapping();

	public void setAvoidBalloonOverlapping(Boolean avoidBalloonOverlapping);

	public Object getBalloonPointerOrientation();

	public void setBalloonPointerOrientation(
			Orientation balloonPointerOrientation);

	public Object isBulletsEnabled();

	public void setBulletsEnabled(Boolean bulletsEnabled);

	public Object getBulletSize();

	public void setBulletSize(Number bulletSize) throws OutOfRangeException;

	public Object getCategoryBallonAlpha();

	public void setCategoryBalloonAlpha(Number categoryBalloonAlpha)
			throws OutOfRangeException;

	public Object getCategoryBalloonColor();

	public void setCategoryBallonColor(String categoryBalloonColor)
			throws ColorException;

	public Object getCategoryBalloonDateFormat();

	public void setCategoryBalloonDateFormat(String categoryBalloonDateFormat);

	public Object isCategoryBalloonEnabled();

	public void setCategoryBalloonEnaled(Boolean categoryBalloonEnabled);

	public Object getCategoryBalloonFunction();

	public void setCategoryBalloonFunction(String categoryBalloonFunction);
	
	public Object getCategoryBalloonText();
	
	public void setCategoryBalloonText(CategoryBalloonText categoryBalloonText);

	public Object getColor();

	public void setColor(String color) throws ColorException;

	public Object getCursorAlpha();

	public void setCursorAlpha(Number cursorAlpha) throws OutOfRangeException;

	public Object getCursorColor();

	public void setCursorColor(String cursorColor) throws ColorException;

	public Object getCursorPosition();

	public void setCursorPosition(CursorPosition cursorPosition);

	public Object isEnabled();

	public void setEnabled(Boolean enabled);

	public Object isFullWidth();

	public void setFullWidth(Boolean fullWidth);

	public Object getGraphBulletAlpha();

	public void setGraphBulletAlpha(Number graphBulletAlpha)
			throws OutOfRangeException;

	public Object getGraphBulletSize();

	public void setGraphBulletSize(Number graphBulletSize)
			throws OutOfRangeException;

	public Object isLeaveCursor();

	public void setLeaveCursor(Boolean leaveCursor);

	public Object isOneBalloonOnly();

	public void setOneBalloonOnly(Boolean oneBalloonOnly);

	public Object isPan();

	public void setPan(Boolean pan);

	public Object getSelectionAlpha();

	public void setSelectionAlpha(Number selectionAlpha)
			throws OutOfRangeException;

	public Object isSelectWithoutZooming();

	public void setSelectWithoutZooming(Boolean selectWithoutZooming);

	public Object isShowNextAvailable();

	public void setShowNextAvailable(Boolean showNextAvailable);

	public Object isValueBalloonsEnabled();

	public void setValueBalloonsEnabled(Boolean valueBalloonsEnabled);

	public Object getValueLineAlpha();

	public void setValueLineAlpha(Number valueLineAlpha)
			throws OutOfRangeException;

	public Object getValueLineAxis();

	public void setValueLineAxis(String valueLineAxis);

	public Object isValueLineBalloonEnabled();

	public void setValueLineBalloonEnabled(Boolean valueLineBalloonEnabled);

	public Object isValueLineEnabled();

	public void setValueLineEnabled(Boolean valueLineEnabled);

	public Object isZoomable();

	public void setZommable(Boolean zoomable);

}