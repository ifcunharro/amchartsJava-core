package es.uvigo.esei.amchartsJava.core.controllers;

import java.io.Serializable;

import org.apache.log4j.Logger;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import es.uvigo.esei.amchartsJava.core.api.IChartScrollbarController;
import es.uvigo.esei.amchartsJava.core.constants.AmchartsConstants;
import es.uvigo.esei.amchartsJava.core.constants.GraphTypesConstant.GraphType;
import es.uvigo.esei.amchartsJava.core.constants.config.Config;
import es.uvigo.esei.amchartsJava.core.constants.lang.I18n;
import es.uvigo.esei.amchartsJava.core.exceptions.ChartException;
import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsJava.core.model.ChartScrollbar;
import es.uvigo.esei.amchartsJava.core.model.charts.AmRectangularChart;
import es.uvigo.esei.amchartsJava.core.validators.ColorValidator;
import es.uvigo.esei.amchartsJava.core.validators.NumberValidator;
import es.uvigo.esei.amchartsJava.core.validators.PathValidator;

@JsonInclude(Include.NON_NULL)
public class ChartScrollbarController implements Serializable, IChartScrollbarController {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1262906027402512218L;
	private ChartScrollbar scrollbar;
	private AmRectangularChart amchart;
	private static final Logger logger = Logger.getLogger(ChartScrollbarController.class.getName());

	
	{
		scrollbar = new ChartScrollbar();
	}
	
	@JsonIgnore
	public void setChart(AmRectangularChart chart){
		amchart = chart;
	}
	
	
	@JsonProperty(value="autoGridCount")
	public Boolean isAutoGridCount(){
		return (Boolean) scrollbar.getFeature("autoGridCount");
	}
	
	public void setAutoGridCount(Boolean autoGridCount){
		scrollbar.setFeature("autoGridCount", autoGridCount);
	}
	
	public Object getBackgroundAlpha(){
		return scrollbar.getFeature("backgroundAlpha");
	}
	
	public void setBackgroundAlpha(Number backgroundAlpha) throws OutOfRangeException{
		if(NumberValidator.rangeDoubleValidator(backgroundAlpha, 0, 1)){
			scrollbar.setFeature("backgroundAlpha", backgroundAlpha);
		}
	}
	
	public String getBackgroundColor(){
		return (String) scrollbar.getFeature("backgroundColor");
	}
	
	public void setBackgroundColor(String backgroundColor) throws ColorException{
		if(ColorValidator.checkFormatColor(backgroundColor)){
			scrollbar.setFeature("backgroundColor", backgroundColor);
		}
	}
	
	public String getColor(){
		return (String) scrollbar.getFeature("color");
	}
	
	public void setColor(String color) throws ColorException{
		if(ColorValidator.checkFormatColor(color)){
			scrollbar.setFeature("color", color);
		}
	}
	
	public String getDragIcon(){
		return (String) scrollbar.getFeature("dragIcon");
	}
	
	public void setDragIcon(String dragIcon){
		String iconValidated = PathValidator.dragIconExist(dragIcon);
		if(iconValidated.length()>0){
			scrollbar.setFeature("dragIcon", dragIcon);
		}
	}
	
	public Object getDragIconHeight(){
		return scrollbar.getFeature("dragIconHeight");
	}
	
	public void setDragIconHeight(Number dragIconHeight) throws OutOfRangeException{
		if(AmchartsConstants.IMPROVED_VISIBILITY.equals("true")){
			if(NumberValidator.rangeIntegerValidator(dragIconHeight, 10, 35)){
				scrollbar.setFeature("dragIconHeight", dragIconHeight);
			}
		}else{
			scrollbar.setFeature("dragIconHeight", dragIconHeight);
		}
	}
	
	public Object getDragIconWidth(){
		return scrollbar.getFeature("dragIconWidth");
	}
	
	public void setDragIconWidth(Number dragIconWidth) throws OutOfRangeException{
		if(AmchartsConstants.IMPROVED_VISIBILITY.equals("true")){
			if(NumberValidator.rangeIntegerValidator(dragIconWidth, 16, 35)){
				scrollbar.setFeature("dragIconWidth", dragIconWidth);
			}
		}else{
			scrollbar.setFeature("dragIconWidth", dragIconWidth);
		}
	}
	
	@JsonProperty(value="enabled")
	public Boolean isEnabled(){
		return (Boolean) scrollbar.getFeature("enabled");
	}
	
	public void setEnabled(Boolean enabled){
		scrollbar.setFeature("enabled", enabled);
	}
	
	public String getGraph(){
		return (String) scrollbar.getFeature("graph");
	}
	
