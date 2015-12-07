package es.uvigo.esei.amchartsJava.core.controllers;

import java.io.Serializable;
import java.util.Observable;
import java.util.Observer;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import es.uvigo.esei.amchartsJava.core.api.IGaugeBandController;
import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.CoordException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsJava.core.model.GaugeBand;
import es.uvigo.esei.amchartsJava.core.validators.ColorValidator;
import es.uvigo.esei.amchartsJava.core.validators.NumberValidator;
import es.uvigo.esei.amchartsJava.core.validators.TypeValidator;

@JsonInclude(Include.NON_NULL)
public class GaugeBandController implements Serializable, Observer, IGaugeBandController {
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1728461584920562660L;
	private GaugeBand gaugeBand;

	{
		gaugeBand = new GaugeBand();
	}
	
	//Set id from chart
	@Override
	public void update(Observable o, Object arg) {
		this.setId("GaugeBand-"+arg.toString());
	}
	
	private void setId(String id) {
		gaugeBand.setFeature("id", id);
	}

	public Double getAlpha(){
		Object alpha = gaugeBand.getFeature("alpha");
		
		return alpha != null ? ((Number)alpha).doubleValue() : null;
	}
	
	public void setAlpha(Number alpha) throws OutOfRangeException{
		if(NumberValidator.rangeDoubleValidator(alpha, 0, 1)){
			gaugeBand.setFeature("alpha", alpha);
		}
	}
	
	public String getBalloonText(){
		return (String) gaugeBand.getFeature("balloonText");
	}
	
	public void setBalloonText(String balloonText){
		gaugeBand.setFeature("balloonText", balloonText);
	}
	
	public String getColor(){
		return (String) gaugeBand.getFeature("color");
	}
	
	public void setColor(String color) throws ColorException{
		if(ColorValidator.checkFormatColor(color)){
			gaugeBand.setFeature("color", color);
		}
	}
	
	public Double getEndValue(){
		Object endValue =  gaugeBand.getFeature("endValue");
		
		return endValue != null ? ((Number)endValue).doubleValue() : null;
	}
	
	public void setEndValue(Number endValue){
		if(endValue.intValue()>0){
			gaugeBand.setFeature("endValue", endValue);
		}
	}
	
	public String getId(){
		return (String) gaugeBand.getFeature("id");
	}
	
	public String getInnerRadius(){
		return (String) gaugeBand.getFeature("innerRadius");
	}
	
	public void setInnerRadius(String innerRadius) throws CoordException{
		if(TypeValidator.pixelOrPercent(innerRadius)){
			gaugeBand.setFeature("innerRadius", innerRadius);
		}
	}
	
	public String getRadius(){
		return (String) gaugeBand.getFeature("radius");
	}
	
	public void setRadius(String radius) throws CoordException{
		if(TypeValidator.pixelOrPercent(radius)){
			gaugeBand.setFeature("radius", radius);
		}
	}
	
	public Double getStartValue(){
		Object startValue = gaugeBand.getFeature("startValue");
		
		return startValue != null ? ((Number)startValue).doubleValue() : null;
	}
	
	public void setStartValue(Number startValue){
		if(startValue.intValue()>0){
			gaugeBand.setFeature("startValue", startValue);
		}
	}
	
}
