package es.uvigo.esei.amchartsJava.core.controllers.trendLines;

import java.io.Serializable;
import java.sql.Date;
import java.util.Observable;
import java.util.Observer;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import es.uvigo.esei.amchartsJava.core.api.trendLines.ITrendLineSerialChartController;
import es.uvigo.esei.amchartsJava.core.controllers.ImageController;
import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsJava.core.model.TrendLine;
import es.uvigo.esei.amchartsJava.core.model.charts.AmRectangularChart;
import es.uvigo.esei.amchartsJava.core.validators.ColorValidator;
import es.uvigo.esei.amchartsJava.core.validators.NumberValidator;

@JsonInclude(Include.NON_NULL)
public class TrendLineSerialChartController implements Observer, Serializable, ITrendLineSerialChartController {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8070134263297552359L;
	protected TrendLine trendLine;
	protected AmRectangularChart amchart;
	
	{
		trendLine = new TrendLine();
	}
	
	@Override
	public void update(Observable o, Object arg) {
		this.setId("TrendLine-"+arg.toString());	
	}
	
	@JsonIgnore
	public void setChart(AmRectangularChart chart) {
		amchart = chart;
	}
	
	private void setId(String id) {
		trendLine.setFeature("id", id);
			
	}

	public Object getDashLength(){
		return trendLine.getFeature("dashLength");
	}
	
	public void setDashLength(Number dashLength) throws OutOfRangeException{
		if(NumberValidator.rangeIntegerValidator(dashLength, 0, 16)){
			trendLine.setFeature("dashLength", dashLength);
		}
	}
	
	public Object getFinalCategory(){
		return trendLine.getFeature("finalCategory");
	}
	
	public void setFinalCategory(String finalCategory){
		trendLine.setFeature("finalCategory", finalCategory);
	}
	
	public Object getFinalDate(){
		return trendLine.getFeature("finalDate");
	}
	
	public void setFinalDate(Date finalDate){
		trendLine.setFeature("finalDate", finalDate.toString());
	}
	
	public Object getFinalValue(){
		return trendLine.getFeature("finalValue");
	}
	
	public void setFinalValue(Number finalValue){
		trendLine.setFeature("finalValue", finalValue);
	}
	
	public Object getId(){
		return trendLine.getFeature("id");
	}
	
	public Object getInitialCategory(){
		return trendLine.getFeature("initialCategory");
	}
	
	public void setInitialCategory(String initialCategory){
		trendLine.setFeature("initialCategory", initialCategory);
	}
	
	public Object getInitialDate(){
		return trendLine.getFeature("initialDate");
	}
	
	public void setInitialDate(Date initialDate){
		trendLine.setFeature("initialDate", initialDate.toString());
		
	}
	
	public Object getInitialValue(){
		return trendLine.getFeature("initialValue");
	}
	
	public void setInitialValue(Number initialValue){
		trendLine.setFeature("initialValue", initialValue);
	}
	
	public Object getLineAlpha(){
		return trendLine.getFeature("lineAlpha");
	}
	
	public void setLineAlpha(Number lineAlpha) throws OutOfRangeException{
		if(NumberValidator.rangeDoubleValidator(lineAlpha, 0, 1)){
			trendLine.setFeature("lineAlpha", lineAlpha);
		}
	}
	
	public Object getLineColor(){
		return trendLine.getFeature("lineColor");
	}
	
	public void setLineColor(String lineColor) throws ColorException{
		if(ColorValidator.checkFormatColor(lineColor)){
			trendLine.setFeature("lineColor", lineColor);
		}
	}
	
	public Object getLineThickness(){
		return trendLine.getFeature("lineThickness");
	}
	
	public void setLineThickness(Number lineThickness) throws OutOfRangeException{
		if(NumberValidator.rangeIntegerValidator(lineThickness, 0, 10)){
			trendLine.setFeature("lineThickness", lineThickness);
		}
	}
	
	public Object getValueAxis(){
		return trendLine.getFeature("valueAxis");
	}
	
	public void setValueAxis(String valueAxis){
		if(amchart.existValueAxis(valueAxis)){
			trendLine.setFeature("valueAxis", valueAxis);
		}
	}
	
	public Object getFinalImage(){
		return trendLine.getFinalImage();
	}
	
	public Object getInitialImage(){
		return trendLine.getInitialImage();
	}
	
	public void addFinalImage(ImageController finalImage){
		trendLine.addFinalImage(finalImage);
	}
	
	public void addInitialImage(ImageController initialImage){
		trendLine.addInitialImage(initialImage);
	}

}
