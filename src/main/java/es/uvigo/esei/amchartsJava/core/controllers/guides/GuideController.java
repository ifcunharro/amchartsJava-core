package es.uvigo.esei.amchartsJava.core.controllers.guides;

import java.io.Serializable;
import java.sql.Date;
import java.util.Observable;
import java.util.Observer;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import es.uvigo.esei.amchartsJava.core.api.guides.IGuideController;
import es.uvigo.esei.amchartsJava.core.constants.AmchartsConstants;
import es.uvigo.esei.amchartsJava.core.constants.Position;
import es.uvigo.esei.amchartsJava.core.constants.lang.I18n;
import es.uvigo.esei.amchartsJava.core.exceptions.ChartException;
import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsJava.core.model.Guide;
import es.uvigo.esei.amchartsJava.core.model.charts.AmCoordinateChart;
import es.uvigo.esei.amchartsJava.core.validators.ColorValidator;
import es.uvigo.esei.amchartsJava.core.validators.NumberValidator;
import es.uvigo.esei.amchartsJava.core.validators.PropertyValidator;

/**
 * This class is a controller for Guide.
 * @author Iago Fernández Cuñarro
 *
 */
@JsonInclude(Include.NON_NULL)
public abstract class GuideController implements Observer, Serializable, IGuideController {
	
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
	public Boolean isAbove(){
		return (Boolean) guide.getFeature("above");
	}
	
	public void setAbove(Boolean above){
		guide.setFeature("above", above);
	}
	
	public String getBalloonColor(){
		return (String) guide.getFeature("balloonColor");
	}
	
	public void setBalloonColor(String balloonColor) throws ColorException{
		if(ColorValidator.checkFormatColor(balloonColor)){
			guide.setFeature("balloonColor", balloonColor);
		}
	}
	
	public String getBalloonText(){
		return (String) guide.getFeature("balloonText");
	}
	
	public void setBalloonText(String balloonText){
		if(PropertyValidator.isValidString(balloonText)){
			guide.setFeature("balloonText", balloonText);
		}
	}
	
	@JsonProperty(value="boldLabel")
	public Boolean isBoldLabel(){
		return (Boolean) guide.getFeature("boldLabel");
	}
	
	public void setBoldLabel(Boolean boldLabel){
		guide.setFeature("boldLabel", boldLabel);
	}
	
	public String getColor(){
		return (String) guide.getFeature("color");
	}
	
	public void setColor(String color) throws ColorException{
		if(ColorValidator.checkFormatColor(color)){
			guide.setFeature("color", color);
		}
	}
	
	public Integer getDashLength(){
		Object dashLength = guide.getFeature("dashLength");
		
		return dashLength != null ? ((Number)dashLength).intValue() : null;
	}
	
	public void setDashLength(Number dashLength) throws OutOfRangeException{
		if(AmchartsConstants.IMPROVED_VISIBILITY.equals("true")){
			if(NumberValidator.rangeIntegerValidator(dashLength, 0, 36)){
				guide.setFeature("dashLength", dashLength);
			}
		}else{
			guide.setFeature("dashLength", dashLength);
		}
	}
	
	public Double getFillAlpha(){
		Object fillAlpha = guide.getFeature("fillAlpha");
		
		return fillAlpha != null ? ((Number)fillAlpha).doubleValue() : null;
	}
	
	public void setFillAlpha(Number fillAlpha) throws OutOfRangeException{
		if(NumberValidator.rangeDoubleValidator(fillAlpha, 0, 1)){
			guide.setFeature("fillAlpha", fillAlpha);
		}
	}
	
	public String getFillColor(){
		return (String) guide.getFeature("fillColor");
	}
	
	public void setFillColor(String fillColor) throws ColorException{
		if(ColorValidator.checkFormatColor(fillColor)){
			guide.setFeature("fillColor", fillColor);
		}
	}
	
	public Integer getFontSize(){
		Object fontSize = guide.getFeature("fontSize");
		
		return fontSize != null ? ((Number)fontSize).intValue() : null;
	}
	
