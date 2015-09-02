package es.uvigo.esei.amchartsJava.core.controllers;

import java.io.Serializable;

import org.apache.log4j.Logger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import es.uvigo.esei.amchartsJava.core.api.IChartCursorController;
import es.uvigo.esei.amchartsJava.core.constants.AmchartsConstants;
import es.uvigo.esei.amchartsJava.core.constants.Config;
import es.uvigo.esei.amchartsJava.core.constants.CategoryBalloonTextConstant.CategoryBalloonText;
import es.uvigo.esei.amchartsJava.core.constants.CursorPositionConstant.CursorPosition;
import es.uvigo.esei.amchartsJava.core.constants.OrientationConstant.Orientation;
import es.uvigo.esei.amchartsJava.core.constants.lang.I18n;
import es.uvigo.esei.amchartsJava.core.exceptions.ChartException;
import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsJava.core.model.ChartCursor;
import es.uvigo.esei.amchartsJava.core.model.charts.AmRectangularChart;
import es.uvigo.esei.amchartsJava.core.validators.ColorValidator;
import es.uvigo.esei.amchartsJava.core.validators.NumberValidator;
import es.uvigo.esei.amchartsJava.core.validators.TypeValidator;

@JsonInclude(Include.NON_NULL)
public class ChartCursorController implements Serializable, IChartCursorController {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1995587507218823504L;
	private ChartCursor chartCursor;
	private AmRectangularChart chart;
	private static final Logger logger = Logger.getLogger(ChartCursorController.class.getName());
	
	{
		chartCursor = new ChartCursor();
	}
	
	@JsonIgnore
	public void setChart(AmRectangularChart c) {
		chart = c;
		
	}
	
	public Object getAdjustment(){
		return chartCursor.getFeature("adjustment");
	}
	
	//no se recomienda cambiar esta propiedad, es la distancia entre el cursor y
	//el mensaje del balloon que aparece
	public void setAdjustment(Number adjustment) throws IntegerException{
		if(NumberValidator.integerValidator(adjustment)){
			chartCursor.setFeature("adjustment", adjustment);
		}
	}
	
	public Object getAnimationDuration(){
		return chartCursor.getFeature("animationDuration");
	}
	
	public void setAnimationDuration(Number animationDuration) throws OutOfRangeException{
		if(NumberValidator.rangeDoubleValidator(animationDuration, 0, 1)){
			chartCursor.setFeature("animationDuration", animationDuration);
		}
	}
	
	@JsonProperty(value="avoidBalloonOverlapping")
	public Boolean isAvoidBalloonOverlapping(){
		return (Boolean) chartCursor.getFeature("avoidBalloonOverlapping");
	}
	
	public void setAvoidBalloonOverlapping(Boolean avoidBalloonOverlapping){
		chartCursor.setFeature("avoidBalloonOverlapping", avoidBalloonOverlapping);
	}
	
	public String getBalloonPointerOrientation(){
		return (String) chartCursor.getFeature("balloonPointerOrientation");
	}
	
	public void setBalloonPointerOrientation(Orientation balloonPointerOrientation){
		chartCursor.setFeature("balloonPointerOrientation", balloonPointerOrientation.toString());
	}
	
	@JsonProperty(value="bulletsEnabled")
	public Boolean isBulletsEnabled(){
		return (Boolean) chartCursor.getFeature("bulletsEnabled");
	}
	
	public void setBulletsEnabled(Boolean bulletsEnabled){
		chartCursor.setFeature("bulletsEnabled", bulletsEnabled);
	}
	
	public Object getBulletSize(){
		return chartCursor.getFeature("bulletSize");
	}
	
	public void setBulletSize(Number bulletSize) throws OutOfRangeException{
		if(AmchartsConstants.IMPROVED_VISIBILITY.equals("true")){
			if(NumberValidator.rangeIntegerValidator(bulletSize, 8, 20)){
				chartCursor.setFeature("bulletSize", bulletSize);
			}
		}else{
			chartCursor.setFeature("bulletSize", bulletSize);
		}
	}
	
	public Object getCategoryBallonAlpha(){
		return chartCursor.getFeature("categoryBallonAlpha");
	}
	
	public void setCategoryBalloonAlpha(Number categoryBalloonAlpha) throws OutOfRangeException{
		if(NumberValidator.rangeDoubleValidator(categoryBalloonAlpha, 0, 1)){
			chartCursor.setFeature("categoryBalloonAlpha", categoryBalloonAlpha);
		}
	}
	
