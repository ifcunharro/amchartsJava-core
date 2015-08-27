package es.uvigo.esei.amchartsJava.core.api;

import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.CoordException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;

public interface IGaugeBandController {

	public Object getAlpha();

	public void setAlpha(Number alpha) throws OutOfRangeException;

	public Object getBalloonText();

	public void setBalloonText(String balloonText);

	public Object getColor();

	public void setColor(String color) throws ColorException;

	public Object getEndValue();

	public void setEndValue(Number endValue);

	public Object getId();

	public Object getInnerRadius();

	public void setInnerRadius(String innerRadius) throws CoordException;

	public Object getRadius();

	public void setRadius(String radius) throws CoordException;

	public Object getStartValue();

	public void setStartValue(Number startValue);

}