package es.uvigo.esei.amchartsJava.core.controllers;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonSetter;

import es.uvigo.esei.amchartsJava.core.api.IPatternController;
import es.uvigo.esei.amchartsJava.core.constants.AmchartsConstants;
import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsJava.core.model.Pattern;
import es.uvigo.esei.amchartsJava.core.validators.ColorValidator;
import es.uvigo.esei.amchartsJava.core.validators.NumberValidator;
import es.uvigo.esei.amchartsJava.core.validators.PathValidator;

/**
 * This class is a controller for Pattern. Pattern is a property in amcharts, this controller
 * help to build correctly that property.
 * @author Iago Fernández Cuñarro
 *
 */
@JsonInclude(Include.NON_NULL)
public class PatternController implements IPatternController, Serializable {

	private static final long serialVersionUID = 131484065003455161L;
	private Pattern pattern;
	
	{
		pattern = new Pattern();
	}


	public String getColor() {
		return (String) pattern.getFeature("color");
	}

	
	public void setColor(String color) throws ColorException {
		if(ColorValidator.checkFormatColor(color)){
			pattern.setFeature("color", color);
		}
	}


	public Integer getHeight() {
		Object height = pattern.getFeature("height");
		
		return height != null ? ((Number)height).intValue() : null;
	}

	
	public void setHeight(Number height) throws OutOfRangeException {
		if(AmchartsConstants.IMPROVED_VISIBILITY.equals("true")){
			if(NumberValidator.rangeIntegerValidator(height, 2, 6)){
				pattern.setFeature("height", height);
			}
		}else{
			pattern.setFeature("height", height);
		}
	}

	
	public String getUrl() {
		return (String) pattern.getFeature("url");
	}

	
	//para deserializar json, usar addUrl para asignar una url
	@JsonSetter
	private void setUrl(String url) {
		pattern.setFeature("url", url);
	}
	
	public void addUrl(String directoryPattern, String namePattern){
		String urlPatternValidated = PathValidator.patternExist(directoryPattern, namePattern);
		if(!urlPatternValidated.isEmpty()){
			pattern.setFeature("url", urlPatternValidated);
		}
	}

	public Integer getWidth() {
		Object width = pattern.getFeature("width");
		
		return width != null ? ((Number)width).intValue() : null;
	}

	
	public void setWidth(Number width) throws OutOfRangeException {
		if(AmchartsConstants.IMPROVED_VISIBILITY.equals("true")){
			if(NumberValidator.rangeDoubleValidator(width, 2, 6)){
				pattern.setFeature("width", width);
			}
		}else{
			pattern.setFeature("width", width);
		}
	}

}
