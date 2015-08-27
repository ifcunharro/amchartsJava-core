package es.uvigo.esei.amchartsJava.core.api;

import es.uvigo.esei.amchartsJava.core.exceptions.ChartException;
import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.CoordException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsJava.core.model.charts.AmAngularGauge;

public interface IGaugeArrowController {

	public void setChart(AmAngularGauge chart);

	public Object getAlpha();

	public void setAlpha(Number alpha) throws OutOfRangeException;

	public Object getAxis();

	public void setAxis(String axis) throws ChartException;

	public Object getBorderAlpha();

	public void setBorderAlpha(Number borderAlpha) throws OutOfRangeException;

	public Object isClockWiseOnly();

	public void setClockWiseOnly(Boolean clockWiseOnly);

	public Object getColor();

	public void setColor(String color) throws ColorException;

	public Object getId();

	public Object getInnerRadius();

	public void setInnerRadius(String innerRadius) throws CoordException;

	public Object getNailAlpha();

	public void setNailAlpha(Number nailAlpha) throws OutOfRangeException;

	public Object getNailBorderAlpha();

	public void setNailBorderAlpha(Number nailBorderAlpha)
			throws OutOfRangeException;

	public Object getNailBorderThickness();

	public void setNailBorderThickness(Number nailBorderThickness)
			throws OutOfRangeException;

	public Object getNailRadius();

	public void setNailRadius(Number nailRadius) throws OutOfRangeException;

	public Object getRadius();

	public void setRadius(String radius) throws CoordException;

	public Object getStartWidth();

	public void setStartWidth(Number startWidth);

	public Object getValue();

	public void setValue(Number value) throws IntegerException;

}