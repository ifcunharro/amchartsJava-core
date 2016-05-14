package es.uvigo.esei.amchartsjava.core.controllers;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import es.uvigo.esei.amchartsjava.core.api.IAmBalloonController;
import es.uvigo.esei.amchartsjava.core.constants.AmchartsConstants;
import es.uvigo.esei.amchartsjava.core.constants.TextAlign;
import es.uvigo.esei.amchartsjava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsjava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsjava.core.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsjava.core.model.AmBalloon;
import es.uvigo.esei.amchartsjava.core.validators.ColorValidator;
import es.uvigo.esei.amchartsjava.core.validators.NumberValidator;

/**
 * This class is a controller for AmBalloon.
 * @author Iago Fernández Cuñarro
 *
 */
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
	
	@JsonProperty(value="adjustBorderColor")
	public Boolean isAdjustBorderColor(){
		return (Boolean)balloon.getFeature("adjustBorderColor");
	}
	
	public void setAdjustBorderColor(Boolean adjustBorderColor){
		balloon.setFeature("adjustBorderColor", adjustBorderColor);
	}
	
	public Double getAnimationDuration(){
		Object animationDuration = balloon.getFeature("animationDuration");
		
		return animationDuration != null ? ((Number)animationDuration).doubleValue() : null;
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
	
	public Double getBorderAlpha(){
		Object borderAlpha = balloon.getFeature("borderAlpha");
		
		return borderAlpha != null ? ((Number)borderAlpha).doubleValue() : null;
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
	
	public Integer getBorderThickness(){
		Object borderThickness = balloon.getFeature("borderThickness");
		
		return borderThickness != null ? ((Number)borderThickness).intValue() : null;
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
	
	public Integer getCornerRadius(){
		Object cornerRadius = balloon.getFeature("cornerRadius");
		
		return cornerRadius != null ? ((Number)cornerRadius).intValue() : null;
		
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
	
	public Double getFadeOutDuration(){
		Object fadeOutDuration = balloon.getFeature("fadeOutDuration");
		
		return fadeOutDuration != null ? ((Number)fadeOutDuration).doubleValue() : null;
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
	
	public Double getFillAlpha(){
		Object fillAlpha = balloon.getFeature("fillAlpha");
		
		return fillAlpha != null ? ((Number)fillAlpha).doubleValue() : null;
		
		
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
	
	public Integer getFontSize(){
		Object fontSize = balloon.getFeature("fontSize");
		
		return fontSize != null ? ((Number)fontSize).intValue() : null;
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
	
	public Integer getHorizontalPadding(){
		Object horizontalPadding = balloon.getFeature("horizontalPadding");
		
		return horizontalPadding != null ? ((Number)horizontalPadding).intValue() : null;
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
	
	public Integer getMaxWidth(){
		Object maxWidth = balloon.getFeature("maxWidth");
		
		return maxWidth != null ? ((Number)maxWidth).intValue() : null;
	}
	
	public void setMaxWidth(Number maxWidth) throws IntegerException{
		if(NumberValidator.integerValidator(maxWidth) && maxWidth.intValue()>0){
			balloon.setFeature("maxWidth", maxWidth);
		}
	}
	
	public Integer getOffsetX(){
		Object offsetX = balloon.getFeature("offsetX");
		
		return offsetX != null ? ((Number)balloon.getFeature("offsetX")).intValue() : null;
	}
	
	public void setOffsetX(Number offsetX) throws IntegerException{
		if(NumberValidator.integerValidator(offsetX)){
			balloon.setFeature("offsetX", offsetX);
		}
	}
	
	public Integer getOffsetY(){
		Object offsetY = balloon.getFeature("offsetY");
		
		return offsetY != null ? ((Number)offsetY).intValue() : null;
	}
	
	public void setOffsetY(Number offsetY) throws IntegerException{
		if(NumberValidator.integerValidator(offsetY)){
			balloon.setFeature("offsetY", offsetY);
		}
	}
	
	public Integer getPointerWidth(){
		Object pointerWidth = balloon.getFeature("pointerWidth");
		
		return pointerWidth != null ? ((Number)pointerWidth).intValue() : null;
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
	
	public Double getShadowAlpha(){
		Object shadowAlpha = balloon.getFeature("shadowAlpha");
		
		return shadowAlpha != null ? ((Number)shadowAlpha).doubleValue() : null;
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
		if(textAlign != null){
			balloon.setFeature("textAlign", textAlign.toString());
		}
	}
	
	public Integer getVerticalPadding(){
		Object verticalPadding = balloon.getFeature("verticalPadding");
		
		return verticalPadding != null ? ((Number)verticalPadding).intValue() : null;
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
