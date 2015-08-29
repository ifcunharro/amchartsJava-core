package es.uvigo.esei.amchartsJava.core.controllers;

import java.io.Serializable;
import java.util.Observable;
import java.util.Observer;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import es.uvigo.esei.amchartsJava.core.api.ITitleController;
import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsJava.core.model.Title;
import es.uvigo.esei.amchartsJava.core.validators.ColorValidator;
import es.uvigo.esei.amchartsJava.core.validators.NumberValidator;

@JsonInclude(Include.NON_NULL)
public class TitleController implements Observer, ITitleController, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5506347353388319114L;
	private Title title;
	
	{
		title = new Title();
	}
	
	
	@Override
	public void update(Observable o, Object arg) {
		this.setId("Title-"+arg.toString());
	}
	
	public Object getAlpha(){
		return title.getFeature("alpha");
	}
	
	public void setAlpha(Number alpha) throws OutOfRangeException{
		if(NumberValidator.rangeDoubleValidator(alpha, 0, 1)){
			title.setFeature("alpha", alpha);
		}
	}
	
	@JsonProperty
	public Boolean isBold(){
		return (Boolean) title.getFeature("bold");
	}
	
	public void setBold(Boolean bold){
		title.setFeature("bold", bold);
	}
	
	public String getColor(){
		return (String) title.getFeature("color");
	}
	
	public void setColor(String color) throws ColorException{
		if(ColorValidator.checkFormatColor(color)){
			title.setFeature("color", color);
		}
	}
	
	public String getId(){
		return (String)title.getFeature("id"); 
	}
	
	private void setId(String id){
		title.setFeature("id", id);
	}
	
	public Object getSize(){
		return title.getFeature("size");
	}
	
	public void setSize(Number size) throws OutOfRangeException{
		if(NumberValidator.rangeIntegerValidator(size, 8, 36)){
			title.setFeature("size", size);
		}
	}
	
	public String getText(){
		return (String) title.getFeature("text");
	}
	
	public void setText(String text){
		title.setFeature("text", text);
	}

	

}
