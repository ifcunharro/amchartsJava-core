package es.uvigo.esei.amchartsJava.core.controllers;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import es.uvigo.esei.amchartsJava.core.api.IChartScrollBarController;
import es.uvigo.esei.amchartsJava.core.constants.GraphTypesConstant.GraphType;
import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsJava.core.model.ChartScrollBar;
import es.uvigo.esei.amchartsJava.core.model.charts.AmRectangularChart;
import es.uvigo.esei.amchartsJava.core.validators.ColorValidator;
import es.uvigo.esei.amchartsJava.core.validators.NumberValidator;
import es.uvigo.esei.amchartsJava.core.validators.PathValidator;

@JsonInclude(Include.NON_NULL)
public class ChartScrollBarController implements Serializable, IChartScrollBarController {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1262906027402512218L;
	private ChartScrollBar scrollBar;
	private AmRectangularChart amchart;
	
	{
		scrollBar = new ChartScrollBar();
	}
	
	@JsonIgnore
	public void setChart(AmRectangularChart chart){
		amchart = chart;
	}
	
	
	@JsonProperty(value="autoGridCount")
	public Object isAutoGridCount(){
		return scrollBar.getFeature("autoGridCount");
	}
	
	public void setAutoGridCount(Boolean autoGridCount){
		scrollBar.setFeature("autoGridCount", autoGridCount);
	}
	
	public Object getBackgroundAlpha(){
		return scrollBar.getFeature("backgroundColor");
	}
	
	public void setBackgroundAlpha(Number backgroundAlpha) throws OutOfRangeException{
		if(NumberValidator.rangeDoubleValidator(backgroundAlpha, 0, 1)){
			scrollBar.setFeature("backgroundAlpha", backgroundAlpha);
		}
	}
	
	public Object getBackgroundColor(){
		return scrollBar.getFeature("backgroundColor");
	}
	
	public void setBackgroundColor(String backgroundColor) throws ColorException{
		if(ColorValidator.checkFormatColor(backgroundColor)){
			scrollBar.setFeature("backgroundColor", backgroundColor);
		}
	}
	
	public Object getColor(){
		return scrollBar.getFeature("color");
	}
	
	public void setColor(String color) throws ColorException{
		if(ColorValidator.checkFormatColor(color)){
			scrollBar.setFeature("color", color);
		}
	}
	
	public Object getDragIcon(){
		return scrollBar.getFeature("dragIcon");
	}
	
	public void setDragIcon(String dragIcon){
		String iconValidated = PathValidator.dragIconExist(dragIcon);
		if(iconValidated.length()>0){
			scrollBar.setFeature("dragIcon", dragIcon);
		}
	}
	
	public Object getDragIconHeight(){
		return scrollBar.getFeature("dragIconHeight");
	}
	
	public void setDragIconHeight(Number dragIconHeight) throws OutOfRangeException{
		if(NumberValidator.rangeIntegerValidator(dragIconHeight, 10, 35)){
			scrollBar.setFeature("dragIconHeight", dragIconHeight);
		}
	}
	
	public Object getDragIconWidth(){
		return scrollBar.getFeature("dragIconWidth");
	}
	
	public void setDragIconWidth(Number dragIconWidth) throws OutOfRangeException{
		if(NumberValidator.rangeIntegerValidator(dragIconWidth, 16, 35)){
			scrollBar.setFeature("dragIconHeight", dragIconWidth);
		}
	}
	
	@JsonProperty(value="enabled")
	public Object isEnabled(){
		return scrollBar.getFeature("enabled");
	}
	
	public void setEnabled(Boolean enabled){
		scrollBar.setFeature("enabled", enabled);
	}
	
	public Object getGraph(){
		return scrollBar.getFeature("graph");
	}
	
	public void setGraph(String graph){
		if(amchart.existGraph(graph)){
			scrollBar.setFeature("graph", graph);
		}
	}
	
	public Object getGraphFillAlpha(){
		return scrollBar.getFeature("graphFillAlpha");
	}
	
	public void setGraphFillAlpha(Number graphFillAlpha) throws OutOfRangeException{
		if(NumberValidator.rangeDoubleValidator(graphFillAlpha, 0, 1)){
			scrollBar.setFeature("graphFillAlpha", graphFillAlpha);
		}
	}
	
