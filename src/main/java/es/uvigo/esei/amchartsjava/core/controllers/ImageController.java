package es.uvigo.esei.amchartsjava.core.controllers;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import es.uvigo.esei.amchartsjava.core.api.IImageController;
import es.uvigo.esei.amchartsjava.core.constants.AmchartsConstants;
import es.uvigo.esei.amchartsjava.core.constants.paths.AmchartsJavaPaths;
import es.uvigo.esei.amchartsjava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsjava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsjava.core.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsjava.core.model.Image;
import es.uvigo.esei.amchartsjava.core.validators.ColorValidator;
import es.uvigo.esei.amchartsjava.core.validators.NumberValidator;
import es.uvigo.esei.amchartsjava.core.validators.PathValidator;
import es.uvigo.esei.amchartsjava.core.validators.PropertyValidator;

/**
 * This class is a controller for Image.
 * @author Iago Fernández Cuñarro
 *
 */
@JsonInclude(Include.NON_NULL)
public class ImageController implements Serializable, IImageController {
	

	private static final long serialVersionUID = -9178942548336014702L;
	private Image image;
	
	{
		image = new Image();
	}
	
	public String getBalloonColor(){
		return (String) image.getFeature("balloonColor");
	}
	
	public void setBalloonColor(String balloonColor) throws ColorException{
		if(ColorValidator.checkFormatColor(balloonColor)){
			image.setFeature("balloonColor", balloonColor);
		}
	}
	
	public String getBalloonText(){
		return (String) image.getFeature("balloonText");
	}
	
	public void setBalloonText(String balloonText){
		if(PropertyValidator.isValidString(balloonText)){
			image.setFeature("balloonText", balloonText);
		}
	}
	
	public String getColor(){
		return (String) image.getFeature("color");
	}
	
	public void setColor(String color) throws ColorException{
		if(ColorValidator.checkFormatColor(color)){
			image.setFeature("color", color);
		}
	}
	
	public Integer getHeight(){
		Object height = image.getFeature("height");
		
		return height != null ? ((Number)height).intValue() : null;
	}
	
	public void setHeight(Number height) throws OutOfRangeException{
		if(AmchartsConstants.IMPROVED_VISIBILITY.equals("true")){
			if(NumberValidator.rangeIntegerValidator(height, 20, 50)){
				image.setFeature("height", height);
			}
		}else{
			image.setFeature("height", height);
		}
	}
	
	public Integer getOffsetX(){
		Object offsetX = image.getFeature("offsetX");
		
		return offsetX != null ? ((Number)offsetX).intValue() : null;
	}
	
	public void setOffsetX(Number offsetX) throws IntegerException{
		if(NumberValidator.integerValidator(offsetX)){
			image.setFeature("offsetX", offsetX);
		}
	}
	
	public Integer getOffsetY(){
		Object offsetY = image.getFeature("offsetY");
		
		return offsetY != null ? ((Number)offsetY).intValue() : null;
	}
	
	public void setOffsetY(Number offsetY) throws IntegerException{
		if(NumberValidator.integerValidator(offsetY)){
			image.setFeature("offsetY", offsetY);
		}
	}
	
	public String getOutlineColor(){
		return (String) image.getFeature("outlineColor");
	}
	
	public void setOutlineColor(String outlineColor) throws ColorException{
		if(ColorValidator.checkFormatColor(outlineColor)){
			image.setFeature("outlineColor", outlineColor);
		}
	}
	
	public Integer getRotation(){
		Object rotation = image.getFeature("rotation");
		
		return rotation != null ? ((Number)rotation).intValue() : null;
	}
	
	public void setRotation(Number rotation) throws OutOfRangeException{
		if(NumberValidator.rangeIntegerValidator(rotation, 0, 360)){
			image.setFeature("rotation", rotation);
		}
	}
	
	public String getUrl(){
		return (String) image.getFeature("url");
	}
	
	public void setUrl(String nameImage){
		String nameImageValidated = PathValidator.imageExist(nameImage);
		if(nameImageValidated.length()>0){
			image.setFeature("url", AmchartsJavaPaths.IMAGES_PATH+nameImageValidated);
		}
		
	}
	
	public Integer getWidth(){
		Object width = image.getFeature("width");
		
		return width != null ? ((Number)width).intValue() : null;
	}
	
	public void setWidth(Number width) throws OutOfRangeException{
		if(AmchartsConstants.IMPROVED_VISIBILITY.equals("true")){
			if(NumberValidator.rangeIntegerValidator(width, 20, 50)){
				image.setFeature("width", width);
			}
		}else{
			image.setFeature("width", width);
		}
	}

}
