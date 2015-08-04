package es.uvigo.esei.amchartsJava.core.api;

import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;

public interface IImageController {

	public Object getBalloonColor();

	public void setBalloonColor(String balloonColor) throws ColorException;

	public Object getBalloonText();

	public void setBalloonText(String balloonText);

	public Object getColor();

	public void setColor(String color) throws ColorException;

	public Object getHeight();

	public void setHeight(Number height) throws OutOfRangeException;

	public Object getOffsetX();

	public void setOffsetX(Number offsetX) throws IntegerException;

	public Object getOffsetY();

	public void setOffsetY(Number offsetY) throws IntegerException;

	public Object getOutlineColor();

	public void setOutlineColor(String outlineColor) throws ColorException;

	public Object getRotation();

	public void setRotation(Number rotation) throws OutOfRangeException;

	public Object getUrl();

	//en vez de url, introduce solo nombre imagen con su extensión, la url se completa con
	//IMAGES_PATH definido en AmchartsJavaPaths
	public void setUrl(String nameImage);

	public Object getWidth();

	public void setWidth(Number width) throws OutOfRangeException;

}