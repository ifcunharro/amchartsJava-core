package es.uvigo.esei.amchartsJava.core.api;

import java.util.List;

import es.uvigo.esei.amchartsJava.core.constants.AxisPositionConstant.Position;
import es.uvigo.esei.amchartsJava.core.controllers.GaugeBandController;
import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.CoordException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;

public abstract interface IGaugeAxisController {

	abstract Object getAxisAlpha();

	abstract void setAxisAlpha(Number axisAlpha) throws OutOfRangeException;

	abstract String getAxisColor();

	abstract void setAxisColor(String axisColor) throws ColorException;

	abstract Object getAxisThickness();

	abstract void setAxisThickness(Number axisThickness)
			throws OutOfRangeException;

	abstract Object getBandAlpha();

	abstract void setBandAlpha(Number bandAlpha) throws OutOfRangeException;

	abstract Object getBandOutlineAlpha();

	abstract void setBandOutlineAlpha(Number bandOutlineAlpha)
			throws OutOfRangeException;

	abstract String getBandOutlineColor();

	abstract void setBandOutlineColor(String bandOutlineColor)
			throws ColorException;

	abstract Object getBandOutlineThickness();

	abstract void setBandOutlineThickness(Number bandOutlineThickness)
			throws OutOfRangeException;

	abstract List<GaugeBandController> getBands();

	abstract String getBottomText();

	abstract void setBottomText(String bottomText);

	abstract Boolean isBottomTextBold();

	abstract void setBottomTextBold(Boolean bottomTextBold);

	abstract String getBottomTextColor();

	abstract void setBottomTextColor(String bottomTextColor)
			throws ColorException;

	abstract Object getBottomTextFontSize();

	abstract void setBottomTextFontSize(Number bottomTextFontSize)
			throws OutOfRangeException;

	abstract Object getBottomTextYOffset();

	abstract void setBottomTextYOffset(Number bottomTextYOffset)
			throws IntegerException;

	abstract String getCenterX();

	abstract void setCenterX(String centerX) throws CoordException;

	abstract String getCenterY();

	abstract void setCenterY(String centerY) throws CoordException;

	abstract Object getEndAngle();

	abstract void setEndAngle(Number endAngle) throws OutOfRangeException;

	abstract Object getEndValue();

	abstract void setEndValue(Number endValue) throws IntegerException;

	abstract Object getGridCount();

	abstract void setGridCount(Number gridCount) throws OutOfRangeException;

	abstract Boolean isGridInside();

	abstract void setGridInside(Boolean gridInside);

	abstract String getId();

	abstract Boolean isInside();

	abstract void setInside(Boolean inside);

	abstract Object getLabelFrequncy();

	abstract void setLabelFrequency(Number labelFrequency)
			throws OutOfRangeException;

	abstract String getLabelFunction();

	abstract void setLabelFunction(String labelFunction);

	abstract Object getLabelOffset();

	abstract void setLabelOffset(Number labelOffset) throws IntegerException;

	abstract Boolean isLabelsEnabled();

	abstract void setLabelsEnabled(Boolean labelsEnabled);

	abstract Object getMinorTickInterval();

	abstract void setMinorTickInterval(Number minorTickInterval)
			throws OutOfRangeException;

	abstract Object getMinorTickLength();

	abstract void setMinorTickLength(Number minorTickLength)
			throws OutOfRangeException;

	abstract String getRadius();

	abstract void setRadius(String radius) throws CoordException;

	abstract Boolean isShowFirstLabel();

	abstract void setShowFirstLabel(Boolean showFirstLabel);

	abstract Boolean isShowLastLabel();

	abstract void setShowLastLabel(Boolean showLastLabel);

	abstract Object getStartAngle();

	abstract void setStartAngle(Number startAngle) throws OutOfRangeException;

	abstract Object getStartValue();

	abstract void setStartValue(Number startValue) throws IntegerException;

	abstract Object getTickAlpha();

	abstract void setTickAlpha(Number tickAlpha) throws OutOfRangeException;

	abstract String getTickColor();

	abstract void setTickColor(String tickColor) throws ColorException;

	abstract Object getTickLength();

	abstract void setTickLength(Number tickLength) throws OutOfRangeException;

	abstract Object getTickThickness();

	abstract void setTickThickness(Number tickThickness)
			throws OutOfRangeException;

	abstract String getTopText();

	abstract void setTopText(String topText);

	abstract Boolean isTopTextBold();

	abstract void setTopTextBold(Boolean topTextBold);

	abstract String getTopTextColor();

	abstract void setTopTextColor(String topTextColor) throws ColorException;

	abstract Object getTopTextFontSize();

	abstract void setTopTextFontSize(Number topTextFontSize)
			throws OutOfRangeException;

	abstract Object getTopTextYOffset();

	abstract void setTopTextYOffset(Number topTextYOffset)
			throws IntegerException;

	abstract String getUnit();

	abstract void setUnit(String unit);

	abstract String getUnitPosition();

	abstract void setUnitPosition(Position unitPosition);

	abstract Boolean isUsePrefixes();

	abstract void setUsePrefixes(Boolean usePrefixes);

	abstract Object getValueInterval();

	abstract void setValueInterval(Number valueInterval);

	abstract void addBand(GaugeBandController gaugeBandController);

}