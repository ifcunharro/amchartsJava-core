package es.uvigo.esei.amchartsJava.core.controllers.axis;

import java.io.Serializable;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import es.uvigo.esei.amchartsJava.core.api.axis.IAxisBaseController;
import es.uvigo.esei.amchartsJava.core.constants.AmchartsConstants;
import es.uvigo.esei.amchartsJava.core.constants.ColorsAmCharts;
import es.uvigo.esei.amchartsJava.core.constants.AxisPosition;
import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsJava.core.model.AxisBase;
import es.uvigo.esei.amchartsJava.core.validators.ColorValidator;
import es.uvigo.esei.amchartsJava.core.validators.NumberValidator;

@JsonInclude(Include.NON_NULL)
public abstract class AxisBaseController implements IAxisBaseController, Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4422241246218914866L;
	protected AxisBase axes;
	
	{
		axes = new AxisBase();
	}
	
	@JsonIgnore
	public Map<String,String> getAxesFields(){
		return axes.getAxesFields();
	}
	
	public void setAxesFields(Map<String,String> axesFields){
		axes.setAxesFields(axesFields);
	}
	
	@JsonProperty(value="autoGridCount")
	public Boolean isAutoGridCount(){
		return (Boolean) axes.getFeature("autoGridCount");
	}
	
	public void setAutoGridCount(Boolean autoGridCount){
		axes.setFeature("autoGridCount", autoGridCount);
	}
	
	public Double getAxisAlpha(){
		Object axisAlpha = axes.getFeature("axisAlpha");
		
		return axisAlpha != null ? ((Number)axisAlpha).doubleValue() : null;
	}
	
	public void setAxisAlpha(Number axisAlpha) throws OutOfRangeException{
		if(NumberValidator.rangeDoubleValidator(axisAlpha, 0, 1)){
			axes.setFeature("axisAlpha", axisAlpha);
		}
	}
	
	public String getAxisColor(){
		return (String) axes.getFeature("axisColor");
	}
	
	public void setAxisColor(String axisColor) throws ColorException{
		if(ColorValidator.checkFormatColor(axisColor)){
			axes.setFeature("axisColor", axisColor);
		}
	}
	
	public Integer getAxisThickness(){
		Object axisThickness = axes.getFeature("axisThickness");
		
		return axisThickness != null ? ((Number)axisThickness).intValue() : null;
	}
	
	public void setAxisThickness(Number axisThickness) throws OutOfRangeException{
		if(AmchartsConstants.IMPROVED_VISIBILITY.equals("true")){
			if(NumberValidator.rangeIntegerValidator(axisThickness, 0, 2)){
				axes.setFeature("axisThickness", axisThickness);
			}
		}else{
			axes.setFeature("axisThickness", axisThickness);
		}
	}
	
	@JsonProperty(value="boldLabels")
	public Boolean isBoldLabels(){
		return (Boolean) axes.getFeature("boldLabels");
	}
	
	public void setBoldLabels(Boolean boldLabels){
		axes.setFeature("boldLabels", boldLabels);
	}
	
	@JsonProperty(value="centerLabels")
	public Boolean isCenterLabels(){
		return (Boolean) axes.getFeature("centerLabels");
	}
	
	public void setCenterLabels(Boolean centerLabels){
		axes.setFeature("centerLabels", centerLabels);
	}
	
	public String getColor(){
		return (String) axes.getFeature("color");
	}
	
	public void setColor(ColorsAmCharts color){
		axes.setFeature("color", color.toString());
	}
	
	public Integer getDashLength(){
		Object dashLength = axes.getFeature("dashLength");
		
		return dashLength != null ? ((Number)dashLength).intValue() : null;
	}
	
	public void setDashLength(Number dashLength) throws OutOfRangeException{
		if(AmchartsConstants.IMPROVED_VISIBILITY.equals("true")){
			if(NumberValidator.rangeIntegerValidator(dashLength, 0, 100)){
				axes.setFeature("dashLength", dashLength);
			}
		}else{
			axes.setFeature("dashLength", dashLength);
		}
	}
	
	@JsonIgnore
	public String[] getDateFormats(){
		return AmchartsConstants.DATE_FORMAT;
	}
	
	public Double getFillAlpha(){
		Object fillAlpha = axes.getFeature("fillAlpha");
		
		return fillAlpha != null ? ((Number)fillAlpha).doubleValue() : null;
	}
	
	public void setFillAlpha(Number fillAlpha) throws OutOfRangeException{
		if(NumberValidator.rangeDoubleValidator(fillAlpha, 0, 1)){
			axes.setFeature("fillAlpha", fillAlpha);
		}
	}
	
	public String getFillColor(){
		return (String) axes.getFeature("fillColor");
	}
	
	public void setFillColor(String fillColor) throws ColorException{
		if(ColorValidator.checkFormatColor(fillColor)){
			axes.setFeature("fillColor", fillColor);
		}
	}
	
	public Integer getFontSize(){
		Object fontSize = axes.getFeature("fontSize");
		
		return fontSize != null ? ((Number)fontSize).intValue() : null;
	}
	
	public void setFontSize(Number fontSize) throws OutOfRangeException{
		if(AmchartsConstants.IMPROVED_VISIBILITY.equals("true")){
			if(NumberValidator.rangeIntegerValidator(fontSize, 10, 16)){
				axes.setFeature("fontSize", fontSize);
			}
		}else{
			axes.setFeature("fontSize", fontSize);
		}
	}
	
	public Double getGridAlpha(){
		Object gridAlpha = axes.getFeature("gridAlpha");
		
		return gridAlpha != null ? ((Number)gridAlpha).doubleValue() : null;
	}
	
	public void setGridAlpha(Number gridAlpha) throws OutOfRangeException{
		if(NumberValidator.rangeDoubleValidator(gridAlpha, 0, 1)){
			axes.setFeature("gridAlpha", gridAlpha);
		}
	}
	
	public String getGridColor(){
		return (String) axes.getFeature("gridColor");
	}
	
	public void setGridColor(String gridColor) throws ColorException{
		if(ColorValidator.checkFormatColor(gridColor)){
			axes.setFeature("gridColor", gridColor);
		}
	}
	
	public Integer getGridCount(){
		Object gridCount = axes.getFeature("gridCount");
		
		return gridCount != null ? ((Number)gridCount).intValue() : null;
	}
	
	public void setGridCount(Number gridCount) throws OutOfRangeException{
		if(AmchartsConstants.IMPROVED_VISIBILITY.equals("true")){
			if(NumberValidator.rangeIntegerValidator(gridCount, 5, 10)){
				axes.setFeature("gridCount", gridCount);
			}
		}else{
			axes.setFeature("gridCount", gridCount);
		}
	}
	
	public Integer getGridThickness(){
		Object gridThickness = axes.getFeature("gridThickness");
		
		return gridThickness != null ? ((Number)gridThickness).intValue() : null;
	}
	
	public void setGridThickness(Number gridThickness) throws OutOfRangeException{
		if(AmchartsConstants.IMPROVED_VISIBILITY.equals("true")){
			if(NumberValidator.rangeIntegerValidator(gridThickness, 0, 2)){
				axes.setFeature("gridThickness", gridThickness);
			}
		}else{
			axes.setFeature("gridThickness", gridThickness);
		}
	}
	
	@JsonProperty(value="ignoreAxisWidth")
	public Boolean isIgnoreAxisWidth(){
		return (Boolean) axes.getFeature("ignoreAxisWidth");
	}
	
	public void setIgnoreAxisWidth(Boolean ignoreAxisWidth){
		axes.setFeature("ignoreAxisWidth", ignoreAxisWidth);
	}
	
	@JsonProperty(value="inside")
	public Boolean isInside(){
		return (Boolean) axes.getFeature("inside");
	}
	
	public void setInside(Boolean inside){
		axes.setFeature("inside", inside);
	}
	
	public Integer getLabelFrequency(){
		Object labelFrequency = axes.getFeature("labelFrequency");
		
		return labelFrequency != null ? ((Number)labelFrequency).intValue() : null;
	}
	
	public void setLabelFrequency(Number labelFrequency) throws OutOfRangeException{
		if(AmchartsConstants.IMPROVED_VISIBILITY.equals("true")){
			if(NumberValidator.rangeIntegerValidator(labelFrequency, 1, 10)){
				axes.setFeature("labelFrequency", labelFrequency);
			}
		}else{
			axes.setFeature("labelFrequency", labelFrequency);
		}
	}
	
	public Integer getLabelOffset(){
		Object labelOffset = axes.getFeature("labelOffset");
		
		return labelOffset != null ? ((Number)labelOffset).intValue() : null;
	}
	
	public void setLabelOffset(Number labelOffset) throws OutOfRangeException{
		if(AmchartsConstants.IMPROVED_VISIBILITY.equals("true")){
			if(NumberValidator.rangeIntegerValidator(labelOffset, 0, 5)){
				axes.setFeature("labelOffset", labelOffset);
			}
		}else{
			axes.setFeature("labelOffset", labelOffset);
		}
	}
	
	public Integer getLabelRotation(){
		Object labelRotation = axes.getFeature("labelRotation");
		
		return labelRotation != null ? ((Number)labelRotation).intValue() : null;
	}
	
	public void setLabelRotation(Number labelRotation) throws OutOfRangeException{
		if(NumberValidator.rangeIntegerValidator(labelRotation, -90, 90)){
			axes.setFeature("labelRotation", labelRotation);
		}
	}
	
	@JsonProperty("labelsEnabled")
	public Boolean isLabelsEnabled(){
		return (Boolean) axes.getFeature("labelsEnabled");
	}
	
	public void setLabelsEnabled(Boolean labelsEnabled){
		axes.setFeature("labelsEnabled", labelsEnabled);
	}
	
	public Integer getMinHorizontalGap(){
		Object minHorizontalGap = axes.getFeature("minHorizontalGap");
		
		return minHorizontalGap != null ? ((Number)minHorizontalGap).intValue() : null;
	}
	
	public void setMinHorizontalGap(Number minHorizontalGap) throws IntegerException{
		if(NumberValidator.integerValidator(minHorizontalGap)){
			axes.setFeature("minHorizontalGap", minHorizontalGap);
		}
	}
	
	public Double getMinorGridAlpha(){
		Object minorGridAlpha = axes.getFeature("minorGridAlpha");
		
		return minorGridAlpha != null ? ((Number)minorGridAlpha).doubleValue() : null;
	}
	
	public void setMinorGridAlpha(Number minorGridAlpha) throws OutOfRangeException{
		if(NumberValidator.rangeDoubleValidator(minorGridAlpha, 0, 1)){
			axes.setFeature("minorGridAlpha", minorGridAlpha);
		}
	}
	
	@JsonProperty(value="minorGridEnabled")
	public Boolean isMinorGridEnabled(){
		return (Boolean) axes.getFeature("minorGridEnabled");
	}
	
	public void setMinorGridEnabled(Boolean minorGridEnabled){
		axes.setFeature("minorGridEnabled", minorGridEnabled);
	}
	
	public Integer getMinorTickLength(){
		Object minorTickLength = axes.getFeature("minorTickLength");
		
		return minorTickLength != null ? ((Number)minorTickLength).intValue() : null;
	}
	
	public void setMinorTickLength(Number minorTickLength) throws OutOfRangeException{
		if(AmchartsConstants.IMPROVED_VISIBILITY.equals("true")){
			if(NumberValidator.rangeIntegerValidator(minorTickLength, 0, 10)){
				axes.setFeature("minorTickLength",minorTickLength);
			}
		}else{
			axes.setFeature("minorTickLength",minorTickLength);
		}
		
	}
	
	public Integer getMinVerticalGap(){
		Object minVerticalGap = axes.getFeature("minVerticalGap");
		
		return minVerticalGap != null ? ((Number)minVerticalGap).intValue() : null;
	}
	
	public void setMinVerticalGap(Number minVerticalGap) throws IntegerException{
		if(NumberValidator.integerValidator(minVerticalGap)){
			axes.setFeature("minVerticalGap", minVerticalGap);
		}
	}
	
	public Integer getOffset(){
		Object offset = axes.getFeature("offset");
		
		return offset != null ? ((Number)offset).intValue() : null;
	}
	
	public void setOffset(Number offset) throws OutOfRangeException{
		if(AmchartsConstants.IMPROVED_VISIBILITY.equals("true")){
			if(NumberValidator.rangeIntegerValidator(offset, 4, 10)){
				axes.setFeature("offset", offset);
			}
		}else{
			axes.setFeature("offset", offset);
		}
	}
	
	public String getPosition(){
		return (String) axes.getFeature("position");
	}
	
	public void setPosition(AxisPosition position){
		axes.setFeature("position", position.toString());
	}
	
	@JsonProperty(value="showFirstLabel")
	public Boolean isShowFirstLabel(){
		return (Boolean) axes.getFeature("showFirstLabel");
	}
	
	public void setShowFirstLabel(Boolean showFirstLabel){
		axes.setFeature("showFirstLabel", showFirstLabel);
	}
	
	@JsonProperty(value="showLastLabel")
	public Boolean isShowLastLabel(){
		return (Boolean) axes.getFeature("showLastLabel");
	}
	
	public void setShowLastLabel(Boolean showLastLabel){
		axes.setFeature("showLastLabel", showLastLabel);
	}
	
	public Integer getTickLength(){
		Object tickLength = axes.getFeature("tickLength");
		
		return tickLength != null ? ((Number)tickLength).intValue() : null;
	}
	
	public void setTickLength(Number tickLength) throws OutOfRangeException{
		if(AmchartsConstants.IMPROVED_VISIBILITY.equals("true")){
			if(NumberValidator.rangeIntegerValidator(tickLength, 0, 10)){
				axes.setFeature("tickLength", tickLength);
			}
		}else{
			axes.setFeature("tickLength", tickLength);
		}
	}
	
	public String getTitle(){
		return (String) axes.getFeature("title");
	}
	
	public void setTitle(String title){
		axes.setFeature("title", title);
	}
	
	@JsonProperty(value="titleBold")
	public Boolean isTitleBold(){
		return (Boolean) axes.getFeature("titleBold");
	}
	
	public void setTitleBold(Boolean titleBold){
		axes.setFeature("titleBold", titleBold);
	}
	
	public String getTitleColor(){
		return (String) axes.getFeature("titleColor");
	}
	
	public void setTitleColor(String titleColor) throws ColorException{
		if(ColorValidator.checkFormatColor(titleColor)){
			axes.setFeature("titleColor", titleColor);
		}
	}
	
	public Integer getTitleFontSize(){
		Object titleFontSize = axes.getFeature("titleFontSize");
		
		return titleFontSize != null ? ((Number)titleFontSize).intValue() : null;
	}
	
	public void setTitleFontSize(Number titleFontSize) throws OutOfRangeException{
		if(AmchartsConstants.IMPROVED_VISIBILITY.equals("true")){
			if(NumberValidator.rangeIntegerValidator(titleFontSize, 10, 18)){
				axes.setFeature("titleFontSize", titleFontSize);
			}
		}else{
			axes.setFeature("titleFontSize", titleFontSize);
		}
	}
	
	public Integer getTitleRotation(){
		Object titleRotation = axes.getFeature("titleRotation");
		
		return titleRotation != null ? ((Number)titleRotation).intValue() : null;
	}
	
	public void setTitleRotation(Number titleRotation) throws OutOfRangeException{
		if(NumberValidator.rangeIntegerValidator(titleRotation, 0, 360)){
			axes.setFeature("titleRotation", titleRotation);
		}
	}
	
}
