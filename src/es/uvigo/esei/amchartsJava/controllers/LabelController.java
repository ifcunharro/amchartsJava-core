package es.uvigo.esei.amchartsJava.controllers;


import java.util.Observable;
import java.util.Observer;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import es.uvigo.esei.amchartsJava.constants.AlignConstant.Align;
import es.uvigo.esei.amchartsJava.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.exceptions.CoordException;
import es.uvigo.esei.amchartsJava.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsJava.model.Label;
import es.uvigo.esei.amchartsJava.validators.ColorValidator;
import es.uvigo.esei.amchartsJava.validators.NumberValidator;
import es.uvigo.esei.amchartsJava.validators.StringValidator;

@JsonInclude(Include.NON_NULL)
public class LabelController implements Observer {
	private Label label;
	
	{
		label = new Label();
		
	}
	
	@Override
	public void update(Observable o, Object arg) {
		this.setId("Label-"+arg.toString());
		
	}
	
	public Object getAlign(){
		return label.getFeature("align");
	}
	//solo left, center o right
	public void setAlign(Align labelAlign){
		label.setFeature("align", labelAlign.toString());
	}

	public Object getAlpha(){
		return label.getFeature("alpha");
	}
	
	public void setAlpha(Number alpha) throws OutOfRangeException{
		if(NumberValidator.rangeFloatValidator(alpha, 0, 1)){
			label.setFeature("alpha", alpha);
		}
	}
	
	@JsonProperty(value = "bold")
	public Object isBold(){
		return label.getFeature("bold");
	}
	
	public void setBold(Boolean bold){
		label.setFeature("bold", bold);
	}
	
	public Object getColor(){
		return label.getFeature("color");
	}
	
	public void setColor(String color) throws ColorException{
		if(ColorValidator.checkFormatColor(color)){
			label.setFeature("color", color);
		}
	}
	
	public Object getId(){
		return label.getFeature("id");
	}
	
	private void setId(String id){
		label.setFeature("id", id);
	}
	
	public Object getRotation(){
		return label.getFeature("rotation");
	}
	
	public void setRotation(Number rotation) throws OutOfRangeException,IntegerException{
		if(NumberValidator.IntegerValidator(rotation) && 
				NumberValidator.rangeIntegerValidator(rotation, -90, 90)){
					label.setFeature("rotation", rotation);
		}
	}
	
	public Object getSize(){
		return label.getFeature("size");
	}
	
	public void setSize(Number size) throws IntegerException{
		if(NumberValidator.IntegerValidator(size)){
			label.setFeature("size", size);
		}
	}
	
	public Object getText(){
		return label.getFeature("text");
	}
	
	public void setText(String text){
		label.setFeature("text", text);
	}
	
	public Object getUrl(){
		return label.getFeature("url");
	}
	
	public void setUrl(String url){
		label.setFeature("url", url);
	}

	public Object getX(){
		return label.getFeature("xCoord");
	}
	
	public void setX(String xCoord) throws CoordException{
		if(StringValidator.coordFormat(xCoord)){
			label.setFeature("x", xCoord);
		}
	}
	
	public Object getY(){
		return label.getFeature("yCoord");
	}
	
	public void setY(String yCoord) throws CoordException{
		if(StringValidator.coordFormat(yCoord)){
			label.setFeature("y", yCoord);
		}
	}
	
	
}
