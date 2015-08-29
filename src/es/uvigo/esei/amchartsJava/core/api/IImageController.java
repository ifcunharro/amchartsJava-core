package es.uvigo.esei.amchartsJava.core.api;

import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;

public abstract interface IImageController {

	abstract String getBalloonColor();

	abstract void setBalloonColor(String balloonColor) throws ColorException;

	abstract String getBalloonText();

	abstract void setBalloonText(String balloonText);

	abstract String getColor();

	abstract void setColor(String color) throws ColorException;

	abstract Object getHeight();

	abstract void setHeight(Number height) throws OutOfRangeException;

	abstract Object getOffsetX();

	abstract void setOffsetX(Number offsetX) throws IntegerException;

	abstract Object getOffsetY();

	abstract void setOffsetY(Number offsetY) throws IntegerException;

	abstract String getOutlineColor();

	abstract void setOutlineColor(String outlineColor) throws ColorException;

	abstract Object getRotation();

	abstract void setRotation(Number rotation) throws OutOfRangeException;

	abstract String getUrl();

	//en vez de url, introduce solo nombre imagen con su extensión, la url se completa con
	//IMAGES_PATH definido en AmchartsJavaPaths
	abstract void setUrl(String nameImage);

	abstract Object getWidth();

	abstract void setWidth(Number width) throws OutOfRangeException;

}