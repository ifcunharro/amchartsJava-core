package es.uvigo.esei.amchartsJava.core.controllers;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsJava.core.model.ChartScrollBar;
import es.uvigo.esei.amchartsJava.core.validators.ColorValidator;
import es.uvigo.esei.amchartsJava.core.validators.NumberValidator;

public class ChartScrollBarController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1262906027402512218L;
	private ChartScrollBar scrollBar;
	
	{
		scrollBar = new ChartScrollBar();
	}
	
	@JsonProperty(value="autoGridCount")
	public Object isAutoGridCount(){
		return scrollBar.getFeature("autoGridCount");
	}
	
	public void setAutoGridCount(Boolean autoGridCount){
		scrollBar.setFeature("autoGridCount", autoGridCount);
	}
	
	public Object getBackgroundAlpha(){
		return scrollBar.getFeature("backgroundColor");
	}
	
	public void setBackgroundAlpha(Number backgroundAlpha) throws OutOfRangeException{
		if(NumberValidator.rangeFloatValidator(backgroundAlpha, 0, 1)){
			scrollBar.setFeature("backgroundAlpha", backgroundAlpha);
		}
	}
	
	public Object getBackgroundColor(){
		return scrollBar.getFeature("backgroundColor");
	}
	
	public void setBackgroundColor(String backgroundColor) throws ColorException{
		if(ColorValidator.checkFormatColor(backgroundColor)){
			scrollBar.setFeature("backgroundColor", backgroundColor);
		}
	}
	
	public Object getColor(){
		return scrollBar.getFeature("color");
	}
	
	public void setColor(String color) throws ColorException{
		if(ColorValidator.checkFormatColor(color)){
			scrollBar.setFeature("color", color);
		}
	}
	
	public Object getDragIcon(){
		return scrollBar.getFeature("dragIcon");
	}
	
	public void setDragIcon(String dragIcon){
		//falta comprobar path imagen, hacerlo sobre amcharts debido a nueva propiedad path
	}

}