	public Object getGraphFillColor(){
		return scrollBar.getFeature("graphFillColor");
	}
	
	public void setGraphFillColor(String graphFillCOlor) throws ColorException{
		if(ColorValidator.checkFormatColor(graphFillCOlor)){
			scrollBar.setFeature("graphFillCOlor", graphFillCOlor);
		}
	}
	
	public Object getGraphLineAlpha(){
		return scrollBar.getFeature("graphLineAlpha");
	}
	
	public void setGraphLineAlpha(Number graphLineAlpha) throws OutOfRangeException{
		if(NumberValidator.rangeDoubleValidator(graphLineAlpha, 0, 1)){
			scrollBar.setFeature("graphLineAlpha", graphLineAlpha);
		}
	}
	
	public Object getGraphLineColor(){
		return scrollBar.getFeature("graphLineCOlor");
	}
	
	public void setGraphLineColor(String graphLineColor) throws ColorException{
		if(ColorValidator.checkFormatColor(graphLineColor)){
			scrollBar.setFeature("graphLineColor", graphLineColor);
		}
	}
	
	public Object getGraphType(){
		return scrollBar.getFeature("graphType");
	}
	
	public void setGraphType(GraphType graphType){
		scrollBar.setFeature("graphType", graphType.toString());
	}
	
	public Object getGridAlpha(){
		return scrollBar.getFeature("gridAlpha");
	}
	
	public void setGridAlpha(Number gridAlpha) throws OutOfRangeException{
		if(NumberValidator.rangeDoubleValidator(gridAlpha, 0, 1)){
			scrollBar.setFeature("gridAlpha", gridAlpha);
		}
	}
	
	public Object getGridColor(){
		return scrollBar.getFeature("gridColor");
	}
	
	public void setGridColor(String gridColor) throws ColorException{
		if(ColorValidator.checkFormatColor(gridColor)){
			scrollBar.setFeature("gridColor", gridColor);
		}
	}
	
	public Object getGridCount(){
		return scrollBar.getFeature("gridCount");
	}
	
	public void setGridCount(Number gridCount) throws OutOfRangeException{
		if(NumberValidator.rangeIntegerValidator(gridCount, 0, 15)){
			scrollBar.setFeature("gridCount", gridCount);
		}
	}
	
	@JsonProperty(value="hideResizeGrips")
	public Object isHideResizeGrips(){
		return scrollBar.getFeature("hideResizeGrips");
	}
	
	public void setHideResizeGrips(Boolean hideResizeGrips){
		scrollBar.setFeature("hideResizeGrips", hideResizeGrips);
	}
	
	@JsonProperty(value="ignoreCustomColors")
	public Object isIgnoreCustomColors(){
		return scrollBar.getFeature("ignoreCustomColors");
	}
	
	public void setIgnoreCustomColors(Boolean ignoreCustomColors){
		scrollBar.setFeature("ignoreCustomColors", ignoreCustomColors);
	}
	
	public Object getMaximum(){
		return scrollBar.getFeature("maximum");
	}
	
	public void setMaximum(Number maximum) throws IntegerException{
		if(NumberValidator.integerValidator(maximum)){
			scrollBar.setFeature("maximum", maximum);
		}
	}
	
	public Object getMinimum(){
		return scrollBar.getFeature("minimum");
	}
	
	public void setMinimum(Number minimum) throws IntegerException{
		if(NumberValidator.integerValidator(minimum)){
			scrollBar.setFeature("minimum", minimum);
		}
	}
	
	public Object getOffset(){
		return scrollBar.getFeature("offset");
	}
	
	public void setOffset(Number offset) throws OutOfRangeException{
		if(NumberValidator.rangeIntegerValidator(offset, 0, 80)){
			scrollBar.setFeature("offset", offset);
		}
	}
	
	@JsonProperty(value="oppositeAxis")
	public Object isOppositeAxis(){
		return scrollBar.getFeature("oppositeAxis");
	}
	
	public void setOppositeAxis(Boolean oppositeAxis){
		scrollBar.setFeature("oppositeAxis", oppositeAxis);
	}
	
