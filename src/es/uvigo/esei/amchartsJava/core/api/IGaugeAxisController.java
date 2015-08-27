package es.uvigo.esei.amchartsJava.core.api;

import es.uvigo.esei.amchartsJava.core.constants.AxisPositionConstant.Position;
import es.uvigo.esei.amchartsJava.core.controllers.GaugeBandController;
import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.CoordException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;

public interface IGaugeAxisController {

	public Object getAxisAlpha();

	public void setAxisAlpha(Number axisAlpha) throws OutOfRangeException;

	public Object getAxisColor();

	public void setAxisColor(String axisColor) throws ColorException;

	public Object getAxisThickness();

	public void setAxisThickness(Number axisThickness)
			throws OutOfRangeException;

	public Object getBandAlpha();

	public void setBandAlpha(Number bandAlpha) throws OutOfRangeException;

	public Object getBandOutlineAlpha();

	public void setBandOutlineAlpha(Number bandOutlineAlpha)
			throws OutOfRangeException;

	public Object getBandOutlineColor();

	public void setBandOutlineColor(String bandOutlineColor)
			throws ColorException;

	public Object getBandOutlineThickness();

	public void setBandOutlineThickness(Number bandOutlineThickness)
			throws OutOfRangeException;

	public Object getBands();

	public Object getBottomText();

	public void setBottomText(String bottomText);

	public Object isBottomTextBold();

	public void setBottomTextBold(Boolean bottomTextBold);

	public Object getBottomTextColor();

	public void setBottomTextColor(String bottomTextColor)
			throws ColorException;

	public Object getBottomTextFontSize();

	public void setBottomTextFontSize(Number bottomTextFontSize)
			throws OutOfRangeException;

	public Object getBottomTextYOffset();

	public void setBottomTextYOffset(Number bottomTextYOffset)
			throws IntegerException;

	public Object getCenterX();

	public void setCenterX(String centerX) throws CoordException;

	public Object getCenterY();

	public void setCenterY(String centerY) throws CoordException;

	public Object getEndAngle();

	public void setEndAngle(Number endAngle) throws OutOfRangeException;

	public Object getEndValue();

	public void setEndValue(Number endValue) throws IntegerException;

	public Object getGridCount();

	public void setGridCount(Number gridCount) throws OutOfRangeException;

	public Object isGridInside();

	public void setGridInside(Boolean gridInside);

	public Object getId();

	public Object isInside();

	public void setInside(Boolean inside);

	public Object getLabelFrequncy();

	public void setLabelFrequency(Number labelFrequency)
			throws OutOfRangeException;

	public Object getLabelFunction();

	public void setLabelFunction(String labelFunction);

	public Object getLabelOffset();

	public void setLabelOffset(Number labelOffset) throws IntegerException;

	public Object isLabelsEnabled();

	public void setLabelsEnabled(Boolean labelsEnabled);

	public Object getMinorTickInterval();

	public void setMinorTickInterval(Number minorTickInterval)
			throws OutOfRangeException;

	public Object getMinorTickLength();

	public void setMinorTickLength(Number minorTickLength)
			throws OutOfRangeException;

	public Object getRadius();

	public void setRadius(String radius) throws CoordException;

	public Object isShowFirstLabel();

	public void setShowFirstLabel(Boolean showFirstLabel);

	public Object isShowLastLabel();

	public void setShowLastLabel(Boolean showLastLabel);

	public Object getStartAngle();

	public void setStartAngle(Number startAngle) throws OutOfRangeException;

	public Object getStartValue();

	public void setStartValue(Number startValue) throws IntegerException;

	public Object getTickAlpha();

	public void setTickAlpha(Number tickAlpha) throws OutOfRangeException;

	public Object getTickColor();

	public void setTickColor(String tickColor) throws ColorException;

	public Object getTickLength();

	public void setTickLength(Number tickLength) throws OutOfRangeException;

	public Object getTickThickness();

	public void setTickThickness(Number tickThickness)
			throws OutOfRangeException;

	public Object getTopText();

	public void setTopText(String topText);

	public Object isTopTextBold();

	public void setTopTextBold(Boolean topTextBold);

	public Object getTopTextColor();

	public void setTopTextColor(String topTextColor) throws ColorException;

	public Object getTopTextFontSize();

	public void setTopTextFontSize(Number topTextFontSize)
			throws OutOfRangeException;

	public Object getTopTextYOffset();

	public void setTopTextYOffset(Number topTextYOffset)
			throws IntegerException;

	public Object getUnit();

	public void setUnit(String unit);

	public Object getUnitPosition();

	public void setUnitPosition(Position unitPosition);

	public Object isUsePrefixes();

	public void setUsePrefixes(Boolean usePrefixes);

	public Object getValueInterval();

	public void setValueInterval(Number valueInterval);

	public void addBand(GaugeBandController gaugeBandController);

}