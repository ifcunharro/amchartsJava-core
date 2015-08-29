package es.uvigo.esei.amchartsJava.core.api;

import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;

public abstract interface IPatternController {
	
	abstract String getColor();
	
	abstract void setColor(String color) throws ColorException;
	
	abstract Object getHeight();
	
	abstract void setHeight(Number height) throws OutOfRangeException;
	
	abstract String getUrl();
	
	abstract void addUrl(String directoryPattern, String namePattern);
	
	abstract Object getWidth();
	
	abstract void setWidth(Number height) throws OutOfRangeException;
	
}
