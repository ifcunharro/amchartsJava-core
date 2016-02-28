package es.uvigo.esei.amchartsJava.core.controllers;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import es.uvigo.esei.amchartsJava.core.api.IChartScrollbarController;
import es.uvigo.esei.amchartsJava.core.constants.AmchartsConstants;
import es.uvigo.esei.amchartsJava.core.constants.GraphType;
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

/**
 * This class is a controller for ChartScrollbar.
 * @author Iago Fernández Cuñarro
 *
 */
@JsonInclude(Include.NON_NULL)
public class ChartScrollbarController implements Serializable, IChartScrollbarController {

	private static final long serialVersionUID = 1262906027402512218L;
	private ChartScrollbar scrollbar;
	private AmRectangularChart amchart;

	
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
	
	public Double getBackgroundAlpha(){
		Object backgroundAlpha = scrollbar.getFeature("backgroundAlpha");
		
		return backgroundAlpha != null ? ((Number)backgroundAlpha).doubleValue() : null;
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
	
	public Integer getDragIconHeight(){
		Object dragIconHeight = scrollbar.getFeature("dragIconHeight");
		
		return dragIconHeight != null ? ((Number)dragIconHeight).intValue() : null;
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
	
	public Integer getDragIconWidth(){
		Object dragIconWidth = scrollbar.getFeature("dragIconWidth");
		
		return dragIconWidth != null ? ((Number)dragIconWidth).intValue() : null;
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
			throw new ChartException(getClass().getSimpleName()+I18n.get("ChartException"));
		}
	}
	
	public Double getGraphFillAlpha(){
		Object graphFillAlpha = scrollbar.getFeature("graphFillAlpha");
		
		return graphFillAlpha != null ? ((Number)graphFillAlpha).doubleValue() : null;
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
	
	public Double getGraphLineAlpha(){
		Object graphLineAlpha = scrollbar.getFeature("graphLineAlpha");
		
		return graphLineAlpha != null ? ((Number)graphLineAlpha).doubleValue() : null;
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
	
	public Double getGridAlpha(){
		Object gridAlpha = scrollbar.getFeature("gridAlpha");
		
		return gridAlpha != null ? ((Number)gridAlpha).doubleValue() : null;
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
	
	public Integer getGridCount(){
		Object gridCount = scrollbar.getFeature("gridCount");
		
		return gridCount != null ? ((Number)gridCount).intValue() : null;
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
	
	public Integer getMaximum(){
		Object maximum = scrollbar.getFeature("maximum");
		
		return maximum != null ? ((Number)maximum).intValue() : null;
	}
	
	public void setMaximum(Number maximum) throws IntegerException{
		if(NumberValidator.integerValidator(maximum)){
			scrollbar.setFeature("maximum", maximum);
		}
	}
	
	public Integer getMinimum(){
		Object minimum = scrollbar.getFeature("minimum");
		
		return minimum != null ? ((Number)minimum).intValue() : null;
	}
	
	public void setMinimum(Number minimum) throws IntegerException{
		if(NumberValidator.integerValidator(minimum)){
			scrollbar.setFeature("minimum", minimum);
		}
	}
	
	public Integer getOffset(){
		Object offset = scrollbar.getFeature("offset");
		
		return offset != null ? ((Number)offset).intValue() : null;
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
	
	public Integer getScrollbarHeight(){
		Object scrollbarHeight = scrollbar.getFeature("scrollbarHeight");
		
		return scrollbarHeight != null ? ((Number)scrollbarHeight).intValue() : null;
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
	
	public Integer getScrollDuration(){
		Object scrollDuration = scrollbar.getFeature("scrollDuration");
		
		return scrollDuration != null ? ((Number)scrollDuration).intValue() : null;
	}
	
	public void setScrollDuration(Number scrollDuration) throws IntegerException{
		if(NumberValidator.integerValidator(scrollDuration) && scrollDuration.intValue()>=0){
			scrollbar.setFeature("scrollDuration", scrollDuration);
		}
	}
	
	public Double getSelectedBackgroundAlpha(){
		Object selectedBackgroundAlpha = scrollbar.getFeature("selectedBackgroundAlpha");
		
		return selectedBackgroundAlpha != null ? ((Number)selectedBackgroundAlpha).doubleValue() : null;
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
	
	public Double getSelectedGraphFillAlpha(){
		Object selectedGraphFillAlpha = scrollbar.getFeature("selectedGraphFillAlpha");
		
		return selectedGraphFillAlpha != null ? ((Number)selectedGraphFillAlpha).doubleValue() : null;
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
	
	public Double getSelectedGraphLineAlpha(){
		Object selectedGraphLineAlpha = scrollbar.getFeature("selectedGraphLineAlpha");
		
		return selectedGraphLineAlpha != null ? ((Number)selectedGraphLineAlpha).doubleValue() : null;
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
