package es.uvigo.esei.amchartsJava.core.controllers.axis;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import es.uvigo.esei.amchartsJava.core.api.axis.IAxisBaseController;
import es.uvigo.esei.amchartsJava.core.api.guides.IGuideController;
import es.uvigo.esei.amchartsJava.core.constants.AmchartsConstants;
import es.uvigo.esei.amchartsJava.core.constants.ColorsAmCharts;
import es.uvigo.esei.amchartsJava.core.constants.AxisPositionConstant.Position;
import es.uvigo.esei.amchartsJava.core.controllers.guides.GuideController;
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
	
	@JsonProperty(value="autoGridCount")
	public Object isAutoGridCount(){
		return axes.getFeature("autoGridCount");
	}
	
	public void setAutoGridCount(Boolean autoGridCount){
		axes.setFeature("autoGridCount", autoGridCount);
	}
	
	public Object getAxisAlpha(){
		return axes.getFeature("axisAlpha");
	}
	
	public void setAxisAlpha(Number axisAlpha) throws OutOfRangeException{
		if(NumberValidator.rangeFloatValidator(axisAlpha, 0, 1)){
			axes.setFeature("axisAlpha", axisAlpha);
		}
	}
	
	public Object getAxisColor(){
		return axes.getFeature("axisColor");
	}
	
	public void setAxisColor(String axisColor) throws ColorException{
		if(ColorValidator.checkFormatColor(axisColor)){
			axes.setFeature("axisColor", axisColor);
		}
	}
	
	public Object getAxisThickness(){
		return axes.getFeature("axisThickness");
	}
	
	public void setAxisThickness(Number axisThickness) throws OutOfRangeException{
		if(NumberValidator.rangeIntegerValidator(axisThickness, 0, 2)){
			axes.setFeature("axisThickness", axisThickness);
		}
	}
	
	@JsonProperty(value="boldLabels")
	public Object isBoldLabels(){
		return axes.getFeature("boldLabels");
	}
	
	public void setBoldLabels(Boolean boldLabels){
		axes.setFeature("boldLabels", boldLabels);
	}
	
	public Object getColor(){
		return axes.getFeature("color");
	}
	
	public void setColor(ColorsAmCharts color){
		axes.setFeature("color", color.toString());
	}
	
	public Object getDashLength(){
		return axes.getFeature("dashLength");
	}
	
	public void setDashLength(Number dashLength) throws OutOfRangeException{
		if(NumberValidator.rangeIntegerValidator(dashLength, 0, 100)){
			axes.setFeature("dashLength", dashLength);
		}
	}
	
	public Object getDateFormats(){
		return AmchartsConstants.DATE_FORMAT;
	}
	
	public Object getFillAlpha(){
		return axes.getFeature("fillAlphas");
	}
	
	public void setFillAlpha(Number fillAlpha) throws OutOfRangeException{
		if(NumberValidator.rangeFloatValidator(fillAlpha, 0, 1)){
			axes.setFeature("fillAlpha", fillAlpha);
		}
	}
	
	public Object getFillColor(){
		return axes.getFeature("fillColor");
	}
	
	public void setFillColor(String fillColor) throws ColorException{
		if(ColorValidator.checkFormatColor(fillColor)){
			axes.setFeature("fillColor", fillColor);
		}
	}
	
	public Object getFontSize(){
		return axes.getFeature("fontSize");
	}
	
	public void setFontSize(Number fontSize) throws OutOfRangeException{
		if(NumberValidator.rangeIntegerValidator(fontSize, 10, 16)){
			axes.setFeature("fontSize", fontSize);
		}
	}
	
	public Object getGridAlpha(){
		return axes.getFeature("gridAlpha");
	}
	
	public void setGridAlpha(Number gridAlpha) throws OutOfRangeException{
		if(NumberValidator.rangeFloatValidator(gridAlpha, 0, 1)){
			axes.setFeature("gridAlpha", gridAlpha);
		}
	}
	
	public Object getGridColor(){
		return axes.getFeature("gridColor");
	}
	
	public void setGridColor(String gridColor) throws ColorException{
		if(ColorValidator.checkFormatColor(gridColor)){
			axes.setFeature("gridColor", gridColor);
		}
	}
	
	public Object getGridCount(){
		return axes.getFeature("gridCount");
	}
	
	public void setGridCount(Number gridCount) throws OutOfRangeException{
		if(NumberValidator.rangeIntegerValidator(gridCount, 5, 10)){
			axes.setFeature("gridCount", gridCount);
		}
	}
	
	public Object getGridThickness(){
		return axes.getFeature("gridThickness");
	}
	
	public void setGridThikness(Number gridThickness) throws OutOfRangeException{
		if(NumberValidator.rangeIntegerValidator(gridThickness, 0, 2)){
			axes.setFeature("gridThickness", gridThickness);
		}
	}
	
	@JsonProperty(value="ignoreAxisWidth")
	public Object isIgnoreAxisWidth(){
		return axes.getFeature("ignoreAxisWidth");
	}
	
	public void setIgnoreAxisWidth(Boolean ignoreAxisWidth){
		axes.setFeature("ignoreAxisWidth", ignoreAxisWidth);
	}
	
	@JsonProperty(value="inside")
	public Object isInside(){
		return axes.getFeature("inside");
	}
	
	public void setInside(Boolean inside){
		axes.setFeature("inside", inside);
	}
	
	public Object getLabelFrequency(){
		return axes.getFeature("labelFrequency");
	}
	
	public void setLabelFrequency(Number labelFrequency) throws OutOfRangeException{
		if(NumberValidator.rangeIntegerValidator(labelFrequency, 1, 10)){
			axes.setFeature("labelFrequency", labelFrequency);
		}
	}
	
	public Object getLabelOffset(){
		return axes.getFeature("labelOffset");
	}
	
	public void setLabelOffset(Number labelOffset) throws OutOfRangeException{
		if(NumberValidator.rangeIntegerValidator(labelOffset, 0, 5)){
			axes.setFeature("labelOffset", labelOffset);
		}
	}
	
	public Object getLabelRotation(){
		return axes.getFeature("labelRotation");
	}
	
	public void setLabelRotation(Number labelRotation) throws OutOfRangeException{
		if(NumberValidator.rangeIntegerValidator(labelRotation, -90, 90)){
			axes.setFeature("labelRotation", labelRotation);
		}
	}
	
	@JsonProperty("labelsEnabled")
	public Object isLabelsEnabled(){
		return axes.getFeature("labelsEnabled");
	}
	
	public void setLabelsEnabled(Boolean labelsEnabled){
		axes.setFeature("labelsEnabled", labelsEnabled);
	}
	
	public Object getMinHorizontalGap(){
		return axes.getFeature("minHorizontalGap");
	}
	
	public void setMinHorizontalGap(Number minHorizontalGap) throws IntegerException{
		if(NumberValidator.integerValidator(minHorizontalGap)){
			axes.setFeature("minHorizontalGap", minHorizontalGap);
		}
	}
	
	public Object getMinorGridAlpha(){
		return axes.getFeature("minorGridAlpha");
	}
	
	public void setMinorGridAlpha(Number minorGridAlpha) throws OutOfRangeException{
		if(NumberValidator.rangeFloatValidator(minorGridAlpha, 0, 1)){
			axes.setFeature("minorGridAlpha", minorGridAlpha);
		}
	}
	
	@JsonProperty(value="minorGridEnabled")
	public Object isMinorGridEnabled(){
		return axes.getFeature("minorGridAlpha");
	}
	
	public void setMinorGridEnabled(Boolean minorGridEnabled){
		axes.setFeature("minorGridEnabled", minorGridEnabled);
	}
	
	public Object getMinorTickLength(){
		return axes.getFeature("minorTickLength");
	}
	
	public void setMinorTickLength(Number minorTickLength) throws OutOfRangeException{
		if(NumberValidator.rangeIntegerValidator(minorTickLength, 0, 10)){
			axes.setFeature("minorTickLength",minorTickLength);
		}
		
	}
	
	public Object getMinVerticalGap(){
		return axes.getFeature("minVerticalGap");
	}
	
	public void setMinVerticalGap(Number minVerticalGap){
		axes.setFeature("minVerticalGap", minVerticalGap);
	}
	
	public Object getOffset(){
		return axes.getFeature("offset");
	}
	
	public void setOffset(Number offset) throws OutOfRangeException{
		if(NumberValidator.rangeIntegerValidator(offset, 4, 10)){
			axes.setFeature("offset", offset);
		}
	}
	
	public Object getPosition(){
		return axes.getFeature("position");
	}
	
	public void setPosition(Position position){
		axes.setFeature("position", position.toString());
	}
	
	@JsonProperty(value="showFirstLabel")
	public Object isShowFirstLabel(){
		return axes.getFeature("showFirstLabel");
	}
	
	public void setShowFirstLabel(Boolean showFirstLabel){
		axes.setFeature("showFirstLabel", showFirstLabel);
	}
	
	@JsonProperty(value="showLastLabel")
	public Object isShowLastLabel(){
		return axes.getFeature("showLastLabel");
	}
	
	public void setShowLastLabel(Boolean showLastLabel){
		axes.setFeature("showLastLabel", showLastLabel);
	}
	
	public Object getTickLength(){
		return axes.getFeature("tickLength");
	}
	
	public void setTickLength(Number tickLength) throws OutOfRangeException{
		if(NumberValidator.rangeIntegerValidator(tickLength, 0, 10)){
			axes.setFeature("tickLength", tickLength);
		}
	}
	
	public Object getTitle(){
		return axes.getFeature("title");
	}
	
	public void setTitle(String title){
		axes.setFeature("title", title);
	}
	
	@JsonProperty(value="titleBold")
	public Object isTitleBold(){
		return axes.getFeature("titleBold");
	}
	
	public void setTitleBold(Boolean titleBold){
		axes.setFeature("titleBold", titleBold);
	}
	
	public Object getTitleColor(){
		return axes.getFeature("titleColor");
	}
	
	public void setTitleColor(String titleColor) throws ColorException{
		if(ColorValidator.checkFormatColor(titleColor)){
			axes.setFeature("titleColor", titleColor);
		}
	}
	
	public Object getTitleFontSize(){
		return axes.getFeature("titleFontSize");
	}
	
	public void setTitleFontSize(Number titleFontSize) throws OutOfRangeException{
		if(NumberValidator.rangeIntegerValidator(titleFontSize, 10, 18)){
			axes.setFeature("titleFontSize", titleFontSize);
		}
	}
	
	public void addGuide(GuideController guideController){
		guideController.removeId();
		axes.addGuide(guideController);
	}
	
	public void removeGuide(IGuideController guideController){
		if(axes.existGuide(guideController)){
			axes.removeGuide(guideController);
		}
	}
	
	
}
