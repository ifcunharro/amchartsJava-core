package es.uvigo.esei.amchartsJava.core.controllers.charts;

import com.fasterxml.jackson.annotation.JsonProperty;

import es.uvigo.esei.amchartsJava.core.api.charts.IAmSerialChartController;
import es.uvigo.esei.amchartsJava.core.constants.AmchartsConstants;
import es.uvigo.esei.amchartsJava.core.controllers.axis.CategoryAxisController;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsJava.core.model.charts.AmSerialChart;
import es.uvigo.esei.amchartsJava.core.validators.NumberValidator;
import es.uvigo.esei.amchartsJava.core.validators.StringValidator;




public class AmSerialChartController extends AmRectangularChartController<AmSerialChart> implements IAmSerialChartController {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4770522225786632974L;
	

	public AmSerialChartController() {
		super(new AmSerialChart());
		setType(AmchartsConstants.CHART_TYPES.getSerial());
	}
	
	public Object getBalloonDateFormat(){
		return amchart.getFeature("balloonDateFormat");
	}

	public void setBalloonDateFormat(String balloonDateFormat){
		if(StringValidator.checkDateFormat(balloonDateFormat)){
			amchart.setFeature("balloonDateFormat", balloonDateFormat);
		}
	}
	
	public Object getCategoryField(){
		return amchart.getFeature("categoryField");
	}
	
	public void setCategoryField(String categoryField){
		amchart.setFeature("categoryField", categoryField);
	}
	
	public Object getColumnSpacing(){
		return amchart.getFeature("columnSpacing");
	}
	
	public void setColumnSpacing(Number columnSpacing) throws IntegerException{
		if(NumberValidator.integerValidator(columnSpacing)){
			amchart.setFeature("columnSpacing", columnSpacing);
		}
	}
	
	public Object getColumnSpacing3D(){
		return amchart.getFeature("columnSpacing3D");
	}
	
	public void setColumnSpacing3D(Number columnSpacing3D) throws IntegerException{
		if(NumberValidator.integerValidator(columnSpacing3D)){
			amchart.setFeature("columnSpacing3D", columnSpacing3D);
		}
	}
	
	public Object getColumnWidth(){
		return amchart.getFeature("columnWidth");
	}
	
	public void setColumnWidth(Number columnWidth) throws OutOfRangeException{
		if(NumberValidator.rangeFloatValidator(columnWidth, 0, 1)){
			amchart.setFeature("columnWidth", columnWidth);
		}
	}
	
	public Object getDataDateFormat(){
		return amchart.getFeature("dataDateFormat");
	}
	
	public void setDataDateFormat(String dataDateFormat){
		if(StringValidator.checkDateFormat(dataDateFormat)){
			amchart.setFeature("dataDateFormat", dataDateFormat);
		}
	}
	
	public Object getMaxSelectedSeries(){
		return amchart.getFeature("maxSelectedSeries");
	}
	
	public void setMaxSelectedSeries(Number maxSelectedSeries) throws IntegerException{
		if(NumberValidator.integerValidator(maxSelectedSeries) && maxSelectedSeries.intValue()>0){
			amchart.setFeature("maxSelectedSeries", maxSelectedSeries);
		}
	}
	
	public Object getMaxSelectedTime(){
		return amchart.getFeature("maxSelectedTime");
	}
	
	public void setMaxSelectedTime(Number maxSelectedTime) throws OutOfRangeException{
		if(NumberValidator.rangeIntegerValidator(maxSelectedTime, 1000, 259200000)){
			amchart.setFeature("maxSelectedTime", maxSelectedTime);
		}
	}
	
	public Object getMinSelectedTime(){
		return amchart.getFeature("minSelectedTime");
	}
	
	public void setMinSelectedTime(Number minSelectedTime) throws OutOfRangeException{
		if(NumberValidator.rangeIntegerValidator(minSelectedTime, 1000, 10000)){
			amchart.setFeature("minSelectedTime", minSelectedTime);
		}
	}
	
	@JsonProperty(value="mouseWheelScrollEnabled")
	public Object isMouseWheelScrollEnabled(){
		return amchart.getFeature("mouseWheelScrollEnabled");
	}
	
	public void setMouseWheelScrollEnabled(Boolean mouseWheelScrollEnabled){
		amchart.setFeature("mouseWheelScrollEnabled", mouseWheelScrollEnabled);
	}
	
	@JsonProperty(value="mouseWheelZoomEnabled")
	public Object isMouseWheelZoomEnabled(){
		return amchart.getFeature("mouseWheelZoomEnabled");
	}
	
	public void setMouseWheelZoomEnabled(Boolean mouseWheelZoomEnabled){
		amchart.setFeature("mouseWheelZoomEnabled", mouseWheelZoomEnabled);
	}

	@JsonProperty(value="rotate")
	public Object isRotate(){
		return amchart.getFeature("rotate");
	}
	
	public void setRotate(Boolean rotate){
		amchart.setFeature("rotate", rotate);
	}
	
	@JsonProperty(value="zoomOutOnDataUpdated")
	public Object isZoomOutOnDataUpdated(){
		return amchart.getFeature("zoomOutOnDataUpdated");
	}
	
	public void setZoomOutOnDataUpdated(Boolean zoomOutOnDataUpdated){
		amchart.setFeature("zoomOutOnDataUpdated", zoomOutOnDataUpdated);
	}
	
	public void addCategoryAxis(CategoryAxisController categoryAxisController){
		amchart.addCategoryAxis(categoryAxisController);
	}

}
