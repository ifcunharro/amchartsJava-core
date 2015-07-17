package es.uvigo.esei.amchartsJava.controllers;

import java.util.Observable;
import java.util.Observer;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import es.uvigo.esei.amchartsJava.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsJava.model.Title;
import es.uvigo.esei.amchartsJava.validators.ColorValidator;
import es.uvigo.esei.amchartsJava.validators.NumberValidator;

@JsonInclude(Include.NON_NULL)
public class TitleController implements Observer {
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
		if(NumberValidator.rangeFloatValidator(alpha, 0, 1)){
			title.setFeature("alpha", alpha);
		}
	}
	
	@JsonProperty
	public Object isBold(){
		return title.getFeature("bold");
	}
	
	public void setBold(Boolean bold){
		title.setFeature("bold", bold);
	}
	
	public Object getColor(){
		return title.getFeature("color");
	}
	
	public void setColor(String color) throws ColorException{
		if(ColorValidator.checkFormatColor(color)){
			title.setFeature("color", color);
		}
	}
	
	public Object getId(){
		return title.getFeature("id"); 
	}
	
	private void setId(String id){
		title.setFeature("id", id);
	}
	
	public Object getSize(){
		return title.getFeature("size");
	}
	
	public void setSize(Number size) throws IntegerException{
		if(NumberValidator.integerValidator(size)){
			title.setFeature("size", size);
		}
	}
	
	public Object getText(){
		return title.getFeature("text");
	}
	
	public void setText(String text){
		title.setFeature("text", text);
	}

	

}
