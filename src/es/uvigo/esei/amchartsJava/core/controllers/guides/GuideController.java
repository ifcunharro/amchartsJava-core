package es.uvigo.esei.amchartsJava.core.controllers.guides;

import java.io.Serializable;
import java.sql.Date;
import java.util.Observable;
import java.util.Observer;

import org.apache.log4j.Logger;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import es.uvigo.esei.amchartsJava.core.api.guides.IGuideController;
import es.uvigo.esei.amchartsJava.core.constants.AmchartsConstants;
import es.uvigo.esei.amchartsJava.core.constants.Config;
import es.uvigo.esei.amchartsJava.core.constants.PositionConstant.Position;
import es.uvigo.esei.amchartsJava.core.constants.lang.I18n;
import es.uvigo.esei.amchartsJava.core.exceptions.ChartException;
import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
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
	private static final Logger logger = Logger.getLogger(GuideController.class.getName());


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
		guide.setFeature("balloonText", balloonText);
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
	
	public Object getDashLength(){
		return guide.getFeature("dashLength");
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
	
	public Object getFillAlpha(){
		return guide.getFeature("fillAlpha");
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
	
	public Object getFontSize(){
		return guide.getFeature("fontSize");
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
	
	public String getLabel(){
		return (String) guide.getFeature("label");
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
	
	public Object getLineThickness(){
		return guide.getFeature("lineThickness");
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
		guide.setFeature("position", position.toString());
	}
	
	public Object getTickLength(){
		return guide.getFeature("tickLength");
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
		guide.setFeature("toDate", toDate.toString());
	}
	
	public String getValueAxis(){
		return (String) guide.getFeature("valueAxis");
	}
	
	public void setValueAxis(String valueAxis) throws ChartException{
		if(chart != null){
			if(chart.existValueAxis(valueAxis)){
				guide.setFeature("valueAxis", valueAxis);
			}
		}else{
			if(Config.getString("log").equals("file")){
				logger.info(getClass().getSimpleName()+I18n.get("ChartException"));
			}
			throw new ChartException(getClass().getSimpleName()+I18n.get("ChartException"));
		}
	}

}