	public void setGraph(String graph) throws ChartException{
		if(amchart != null){
			if(amchart.existGraph(graph)){
				scrollbar.setFeature("graph", graph);
			}
		}else{
			if(Config.getString("log").equals("file")){
				logger.info(getClass().getSimpleName()+I18n.get("ChartException"));
			}
			throw new ChartException(getClass().getSimpleName()+I18n.get("ChartException"));
		}
	}
	
	public Object getGraphFillAlpha(){
		return scrollbar.getFeature("graphFillAlpha");
	}
	
	public void setGraphFillAlpha(Number graphFillAlpha) throws OutOfRangeException{
		if(NumberValidator.rangeDoubleValidator(graphFillAlpha, 0, 1)){
			scrollbar.setFeature("graphFillAlpha", graphFillAlpha);
		}
	}
	
	public String getGraphFillColor(){
		return (String) scrollbar.getFeature("graphFillColor");
	}
	
	public void setGraphFillColor(String graphFillColor) throws ColorException{
		if(ColorValidator.checkFormatColor(graphFillColor)){
			scrollbar.setFeature("graphFillColor", graphFillColor);
		}
	}
	
	public Object getGraphLineAlpha(){
		return scrollbar.getFeature("graphLineAlpha");
	}
	
	public void setGraphLineAlpha(Number graphLineAlpha) throws OutOfRangeException{
		if(NumberValidator.rangeDoubleValidator(graphLineAlpha, 0, 1)){
			scrollbar.setFeature("graphLineAlpha", graphLineAlpha);
		}
	}
	
	public String getGraphLineColor(){
		return (String) scrollbar.getFeature("graphLineColor");
	}
	
	public void setGraphLineColor(String graphLineColor) throws ColorException{
		if(ColorValidator.checkFormatColor(graphLineColor)){
			scrollbar.setFeature("graphLineColor", graphLineColor);
		}
	}
	
	public String getGraphType(){
		return (String) scrollbar.getFeature("graphType");
	}
	
	public void setGraphType(GraphType graphType){
		scrollbar.setFeature("graphType", graphType.toString());
	}
	
	public Object getGridAlpha(){
		return scrollbar.getFeature("gridAlpha");
	}
	
	public void setGridAlpha(Number gridAlpha) throws OutOfRangeException{
		if(NumberValidator.rangeDoubleValidator(gridAlpha, 0, 1)){
			scrollbar.setFeature("gridAlpha", gridAlpha);
		}
	}
	
	public String getGridColor(){
		return (String) scrollbar.getFeature("gridColor");
	}
	
	public void setGridColor(String gridColor) throws ColorException{
		if(ColorValidator.checkFormatColor(gridColor)){
			scrollbar.setFeature("gridColor", gridColor);
		}
	}
	
	public Object getGridCount(){
		return scrollbar.getFeature("gridCount");
	}
	
	public void setGridCount(Number gridCount) throws OutOfRangeException{
		if(AmchartsConstants.IMPROVED_VISIBILITY.equals("true")){
			if(NumberValidator.rangeIntegerValidator(gridCount, 0, 15)){
				scrollbar.setFeature("gridCount", gridCount);
			}
		}else{
			scrollbar.setFeature("gridCount", gridCount);
		}
	}
	
	@JsonProperty(value="hideResizeGrips")
	public Boolean isHideResizeGrips(){
		return (Boolean) scrollbar.getFeature("hideResizeGrips");
	}
	
	public void setHideResizeGrips(Boolean hideResizeGrips){
		scrollbar.setFeature("hideResizeGrips", hideResizeGrips);
	}
	
	@JsonProperty(value="ignoreCustomColors")
	public Boolean isIgnoreCustomColors(){
		return (Boolean) scrollbar.getFeature("ignoreCustomColors");
	}
	
	public void setIgnoreCustomColors(Boolean ignoreCustomColors){
		scrollbar.setFeature("ignoreCustomColors", ignoreCustomColors);
	}
	
	public Object getMaximum(){
		return scrollbar.getFeature("maximum");
	}
	
	public void setMaximum(Number maximum) throws IntegerException{
		if(NumberValidator.integerValidator(maximum)){
			scrollbar.setFeature("maximum", maximum);
		}
	}
	
	public Object getMinimum(){
		return scrollbar.getFeature("minimum");
	}
	
	public void setMinimum(Number minimum) throws IntegerException{
		if(NumberValidator.integerValidator(minimum)){
			scrollbar.setFeature("minimum", minimum);
		}
	}
	
	public Object getOffset(){
		return scrollbar.getFeature("offset");
	}
	
	public void setOffset(Number offset) throws OutOfRangeException{
		if(AmchartsConstants.IMPROVED_VISIBILITY.equals("true")){
			if(NumberValidator.rangeIntegerValidator(offset, 0, 80)){
				scrollbar.setFeature("offset", offset);
			}
		}
	}
	