	public String getCategoryBalloonColor(){
		return (String) chartCursor.getFeature("categoryBalloonColor");
	}
	
	public void setCategoryBallonColor(String categoryBalloonColor) throws ColorException{
		if(ColorValidator.checkFormatColor(categoryBalloonColor)){
			chartCursor.setFeature("categoryBalloonColor", categoryBalloonColor);
		}
	}
	
	public String getCategoryBalloonDateFormat(){
		return (String) chartCursor.getFeature("categoryBalloonDateFormat");
	}
	
	public void setCategoryBalloonDateFormat(String categoryBalloonDateFormat){
		if(TypeValidator.checkDateFormat(categoryBalloonDateFormat)){
			chartCursor.setFeature("categoryBalloonDateFormat", categoryBalloonDateFormat);
		}
	}
	
	@JsonProperty(value="categoryBalloonEnabled")
	public Boolean isCategoryBalloonEnabled(){
		return (Boolean) chartCursor.getFeature("categoryBalloonEnabled");
	}
	
	public void setCategoryBalloonEnaled(Boolean categoryBalloonEnabled){
		chartCursor.setFeature("categoryBalloonEnabled", categoryBalloonEnabled);
	}
	
	public String getCategoryBalloonFunction(){
		return (String) chartCursor.getFeature("categoryBalloonFunction");
	}
	
	public void setCategoryBalloonFunction(String categoryBalloonFunction){
		chartCursor.setFeature("categoryBalloonFunction", categoryBalloonFunction);
	}
	
	public String getCategoryBalloonText(){
		return (String) chartCursor.getFeature("categoryBalloonText");
	}
	
	public void setCategoryBalloonText(CategoryBalloonText categoryBalloonText){
		chartCursor.setFeature("categoryBalloonText", categoryBalloonText.toString());
	}
	
	public String getColor(){
		return (String) chartCursor.getFeature("color");
	}
	
	public void setColor(String color) throws ColorException{
		if(ColorValidator.checkFormatColor(color)){
			chartCursor.setFeature(color, color);
		}
	}
	
	public Object getCursorAlpha(){
		return chartCursor.getFeature("cursorAlpha");
	}
	
	public void setCursorAlpha(Number cursorAlpha) throws OutOfRangeException{
		if(NumberValidator.rangeDoubleValidator(cursorAlpha, 0, 1)){
			chartCursor.setFeature("cursorAlpha", cursorAlpha);
		}
	}
	
	public String getCursorColor(){
		return (String) chartCursor.getFeature("cursorColor");
	}
	
	public void setCursorColor(String cursorColor) throws ColorException{
		if(ColorValidator.checkFormatColor(cursorColor)){
			chartCursor.setFeature("cursorColor", cursorColor);
		}
	}
	
	public String getCursorPosition(){
		return (String) chartCursor.getFeature("cursorPosition");
	}
	
	public void setCursorPosition(CursorPosition cursorPosition){
		chartCursor.setFeature("cursorPosition", cursorPosition.toString());
	}
	
	@JsonProperty(value="enabled")
	public Boolean isEnabled(){
		return (Boolean) chartCursor.getFeature("enabled");
	}
	
	public void setEnabled(Boolean enabled){
		chartCursor.setFeature("enabled", enabled);
	}
	
	@JsonProperty(value="fullWidth")
	public Boolean isFullWidth(){
		return (Boolean) chartCursor.getFeature("fullWidth");
	}
	
	public void setFullWidth(Boolean fullWidth){
		chartCursor.setFeature("fullWidth", fullWidth);
	}
	
	public Object getGraphBulletAlpha(){
		return chartCursor.getFeature("graphBulletAlpha");
	}
	
	public void setGraphBulletAlpha(Number graphBulletAlpha) throws OutOfRangeException{
		if(NumberValidator.rangeDoubleValidator(graphBulletAlpha, 0, 1)){
			chartCursor.setFeature("graphBulletAlpha", graphBulletAlpha);
		}
	}
	
	public Object getGraphBulletSize(){
		return chartCursor.getFeature("graphBulletSize");
	}
	
	public void setGraphBulletSize(Number graphBulletSize) throws OutOfRangeException{
		if(AmchartsConstants.IMPROVED_VISIBILITY.equals("true")){
			if(NumberValidator.rangeDoubleValidator(graphBulletSize, 1, 20)){
				chartCursor.setFeature("graphBulletSize", graphBulletSize);
			}
		}else{
			chartCursor.setFeature("graphBulletSize", graphBulletSize);
		}
	}
	
