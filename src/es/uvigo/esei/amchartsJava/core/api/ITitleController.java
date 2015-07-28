package es.uvigo.esei.amchartsJava.core.api;


import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;

public interface ITitleController {

	public Object getAlpha();

	public void setAlpha(Number alpha) throws OutOfRangeException;

	public Object isBold();

	public void setBold(Boolean bold);

	public Object getColor();

	public void setColor(String color) throws ColorException;

	public Object getId();

	public Object getSize();

	public void setSize(Number size) throws OutOfRangeException;

	public Object getText();

	public void setText(String text);

}