	@JsonProperty(value="oppositeAxis")
	public Boolean isOppositeAxis(){
		return (Boolean) scrollbar.getFeature("oppositeAxis");
	}
	
	public void setOppositeAxis(Boolean oppositeAxis){
		scrollbar.setFeature("oppositeAxis", oppositeAxis);
	}
	
	@JsonProperty(value="resizeEnabled")
	public Boolean isResizeEnabled(){
		return (Boolean) scrollbar.getFeature("resizeEnabled");
	}
	
	public void setResizeEnabled(Boolean resizeEnabled){
		scrollbar.setFeature("resizeEnabled", resizeEnabled);
	}
	
	public Object getScrollbarHeight(){
		return scrollbar.getFeature("scrollbarHeight");
	}
	
	public void setScrollbarHeight(Number scrollbarHeight) throws OutOfRangeException{
		if(AmchartsConstants.IMPROVED_VISIBILITY.equals("true")){
			if(NumberValidator.rangeIntegerValidator(scrollbarHeight, 10, 30)){
				scrollbar.setFeature("scrollbarHeight", scrollbarHeight);
			}
		}else{
			scrollbar.setFeature("scrollbarHeight", scrollbarHeight);
		}
	}
	
	public Object getScrollDuration(){
		return scrollbar.getFeature("scrollDuration");
	}
	
	public void setScrollDuration(Number scrollDuration) throws IntegerException{
		if(NumberValidator.integerValidator(scrollDuration) && scrollDuration.intValue()>=0){
			scrollbar.setFeature("scrollDuration", scrollDuration);
		}
	}
	
	public Object getSelectedBackgroundAlpha(){
		return scrollbar.getFeature("selectedBackgroundAlpha");
	}
	
	public void setSelectedBackgroundAlpha(Number selectedBackgroundAlpha) throws OutOfRangeException{
		if(NumberValidator.rangeDoubleValidator(selectedBackgroundAlpha, 0, 1)){
			scrollbar.setFeature("selectedBackgroundAlpha", selectedBackgroundAlpha);
		}
	}
	
	public String getSelectedBackgroundColor(){
		return (String) scrollbar.getFeature("selectedBackgroundColor");
	}
	
	public void setSelectedBackgroundColor(String selectedBackgroundColor) throws ColorException{
		if(ColorValidator.checkFormatColor(selectedBackgroundColor)){
			scrollbar.setFeature("selectedBackgroundColor", selectedBackgroundColor);
		}
	}
	
	public Object getSelectedGraphFillAlpha(){
		return scrollbar.getFeature("selectedGraphFillAlpha");
	}
	
	public void setSelectedGraphFillAlpha(Number selectedGraphFillAlpha) throws OutOfRangeException{
		if(NumberValidator.rangeDoubleValidator(selectedGraphFillAlpha, 0, 1)){
			scrollbar.setFeature("selectedGraphFillAlpha", selectedGraphFillAlpha);
		}
	}
	
	public String getSelectedGraphFillColor(){
		return (String) scrollbar.getFeature("selectedGraphFillColor");
	}
	
	public void setSelectedGraphFillColor(String selectedGraphFillColor) throws ColorException{
		if(ColorValidator.checkFormatColor(selectedGraphFillColor)){
			scrollbar.setFeature("selectedGraphFillColor", selectedGraphFillColor);
		}
	}
	
	public Object getSelectedGraphLineAlpha(){
		return scrollbar.getFeature("selectedGraphLineAlpha");
	}
	
	public void setSelectedGraphLineAlpha(Number selectedGraphLineAlpha) throws OutOfRangeException{
		if(NumberValidator.rangeDoubleValidator(selectedGraphLineAlpha, 0, 1)){
			scrollbar.setFeature("selectedGraphLineAlpha", selectedGraphLineAlpha);
		}
	}
	
	public String getSelectedGraphLineColor(){
		return (String) scrollbar.getFeature("selectedGraphLineColor");
	}
	
	public void setSelectedGraphLineColor(String selectedGraphLineColor) throws ColorException{
		if(ColorValidator.checkFormatColor(selectedGraphLineColor)){
			scrollbar.setFeature("selectedGraphLineColor", selectedGraphLineColor);
		}
	}
	
	@JsonProperty(value="updateOnReleaseOnly")
	public Boolean isUpdateOnReleaseOnly(){
		return (Boolean) scrollbar.getFeature("updateOnReleaseOnly");
	}
	
	public void setUpdateOnReleaseOnly(Boolean updateOnReleaseOnly){
		scrollbar.setFeature("updateOnReleaseOnly", updateOnReleaseOnly);
	}

}
