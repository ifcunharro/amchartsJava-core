package es.uvigo.esei.amchartsJava.core.api.guides;

import java.sql.Date;

import es.uvigo.esei.amchartsJava.core.constants.PositionConstant.Position;
import es.uvigo.esei.amchartsJava.core.exceptions.ChartException;
import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsJava.core.model.charts.AmCoordinateChart;

public abstract interface IGuideController {

	abstract void setChart(AmCoordinateChart c);

	abstract Boolean isAbove();

	abstract void setAbove(Boolean above);

	abstract String getBalloonColor();

	abstract void setBalloonColor(String balloonColor) throws ColorException;

	abstract String getBalloonText();

	abstract void setBalloonText(String balloonText);

	abstract Boolean isBoldLabel();

	abstract void setBoldLabel(Boolean boldLabel);

	abstract String getColor();

	abstract void setColor(String color) throws ColorException;

	abstract Object getDashLength();

	abstract void setDashLength(Number dashLength) throws OutOfRangeException;

	abstract Object getFillAlpha();

	abstract void setFillAlpha(Number fillAlpha) throws OutOfRangeException;

	abstract String getFillColor();

	abstract void setFillColor(String fillColor) throws ColorException;

	abstract Object getFontSize();

	abstract void setFontSize(Number fontSize) throws OutOfRangeException;

	abstract String getId();

	abstract Boolean isInside();

	abstract String getLabel();

	abstract void setLabel(String label);

	abstract Object getLabelRotation();

	abstract void setLabelRotation(Number labelRotation)
			throws OutOfRangeException;

	abstract Object getLineAlpha();

	abstract void setLineAlpha(Number lineAlpha) throws OutOfRangeException;

	abstract String getLineColor();

	abstract void setLineColor(String lineColor) throws ColorException;

	abstract Object getLineThickness();

	abstract void setLineThickness(Number lineThickness)
			throws OutOfRangeException;

	abstract String getPosition();

	abstract void setPosition(Position position);

	abstract Object getTickLength();

	abstract void setTickLength(Number tickLength) throws OutOfRangeException;

	abstract String getToDate();

	abstract void setToDate(Date toDate);

	abstract String getValueAxis();

	abstract void setValueAxis(String valueAxis) throws ChartException;

}