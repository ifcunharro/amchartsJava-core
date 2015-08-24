package es.uvigo.esei.amchartsJava.core.api;

import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;

public interface IPatternController {
	
	public Object getColor();
	
	public void setColor(String color) throws ColorException;
	
	public Object getHeight();
	
	public void setHeight(Number height) throws OutOfRangeException;
	
	public Object getUrl();
	
	public void setUrl(String url);
	
	public Object getWidth();
	
	public void setWidth(Number height) throws OutOfRangeException;
	
}
