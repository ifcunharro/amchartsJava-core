package es.uvigo.esei.amchartsJava.core.controllers.charts;

import java.util.List;

import org.apache.log4j.Logger;

import com.fasterxml.jackson.annotation.JsonProperty;

import es.uvigo.esei.amchartsJava.core.api.charts.IAmAngularGaugeController;
import es.uvigo.esei.amchartsJava.core.constants.AmchartsConstants;
import es.uvigo.esei.amchartsJava.core.constants.Config;
import es.uvigo.esei.amchartsJava.core.constants.EffectConstant.Effect;
import es.uvigo.esei.amchartsJava.core.constants.lang.I18n;
import es.uvigo.esei.amchartsJava.core.controllers.GaugeArrowController;
import es.uvigo.esei.amchartsJava.core.controllers.GaugeAxisController;
import es.uvigo.esei.amchartsJava.core.controllers.PatternController;
import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.MalFormedPatternException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsJava.core.model.charts.AmAngularGauge;
import es.uvigo.esei.amchartsJava.core.validators.ColorValidator;
import es.uvigo.esei.amchartsJava.core.validators.NumberValidator;
import es.uvigo.esei.amchartsJava.core.validators.TypeValidator;

public class AmAngularGaugeController extends AmChartController<AmAngularGauge> 
		implements IAmAngularGaugeController {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7923112909942594021L;
	private static final Logger logger = Logger.getLogger(AmAngularGaugeController.class.getName());


	public AmAngularGaugeController() {
		super(new AmAngularGauge());
	}
	
	@JsonProperty(value="adjustSize")
	public Boolean isAdjustSize(){
		return (Boolean) amchart.getFeature("adjustSize");
	}
	
	public void setAdjustSize(Boolean adjustSize){
		amchart.setFeature("adjustSize", adjustSize);
	}
	
	public List<GaugeArrowController> getArrows(){
		return amchart.getArrows();
	}
	
	@SuppressWarnings("unused")
	private void setArrows(List<GaugeArrowController> arrows){
		amchart.setArrows(arrows);
	}
	
	public List<GaugeAxisController> getAxes(){
		return amchart.getAxes();
	}
	
	@SuppressWarnings("unused")
	private void setAxes(List<GaugeAxisController> axes){
		amchart.setAxes(axes);
	}
	
	@JsonProperty(value="clockWiseOnly")
	public Boolean isClockWiseOnly(){
		return (Boolean) amchart.getFeature("clockWiseOnly");
	}
	
	public void setClockWiseOnly(Boolean clockWiseOnly){
		amchart.setFeature("clockWiseOnly", clockWiseOnly);
	}
	
	public Object getFaceAlpha(){
		return amchart.getFeature("faceAlpha");
	}
	
	public void setFaceAlpha(Number faceAlpha) throws OutOfRangeException{
		if(NumberValidator.rangeDoubleValidator(faceAlpha, 0, 1)){
			amchart.setFeature("faceAlpha", faceAlpha);
		}
	}
	
	public Object getFaceBorderAlpha(){
		return amchart.getFeature("faceBorderAlpha");
	}
	
	public void setFaceBorderAlpha(Number faceBorderAlpha) throws OutOfRangeException{
		if(NumberValidator.rangeDoubleValidator(faceBorderAlpha, 0, 1)){
			amchart.setFeature("faceBorderAlpha", faceBorderAlpha);
		}
	}
	
	public String getFaceBorderColor(){
		return (String) amchart.getFeature("faceBorderColor");
	}
	
	public void setFaceBorderColor(String faceBorderColor) throws ColorException{
		if(ColorValidator.checkFormatColor(faceBorderColor)){
			amchart.setFeature("faceBorderColor", faceBorderColor);
		}
	}
	
	public Object getFaceBorderWidth(){
		return amchart.getFeature("faceBorderWidth");
	}
	
	public void setFaceBorderWidth(Number faceBorderWidth) throws OutOfRangeException{
		if(AmchartsConstants.IMPROVED_VISIBILITY.equals("true")){
			if(NumberValidator.rangeIntegerValidator(faceBorderWidth, 0, 5)){
				amchart.setFeature("faceBorderWidth", faceBorderWidth);
			}
		}else{
			amchart.setFeature("faceBorderWidth", faceBorderWidth);
		}
	}
	
	public String getFaceColor(){
		return (String) amchart.getFeature("faceColor");
	}
	
	public void setFaceColor(String faceColor) throws ColorException{
		if(ColorValidator.checkFormatColor(faceColor)){
			amchart.setFeature("faceColor", faceColor);
		}
	}
	
	public PatternController getFacePattern(){
		return amchart.getFacePattern();
	}
	
	public void setFacePattern(PatternController facePattern) throws MalFormedPatternException{
		if(TypeValidator.checkPattern(facePattern)){
			amchart.setFacePattern(facePattern);
		}else{
			if(Config.getString("log").equals("file")){
				logger.info(I18n.get("PatternException"));
			}
			throw new MalFormedPatternException(I18n.get("PatternException"));
		}
	}
	
	public Object getGaugeX(){
		return amchart.getFeature("gaugeX");
	}
	
	public void setGaugeX(Number gaugeX) throws IntegerException{
		if(NumberValidator.integerValidator(gaugeX)){
			amchart.setFeature("gaugeX", gaugeX);
		}
	}
	
	public Object getGaugeY(){
		return amchart.getFeature("gaugeY");
	}
	
	public void setGaugeY(Number gaugeY) throws IntegerException{
		if(NumberValidator.integerValidator(gaugeY)){
			amchart.setFeature("gaugeY", gaugeY);
		}
	}
	
	public Object getMarginBottom(){
		return amchart.getFeature("marginBottom");
	}
	
	public void setMarginBottom(Number marginBottom) throws IntegerException{
		if(NumberValidator.integerValidator(marginBottom)){
			amchart.setFeature("marginBottom", marginBottom);
		}
	}
	
	public Object getMarginLeft(){
		return amchart.getFeature("marginLeft");
	}
	
	public void setMarginLeft(Number marginLeft) throws IntegerException{
		if(NumberValidator.integerValidator(marginLeft)){
			amchart.setFeature("marginLeft", marginLeft);
		}
	}
	
	public Object getMarginRight(){
		return amchart.getFeature("marginRight");
	}
	
	public void setMarginRight(Number marginRight) throws IntegerException{
		if(NumberValidator.integerValidator(marginRight)){
			amchart.setFeature("marginRight", marginRight);
		}
	}
	
	public Object getMarginTop(){
		return amchart.getFeature("marginTop");
	}
	
	public void setMarginTop(Number marginTop) throws IntegerException{
		if(NumberValidator.integerValidator(marginTop)){
			amchart.setFeature("marginTop", marginTop);
		}
	}
	
	public Object getMinRadius(){
		return amchart.getFeature("minRadius");
	}
	
	public void setMinRadius(Number minRadius){
		if(minRadius.intValue()>=10){
			amchart.setFeature("minRadius", minRadius);
		}
	}
	
	public Object getStartDuration(){
		return amchart.getFeature("startDuration");
	}
	
	public void setStartDuration(Number startDuration) throws OutOfRangeException{
		if(AmchartsConstants.IMPROVED_VISIBILITY.equals("true")){
			if(NumberValidator.rangeIntegerValidator(startDuration, 0, 10)){
				amchart.setFeature("startDuration", startDuration);
			}
		}else{
			amchart.setFeature("startDuration", startDuration);
		}
	}
	
	public String getStartEffect(){
		return (String) amchart.getFeature("startEffect");
	}
	
	public void setStartEffect(Effect startEffect){
		amchart.setFeature("startEffect", startEffect.toString());
	}
	
	public void addArrow(GaugeArrowController arrow){
		amchart.addArrow(arrow);
	}
	
	public void addAxis(GaugeAxisController axis){
		amchart.addAxis(axis);
	}
	
	public void removeArrow(String idArrow){
		if(amchart.existArrow(idArrow)){
			amchart.removeArrow(idArrow);
		}
	}
	
	public void removeAxis(String idAxis){
		if(amchart.existAxis(idAxis)){
			amchart.removeAxis(idAxis);
		}
	}
}
