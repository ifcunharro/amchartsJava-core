package es.uvigo.esei.amchartsJava.core.api;


import es.uvigo.esei.amchartsJava.core.constants.AlignConstant.Align;
import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.CoordException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;

public interface ILabelController  {

	public Object getAlign();

	//solo left, center o right
	public void setAlign(Align labelAlign);

	public Object getAlpha();

	public void setAlpha(Number alpha) throws OutOfRangeException;

	public Object isBold();

	public void setBold(Boolean bold);

	public Object getColor();

	public void setColor(String color) throws ColorException;

	public Object getId();

	public Object getRotation();

	public void setRotation(Number rotation) throws OutOfRangeException,
			IntegerException;

	public Object getSize();

	public void setSize(Number size) throws OutOfRangeException;

	public Object getText();

	public void setText(String text);

	public Object getUrl();

	public void setUrl(String url);

	public Object getX();

	public void setX(String xCoord) throws CoordException;

	public Object getY();

	public void setY(String yCoord) throws CoordException;

}