	public void setFontSize(Number fontSize) throws OutOfRangeException{
		if(AmchartsConstants.IMPROVED_VISIBILITY.equals("true")){
			if(NumberValidator.rangeIntegerValidator(fontSize, 8, 20)){
				guide.setFeature("fontSize", fontSize);
			}
		}else{
			guide.setFeature("fontSize", fontSize);
		}
	}
	
	public String getId(){
		return (String) guide.getFeature("id");
	}
	
	private void setId(String id) {
		guide.setFeature("id", id);
	}
	
	@JsonProperty(value="inside")
	public Boolean isInside(){
		return (Boolean) guide.getFeature("inside");
	}
	
	public void setInside(Boolean inside){
		guide.setFeature("inside", inside);
	}
	
	public String getLabel(){
		return (String) guide.getFeature("label");
	}
	
	public void setLabel(String label){
		if(PropertyValidator.isValidString(label)){
			guide.setFeature("label", label);
		}
	}
	
	public Integer getLabelRotation(){
		Object labelRotation = guide.getFeature("rotation");
		
		return labelRotation != null ? ((Number)labelRotation).intValue() : null;
	}
	
	public void setLabelRotation(Number labelRotation) throws OutOfRangeException{
		if(NumberValidator.rangeIntegerValidator(labelRotation, 0, 360)){
			guide.setFeature("labelRotation", labelRotation);
		}
	}
	
	public Double getLineAlpha(){
		Object lineAlpha = guide.getFeature("lineAlpha");
		
		return lineAlpha != null ? ((Number)lineAlpha).doubleValue() : null;
	}
	
	public void setLineAlpha(Number lineAlpha) throws OutOfRangeException{
		if(NumberValidator.rangeDoubleValidator(lineAlpha, 0, 1)){
			guide.setFeature("lineAlpha", lineAlpha);
		}
	}
	
	public String getLineColor(){
		return (String) guide.getFeature("lineColor");
	}
	
	public void setLineColor(String lineColor) throws ColorException{
		if(ColorValidator.checkFormatColor(lineColor)){
			guide.setFeature("lineColor", lineColor);
		}
	}
	
	public Integer getLineThickness(){
		Object lineThickness = guide.getFeature("lineThickness");
		
		return lineThickness != null ? ((Number)lineThickness).intValue() : null;
	}
	
	public void setLineThickness(Number lineThickness) throws OutOfRangeException{
		if(AmchartsConstants.IMPROVED_VISIBILITY.equals("true")){
			if(NumberValidator.rangeIntegerValidator(lineThickness, 1, 20)){
				guide.setFeature("lineThickness", lineThickness);
			}
		}else{
			guide.setFeature("lineThickness", lineThickness);
		}
	}
	
	public String getPosition(){
		return (String) guide.getFeature("position");
	}
	
	public void setPosition(Position position){
		if(position != null){
			guide.setFeature("position", position.toString());
		}
	}
	
	public Integer getTickLength(){
		Object tickLength = guide.getFeature("tickLength");
		
		return tickLength != null ? ((Number)tickLength).intValue() : null;
	}
	
	public void setTickLength(Number tickLength) throws OutOfRangeException{
		if(AmchartsConstants.IMPROVED_VISIBILITY.equals("true")){
			if(NumberValidator.rangeIntegerValidator(tickLength, 0, 5)){
				guide.setFeature("tickLength", tickLength);
			}
		}else{
			guide.setFeature("tickLength", tickLength);
		}
	}
	
	public String getToDate(){
		return (String) guide.getFeature("toDate");
	}
	
	public void setToDate(Date toDate){
		if(toDate != null){
			guide.setFeature("toDate", toDate.toString());
		}
	}
	
	public String getValueAxis(){
		return (String) guide.getFeature("valueAxis");
	}
	
	public void setValueAxis(String valueAxis) throws ChartException{
		if(chart != null){
			if(PropertyValidator.isValidString(valueAxis) && chart.existValueAxis(valueAxis)){
				guide.setFeature("valueAxis", valueAxis);
			}
		}else{
			throw new ChartException(getClass().getSimpleName()+I18n.get("ChartException"));
		}
	}
	
	//Used to deserialize json
	@JsonSetter(value="valueAxis")
	private void setJsonValueAxis(String valueAxis){
		guide.setFeature("valueAxis", valueAxis);
	}

}
