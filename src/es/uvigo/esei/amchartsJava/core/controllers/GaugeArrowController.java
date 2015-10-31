package es.uvigo.esei.amchartsJava.core.controllers;

import java.io.Serializable;
import java.util.Observable;
import java.util.Observer;

import org.apache.log4j.Logger;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import es.uvigo.esei.amchartsJava.core.api.IGaugeArrowController;
import es.uvigo.esei.amchartsJava.core.constants.AmchartsConstants;
import es.uvigo.esei.amchartsJava.core.constants.config.Config;
import es.uvigo.esei.amchartsJava.core.constants.lang.I18n;
import es.uvigo.esei.amchartsJava.core.exceptions.ChartException;
import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.CoordException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsJava.core.model.GaugeArrow;
import es.uvigo.esei.amchartsJava.core.model.charts.AmAngularGauge;
import es.uvigo.esei.amchartsJava.core.validators.ColorValidator;
import es.uvigo.esei.amchartsJava.core.validators.NumberValidator;
import es.uvigo.esei.amchartsJava.core.validators.TypeValidator;

@JsonInclude(Include.NON_NULL)
public class GaugeArrowController implements Serializable,Observer, IGaugeArrowController {

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 963880554698117462L;
	private AmAngularGauge amchart;
	private GaugeArrow gaugeArrow;
	private static final Logger logger = Logger.getLogger(GaugeArrowController.class.getName());

	
	{
		gaugeArrow = new GaugeArrow();
	}

	@Override
	public void update(Observable o, Object arg) {
		this.setId("GaugeArrow-"+arg.toString());	
	}
	
	@JsonIgnore
	public void setChart(AmAngularGauge chart){
		amchart = chart;
	}

	private void setId(String id) {
		gaugeArrow.setFeature("id", id);
	}
	
	public Object getAlpha(){
		return gaugeArrow.getFeature("alpha");
	}
	
	public void setAlpha(Number alpha) throws OutOfRangeException{
		if(NumberValidator.rangeDoubleValidator(alpha, 0, 1)){
			gaugeArrow.setFeature("alpha", alpha);
		}
	}
	
	public String getAxis(){
		return (String) gaugeArrow.getFeature("axis");
	}
	
	public void addAxis(String axis) throws ChartException{
		if(amchart != null){
			if(amchart.existAxis(axis)){
				gaugeArrow.setFeature("axis", axis);
			}
		}else{
			if(Config.getString("log").equals("file")){
				logger.info(getClass().getSimpleName()+I18n.get("ChartException"));
			}
			throw new ChartException(getClass().getSimpleName()+I18n.get("ChartException"));
		}
	}
	
	//this method only use to deserialize json
	@SuppressWarnings("unused")
	private void setAxis(String axis){
		gaugeArrow.setFeature("axis", axis);	
	}
	
	public Object getBorderAlpha(){
		return gaugeArrow.getFeature("borderAlpha");
	}
	
	public void setBorderAlpha(Number borderAlpha) throws OutOfRangeException{
		if(NumberValidator.rangeDoubleValidator(borderAlpha, 0, 1)){
			gaugeArrow.setFeature("borderAlpha", borderAlpha);
		}
	}
	
	@JsonProperty(value="clockWiseOnly")
	public Boolean isClockWiseOnly(){
		return (Boolean) gaugeArrow.getFeature("clockWiseOnly");
	}
	
	public void setClockWiseOnly(Boolean clockWiseOnly){
		gaugeArrow.setFeature("clockWiseOnly", clockWiseOnly);
	}
	
	public String getColor(){
		return (String) gaugeArrow.getFeature("color");
	}
	
	public void setColor(String color) throws ColorException{
		if(ColorValidator.checkFormatColor(color)){
			gaugeArrow.setFeature("color", color);
		}
	}
	
	public String getId(){
		return (String) gaugeArrow.getFeature("id");
	}
	
	public String getInnerRadius(){
		return (String) gaugeArrow.getFeature("innerRadius");
	}
	
	public void setInnerRadius(String innerRadius) throws CoordException{
		if(TypeValidator.pixelOrPercent(innerRadius)){
			gaugeArrow.setFeature("innerRadius", innerRadius);
		}
	}
	
	public Object getNailAlpha(){
		return gaugeArrow.getFeature("nailAlpha");
	}
	
	public void setNailAlpha(Number nailAlpha) throws OutOfRangeException{
		if(NumberValidator.rangeDoubleValidator(nailAlpha, 0, 1)){
			gaugeArrow.setFeature("nailAlpha", nailAlpha);
		}
	}
	
	public Object getNailBorderAlpha(){
		return gaugeArrow.getFeature("nailBorderAlpha");
	}
	
	public void setNailBorderAlpha(Number nailBorderAlpha) throws OutOfRangeException{
		if(NumberValidator.rangeDoubleValidator(nailBorderAlpha, 0, 1)){
			gaugeArrow.setFeature("nailBorderAlpha", nailBorderAlpha);
		}
	}
	
	public Object getNailBorderThickness(){
		return gaugeArrow.getFeature("nailBorderThickness");
	}
	
	public void setNailBorderThickness(Number nailBorderThickness) throws OutOfRangeException{
		if(AmchartsConstants.IMPROVED_VISIBILITY.equals("true")){
			if(NumberValidator.rangeIntegerValidator(nailBorderThickness, 0, 10)){
				gaugeArrow.setFeature("nailBorderThickness", nailBorderThickness);
			}
		}else{
			gaugeArrow.setFeature("nailBorderThickness", nailBorderThickness);
		}
	}
	
	public Object getNailRadius(){
		return gaugeArrow.getFeature("nailRadius");
	}
	
	public void setNailRadius(Number nailRadius) throws OutOfRangeException{
		if(AmchartsConstants.IMPROVED_VISIBILITY.equals("true")){
			if(NumberValidator.rangeIntegerValidator(nailRadius, 0, 15)){
				gaugeArrow.setFeature("nailRadius", nailRadius);
			}
		}else{
			gaugeArrow.setFeature("nailRadius", nailRadius);
		}
	}
	
	public String getRadius(){
		return (String) gaugeArrow.getFeature("radius");
	}
	
	public void setRadius(String radius) throws CoordException{
		if(TypeValidator.pixelOrPercent(radius)){
			if(radius.contains("%") 
					&& Integer.valueOf(radius.substring(0, radius.length()-1))>100){
				gaugeArrow.setFeature("radius", "100%");
			}else{
				gaugeArrow.setFeature("radius", radius);
			}
		}
	}
	
	public Object getStartWidth(){
		return gaugeArrow.getFeature("startWidth");
	}
	
	public void setStartWidth(Number startWidth){
		if(startWidth.intValue()>=5){
			gaugeArrow.setFeature("startWidth", startWidth);
		}
	}
	
	public Object getValue(){
		return gaugeArrow.getFeature("value");
	}
	
	public void setValue(Number value) throws IntegerException{
		if(NumberValidator.integerValidator(value)){
			gaugeArrow.setFeature("value", value);
		}
	}

}
