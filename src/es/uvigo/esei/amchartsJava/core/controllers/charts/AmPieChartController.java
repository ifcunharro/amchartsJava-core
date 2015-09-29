package es.uvigo.esei.amchartsJava.core.controllers.charts;

import com.fasterxml.jackson.annotation.JsonProperty;

import es.uvigo.esei.amchartsJava.core.api.charts.IAmPieChartController;
import es.uvigo.esei.amchartsJava.core.constants.AmchartsConstants;
import es.uvigo.esei.amchartsJava.core.exceptions.CoordException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsJava.core.model.charts.AmSlicedChart;
import es.uvigo.esei.amchartsJava.core.validators.NumberValidator;
import es.uvigo.esei.amchartsJava.core.validators.TypeValidator;

public class AmPieChartController extends AmSlicedChartController<AmSlicedChart> implements IAmPieChartController {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2014181511231582610L;

	public AmPieChartController() {
		super(new AmSlicedChart());
		setType(AmchartsConstants.CHART_TYPES.getPie());
	}
	
	@JsonProperty(value="adjustPrecision")
	public Boolean isAdjustPrecision(){
		return (Boolean) amchart.getFeature("adjustPrecision");
	}
	
	public void setAdjustPrecision(Boolean adjustPrecision){
		amchart.setFeature("adjustPrecision", adjustPrecision);
	}
	
	public Object getAngle(){
		return amchart.getFeature("angle");
	}
	
	public void setAngle(Number angle) throws OutOfRangeException{
		if(NumberValidator.rangeIntegerValidator(angle, 0, 90)){
			amchart.setFeature("angle", angle);
		}
	}
	
	public String getBalloonText(){
		return (String) amchart.getFeature("balloonText");
	}
	
	//formarlo con [[]] y htmltags
	public void setBalloonText(String balloonText){
		amchart.setFeature("balloonText", balloonText);
	}
	
	public Object getDepth3D(){
		return amchart.getFeature("depth3D");
	}
	
	public void setDepth3D(Number depth3D) throws OutOfRangeException{
		if(AmchartsConstants.IMPROVED_VISIBILITY.equals("true")){
			if(NumberValidator.rangeIntegerValidator(depth3D, 0, 50)){
				amchart.setFeature("depth3D", depth3D);
			}
		}else{
			amchart.setFeature("depth3D", depth3D);
		}
	}
	
	public String getInnerRadius(){
		return (String) amchart.getFeature("innerRadius");
	}
	
	public void setInnerRadius(String innerRadius) throws CoordException{
		if(TypeValidator.pixelOrPercent(innerRadius)){
			amchart.setFeature("innerRadius", innerRadius);
		}
	}
	
	public Object getLabelRadius(){
		return amchart.getFeature("labelRadius");
	}
	
	public void setLabelRadius(Number labelRadius) throws OutOfRangeException{
		if(AmchartsConstants.IMPROVED_VISIBILITY.equals("true")){
			if(NumberValidator.rangeIntegerValidator(labelRadius, 0, 40)){
				amchart.setFeature("labelRadius", labelRadius);
			}
		}else{
			amchart.setFeature("labelRadius", labelRadius);
		}
	}
	
	public String getLabelRadiusField(){
		return (String) amchart.getFeature("labelRadiusField");
	}
	
	public void setLabelRadiusField(String labelRadiusField){
		amchart.setFeature("labelRadiusField", labelRadiusField);
		amchart.addField("labelRadiusField",labelRadiusField);
	}
	
	public String getLabelText(){
		return (String) amchart.getFeature("labelText");
	}
	
	public void setLabelText(String labelText){
		amchart.setFeature("labelText", labelText);
	}
	
	public Object getMinRadius(){
		return amchart.getFeature("minRadius");
	}
	
	public void setMinRadius(Number minRadius) throws IntegerException{
		if(NumberValidator.integerValidator(minRadius) && minRadius.intValue()>=10){
			amchart.setFeature("minRadius", minRadius);
		}
	}
	
	public Object getPieAlpha(){
		return amchart.getFeature("pieAlpha");
	}
	
	public void setPieAlpha(Number pieAlpha) throws OutOfRangeException{
		if(NumberValidator.rangeDoubleValidator(pieAlpha, 0, 1)){
			amchart.setFeature("pieAlpha", pieAlpha);
		}
	}
	
	public String getPieX(){
		return (String) amchart.getFeature("pieX");
	}
	
	public void setPieX(String pieX) throws CoordException{
		if(TypeValidator.pixelOrPercent(pieX)){
			amchart.setFeature("pieX", pieX);
		}
	}
	
	public String getPieY(){
		return (String) amchart.getFeature("pieY");
	}
	
	public void setPieY(String pieY) throws CoordException{
		if(TypeValidator.pixelOrPercent(pieY)){
			amchart.setFeature("pieY", pieY);
		}
	}
	
	public String getPullOutRadius(){
		return (String) amchart.getFeature("pullOutRadius");
	}
	
	public void setPullOutRadius(String pullOutRadius) throws CoordException{
		if(TypeValidator.pixelOrPercent(pullOutRadius)){
			amchart.setFeature("pullOutRadius", pullOutRadius);
		}
	}
	
	public String getRadius(){
		return (String) amchart.getFeature("radius");
	}
	
	public void setRadius(String radius) throws CoordException{
		if(TypeValidator.pixelOrPercent(radius)){
			amchart.setFeature("radius", radius);
		}
	}
	
	public Object getStartAngle(){
		return amchart.getFeature("startAngle");
	}
	
	public void setStartAngle(Number startAngle) throws OutOfRangeException{
		if(NumberValidator.rangeIntegerValidator(startAngle, 0, 360)){
			amchart.setFeature("startAngle", startAngle);
		}
	}
	
	public String getStartRadius(){
		return (String) amchart.getFeature("startRadius");
	}
	
	public void setStartRadius(String startRadius) throws CoordException{
		if(TypeValidator.pixelOrPercent(startRadius)){
			amchart.setFeature("startRadius", startRadius);
		}
	}
}
