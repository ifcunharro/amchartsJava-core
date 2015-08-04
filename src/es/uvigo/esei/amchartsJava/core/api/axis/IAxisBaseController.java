package es.uvigo.esei.amchartsJava.core.api.axis;


import es.uvigo.esei.amchartsJava.core.constants.ColorsAmCharts;
import es.uvigo.esei.amchartsJava.core.constants.AxisPositionConstant.Position;
import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;

public abstract interface IAxisBaseController {

	abstract Object isAutoGridCount();

	abstract void setAutoGridCount(Boolean autoGridCount);

	abstract Object getAxisAlpha();

	abstract void setAxisAlpha(Number axisAlpha) throws OutOfRangeException;

	abstract Object getAxisColor();

	abstract void setAxisColor(String axisColor) throws ColorException;

	abstract Object getAxisThickness();

	abstract void setAxisThickness(Number axisThickness)
			throws OutOfRangeException;

	abstract Object isBoldLabels();

	abstract void setBoldLabels(Boolean boldLabels);
	
	abstract Object isCenterLabels();
	
	abstract void setCenterLabels(Boolean centerLabels);

	abstract Object getColor();

	abstract void setColor(ColorsAmCharts color);

	abstract Object getDashLength();

	abstract void setDashLength(Number dashLength) throws OutOfRangeException;

	abstract Object getDateFormats();

	abstract Object getFillAlpha();

	abstract void setFillAlpha(Number fillAlpha) throws OutOfRangeException;

	abstract Object getFillColor();

	abstract void setFillColor(String fillColor) throws ColorException;

	abstract Object getFontSize();

	abstract void setFontSize(Number fontSize) throws OutOfRangeException;

	abstract Object getGridAlpha();

	abstract void setGridAlpha(Number gridAlpha) throws OutOfRangeException;

	abstract Object getGridColor();

	abstract void setGridColor(String gridColor) throws ColorException;

	abstract Object getGridCount();

	abstract void setGridCount(Number gridCount) throws OutOfRangeException;

	abstract Object getGridThickness();

	abstract void setGridThikness(Number gridThickness) throws OutOfRangeException;

	abstract Object isIgnoreAxisWidth();

	abstract void setIgnoreAxisWidth(Boolean ignoreAxisWidth);

	abstract Object isInside();

	abstract void setInside(Boolean inside);

	abstract Object getLabelFrequency();

	abstract void setLabelFrequency(Number labelFrequency)
			throws OutOfRangeException;

	abstract Object getLabelOffset();

	abstract void setLabelOffset(Number labelOffset) throws OutOfRangeException;

	abstract Object getLabelRotation();

	abstract void setLabelRotation(Number labelRotation)
			throws OutOfRangeException;

	abstract Object isLabelsEnabled();

	abstract void setLabelsEnabled(Boolean labelsEnabled);

	abstract Object getMinHorizontalGap();

	abstract void setMinHorizontalGap(Number minHorizontalGap)
			throws IntegerException;

	abstract Object getMinorGridAlpha();

	abstract void setMinorGridAlpha(Number minorGridAlpha)
			throws OutOfRangeException;

	abstract Object isMinorGridEnabled();

	abstract void setMinorGridEnabled(Boolean minorGridEnabled);
	
	abstract Object getMinorTickLength();
	
	abstract void setMinorTickLength(Number minorTickLength) 
			throws OutOfRangeException;

	abstract Object getMinVerticalGap();

	abstract void setMinVerticalGap(Number minVerticalGap);

	abstract Object getOffset();

	abstract void setOffset(Number offset) throws OutOfRangeException;

	abstract Object getPosition();

	abstract void setPosition(Position position);

	abstract Object isShowFirstLabel();

	abstract void setShowFirstLabel(Boolean showFirstLabel);

	abstract Object isShowLastLabel();

	abstract void setShowLastLabel(Boolean showLastLabel);

	abstract Object getTickLength();

	abstract void setTickLength(Number tickLength) throws OutOfRangeException;

	abstract Object getTitle();

	abstract void setTitle(String title);

	abstract Object isTitleBold();

	abstract void setTitleBold(Boolean titleBold);

	abstract Object getTitleColor();

	abstract void setTitleColor(String titleColor) throws ColorException;

	abstract Object getTitleFontSize();

	abstract void setTitleFontSize(Number titleFontSize)
			throws OutOfRangeException;
	
	abstract Object getTitleRotation();
	
	abstract void setTitleRotation(Number titleRotation) throws OutOfRangeException;

}