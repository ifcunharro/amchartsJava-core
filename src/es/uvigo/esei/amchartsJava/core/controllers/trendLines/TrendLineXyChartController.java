package es.uvigo.esei.amchartsJava.core.controllers.trendLines;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import es.uvigo.esei.amchartsJava.core.api.trendLines.ITrendLineXyChartController;

@JsonInclude(Include.NON_NULL)
public class TrendLineXyChartController extends TrendLineSerialChartController implements ITrendLineXyChartController {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9162444480552470659L;
	
	public Object getFinalXValue(){
		return trendLine.getFeature("finalXValue");
	}
	
	public void setFinalXValue(Number finalXValue){
		trendLine.setFeature("finalXValue", finalXValue);
	}
	
	public Object getInitialXValue(){
		return trendLine.getFeature("initialXValue");
	}
	
	public void setInitialXValue(Number initialXValue){
		trendLine.setFeature("initialXValue", initialXValue);
	}
	
	public Object getValueAxisX(){
		return trendLine.getFeature("valueAxisX");
	}
	
	public void setValueAxisX(String valueAxisX){
		if(amchart.existValueAxis(valueAxisX)){
			trendLine.setFeature("valueAxisX", valueAxisX);
		}
	}

}