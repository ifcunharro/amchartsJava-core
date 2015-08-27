package es.uvigo.esei.amchartsJava.core.controllers;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import es.uvigo.esei.amchartsJava.core.api.IPatternController;
import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsJava.core.model.Pattern;
import es.uvigo.esei.amchartsJava.core.validators.ColorValidator;
import es.uvigo.esei.amchartsJava.core.validators.NumberValidator;
import es.uvigo.esei.amchartsJava.core.validators.PathValidator;

@JsonInclude(Include.NON_NULL)
public class PatternController implements IPatternController, Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 131484065003455161L;
	private Pattern pattern;
	
	{
		pattern = new Pattern();
	}


	public Object getColor() {
		return pattern.getFeature("color");
	}

	
	public void setColor(String color) throws ColorException {
		if(ColorValidator.checkFormatColor(color)){
			pattern.setFeature("color", color);
		}
	}


	public Object getHeight() {
		return pattern.getFeature("height");
	}

	
	public void setHeight(Number height) throws OutOfRangeException {
		if(NumberValidator.rangeIntegerValidator(height, 2, 6)){
			pattern.setFeature("height", height);
		}
	}

	
	public Object getUrl() {
		return pattern.getFeature("url");
	}

	
	//para deserializar json, usar addUrl para asignar una url
	public void setUrl(String url) {
		pattern.setFeature("url", url);
	}
	
	public void addUrl(String directoryPattern, String namePattern){
		String urlPatternValidated = PathValidator.patternExist(directoryPattern, namePattern);
		if(!urlPatternValidated.isEmpty()){
			pattern.setFeature("url", urlPatternValidated);
		}
	}

	public Object getWidth() {
		return pattern.getFeature("width");
	}

	
	public void setWidth(Number width) throws OutOfRangeException {
		if(NumberValidator.rangeDoubleValidator(width, 2, 6)){
			pattern.setFeature("width", width);
		}
	}

}
