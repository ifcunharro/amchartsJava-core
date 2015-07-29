package es.uvigo.esei.amchartsJava.core.controllers.guides;

import java.io.Serializable;
import java.sql.Date;
import java.util.Observable;
import java.util.Observer;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import es.uvigo.esei.amchartsJava.core.api.guides.IGuideController;
import es.uvigo.esei.amchartsJava.core.constants.PositionConstant.Position;
import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsJava.core.model.Guide;
import es.uvigo.esei.amchartsJava.core.model.charts.AmCoordinateChart;
import es.uvigo.esei.amchartsJava.core.validators.ColorValidator;
import es.uvigo.esei.amchartsJava.core.validators.NumberValidator;

@JsonInclude(Include.NON_NULL)
public abstract class GuideController implements Observer, Serializable, IGuideController {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5144456903786410897L;
	protected Guide guide;
	private AmCoordinateChart chart;

	{
		guide = new Guide();
	}
	
	@Override
	public void update(Observable o, Object arg) {
		this.setId("Guide-"+arg.toString());
	}
	
	@JsonIgnore
	public void setChart(AmCoordinateChart c) {
		chart = c;
	}
	
	@JsonProperty(value="above")
	public Object isAbove(){
		return guide.getFeature("above");
	}
	
	public void setAbove(Boolean above){
		guide.setFeature("above", above);
	}
	
	public Object getBalloonColor(){
		return guide.getFeature("balloonColor");
	}
	
	public void setBalloonColor(String balloonColor) throws ColorException{
		if(ColorValidator.checkFormatColor(balloonColor)){
			guide.setFeature("balloonColor", balloonColor);
		}
	}
	
	public Object getBalloonText(){
		return guide.getFeature("balloonText");
	}
	
	public void setBalloonText(String balloonText){
		guide.setFeature("balloonText", balloonText);
	}
	
	@JsonProperty(value="boldLabel")
	public Object isBoldLabel(){
		return guide.getFeature("boldLabel");
	}
	
	public void setBoldLabel(Boolean boldLabel){
		guide.setFeature("boldLabel", boldLabel);
	}
	
	public Object getCategory(){
		return guide.getFeature("category");
	}
	
	public void setCategory(String category){
		guide.setFeature("category", category);
	}
	
	public Object getColor(){
		return guide.getFeature("color");
	}
	
	public void setColor(String color) throws ColorException{
		if(ColorValidator.checkFormatColor(color)){
			guide.setFeature("color", color);
		}
	}
	
	public Object getDashLength(){
		return guide.getFeature("dashLength");
	}
	
	public void setDashLength(Number dashLength) throws IntegerException{
		if(NumberValidator.integerValidator(dashLength)){
			guide.setFeature("dashLength", dashLength);
		}
	}
	
	public Object getDate(){
		return guide.getFeature("date");
	}
	
	public void setDate(Date date){
		guide.setFeature("date", date.toString());
	}

	public Object getFillAlpha(){
		return guide.getFeature("fillAlpha");
	}
	
	public void setFillAlpha(Number fillAlpha) throws OutOfRangeException{
		if(NumberValidator.rangeFloatValidator(fillAlpha, 0, 1)){
			guide.setFeature("fillAlpha", fillAlpha);
		}
	}
	
	public Object getFillColor(){
		return guide.getFeature("fillColor");
	}
	
	public void setFillColor(String fillColor) throws ColorException{
		if(ColorValidator.checkFormatColor(fillColor)){
			guide.setFeature("fillColor", fillColor);
		}
	}
	
	public Object getFontSize(){
		return guide.getFeature("fontSize");
	}
	
	public void setFontSize(Number fontSize) throws IntegerException{
		if(NumberValidator.integerValidator(fontSize)){
			guide.setFeature("fontSize", fontSize);
		}
	}
	
	public Object getId(){
		return guide.getFeature("id");
	}
	
	private void setId(String id) {
		guide.setFeature("id", id);
	}
	
	public void removeId(){
		setId(null);
	}
	
	@JsonProperty(value="inside")
	public Object isInside(){
		return guide.getFeature("inside");
	}
	
	public Object getLabel(){
		return guide.getFeature("label");
	}
	
	public void setLabel(String label){
		guide.setFeature("label", label);
	}
	
	public Object getLabelRotation(){
		return guide.getFeature("rotation");
	}
	
	public void setLabelRotation(Number labelRotation) throws OutOfRangeException{
		if(NumberValidator.rangeIntegerValidator(labelRotation, 0, 360)){
			guide.setFeature("labelRotation", labelRotation);
		}
	}
	
	public Object getLineAlpha(){
		return guide.getFeature("lineAlpha");
	}
	
	public void setLineAlpha(Number lineAlpha) throws OutOfRangeException{
		if(NumberValidator.rangeFloatValidator(lineAlpha, 0, 1)){
			guide.setFeature("lineAlpha", lineAlpha);
		}
	}
	
	public Object getLineColor(){
		return guide.getFeature("lineColor");
	}
	
	public void setLineColor(String lineColor) throws ColorException{
		if(ColorValidator.checkFormatColor(lineColor)){
			guide.setFeature("lineColor", lineColor);
		}
	}
	
	public Object getLineThickness(){
		return guide.getFeature("lineThickness");
	}
	
	public void setLineThickness(Number lineThickness) throws IntegerException{
		if(NumberValidator.integerValidator(lineThickness)){
			guide.setFeature("lineThickness", lineThickness);
		}
	}
	
	public Object getPosition(){
		return guide.getFeature("position");
	}
	
	public void setPosition(Position position){
		guide.setFeature("position", position.toString());
	}
	
	public Object getTickLength(){
		return guide.getFeature("tickLength");
	}
	
	public void setTickLength(Number tickLength) throws IntegerException{
		if(NumberValidator.integerValidator(tickLength)){
			guide.setFeature("tickLength", tickLength);
		}
	}
	
	public Object getToDate(){
		return guide.getFeature("toDate");
	}
	
	public void setToDate(Date toDate){
		guide.setFeature("toDate", toDate.toString());
	}
	
	public Object getValueAxis(){
		return guide.getFeature("valueAxis");
	}
	
	public void setValueAxis(String valueAxis){
		if(chart.existValueAxis(valueAxis)){
			guide.setFeature("valueAxis", valueAxis);
		}
	}

}
