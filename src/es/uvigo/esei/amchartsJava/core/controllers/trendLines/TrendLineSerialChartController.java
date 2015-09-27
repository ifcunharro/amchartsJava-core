package es.uvigo.esei.amchartsJava.core.controllers.trendLines;

import java.io.Serializable;
import java.sql.Date;
import java.util.Observable;
import java.util.Observer;

import org.apache.log4j.Logger;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonSetter;

import es.uvigo.esei.amchartsJava.core.api.trendLines.ITrendLineSerialChartController;
import es.uvigo.esei.amchartsJava.core.constants.AmchartsConstants;
import es.uvigo.esei.amchartsJava.core.constants.Config;
import es.uvigo.esei.amchartsJava.core.constants.lang.I18n;
import es.uvigo.esei.amchartsJava.core.controllers.ImageController;
import es.uvigo.esei.amchartsJava.core.exceptions.ChartException;
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
	private static final Logger logger = Logger.getLogger(TrendLineSerialChartController.class.getName());

	
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
		if(AmchartsConstants.IMPROVED_VISIBILITY.equals("true")){
			if(NumberValidator.rangeIntegerValidator(dashLength, 0, 16)){
				trendLine.setFeature("dashLength", dashLength);
			}
		}else{
			trendLine.setFeature("dashLength", dashLength);
		}
	}
	
	public String getFinalCategory(){
		return (String) trendLine.getFeature("finalCategory");
	}
	
	public void setFinalCategory(String finalCategory){
		trendLine.setFeature("finalCategory", finalCategory);
	}
	
	public String getFinalDate(){
		return (String) trendLine.getFeature("finalDate");
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
	
	public String getId(){
		return (String) trendLine.getFeature("id");
	}
	
	public String getInitialCategory(){
		return (String) trendLine.getFeature("initialCategory");
	}
	
	public void setInitialCategory(String initialCategory){
		trendLine.setFeature("initialCategory", initialCategory);
	}
	
	public String getInitialDate(){
		return (String) trendLine.getFeature("initialDate");
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
	
	public String getLineColor(){
		return (String) trendLine.getFeature("lineColor");
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
		if(AmchartsConstants.IMPROVED_VISIBILITY.equals("true")){
			if(NumberValidator.rangeIntegerValidator(lineThickness, 0, 10)){
				trendLine.setFeature("lineThickness", lineThickness);
			}
		}else{
			trendLine.setFeature("lineThickness", lineThickness);
		}
	}
	
	public String getValueAxis(){
		return (String) trendLine.getFeature("valueAxis");
	}
	
	public void setValueAxis(String valueAxis) throws ChartException{
		if(amchart != null){
			if(amchart.existValueAxis(valueAxis)){
				trendLine.setFeature("valueAxis", valueAxis);
			}
		}else{
			if(Config.getString("log").equals("file")){
				logger.info(getClass().getSimpleName()+I18n.get("ChartException"));
			}
			throw new ChartException(getClass().getSimpleName()+I18n.get("ChartException"));
		}
	}
	
	@JsonSetter(value="valueAxis")
	private void setJsonValueAxis(String valueAxis){
		trendLine.setFeature("valueAxis", valueAxis);
	}
	
	public ImageController getFinalImage(){
		return trendLine.getFinalImage();
	}
	
	public ImageController getInitialImage(){
		return trendLine.getInitialImage();
	}
	
	public void addFinalImage(ImageController finalImage){
		trendLine.addFinalImage(finalImage);
	}
	
	public void addInitialImage(ImageController initialImage){
		trendLine.addInitialImage(initialImage);
	}

}
