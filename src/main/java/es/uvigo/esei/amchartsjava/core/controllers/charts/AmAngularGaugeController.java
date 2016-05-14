package es.uvigo.esei.amchartsjava.core.controllers.charts;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

import es.uvigo.esei.amchartsjava.core.api.charts.IAmAngularGaugeController;
import es.uvigo.esei.amchartsjava.core.constants.AmchartsConstants;
import es.uvigo.esei.amchartsjava.core.constants.ChartType;
import es.uvigo.esei.amchartsjava.core.constants.Effect;
import es.uvigo.esei.amchartsjava.core.constants.lang.I18n;
import es.uvigo.esei.amchartsjava.core.controllers.GaugeArrowController;
import es.uvigo.esei.amchartsjava.core.controllers.GaugeAxisController;
import es.uvigo.esei.amchartsjava.core.controllers.PatternController;
import es.uvigo.esei.amchartsjava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsjava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsjava.core.exceptions.MalFormedPatternException;
import es.uvigo.esei.amchartsjava.core.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsjava.core.model.charts.AmAngularGauge;
import es.uvigo.esei.amchartsjava.core.validators.ColorValidator;
import es.uvigo.esei.amchartsjava.core.validators.NumberValidator;
import es.uvigo.esei.amchartsjava.core.validators.PropertyValidator;

/**
 * This class is a controller for AmAngularGauge.
 * @author Iago Fernández Cuñarro
 *
 */
public class AmAngularGaugeController extends AmChartController<AmAngularGauge> 
		implements IAmAngularGaugeController {

	
	private static final long serialVersionUID = -7923112909942594021L;

	public AmAngularGaugeController() {
		super(new AmAngularGauge());
		//AmAngularGaugeController always type gauge
		setType(ChartType.gauge);
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
	
	//Used to deserialize json
	@JsonSetter
	private void setArrows(List<GaugeArrowController> arrows){
		amchart.setArrows(arrows);
	}
	
	public List<GaugeAxisController> getAxes(){
		return amchart.getAxes();
	}
	
	//Used to deserialize json
	@JsonSetter
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
	
	public Double getFaceAlpha(){
		Object faceAlpha = amchart.getFeature("faceAlpha");
		
		return faceAlpha != null ? ((Number)faceAlpha).doubleValue() : null;
	}
	
	public void setFaceAlpha(Number faceAlpha) throws OutOfRangeException{
		if(NumberValidator.rangeDoubleValidator(faceAlpha, 0, 1)){
			amchart.setFeature("faceAlpha", faceAlpha);
		}
	}
	
	public Double getFaceBorderAlpha(){
		Object faceBorderAlpha = amchart.getFeature("faceBorderAlpha");
		
		return faceBorderAlpha != null ? ((Number)faceBorderAlpha).doubleValue() : null;
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
	
	public Integer getFaceBorderWidth(){
		Object faceBorderWidth = amchart.getFeature("faceBorderWidth");
		
		return faceBorderWidth != null ? ((Number)faceBorderWidth).intValue() : null;
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
		if(PropertyValidator.checkPattern(facePattern)){
			amchart.setFacePattern(facePattern);
		}else{
			throw new MalFormedPatternException(I18n.get("PatternException"));
		}
	}
	
	public Integer getGaugeX(){
		Object gaugeX = amchart.getFeature("gaugeX");
		
		return gaugeX != null ? ((Number)gaugeX).intValue() : null;
	}
	
	public void setGaugeX(Number gaugeX) throws IntegerException{
		if(NumberValidator.integerValidator(gaugeX)){
			amchart.setFeature("gaugeX", gaugeX);
		}
	}
	
	public Integer getGaugeY(){
		Object gaugeY = amchart.getFeature("gaugeY");
		
		return gaugeY != null ? ((Number)gaugeY).intValue() : null;
	}
	
	public void setGaugeY(Number gaugeY) throws IntegerException{
		if(NumberValidator.integerValidator(gaugeY)){
			amchart.setFeature("gaugeY", gaugeY);
		}
	}
	
	public Integer getMarginBottom(){
		Object marginBottom = amchart.getFeature("marginBottom");
		
		return marginBottom != null ? ((Number)marginBottom).intValue() : null;
	}
	
	public void setMarginBottom(Number marginBottom) throws IntegerException{
		if(NumberValidator.integerValidator(marginBottom)){
			amchart.setFeature("marginBottom", marginBottom);
		}
	}
	
	public Integer getMarginLeft(){
		Object marginLeft = amchart.getFeature("marginLeft");
		
		return marginLeft != null ? ((Number)marginLeft).intValue() : null;
	}
	
	public void setMarginLeft(Number marginLeft) throws IntegerException{
		if(NumberValidator.integerValidator(marginLeft)){
			amchart.setFeature("marginLeft", marginLeft);
		}
	}
	
	public Integer getMarginRight(){
		Object marginRight = amchart.getFeature("marginRight");
		
		return marginRight != null ? ((Number)marginRight).intValue() : null;
	}
	
	public void setMarginRight(Number marginRight) throws IntegerException{
		if(NumberValidator.integerValidator(marginRight)){
			amchart.setFeature("marginRight", marginRight);
		}
	}
	
	public Integer getMarginTop(){
		Object marginTop = amchart.getFeature("marginTop");
		
		return marginTop != null ? ((Number)marginTop).intValue() : null;
	}
	
	public void setMarginTop(Number marginTop) throws IntegerException{
		if(NumberValidator.integerValidator(marginTop)){
			amchart.setFeature("marginTop", marginTop);
		}
	}
	
	public Double getMinRadius(){
		Object minRadius = amchart.getFeature("minRadius");
		
		return minRadius != null ? ((Number)minRadius).doubleValue() : null;
	}
	
	public void setMinRadius(Number minRadius){
		if(minRadius != null && minRadius.intValue()>=10){
			amchart.setFeature("minRadius", minRadius);
		}
	}
	
	public Integer getStartDuration(){
		Object startDuration = amchart.getFeature("startDuration");
		
		return startDuration != null ? ((Number)startDuration).intValue() : null;
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
		if(startEffect != null){
			amchart.setFeature("startEffect", startEffect.toString());
		}
	}
	
	public void addArrow(GaugeArrowController arrow){
		if(arrow != null){
			amchart.addArrow(arrow);
		}
	}
	
	public void addAxis(GaugeAxisController axis){
		if(axis != null){
			amchart.addAxis(axis);
		}
	}
	
	public void removeArrow(String idArrow){
		if(PropertyValidator.isValidString(idArrow) && amchart.existArrow(idArrow)){
			amchart.removeArrow(idArrow);
		}
	}
	
	public void removeAxis(String idAxis){
		if(PropertyValidator.isValidString(idAxis) && amchart.existAxis(idAxis)){
			amchart.removeAxis(idAxis);
		}
	}

}