	@JsonProperty(value="leaveCursor")
	public Boolean isLeaveCursor(){
		return (Boolean) chartCursor.getFeature("leaveCursor");
	}
	
	public void setLeaveCursor(Boolean leaveCursor){
		chartCursor.setFeature("leaveCursor", leaveCursor);
	}
	
	@JsonProperty(value="oneBalloonOnly")
	public Boolean isOneBalloonOnly(){
		return (Boolean) chartCursor.getFeature("oneBalloonOnly");
	}
	
	public void setOneBalloonOnly(Boolean oneBalloonOnly){
		chartCursor.setFeature("oneBalloonOnly", oneBalloonOnly);
	}
	
	@JsonProperty(value="pan")
	public Boolean isPan(){
		return (Boolean) chartCursor.getFeature("pan");
	}
	
	public void setPan(Boolean pan){
		chartCursor.setFeature("pan", pan);
	}
	
	public Object getSelectionAlpha(){
		return chartCursor.getFeature("selectionAlpha");
	}
	
	public void setSelectionAlpha(Number selectionAlpha) throws OutOfRangeException{
		if(NumberValidator.rangeDoubleValidator(selectionAlpha, 0, 1)){
			chartCursor.setFeature("selectionAlpha", selectionAlpha);
		}
	}
	
	@JsonProperty(value="selectWithoutZooming")
	public Boolean isSelectWithoutZooming(){
		return (Boolean) chartCursor.getFeature("selectWithoutZooming");
	}
	
	public void setSelectWithoutZooming(Boolean selectWithoutZooming){
		chartCursor.setFeature("selectWithoutZooming", selectWithoutZooming);
	}
	
	@JsonProperty(value="showNextAvailable")
	public Boolean isShowNextAvailable(){
		return (Boolean) chartCursor.getFeature("showNextAvailable");
	}
	
	public void setShowNextAvailable(Boolean showNextAvailable){
		chartCursor.setFeature("showNextAvailable", showNextAvailable);
	}
	
	@JsonProperty(value="valueBalloonsEnabled")
	public Boolean isValueBalloonsEnabled(){
		return (Boolean) chartCursor.getFeature("valueBalloonsEnabled");
	}
	
	public void setValueBalloonsEnabled(Boolean valueBalloonsEnabled){
		chartCursor.setFeature("valueBalloonsEnabled", valueBalloonsEnabled);
	}
	
	public Object getValueLineAlpha(){
		return chartCursor.getFeature("valueLineAlpha");
	}
	
	public void setValueLineAlpha(Number valueLineAlpha) throws OutOfRangeException{
		if(NumberValidator.rangeDoubleValidator(valueLineAlpha, 0, 1)){
			chartCursor.setFeature("valueLineAlpha", valueLineAlpha);
		}
	}
	
	public String getValueLineAxis(){
		return (String) chartCursor.getFeature("valueLineAxis");
	}
	
	public void setValueLineAxis(String valueLineAxis) throws ChartException{
		if(chart != null){
			if(chart.existValueAxis(valueLineAxis)){
				chartCursor.setFeature("valueLineAxis", valueLineAxis);
			}
		}else{
			if(Config.getString("log").equals("file")){
				logger.info(getClass().getSimpleName()+I18n.get("ChartException"));
			}
			throw new ChartException(getClass().getSimpleName()+I18n.get("ChartException"));
		}
	}
	
	@JsonProperty(value="valueLineBalloonEnabled")
	public Boolean isValueLineBalloonEnabled(){
		return (Boolean) chartCursor.getFeature("valueLineBalloonEnabled");
	}
	
	public void setValueLineBalloonEnabled(Boolean valueLineBalloonEnabled){
		chartCursor.setFeature("valueLineBalloonEnabled", valueLineBalloonEnabled);
	}
	
	@JsonProperty(value="valueLineEnabled")
	public Boolean isValueLineEnabled(){
		return (Boolean) chartCursor.getFeature("valueLineEnabled");
	}
	
	public void setValueLineEnabled(Boolean valueLineEnabled){
		chartCursor.setFeature("valueLineEnabled", valueLineEnabled);
	}
	
	@JsonProperty(value="zoomable")
	public Boolean isZoomable(){
		return (Boolean) chartCursor.getFeature("zoomable");
	}
	
	public void setZommable(Boolean zoomable){
		chartCursor.setFeature("zoomable", zoomable);
	}

}
