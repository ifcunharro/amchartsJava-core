package es.uvigo.esei.amchartsJava.core.controllers;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import es.uvigo.esei.amchartsJava.core.api.IAmBalloonController;
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
	public Object isAdjustColor(){
		return balloon.getFeature("adjustColor");
	}
	
	public void setAdjustColor(Boolean adjustColor){
		balloon.setFeature("adjustColor", adjustColor);
	}
	
	public Object getAnimationDuration(){
		return balloon.getFeature("animationDuration");
	}
	
	public void setAnimationDuration(Number animationDuration) throws OutOfRangeException{
		if(NumberValidator.rangeFloatValidator(animationDuration, 0, 2)){
			balloon.setFeature("animationDuration", animationDuration);
		}
	}
	
	public Object getBorderAlpha(){
		return balloon.getFeature("borderAlpha");
	}
	
	public void setBorderAlpha(Number borderAlpha) throws OutOfRangeException{
		if(NumberValidator.rangeFloatValidator(borderAlpha, 0, 1)){
			balloon.setFeature("borderAlpha", borderAlpha);
		}
	}
	
	public Object getBorderColor(){
		return balloon.getFeature("borderColor");
	}
	
	public void setBorderColor(String borderColor) throws ColorException{
		if(ColorValidator.checkFormatColor(borderColor)){
			balloon.setFeature("borderColor", borderColor);
		}
	}
	
	public Object getBorderThickness(){
		return balloon.getFeature("borderThickness");
	}
	
	public void setBorderThickness(Number borderThickness) throws IntegerException{
		if(NumberValidator.integerValidator(borderThickness)){
			balloon.setFeature("borderThickness", borderThickness);
		}
	}
	
	public Object getColor(){
		return balloon.getFeature("color");
	}
	
	public void setColor(String color) throws ColorException{
		if(ColorValidator.checkFormatColor(color)){
			balloon.setFeature("color", color);
		}
	}
	
	public Object getCornerRadius(){
		return balloon.getFeature("cornerRadius");
	}
	
	public void setCornerRadius(Number cornerRadius) throws IntegerException{
		if(NumberValidator.integerValidator(cornerRadius)){
			balloon.setFeature("cornerRadius", cornerRadius);
		}
	}
	
	public Object getFadeOutDuration(){
		return balloon.getFeature("fadeOutDuration");
	}
	
	public void setFadeOutDuration(Number fadeOutDuration) throws OutOfRangeException{
		if(NumberValidator.rangeFloatValidator(fadeOutDuration, 0, 2)){
			balloon.setFeature("fadeOutDuration", fadeOutDuration);
		}
	}
	
	public Object getFillAlpha(){
		return balloon.getFeature("fillAlpha");
	}
	
	public void setFillAlpha(Number fillAlpha) throws OutOfRangeException{
		if(NumberValidator.rangeFloatValidator(fillAlpha, 0, 1)){
			balloon.setFeature("fillAlpha", fillAlpha);
		}
	}
	
	public Object getFillColor(){
		return balloon.getFeature("fillColor");
	}
	
	public void setFillColor(String fillColor) throws ColorException{
		if(ColorValidator.checkFormatColor(fillColor)){
			balloon.setFeature("fillColor", fillColor);
		}
	}
	
	@JsonProperty(value="fixedPosition")
	public Object isFixedPosition(){
		return balloon.getFeature("fixedPosition");
	}
	
	public void setFixedPosition(Boolean fixedPosition){
		balloon.setFeature("fixedPosition", fixedPosition);
	}
	
	public Object getFontSize(){
		return balloon.getFeature("fontSize");
	}
	
	public void setFontSize(Number fontSize) throws IntegerException{
		if(NumberValidator.integerValidator(fontSize)){
			balloon.setFeature("fontSize", fontSize);
		}
	}
	
	public Object getHorizontalPadding(){
		return balloon.getFeature("horizontalPadding");
	}
	
	public void setHorizontalPaddint(Number horizontalPadding) throws IntegerException{
		if(NumberValidator.integerValidator(horizontalPadding)){
			balloon.setFeature("horizontalPadding", horizontalPadding);
		}
	}
	
	public Object getMaxWidth(){
		return balloon.getFeature("maxWidth");
	}
	
	public void setMaxWidth(Number maxWidth) throws IntegerException{
		if(NumberValidator.integerValidator(maxWidth)){
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
	
	public void setPointerWidth(Number pointerWidth) throws IntegerException{
		if(NumberValidator.integerValidator(pointerWidth)){
			balloon.setFeature("pointerWidth", pointerWidth);
		}
	}
	
	public Object getShadowAlpha(){
		return balloon.getFeature("shadowAlpha");
	}
	
	public void setShadowAlpha(Number shadowAlpha) throws OutOfRangeException{
		if(NumberValidator.rangeFloatValidator(shadowAlpha, 0, 1)){
			balloon.setFeature("shadowAlpha", shadowAlpha);
		}
	}
	
	public Object getShadowColor(){
		return balloon.getFeature("shadowColor");
	}
	
	public void setShadowColor(String shadowColor) throws ColorException{
		if(ColorValidator.checkFormatColor(shadowColor)){
			balloon.setFeature("shadowColor", shadowColor);
		}
	}
	
	@JsonProperty(value="showBullet")
	public Object isShowBullet(){
		return balloon.getFeature("showBullet");
	}
	
	public void setShowBullet(Boolean showBullet){
		balloon.setFeature("showBullet", showBullet);
	}
	
	public Object getTextAlign(){
		return balloon.getFeature("textAlign");
	}
	
	public void setTextAlign(TextAlign textAlign){
		balloon.setFeature("textAlign", textAlign.toString());
	}
	
	public Object getVerticalPadding(){
		return balloon.getFeature("verticalPadding");
	}
	
	public void setVerticalPadding(Number verticalPadding) throws IntegerException{
		if(NumberValidator.integerValidator(verticalPadding)){
			balloon.setFeature("verticalPadding", verticalPadding);
		}
	}

}
