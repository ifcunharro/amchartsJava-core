package es.uvigo.esei.amchartsJava.core.api;


import es.uvigo.esei.amchartsJava.core.constants.ColorsAmCharts;
import es.uvigo.esei.amchartsJava.core.constants.AxisPositionConstant.Position;
import es.uvigo.esei.amchartsJava.core.controllers.guides.GuideController;
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
			throws IntegerException;

	abstract Object isBoldLabels();

	abstract void setBoldLabels(Boolean boldLabels);

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

	abstract void setFontSize(Number fontSize) throws IntegerException;

	abstract Object getGridAlpha();

	abstract void setGridAlpha(Number gridAlpha) throws OutOfRangeException;

	abstract Object getGridColor();

	abstract void setGridColor(String gridColor) throws ColorException;

	abstract Object getGridCount();

	abstract void setGridCount(Number gridCount) throws IntegerException;

	abstract Object getGridThickness();

	abstract void setGridThikness(Number gridThickness) throws IntegerException;

	abstract Object isIgnoreAxisWidth();

	abstract void setIgnoreAxisWidth(Boolean ignoreAxisWidth);

	abstract Object isInside();

	abstract void setInside(Boolean inside);

	abstract Object getLabelFrequency();

	abstract void setLabelFrequency(Number labelFrequency)
			throws IntegerException;

	abstract Object getLabelOffset();

	abstract void setLabelOffset(Number labelOffset) throws IntegerException;

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

	abstract Object getMinVerticalGap();

	abstract void setMinVerticalGap(Number minVerticalGap);

	abstract Object getOffset();

	abstract void setOffset(Number offset) throws IntegerException;

	abstract Object getPosition();

	abstract void setPosition(Position position);

	abstract Object isShowFirstLabel();

	abstract void setShowFirstLabel(Boolean showFirstLabel);

	abstract Object isShowLastLabel();

	abstract void setShowLastLabel(Boolean showLastLabel);

	abstract Object getTickLength();

	abstract void setTickLength(Number tickLength) throws IntegerException;

	abstract Object getTitle();

	abstract void setTitle(String title);

	abstract Object isTitleBold();

	abstract void setTitleBold(Boolean titleBold);

	abstract Object getTitleColor();

	abstract void setTitleColor(String titleColor) throws ColorException;

	abstract Object getTitleFontSize();

	abstract void setTitleFontSize(Number titleFontSize)
			throws IntegerException;

	abstract void addGuide(GuideController guideController);

	abstract void removeGuide(IGuideController guideController);

}