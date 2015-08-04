package es.uvigo.esei.amchartsJava.core.controllers;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import es.uvigo.esei.amchartsJava.core.api.IImageController;
import es.uvigo.esei.amchartsJava.core.constants.paths.AmchartsJavaPaths;
import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsJava.core.model.Image;
import es.uvigo.esei.amchartsJava.core.validators.ColorValidator;
import es.uvigo.esei.amchartsJava.core.validators.NumberValidator;
import es.uvigo.esei.amchartsJava.core.validators.StringValidator;

@JsonInclude(Include.NON_NULL)
public class ImageController implements Serializable, IImageController {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -9178942548336014702L;
	private Image image;
	
	{
		image = new Image();
	}
	
	public Object getBalloonColor(){
		return image.getFeature("balloonColor");
	}
	
	public void setBalloonColor(String balloonColor) throws ColorException{
		if(ColorValidator.checkFormatColor(balloonColor)){
			image.setFeature("balloonColor", balloonColor);
		}
	}
	
	public Object getBalloonText(){
		return image.getFeature("balloonText");
	}
	
	public void setBalloonText(String balloonText){
		image.setFeature("balloonText", balloonText);
	}
	
	public Object getColor(){
		return image.getFeature("color");
	}
	
	public void setColor(String color) throws ColorException{
		if(ColorValidator.checkFormatColor(color)){
			image.setFeature("color", color);
		}
	}
	
	public Object getHeight(){
		return image.getFeature("height");
	}
	
	public void setHeight(Number height) throws OutOfRangeException{
		if(NumberValidator.rangeIntegerValidator(height, 20, 50)){
			image.setFeature("height", height);
		}
	}
	
	public Object getOffsetX(){
		return image.getFeature("offsetX");
	}
	
	public void setOffsetX(Number offsetX) throws IntegerException{
		if(NumberValidator.integerValidator(offsetX)){
			image.setFeature("offsetX", offsetX);
		}
	}
	
	public Object getOffsetY(){
		return image.getFeature("offsetY");
	}
	
	public void setOffsetY(Number offsetY) throws IntegerException{
		if(NumberValidator.integerValidator(offsetY)){
			image.setFeature("offsetY", offsetY);
		}
	}
	
	public Object getOutlineColor(){
		return image.getFeature("outlineColor");
	}
	
	public void setOutlineColor(String outlineColor) throws ColorException{
		if(ColorValidator.checkFormatColor(outlineColor)){
			image.setFeature("outlineColor", outlineColor);
		}
	}
	
	public Object getRotation(){
		return image.getFeature("rotation");
	}
	
	public void setRotation(Number rotation) throws OutOfRangeException{
		if(NumberValidator.rangeIntegerValidator(rotation, 0, 360)){
			image.setFeature("rotation", rotation);
		}
	}
	
	//svgPath
	
	public Object getUrl(){
		return image.getFeature("url");
	}
	
	//en vez de url, introduce solo nombre imagen con su extensión, la url se completa con
	//IMAGES_PATH definido en AmchartsJavaPaths
	public void setUrl(String nameImage){
		if(StringValidator.imageExist(AmchartsJavaPaths.IMAGES_PATH+nameImage)){
			image.setFeature("url", AmchartsJavaPaths.IMAGES_PATH+nameImage);
		}
		
	}
	
	public Object getWidth(){
		return image.getFeature("width");
	}
	
	public void setWidth(Number width) throws OutOfRangeException{
		if(NumberValidator.rangeIntegerValidator(width, 20, 50)){
			image.setFeature("width", width);
		}
	}

}
