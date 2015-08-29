package es.uvigo.esei.amchartsJava.core.api;

import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.CoordException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;

public abstract interface IGaugeBandController {

	abstract Object getAlpha();

	abstract void setAlpha(Number alpha) throws OutOfRangeException;

	abstract String getBalloonText();

	abstract void setBalloonText(String balloonText);

	abstract String getColor();

	abstract void setColor(String color) throws ColorException;

	abstract Object getEndValue();

	abstract void setEndValue(Number endValue);

	abstract String getId();

	abstract String getInnerRadius();

	abstract void setInnerRadius(String innerRadius) throws CoordException;

	abstract String getRadius();

	abstract void setRadius(String radius) throws CoordException;

	abstract Object getStartValue();

	abstract void setStartValue(Number startValue);

}