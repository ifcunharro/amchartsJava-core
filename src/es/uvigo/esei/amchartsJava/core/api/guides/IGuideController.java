package es.uvigo.esei.amchartsJava.core.api.guides;

import java.sql.Date;
import java.util.Observable;


import es.uvigo.esei.amchartsJava.core.constants.PositionConstant.Position;
import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsJava.core.model.charts.AmCoordinateChart;

public abstract interface IGuideController {

	abstract void update(Observable o, Object arg);

	abstract void setChart(AmCoordinateChart c);

	abstract Object isAbove();

	abstract void setAbove(Boolean above);

	abstract Object getBalloonColor();

	abstract void setBalloonColor(String balloonColor) throws ColorException;

	abstract Object getBalloonText();

	abstract void setBalloonText(String balloonText);

	abstract Object isBoldLabel();

	abstract void setBoldLabel(Boolean boldLabel);

	abstract Object getCategory();

	abstract void setCategory(String category);

	abstract Object getColor();

	abstract void setColor(String color) throws ColorException;

	abstract Object getDashLength();

	abstract void setDashLength(Number dashLength) throws IntegerException;

	abstract Object getDate();

	abstract void setDate(Date date);

	abstract Object getFillAlpha();

	abstract void setFillAlpha(Number fillAlpha) throws OutOfRangeException;

	abstract Object getFillColor();

	abstract void setFillColor(String fillColor) throws ColorException;

	abstract Object getFontSize();

	abstract void setFontSize(Number fontSize) throws IntegerException;

	abstract Object getId();

	abstract void removeId();

	abstract Object isInside();

	abstract Object getLabel();

	abstract void setLabel(String label);

	abstract Object getLabelRotation();

	abstract void setLabelRotation(Number labelRotation)
			throws OutOfRangeException;

	abstract Object getLineAlpha();

	abstract void setLineAlpha(Number lineAlpha) throws OutOfRangeException;

	abstract Object getLineColor();

	abstract void setLineColor(String lineColor) throws ColorException;

	abstract Object getLineThickness();

	abstract void setLineThickness(Number lineThickness)
			throws IntegerException;

	abstract Object getPosition();

	abstract void setPosition(Position position);

	abstract Object getTickLength();

	abstract void setTickLength(Number tickLength) throws IntegerException;

	abstract Object getToDate();

	abstract void setToDate(Date toDate);

	abstract Object getValueAxis();

	abstract void setValueAxis(String valueAxis);

}