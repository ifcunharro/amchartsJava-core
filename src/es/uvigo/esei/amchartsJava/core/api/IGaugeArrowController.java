package es.uvigo.esei.amchartsJava.core.api;

import es.uvigo.esei.amchartsJava.core.exceptions.ChartException;
import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.CoordException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsJava.core.model.charts.AmAngularGauge;

public abstract interface IGaugeArrowController {

	abstract void setChart(AmAngularGauge chart);

	abstract Object getAlpha();

	abstract void setAlpha(Number alpha) throws OutOfRangeException;

	abstract String getAxis();

	abstract void addAxis(String axis) throws ChartException;

	abstract Object getBorderAlpha();

	abstract void setBorderAlpha(Number borderAlpha) throws OutOfRangeException;

	abstract Boolean isClockWiseOnly();

	abstract void setClockWiseOnly(Boolean clockWiseOnly);

	abstract String getColor();

	abstract void setColor(String color) throws ColorException;

	abstract String getId();

	abstract String getInnerRadius();

	abstract void setInnerRadius(String innerRadius) throws CoordException;

	abstract Object getNailAlpha();

	abstract void setNailAlpha(Number nailAlpha) throws OutOfRangeException;

	abstract Object getNailBorderAlpha();

	abstract void setNailBorderAlpha(Number nailBorderAlpha)
			throws OutOfRangeException;

	abstract Object getNailBorderThickness();

	abstract void setNailBorderThickness(Number nailBorderThickness)
			throws OutOfRangeException;

	abstract Object getNailRadius();

	abstract void setNailRadius(Number nailRadius) throws OutOfRangeException;

	abstract String getRadius();

	abstract void setRadius(String radius) throws CoordException;

	abstract Object getStartWidth();

	abstract void setStartWidth(Number startWidth);

	abstract Object getValue();

	abstract void setValue(Number value) throws IntegerException;

}