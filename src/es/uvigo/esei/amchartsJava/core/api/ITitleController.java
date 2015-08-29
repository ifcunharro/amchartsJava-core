package es.uvigo.esei.amchartsJava.core.api;


import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;

public abstract interface ITitleController {

	abstract Object getAlpha();

	abstract void setAlpha(Number alpha) throws OutOfRangeException;

	abstract Boolean isBold();

	abstract void setBold(Boolean bold);

	abstract String getColor();

	abstract void setColor(String color) throws ColorException;

	abstract String getId();

	abstract Object getSize();

	abstract void setSize(Number size) throws OutOfRangeException;

	abstract String getText();

	abstract void setText(String text);

}