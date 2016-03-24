package es.uvigo.esei.amchartsJava.core.controllers;

import java.io.Serializable;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import es.uvigo.esei.amchartsJava.core.api.IGaugeAxisController;
import es.uvigo.esei.amchartsJava.core.constants.AmchartsConstants;
import es.uvigo.esei.amchartsJava.core.constants.Position;
import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.CoordException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsJava.core.model.GaugeAxis;
import es.uvigo.esei.amchartsJava.core.validators.ColorValidator;
import es.uvigo.esei.amchartsJava.core.validators.NumberValidator;
import es.uvigo.esei.amchartsJava.core.validators.PropertyValidator;

/**
 * This class is a controller for GaugeAxis.
 * @author Iago Fernández Cuñarro
 *
 */
@JsonInclude(Include.NON_NULL)
public class GaugeAxisController 
		implements Serializable, Observer, IGaugeAxisController{

	private static final long serialVersionUID = 1432463462678411858L;
	private GaugeAxis gaugeAxis;

	
	{
		gaugeAxis = new GaugeAxis();
	}
	
	//Set id from chart
	@Override
	public void update(Observable o, Object arg) {
		this.setId("GaugeAxis-"+arg.toString());	
	}
	
	private void setId(String id) {
		gaugeAxis.setFeature("id", id);
	}
	
	public Double getAxisAlpha(){
		Object axisAlpha = gaugeAxis.getFeature("axisAlpha");
		
		return axisAlpha != null ? ((Number)axisAlpha).doubleValue() : null;
	}
	
	public void setAxisAlpha(Number axisAlpha) throws OutOfRangeException{
		if(NumberValidator.rangeDoubleValidator(axisAlpha, 0, 1)){
			gaugeAxis.setFeature("axisAlpha", axisAlpha);
		}
	}
	
	public String getAxisColor(){
		return (String) gaugeAxis.getFeature("axisColor");
	}
	
	public void setAxisColor(String axisColor) throws ColorException{
		if(ColorValidator.checkFormatColor(axisColor)){
			gaugeAxis.setFeature("axisColor", axisColor);
		}
	}
	
	public Integer getAxisThickness(){
		Object axisThickness = gaugeAxis.getFeature("axisThickness");
		
		return axisThickness != null ? ((Number)axisThickness).intValue() : null;
	}
	
	public void setAxisThickness(Number axisThickness) throws OutOfRangeException{
		if(AmchartsConstants.IMPROVED_VISIBILITY.equals("true")){
			if(NumberValidator.rangeIntegerValidator(axisThickness, 0, 5)){
				gaugeAxis.setFeature("axisThickness", axisThickness);
			}
		}else{
			gaugeAxis.setFeature("axisThickness", axisThickness);
		}
	}
	
	public Double getBandAlpha(){
		Object bandAlpha = gaugeAxis.getFeature("bandAlpha");
		
		return bandAlpha != null ? ((Number)bandAlpha).doubleValue() : null;
	}
	
	public void setBandAlpha(Number bandAlpha) throws OutOfRangeException{
		if(NumberValidator.rangeDoubleValidator(bandAlpha, 0, 1)){
			gaugeAxis.setFeature("bandAlpha", bandAlpha);
		}
	}
	
	public Double getBandOutlineAlpha(){
		Object bandOulineAlpha = gaugeAxis.getFeature("bandOutlineAlpha");
		
		return bandOulineAlpha != null ? ((Number)bandOulineAlpha).doubleValue() : null;
	}
	
	public void setBandOutlineAlpha(Number bandOutlineAlpha) throws OutOfRangeException{
		if(NumberValidator.rangeDoubleValidator(bandOutlineAlpha, 0, 1)){
			gaugeAxis.setFeature("bandOutlineAlpha", bandOutlineAlpha);
		}
	}
	
	public String getBandOutlineColor(){
		return (String) gaugeAxis.getFeature("bandOutlineColor");
	}
	
	public void setBandOutlineColor(String bandOutlineColor) throws ColorException{
		if(ColorValidator.checkFormatColor(bandOutlineColor)){
			gaugeAxis.setFeature("bandOutlineColor", bandOutlineColor);
		}
	}
	
	public Integer getBandOutlineThickness(){
		Object bandOutlineThickness = gaugeAxis.getFeature("bandOutlineThickness");
		
		return bandOutlineThickness != null ? ((Number)bandOutlineThickness).intValue() : null;
	}
	
	public void setBandOutlineThickness(Number bandOutlineThickness) throws OutOfRangeException{
		if(AmchartsConstants.IMPROVED_VISIBILITY.equals("true")){
			if(NumberValidator.rangeIntegerValidator(bandOutlineThickness, 0, 10)){
				gaugeAxis.setFeature("bandOutlineThickness", bandOutlineThickness);
			}
		}else{
			gaugeAxis.setFeature("bandOutlineThickness", bandOutlineThickness);
		}
	}
	
	public List<GaugeBandController> getBands(){
		return gaugeAxis.getBands();
	}
	
	//Used to desearialize json
	@JsonSetter(value="bands")
	private void setBands(List<GaugeBandController> gaugeBands){
		gaugeAxis.setBands(gaugeBands);
	}
	
	public String getBottomText(){
		return (String) gaugeAxis.getFeature("bottomText");
	}
	
	public void setBottomText(String bottomText){
		if(PropertyValidator.isValidString(bottomText)){
			gaugeAxis.setFeature("bottomText", bottomText);
		}
	}
	
	@JsonProperty(value="bottomTextBold")
	public Boolean isBottomTextBold(){
		return (Boolean) gaugeAxis.getFeature("bottomTextBold");
	}
	
	public void setBottomTextBold(Boolean bottomTextBold){
		gaugeAxis.setFeature("bottomTextBold", bottomTextBold);
	}
	
	public String getBottomTextColor(){
		return (String) gaugeAxis.getFeature("bottomTextColor");
	}
	
	public void setBottomTextColor(String bottomTextColor) throws ColorException{
		if(ColorValidator.checkFormatColor(bottomTextColor)){
			gaugeAxis.setFeature("bottomTextColor", bottomTextColor);
		}
	}
	
	public Integer getBottomTextFontSize(){
		Object bottomTextFontSize = gaugeAxis.getFeature("bottomTextFontSize");
		
		return bottomTextFontSize != null ? ((Number)bottomTextFontSize).intValue() : null;
	}
	
	public void setBottomTextFontSize(Number bottomTextFontSize) throws OutOfRangeException{
		if(AmchartsConstants.IMPROVED_VISIBILITY.equals("true")){
			if(NumberValidator.rangeIntegerValidator(bottomTextFontSize, 0, 36)){
				gaugeAxis.setFeature("bottomTextFontSize", bottomTextFontSize);
			}
		}else{
			gaugeAxis.setFeature("bottomTextFontSize", bottomTextFontSize);
		}
	}
	
	public Integer getBottomTextYOffset(){
		Object bottomTextYOffset = gaugeAxis.getFeature("bottomTextYOffset");
		
		return bottomTextYOffset != null ? ((Number)bottomTextYOffset).intValue() : null;
	}
	
	public void setBottomTextYOffset(Number bottomTextYOffset) throws IntegerException{
		if(NumberValidator.integerValidator(bottomTextYOffset)){
			gaugeAxis.setFeature("bottomTextYOffset", bottomTextYOffset);
		}
	}
	
	public String getCenterX(){
		return (String) gaugeAxis.getFeature("centerX");
	}
	
	public void setCenterX(String centerX) throws CoordException{
		if(PropertyValidator.pixelOrPercent(centerX)){
			gaugeAxis.setFeature("centerX", centerX);
		}
	}
	
	public String getCenterY(){
		return (String) gaugeAxis.getFeature("centerY");
	}
	
	public void setCenterY(String centerY) throws CoordException{
		if(PropertyValidator.pixelOrPercent(centerY)){
			gaugeAxis.setFeature("centerY", centerY);
		}
	}
	
	public Integer getEndAngle(){
		Object endAngle = gaugeAxis.getFeature("endAngle");
		
		return endAngle != null ? ((Number)endAngle).intValue() : null;
	}
	
	public void setEndAngle(Number endAngle) throws OutOfRangeException{
		if(NumberValidator.rangeIntegerValidator(endAngle, -180, 180)){
			gaugeAxis.setFeature("endAngle", endAngle);
		}
	}
	
	public Integer getEndValue(){
		Object endValue = gaugeAxis.getFeature("endValue");
		
		return endValue != null ? ((Number)endValue).intValue() : null;
	}
	
	public void setEndValue(Number endValue) throws IntegerException{
		if(NumberValidator.integerValidator(endValue)){
			gaugeAxis.setFeature("endValue", endValue);
		}
	}
	
	public Integer getGridCount(){
		Object gridCount = gaugeAxis.getFeature("gridCount");
		
		return gridCount != null ? ((Number)gridCount).intValue() : null;
	}
	
	public void setGridCount(Number gridCount) throws OutOfRangeException{
		if(AmchartsConstants.IMPROVED_VISIBILITY.equals("true")){
			if(NumberValidator.rangeIntegerValidator(gridCount, 0, 100)){
				gaugeAxis.setFeature("gridCount", gridCount);
			}
		}else{
			gaugeAxis.setFeature("gridCount", gridCount);
		}
	}
	
	@JsonProperty(value="gridInside")
	public Boolean isGridInside(){
		return (Boolean) gaugeAxis.getFeature("gridInside");
	}
	
	public void setGridInside(Boolean gridInside){
		gaugeAxis.setFeature("gridInside", gridInside);
	}
	
	public String getId() {
		return (String) gaugeAxis.getFeature("id");
	}
	
	@JsonProperty(value="inside")
	public Boolean isInside(){
		return (Boolean) gaugeAxis.getFeature("inside");
	}
	
	public void setInside(Boolean inside){
		gaugeAxis.setFeature("inside", inside);
	}
	
	public Integer getLabelFrequency(){
		Object labelFrequency = gaugeAxis.getFeature("labelFrequency");
		
		return labelFrequency != null ? ((Number)labelFrequency).intValue() : null;
	}
	
	public void setLabelFrequency(Number labelFrequency) throws OutOfRangeException{
		if(AmchartsConstants.IMPROVED_VISIBILITY.equals("true")){
			if(NumberValidator.rangeIntegerValidator(labelFrequency, 1, 5)){
				gaugeAxis.setFeature("labelFrequency", labelFrequency);
			}
		}else{
			gaugeAxis.setFeature("labelFrequency", labelFrequency);
		}
	}
	
	public String getLabelFunction(){
		return (String) gaugeAxis.getFeature("labelFunction");
	}
	
	public void setLabelFunction(String labelFunction){
		if(PropertyValidator.isValidString(labelFunction)){
			gaugeAxis.setFeature("labelFunction", labelFunction);
		}
	}
	
	public Integer getLabelOffset(){
		Object labelOffset = gaugeAxis.getFeature("labelOffset");
		
		return labelOffset != null ? ((Number)labelOffset).intValue() : null;
	}
	
	public void setLabelOffset(Number labelOffset) throws IntegerException{
		if(NumberValidator.integerValidator(labelOffset)){
			gaugeAxis.setFeature("labelOffset", labelOffset);
		}
	}
	
	@JsonProperty(value="labelsEnabled")
	public Boolean isLabelsEnabled(){
		return (Boolean) gaugeAxis.getFeature("labelsEnabled");
	}
	
	public void setLabelsEnabled(Boolean labelsEnabled){
		gaugeAxis.setFeature("labelsEnabled", labelsEnabled);
	}
	
	public Integer getMinorTickInterval(){
		Object minorTickInterval = gaugeAxis.getFeature("minorTickInterval");
		
		return minorTickInterval != null ? ((Number)minorTickInterval).intValue() : null;
	}
	
	public void setMinorTickInterval(Number minorTickInterval) throws OutOfRangeException{
		if(AmchartsConstants.IMPROVED_VISIBILITY.equals("true")){
			if(NumberValidator.rangeIntegerValidator(minorTickInterval, 1, 5)){
				gaugeAxis.setFeature("minorTickInterval", minorTickInterval);
			}
		}else{
			gaugeAxis.setFeature("minorTickInterval", minorTickInterval);
		}
	}
	
	public Integer getMinorTickLength(){
		Object minorTickLength = gaugeAxis.getFeature("minorTickLength");
		
		return minorTickLength != null ? ((Number)minorTickLength).intValue() : null;
	}
	
	public void setMinorTickLength(Number minorTickLength) throws OutOfRangeException{
		if(AmchartsConstants.IMPROVED_VISIBILITY.equals("true")){
			if(NumberValidator.rangeIntegerValidator(minorTickLength, 1, 10)){
				gaugeAxis.setFeature("minorTickLength", minorTickLength);
			}
		}else{
			gaugeAxis.setFeature("minorTickLength", minorTickLength);
		}
	}
	
	public String getRadius(){
		return (String) gaugeAxis.getFeature("radius");
	}
	
	public void setRadius(String radius) throws CoordException{
		if(PropertyValidator.pixelOrPercent(radius)){
			if(radius.contains("%")
					&& Integer.valueOf(radius.substring(0, radius.length()-1))>100){
				gaugeAxis.setFeature("radius", "100%");
			}else{
				gaugeAxis.setFeature("radius", radius);
			}
		}
	}
	
	@JsonProperty(value="showFirstLabel")
	public Boolean isShowFirstLabel(){
		return (Boolean) gaugeAxis.getFeature("showFirstLabel");
	}
	
	public void setShowFirstLabel(Boolean showFirstLabel){
		gaugeAxis.setFeature("showFirstLabel", showFirstLabel);
	}
	
	public Boolean isShowLastLabel(){
		return (Boolean) gaugeAxis.getFeature("showLastLabel");
	}
	
	public void setShowLastLabel(Boolean showLastLabel){
		gaugeAxis.setFeature("showLastLabel", showLastLabel);
	}
	
	public Integer getStartAngle(){
		Object startAngle = gaugeAxis.getFeature("startAngle");
		
		return startAngle != null ? ((Number)startAngle).intValue() : null;
	}
	
	public void setStartAngle(Number startAngle) throws OutOfRangeException{
		if(NumberValidator.rangeIntegerValidator(startAngle, -180, 180)){
			gaugeAxis.setFeature("startAngle", startAngle);
		}
	}
	
	public Integer getStartValue(){
		Object startValue = gaugeAxis.getFeature("startValue");
		
		return startValue != null ? ((Number)startValue).intValue() : null;
	}
	
	public void setStartValue(Number startValue) throws IntegerException{
		if(NumberValidator.integerValidator(startValue)){
			gaugeAxis.setFeature("startValue", startValue);
		}
	}
	
	public Double getTickAlpha(){
		Object tickAlpha = gaugeAxis.getFeature("tickAlpha");
		
		return tickAlpha != null ? ((Number)tickAlpha).doubleValue() : null;
	}
	
	public void setTickAlpha(Number tickAlpha) throws OutOfRangeException{
		if(NumberValidator.rangeDoubleValidator(tickAlpha, 0, 1)){
			gaugeAxis.setFeature("tickAlpha", tickAlpha);
		}
	}
	
	public String getTickColor(){
		return (String) gaugeAxis.getFeature("tickColor");
	}
	
	public void setTickColor(String tickColor) throws ColorException{
		if(ColorValidator.checkFormatColor(tickColor)){
			gaugeAxis.setFeature("tickColor", tickColor);
		}
	}
	
	public Integer getTickLength(){
		Object tickLength = gaugeAxis.getFeature("tickLength");
		
		return tickLength != null ? ((Number)tickLength).intValue() : null;
	}
	
	public void setTickLength(Number tickLength) throws OutOfRangeException{
		if(AmchartsConstants.IMPROVED_VISIBILITY.equals("true")){
			if(NumberValidator.rangeIntegerValidator(tickLength, 0, 15)){
				gaugeAxis.setFeature("tickLength", tickLength);
			}
		}else{
			gaugeAxis.setFeature("tickLength", tickLength);
		}
	}
	
	public Integer getTickThickness(){
		Object tickThickness = gaugeAxis.getFeature("tickThickness");
		
		return tickThickness != null ? ((Number)tickThickness).intValue() : null;
	}
	
	public void setTickThickness(Number tickThickness) throws OutOfRangeException{
		if(AmchartsConstants.IMPROVED_VISIBILITY.equals("true")){
			if(NumberValidator.rangeIntegerValidator(tickThickness, 0, 4)){
				gaugeAxis.setFeature("tickThickness", tickThickness);
			}
		}else{
			gaugeAxis.setFeature("tickThickness", tickThickness);
		}
	}
	
	public String getTopText(){
		return (String) gaugeAxis.getFeature("topText");
	}
	
	public void setTopText(String topText){
		if(PropertyValidator.isValidString(topText)){
			gaugeAxis.setFeature("topText", topText);
		}
	}
	
	@JsonProperty(value="topTextBold")
	public Boolean isTopTextBold(){
		return (Boolean) gaugeAxis.getFeature("topTextBold");
	}
	
	public void setTopTextBold(Boolean topTextBold){
		gaugeAxis.setFeature("topTextBold", topTextBold);
	}
	
	public String getTopTextColor(){
		return (String) gaugeAxis.getFeature("topTextColor");
	}
	
	public void setTopTextColor(String topTextColor) throws ColorException{
		if(ColorValidator.checkFormatColor(topTextColor)){
			gaugeAxis.setFeature("topTextColor", topTextColor);
		}
	}
	
	public Integer getTopTextFontSize(){
		Object topTextFontSize = gaugeAxis.getFeature("topTextFontSize");
		
		return topTextFontSize != null ? ((Number)topTextFontSize).intValue() : null;
	}
	
	public void setTopTextFontSize(Number topTextFontSize) throws OutOfRangeException{
		if(AmchartsConstants.IMPROVED_VISIBILITY.equals("true")){
			if(NumberValidator.rangeIntegerValidator(topTextFontSize, 0, 36)){
				gaugeAxis.setFeature("topTextFontSize", topTextFontSize);
			}
		}else{
			gaugeAxis.setFeature("topTextFontSize", topTextFontSize);
		}
	}
	
	public Integer getTopTextYOffset(){
		Object topTextYOffset = gaugeAxis.getFeature("topTextYOffset");
		
		return topTextYOffset != null ? ((Number)topTextYOffset).intValue() : null;
	}
	
	public void setTopTextYOffset(Number topTextYOffset) throws IntegerException{
		if(NumberValidator.integerValidator(topTextYOffset)){
			gaugeAxis.setFeature("topTextYOffset", topTextYOffset);
		}
	}
	
	public String getUnit(){
		return (String) gaugeAxis.getFeature("unit");
	}
	
	public void setUnit(String unit){
		if(PropertyValidator.isValidString(unit)){
			gaugeAxis.setFeature("unit", unit);
		}
	}
	
	public String getUnitPosition(){
		return (String) gaugeAxis.getFeature("unitPosition");
	}
	
	public void setUnitPosition(Position unitPosition){
		if(unitPosition != null){
			gaugeAxis.setFeature("unitPosition", unitPosition.toString());
		}
	}
	
	@JsonProperty(value="usePrefixes")
	public Boolean isUsePrefixes(){
		return (Boolean) gaugeAxis.getFeature("usePrefixes");
	}
	
	public void setUsePrefixes(Boolean usePrefixes){
		gaugeAxis.setFeature("usePrefixes", usePrefixes);
	}
	
	public Double getValueInterval(){
		Object valueInterval = gaugeAxis.getFeature("valueInterval");
		
		return valueInterval != null ? ((Number)valueInterval).doubleValue() : null;
	}
	
	public void setValueInterval(Number valueInterval){
		if(valueInterval != null){
			if(valueInterval.intValue()>1){
				gaugeAxis.setFeature("valueInterval", valueInterval);
			}
		}
	}
	
	public void addBand(GaugeBandController gaugeBandController){
		if(gaugeBandController != null){
			gaugeAxis.addBand(gaugeBandController);
		}
	}

}
