package es.uvigo.esei.amchartsJava.core.api;


import es.uvigo.esei.amchartsJava.core.constants.AlignConstant.Align;
import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.CoordException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;

public abstract interface ILabelController  {

	abstract Object getAlign();

	abstract void setAlign(Align labelAlign);

	abstract Object getAlpha();

	abstract void setAlpha(Number alpha) throws OutOfRangeException;

	abstract Object isBold();

	abstract void setBold(Boolean bold);

	abstract Object getColor();

	abstract void setColor(String color) throws ColorException;

	abstract Object getId();

	abstract Object getRotation();

	abstract void setRotation(Number rotation) throws OutOfRangeException, IntegerException;

	abstract Object getSize();

	abstract void setSize(Number size) throws OutOfRangeException;

	abstract Object getText();

	abstract void setText(String text);

	abstract Object getUrl();

	abstract void setUrl(String url);

	abstract Object getX();

	abstract void setX(String xCoord) throws CoordException;

	abstract Object getY();

	abstract void setY(String yCoord) throws CoordException;

}