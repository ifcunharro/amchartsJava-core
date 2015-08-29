package es.uvigo.esei.amchartsJava.core.api;


import es.uvigo.esei.amchartsJava.core.constants.AlignConstant.Align;
import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.CoordException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;

public abstract interface ILabelController  {

	abstract String getAlign();

	abstract void setAlign(Align labelAlign);

	abstract Object getAlpha();

	abstract void setAlpha(Number alpha) throws OutOfRangeException;

	abstract Boolean isBold();

	abstract void setBold(Boolean bold);

	abstract String getColor();

	abstract void setColor(String color) throws ColorException;

	abstract String getId();

	abstract Object getRotation();

	abstract void setRotation(Number rotation) throws OutOfRangeException, IntegerException;

	abstract Object getSize();

	abstract void setSize(Number size) throws OutOfRangeException;

	abstract String getText();

	abstract void setText(String text);

	abstract String getUrl();

	abstract void setUrl(String url);

	abstract String getX();

	abstract void setX(String xCoord) throws CoordException;

	abstract String getY();

	abstract void setY(String yCoord) throws CoordException;

}