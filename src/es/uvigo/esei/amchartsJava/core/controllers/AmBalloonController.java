package es.uvigo.esei.amchartsJava.core.controllers;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import es.uvigo.esei.amchartsJava.core.api.IAmBalloonController;
import es.uvigo.esei.amchartsJava.core.constants.AmchartsConstants;
import es.uvigo.esei.amchartsJava.core.constants.TextAlignConstant.TextAlign;
import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsJava.core.model.AmBalloon;
import es.uvigo.esei.amchartsJava.core.validators.ColorValidator;
import es.uvigo.esei.amchartsJava.core.validators.NumberValidator;

@JsonInclude(Include.NON_NULL)
public class AmBalloonController implements IAmBalloonController, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6979086957398166592L;
	private AmBalloon balloon;
	
	public AmBalloonController(){
		balloon = new AmBalloon();
	}
	
	@JsonProperty(value="adjustColor")
	public Boolean isAdjustColor(){
		return (Boolean)balloon.getFeature("adjustColor");
	}
	
	public void setAdjustColor(Boolean adjustColor){
		balloon.setFeature("adjustColor", adjustColor);
	}
	
	public Object getAnimationDuration(){
		return balloon.getFeature("animationDuration");
	}
	
	public void setAnimationDuration(Number animationDuration) throws OutOfRangeException{
		if(AmchartsConstants.IMPROVED_VISIBILITY.equals("true")){
			if(NumberValidator.rangeDoubleValidator(animationDuration, 0, 2)){
				balloon.setFeature("animationDuration", animationDuration);
			}
		}else{
			balloon.setFeature("animationDuration", animationDuration);
		}
	}
	
	public Object getBorderAlpha(){
		return balloon.getFeature("borderAlpha");
	}
	
	public void setBorderAlpha(Number borderAlpha) throws OutOfRangeException{
		if(NumberValidator.rangeDoubleValidator(borderAlpha, 0, 1)){
			balloon.setFeature("borderAlpha", borderAlpha);
		}
	}
	
	public String getBorderColor(){
		return (String)balloon.getFeature("borderColor");
	}
	
	public void setBorderColor(String borderColor) throws ColorException{
		if(ColorValidator.checkFormatColor(borderColor)){
			balloon.setFeature("borderColor", borderColor);
		}
	}
	
	public Object getBorderThickness(){
		return balloon.getFeature("borderThickness");
	}
	
	public void setBorderThickness(Number borderThickness) throws OutOfRangeException{
		if(AmchartsConstants.IMPROVED_VISIBILITY.equals("true")){
			if(NumberValidator.rangeIntegerValidator(borderThickness, 0, 10)){
				balloon.setFeature("borderThickness", borderThickness);
			}
		}else{
			balloon.setFeature("borderThickness", borderThickness);
		}
	}
	
	public String getColor(){
		return (String)balloon.getFeature("color");
	}
	
	public void setColor(String color) throws ColorException{
		if(ColorValidator.checkFormatColor(color)){
			balloon.setFeature("color", color);
		}
	}
	
	public Object getCornerRadius(){
		return balloon.getFeature("cornerRadius");
	}
	
	public void setCornerRadius(Number cornerRadius) throws OutOfRangeException{
		if(AmchartsConstants.IMPROVED_VISIBILITY.equals("true")){
			if(NumberValidator.rangeIntegerValidator(cornerRadius, 0, 14)){
				balloon.setFeature("cornerRadius", cornerRadius);
			}
		}else{
			balloon.setFeature("cornerRadius", cornerRadius);
		}
	}
	
	
	@JsonProperty(value="disableMouseEvents")
	public Boolean isDisableMouseEvents(){
		return (Boolean)balloon.getFeature("disableMouseEvents");
	}
	
	public void setDisableMouseEvents(Boolean disableMouseEvents){
		balloon.setFeature("disableMouseEvents", disableMouseEvents);
	}
	
	public Object getFadeOutDuration(){
		return balloon.getFeature("fadeOutDuration");
	}
	
	public void setFadeOutDuration(Number fadeOutDuration) throws OutOfRangeException{
		if(AmchartsConstants.IMPROVED_VISIBILITY.equals("true")){
			if(NumberValidator.rangeDoubleValidator(fadeOutDuration, 0, 2)){
				balloon.setFeature("fadeOutDuration", fadeOutDuration);
			}
		}else{
			balloon.setFeature("fadeOutDuration", fadeOutDuration);
		}
	}
	
	public Object getFillAlpha(){
		return balloon.getFeature("fillAlpha");
	}
	
	public void setFillAlpha(Number fillAlpha) throws OutOfRangeException{
		if(NumberValidator.rangeDoubleValidator(fillAlpha, 0, 1)){
			balloon.setFeature("fillAlpha", fillAlpha);
		}
	}
	
	public String getFillColor(){
		return (String)balloon.getFeature("fillColor");
	}
	
	public void setFillColor(String fillColor) throws ColorException{
		if(ColorValidator.checkFormatColor(fillColor)){
			balloon.setFeature("fillColor", fillColor);
		}
	}
	
	@JsonProperty(value="fixedPosition")
	public Boolean isFixedPosition(){
		return (Boolean)balloon.getFeature("fixedPosition");
	}
	
	public void setFixedPosition(Boolean fixedPosition){
		balloon.setFeature("fixedPosition", fixedPosition);
	}
	
	public Object getFontSize(){
		return balloon.getFeature("fontSize");
	}
	
	public void setFontSize(Number fontSize) throws OutOfRangeException{
		if(AmchartsConstants.IMPROVED_VISIBILITY.equals("true")){
			if(NumberValidator.rangeIntegerValidator(fontSize, 10, 16)){
				balloon.setFeature("fontSize", fontSize);
			}
		}else{
			balloon.setFeature("fontSize", fontSize);
		}
	}
	
	public Object getHorizontalPadding(){
		return balloon.getFeature("horizontalPadding");
	}
	
	public void setHorizontalPadding(Number horizontalPadding) throws OutOfRangeException{
		if(AmchartsConstants.IMPROVED_VISIBILITY.equals("true")){
			if(NumberValidator.rangeIntegerValidator(horizontalPadding, 8, 20)){
				balloon.setFeature("horizontalPadding", horizontalPadding);
			}
		}else{
			balloon.setFeature("horizontalPadding", horizontalPadding);
		}
	}
	
	public Object getMaxWidth(){
		return balloon.getFeature("maxWidth");
	}
	
	public void setMaxWidth(Number maxWidth) throws IntegerException{
		if(NumberValidator.integerValidator(maxWidth) && maxWidth.intValue()>0){
			balloon.setFeature("maxWidth", maxWidth);
		}
	}
	
	public Object getOffsetX(){
		return balloon.getFeature("offsetX");
	}
	
	public void setOffsetX(Number offsetX) throws IntegerException{
		if(NumberValidator.integerValidator(offsetX)){
			balloon.setFeature("offsetX", offsetX);
		}
	}
	
	public Object getOffsetY(){
		return balloon.getFeature("offsetY");
	}
	
	public void setOffsetY(Number offsetY) throws IntegerException{
		if(NumberValidator.integerValidator(offsetY)){
			balloon.setFeature("offsetY", offsetY);
		}
	}
	
	public Object getPointerWidth(){
		return balloon.getFeature("pointerWidth");
	}
	
	public void setPointerWidth(Number pointerWidth) throws OutOfRangeException{
		if(AmchartsConstants.IMPROVED_VISIBILITY.equals("true")){
			if(NumberValidator.rangeIntegerValidator(pointerWidth, 0, 36)){
				balloon.setFeature("pointerWidth", pointerWidth);
			}
		}else{
			balloon.setFeature("pointerWidth", pointerWidth);
		}
	}
	
	public Object getShadowAlpha(){
		return balloon.getFeature("shadowAlpha");
	}
	
	public void setShadowAlpha(Number shadowAlpha) throws OutOfRangeException{
		if(NumberValidator.rangeDoubleValidator(shadowAlpha, 0, 1)){
			balloon.setFeature("shadowAlpha", shadowAlpha);
		}
	}
	
	public String getShadowColor(){
		return (String)balloon.getFeature("shadowColor");
	}
	
	public void setShadowColor(String shadowColor) throws ColorException{
		if(ColorValidator.checkFormatColor(shadowColor)){
			balloon.setFeature("shadowColor", shadowColor);
		}
	}
	
	@JsonProperty(value="showBullet")
	public Boolean isShowBullet(){
		return (Boolean)balloon.getFeature("showBullet");
	}
	
	public void setShowBullet(Boolean showBullet){
		balloon.setFeature("showBullet", showBullet);
	}
	
	public String getTextAlign(){
		return (String)balloon.getFeature("textAlign");
	}
	
	public void setTextAlign(TextAlign textAlign){
		balloon.setFeature("textAlign", textAlign.toString());
	}
	
	public Object getVerticalPadding(){
		return balloon.getFeature("verticalPadding");
	}
	
	public void setVerticalPadding(Number verticalPadding) throws OutOfRangeException{
		if(AmchartsConstants.IMPROVED_VISIBILITY.equals("true")){
			if(NumberValidator.rangeIntegerValidator(verticalPadding, 0, 10)){
				balloon.setFeature("verticalPadding", verticalPadding);
			}
		}else{
			balloon.setFeature("verticalPadding", verticalPadding);
		}
	}

}
