package es.uvigo.esei.amchartsJava.core.controllers.trendLines;

import com.fasterxml.jackson.annotation.JsonSetter;

import es.uvigo.esei.amchartsJava.core.api.trendLines.ITrendLineXyChartController;
import es.uvigo.esei.amchartsJava.core.constants.lang.I18n;
import es.uvigo.esei.amchartsJava.core.exceptions.ChartException;
import es.uvigo.esei.amchartsJava.core.validators.PropertyValidator;

/**
 * This class is a controller for TrendLine used by AmXyChart.
 * @author Iago Fernández Cuñarro
 *
 */
public class TrendLineXyChartController extends TrendLineSerialChartController implements ITrendLineXyChartController {

	private static final long serialVersionUID = -9162444480552470659L;

	
	{
		//property only used in AmXyChart. Used to deserialize json to this class
		setInitialXValue(0);
	}
	
	public Double getFinalXValue(){
		Object finalXValue = trendLine.getFeature("finalXValue");
		
		return finalXValue != null ? ((Number)finalXValue).doubleValue() : null;
	}
	
	public void setFinalXValue(Number finalXValue){
		trendLine.setFeature("finalXValue", finalXValue);
	}
	
	public Double getInitialXValue(){
		Object initialXValue = trendLine.getFeature("initialXValue");
		
		return initialXValue != null ? ((Number)initialXValue).doubleValue() : null;
	}
	
	public void setInitialXValue(Number initialXValue){
		trendLine.setFeature("initialXValue", initialXValue);
	}
	
	public String getValueAxisX(){
		return (String) trendLine.getFeature("valueAxisX");
	}
	
	public void setValueAxisX(String valueAxisX) throws ChartException{
		if(amchart != null){
			if(PropertyValidator.isValidString(valueAxisX) && amchart.existValueAxis(valueAxisX)){
				trendLine.setFeature("valueAxisX", valueAxisX);
			}
		}else{
			throw new ChartException(getClass().getSimpleName()+I18n.get("ChartException"));
		}
	}
	
	//Used to deserialize json
	@JsonSetter(value="valueAxisX")
	private void setJsonValueAxisX(String valueAxisX){
		trendLine.setFeature("valueAxisX", valueAxisX);
	}

}
