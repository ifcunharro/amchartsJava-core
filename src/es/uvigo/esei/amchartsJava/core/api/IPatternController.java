package es.uvigo.esei.amchartsJava.core.api;

import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;

/**
 * 
 * Interface for controller of Pattern.
 *  Amcharts use pattern as property in AmGraph or another objects. PatternController manage
 *  creation of that property.
 *  
 * @author Iago Fernández Cuñarro
 *
 */
public abstract interface IPatternController {
	
	/**
	 * Get color property.
	 * @return String Value for color.
	 */
	abstract String getColor();
	
	/**
	 * Set color property.
	 * @param color Value for color.
	 * @throws ColorException Format color doesn't admitted, format admitted: #ffffff
	 */
	abstract void setColor(String color) throws ColorException;
	
	/**
	 * Get height property.
	 * @return Object Value for height is an integer number.
	 */
	abstract Object getHeight();
	
	/**
	 * Set height property.With improvedVisibility enabled range activated.
	 * @param height Value for height.
	 * @throws OutOfRangeException Value out of range admitted: 2-6.
	 */
	abstract void setHeight(Number height) throws OutOfRangeException;
	
	/**
	 * Get url property.
	 * @return String Value for url.
	 */
	abstract String getUrl();
	
	/**
	 * Add url to pattern.
	 * @param directoryPattern Folder that containt patterns into pattern folde amcharts.
	 * @param namePattern File name of pattern.
	 */
	abstract void addUrl(String directoryPattern, String namePattern);
	
	/**
	 * Get width property.
	 * @return Object Value for width is an integer number.
	 */
	abstract Object getWidth();
	
	/**
	 * Set width property.With improvedVisibility enabled range activated.
	 * @param height Value for width
	 * @throws OutOfRangeException Value out of range admitted: 2-6.
	 */
	abstract void setWidth(Number width) throws OutOfRangeException;
	
}