	@JsonProperty(value="resizeEnabled")
	public Object isResizeEnabled(){
		return scrollBar.getFeature("resizeEnabled");
	}
	
	public void setResizeEnabled(Boolean resizeEnabled){
		scrollBar.setFeature("resizeEnabled", resizeEnabled);
	}
	
	public Object getScrollbarHeight(){
		return scrollBar.getFeature("scrollbarHeight");
	}
	
	public void setScrollbarHeight(Number scrollbarHeight) throws OutOfRangeException{
		if(NumberValidator.rangeIntegerValidator(scrollbarHeight, 10, 30)){
			scrollBar.setFeature("scrollbarHeight", scrollbarHeight);
		}
	}
	
	public Object getScrollDuration(){
		return scrollBar.getFeature("scrollbarDuration");
	}
	
	public void setScrollbarDuration(Number scrollbarDuration) throws IntegerException{
		if(NumberValidator.integerValidator(scrollbarDuration) && scrollbarDuration.intValue()>=0){
			scrollBar.setFeature("scrollbarDuration", scrollbarDuration);
		}
	}
	
	public Object getSelectedBackgroundAlpha(){
		return scrollBar.getFeature("selectedBackGroundAlpha");
	}
	
	public void setSelectedBackgroundAlpha(Number selectedBackgroundAlpha) throws OutOfRangeException{
		if(NumberValidator.rangeDoubleValidator(selectedBackgroundAlpha, 0, 1)){
			scrollBar.setFeature("selectedBackgroundAlpha", selectedBackgroundAlpha);
		}
	}
	
	public Object getSelectedBackgroundColor(){
		return scrollBar.getFeature("selectedBackgroundColor");
	}
	
	public void setSelectedBackgroundColor(String selectedBackgroundColor) throws ColorException{
		if(ColorValidator.checkFormatColor(selectedBackgroundColor)){
			scrollBar.setFeature("selectedBackgroundColor", selectedBackgroundColor);
		}
	}
	
	public Object getSelectedGraphFillAlpha(){
		return scrollBar.getFeature("selectedGraphFillAlpha");
	}
	
	public void setSelectedGraphFillAlpha(Number selectedGraphFillAlpha) throws OutOfRangeException{
		if(NumberValidator.rangeDoubleValidator(selectedGraphFillAlpha, 0, 1)){
			scrollBar.setFeature("selectedGraphFillAlpha", selectedGraphFillAlpha);
		}
	}
	
	public Object getSelectedGraphFillColor(){
		return scrollBar.getFeature("selectedGraphFillColor");
	}
	
	public void setSelectedGraphFillColor(String selectedGraphFillColor) throws ColorException{
		if(ColorValidator.checkFormatColor(selectedGraphFillColor)){
			scrollBar.setFeature("selectedGraphFillColor", selectedGraphFillColor);
		}
	}
	
	public Object getSelectedGraphLineAlpha(){
		return scrollBar.getFeature("selectedGraphLineAlpha");
	}
	
	public void setSelectedGraphLineAlpha(Number selectedGraphLineAlpha) throws OutOfRangeException{
		if(NumberValidator.rangeDoubleValidator(selectedGraphLineAlpha, 0, 1)){
			scrollBar.setFeature("selectedGraphLineAlpha", selectedGraphLineAlpha);
		}
	}
	
	public Object getSelectedGraphLineColor(){
		return scrollBar.getFeature("selectedGraphLineColor");
	}
	
	public void setSelectedGraphLineColor(String selectedGraphLineColor) throws ColorException{
		if(ColorValidator.checkFormatColor(selectedGraphLineColor)){
			scrollBar.setFeature("selectedGraphLineColor", selectedGraphLineColor);
		}
	}
	
	@JsonProperty(value="updateOnReleaseOnly")
	public Object isUpdateOnReleaseOnly(){
		return scrollBar.getFeature("updateOnReleaseOnly");
	}
	
	public void setUpdateOnReleaseOnly(Boolean updateOnReleaseOnly){
		scrollBar.setFeature("updateOnReleaseOnly", updateOnReleaseOnly);
	}

}
