package es.uvigo.esei.amchartsJava.core.controllers;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import es.uvigo.esei.amchartsJava.core.api.IChartCursorController;
import es.uvigo.esei.amchartsJava.core.constants.CategoryBalloonTextConstant.CategoryBalloonText;
import es.uvigo.esei.amchartsJava.core.constants.CursorPositionConstant.CursorPosition;
import es.uvigo.esei.amchartsJava.core.constants.OrientationConstant.Orientation;
import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsJava.core.model.ChartCursor;
import es.uvigo.esei.amchartsJava.core.model.charts.AmRectangularChart;
import es.uvigo.esei.amchartsJava.core.validators.ColorValidator;
import es.uvigo.esei.amchartsJava.core.validators.NumberValidator;
import es.uvigo.esei.amchartsJava.core.validators.StringValidator;

@JsonInclude(Include.NON_NULL)
public class ChartCursorController implements Serializable, IChartCursorController {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1995587507218823504L;
	private ChartCursor chartCursor;
	private AmRectangularChart chart;
	
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
		if(NumberValidator.rangeFloatValidator(animationDuration, 0, 1)){
			chartCursor.setFeature("animationDuration", animationDuration);
		}
	}
	
	@JsonProperty(value="avoidBalloonOverlapping")
	public Object isAvoidBalloonOverlapping(){
		return chartCursor.getFeature("avoidBalloonOverlapping");
	}
	
	public void setAvoidBalloonOverlapping(Boolean avoidBalloonOverlapping){
		chartCursor.setFeature("avoidBalloonOverlapping", avoidBalloonOverlapping);
	}
	
	public Object getBalloonPointerOrientation(){
		return chartCursor.getFeature("balloonPointerOrientation");
	}
	
	public void setBalloonPointerOrientation(Orientation balloonPointerOrientation){
		chartCursor.setFeature("balloonPointerOrientation", balloonPointerOrientation.toString());
	}
	
	@JsonProperty(value="bulletsEnabled")
	public Object isBulletsEnabled(){
		return chartCursor.getFeature("bulletsEnabled");
	}
	
	public void setBulletsEnabled(Boolean bulletsEnabled){
		chartCursor.setFeature("bulletsEnabled", bulletsEnabled);
	}
	
	public Object getBulletSize(){
		return chartCursor.getFeature("bulletSize");
	}
	
	public void setBulletSize(Number bulletSize) throws OutOfRangeException{
		if(NumberValidator.rangeIntegerValidator(bulletSize, 8, 20)){
			chartCursor.setFeature("bulletSize", bulletSize);
		}
	}
	
	public Object getCategoryBallonAlpha(){
		return chartCursor.getFeature("categoryBallonAlpha");
	}
	
	public void setCategoryBalloonAlpha(Number categoryBalloonAlpha) throws OutOfRangeException{
		if(NumberValidator.rangeFloatValidator(categoryBalloonAlpha, 0, 1)){
			chartCursor.setFeature("categoryBalloonAlpha", categoryBalloonAlpha);
		}
	}
	
	public Object getCategoryBalloonColor(){
		return chartCursor.getFeature("categoryBalloonColor");
	}
	
	public void setCategoryBallonColor(String categoryBalloonColor) throws ColorException{
		if(ColorValidator.checkFormatColor(categoryBalloonColor)){
			chartCursor.setFeature("categoryBalloonColor", categoryBalloonColor);
		}
	}
	
	public Object getCategoryBalloonDateFormat(){
		return chartCursor.getFeature("categoryBalloonDateFormat");
	}
	
	public void setCategoryBalloonDateFormat(String categoryBalloonDateFormat){
		if(StringValidator.checkDateFormat(categoryBalloonDateFormat)){
			chartCursor.setFeature("categoryBalloonDateFormat", categoryBalloonDateFormat);
		}
	}
	
	@JsonProperty(value="categoryBalloonEnabled")
	public Object isCategoryBalloonEnabled(){
		return chartCursor.getFeature("categoryBalloobEnabled");
	}
	
	public void setCategoryBalloonEnaled(Boolean categoryBalloonEnabled){
		chartCursor.setFeature("categoryBalloonEnabled", categoryBalloonEnabled);
	}
	
	public Object getCategoryBalloonFunction(){
		return chartCursor.getFeature("categoryBalloonFunction");
	}
	
	public void setCategoryBalloonFunction(String categoryBalloonFunction){
		chartCursor.setFeature("categoryBalloonFunction", categoryBalloonFunction);
	}
	
	public Object getCategoryBalloonText(){
		return chartCursor.getFeature("categoryBalloonText");
	}
	
	public void setCategoryBalloonText(CategoryBalloonText categoryBalloonText){
		chartCursor.setFeature("categoryBalloonText", categoryBalloonText.toString());
	}
	
	public Object getColor(){
		return chartCursor.getFeature("color");
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
		if(NumberValidator.rangeFloatValidator(cursorAlpha, 0, 1)){
			chartCursor.setFeature("cursorAlpha", cursorAlpha);
		}
	}
	
	public Object getCursorColor(){
		return chartCursor.getFeature("cursorColor");
	}
	
	public void setCursorColor(String cursorColor) throws ColorException{
		if(ColorValidator.checkFormatColor(cursorColor)){
			chartCursor.setFeature("cursorColor", cursorColor);
		}
	}
	
	public Object getCursorPosition(){
		return chartCursor.getFeature("cursorPosition");
	}
	
	public void setCursorPosition(CursorPosition cursorPosition){
		chartCursor.setFeature("cursorPosition", cursorPosition.toString());
	}
	
	@JsonProperty(value="enabled")
	public Object isEnabled(){
		return chartCursor.getFeature("enabled");
	}
	
	public void setEnabled(Boolean enabled){
		chartCursor.setFeature("enabled", enabled);
	}
	
	@JsonProperty(value="fullWidth")
	public Object isFullWidth(){
		return chartCursor.getFeature("fullWidth");
	}
	
	public void setFullWidth(Boolean fullWidth){
		chartCursor.setFeature("fullWidth", fullWidth);
	}
	
	public Object getGraphBulletAlpha(){
		return chartCursor.getFeature("graphBulletAlpha");
	}
	
	public void setGraphBulletAlpha(Number graphBulletAlpha) throws OutOfRangeException{
		if(NumberValidator.rangeFloatValidator(graphBulletAlpha, 0, 1)){
			chartCursor.setFeature("graphBulletAlpha", graphBulletAlpha);
		}
	}
	
	public Object getGraphBulletSize(){
		return chartCursor.getFeature("graphBulletSize");
	}
	
	public void setGraphBulletSize(Number graphBulletSize) throws OutOfRangeException{
		if(NumberValidator.rangeFloatValidator(graphBulletSize, 1, 20)){
			chartCursor.setFeature("graphBulletSize", graphBulletSize);
		}
	}
	
	@JsonProperty(value="leaveCursor")
	public Object isLeaveCursor(){
		return chartCursor.getFeature("leaveCursor");
	}
	
	public void setLeaveCursor(Boolean leaveCursor){
		chartCursor.setFeature("leaveCursor", leaveCursor);
	}
	
	@JsonProperty(value="oneBalloonOnly")
	public Object isOneBalloonOnly(){
		return chartCursor.getFeature("oneBalloonOnly");
	}
	
	public void setOneBalloonOnly(Boolean oneBalloonOnly){
		chartCursor.setFeature("oneBalloonOnly", oneBalloonOnly);
	}
	
	@JsonProperty(value="pan")
	public Object isPan(){
		return chartCursor.getFeature("pan");
	}
	
	public void setPan(Boolean pan){
		chartCursor.setFeature("pan", pan);
	}
	
	public Object getSelectionAlpha(){
		return chartCursor.getFeature("selectionAlpha");
	}
	
	public void setSelectionAlpha(Number selectionAlpha) throws OutOfRangeException{
		if(NumberValidator.rangeFloatValidator(selectionAlpha, 0, 1)){
			chartCursor.setFeature("selectionAlpha", selectionAlpha);
		}
	}
	
	@JsonProperty(value="selectWithoutZooming")
	public Object isSelectWithoutZooming(){
		return chartCursor.getFeature("selectWithoutZooming");
	}
	
	public void setSelectWithoutZooming(Boolean selectWithoutZooming){
		chartCursor.setFeature("selectWithoutZooming", selectWithoutZooming);
	}
	
	@JsonProperty(value="showNextAvailable")
	public Object isShowNextAvailable(){
		return chartCursor.getFeature("showNextAvailable");
	}
	
	public void setShowNextAvailable(Boolean showNextAvailable){
		chartCursor.setFeature("showNextAvailable", showNextAvailable);
	}
	
	@JsonProperty(value="valueBalloonsEnabled")
	public Object isValueBalloonsEnabled(){
		return chartCursor.getFeature("valueBalloonsEnabled");
	}
	
	public void setValueBalloonsEnabled(Boolean valueBalloonsEnabled){
		chartCursor.setFeature("valueBalloonsEnabled", valueBalloonsEnabled);
	}
	
	public Object getValueLineAlpha(){
		return chartCursor.getFeature("valueLineAlpha");
	}
	
	public void setValueLineAlpha(Number valueLineAlpha) throws OutOfRangeException{
		if(NumberValidator.rangeFloatValidator(valueLineAlpha, 0, 1)){
			chartCursor.setFeature("valueLineAlpha", valueLineAlpha);
		}
	}
	
	public Object getValueLineAxis(){
		return chartCursor.getFeature("valueLineAxis");
	}
	
	public void setValueLineAxis(String valueLineAxis){
		if(chart.existValueAxis(valueLineAxis)){
			chartCursor.setFeature("valueLineAxis", valueLineAxis);
		}
	}
	
	@JsonProperty(value="valueLineBalloonEnabled")
	public Object isValueLineBalloonEnabled(){
		return chartCursor.getFeature("valueLineBalloonEnabled");
	}
	
	public void setValueLineBalloonEnabled(Boolean valueLineBalloonEnabled){
		chartCursor.setFeature("valueLineBalloonEnabled", valueLineBalloonEnabled);
	}
	
	@JsonProperty(value="valueLineEnabled")
	public Object isValueLineEnabled(){
		return chartCursor.getFeature("valueLineEnabled");
	}
	
	public void setValueLineEnabled(Boolean valueLineEnabled){
		chartCursor.setFeature("valueLineEnabled", valueLineEnabled);
	}
	
	@JsonProperty(value="zoomable")
	public Object isZoomable(){
		return chartCursor.getFeature("zoomable");
	}
	
	public void setZommable(Boolean zoomable){
		chartCursor.setFeature("zoomable", zoomable);
	}

}
