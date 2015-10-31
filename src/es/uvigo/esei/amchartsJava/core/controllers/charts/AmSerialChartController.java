package es.uvigo.esei.amchartsJava.core.controllers.charts;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

import es.uvigo.esei.amchartsJava.core.api.charts.IAmSerialChartController;
import es.uvigo.esei.amchartsJava.core.constants.AmchartsConstants;
import es.uvigo.esei.amchartsJava.core.controllers.axis.CategoryAxisController;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsJava.core.model.charts.AmSerialChart;
import es.uvigo.esei.amchartsJava.core.validators.NumberValidator;
import es.uvigo.esei.amchartsJava.core.validators.TypeValidator;




public class AmSerialChartController extends AmRectangularChartController<AmSerialChart> 
	implements IAmSerialChartController {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4770522225786632974L;
	

	public AmSerialChartController() {
		super(new AmSerialChart());
		setType(AmchartsConstants.CHART_TYPES.getSerial());
	}
	
	public String getBalloonDateFormat(){
		return (String) amchart.getFeature("balloonDateFormat");
	}

	public void setBalloonDateFormat(String balloonDateFormat){
		if(TypeValidator.checkDateFormat(balloonDateFormat)){
			amchart.setFeature("balloonDateFormat", balloonDateFormat);
		}
	}
	
	public String getCategoryField(){
		return (String) amchart.getFeature("categoryField");
	}
	
	public void setCategoryField(String categoryField){
		amchart.setFeature("categoryField", categoryField);
		amchart.addField("categoryField", categoryField);
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
		if(NumberValidator.rangeDoubleValidator(columnWidth, 0, 1)){
			amchart.setFeature("columnWidth", columnWidth);
		}
	}
	
	public String getDataDateFormat(){
		return (String) amchart.getFeature("dataDateFormat");
	}
	
	public void setDataDateFormat(String dataDateFormat){
		if(TypeValidator.checkDateFormat(dataDateFormat)){
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
	public Boolean isMouseWheelScrollEnabled(){
		return (Boolean) amchart.getFeature("mouseWheelScrollEnabled");
	}
	
	public void setMouseWheelScrollEnabled(Boolean mouseWheelScrollEnabled){
		amchart.setFeature("mouseWheelScrollEnabled", mouseWheelScrollEnabled);
	}
	
	@JsonProperty(value="mouseWheelZoomEnabled")
	public Boolean isMouseWheelZoomEnabled(){
		return (Boolean) amchart.getFeature("mouseWheelZoomEnabled");
	}
	
	public void setMouseWheelZoomEnabled(Boolean mouseWheelZoomEnabled){
		amchart.setFeature("mouseWheelZoomEnabled", mouseWheelZoomEnabled);
	}

	@JsonProperty(value="rotate")
	public Boolean isRotate(){
		return (Boolean) amchart.getFeature("rotate");
	}
	
	public void setRotate(Boolean rotate){
		amchart.setFeature("rotate", rotate);
	}
	
	@JsonProperty(value="zoomOutOnDataUpdated")
	public Boolean isZoomOutOnDataUpdated(){
		return (Boolean) amchart.getFeature("zoomOutOnDataUpdated");
	}
	
	public void setZoomOutOnDataUpdated(Boolean zoomOutOnDataUpdated){
		amchart.setFeature("zoomOutOnDataUpdated", zoomOutOnDataUpdated);
	}
	
	@JsonSetter(value="categoryAxis")
	public void addCategoryAxis(CategoryAxisController categoryAxisController){
		amchart.addCategoryAxis(categoryAxisController);
	}
	
	public CategoryAxisController getCategoryAxis(){
		return amchart.getCategoryAxis();
	}

}
