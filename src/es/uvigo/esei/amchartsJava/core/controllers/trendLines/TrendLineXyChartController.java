package es.uvigo.esei.amchartsJava.core.controllers.trendLines;

import es.uvigo.esei.amchartsJava.core.api.trendLines.ITrendLineXyChartController;
import es.uvigo.esei.amchartsJava.core.constants.lang.I18n;
import es.uvigo.esei.amchartsJava.core.exceptions.ChartException;


public class TrendLineXyChartController extends TrendLineSerialChartController implements ITrendLineXyChartController {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9162444480552470659L;
	
	{
		setInitialXValue(0);
	}
	
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
	
	public void setValueAxisX(String valueAxisX) throws ChartException{
		if(amchart != null){
			if(amchart.existValueAxis(valueAxisX)){
				trendLine.setFeature("valueAxisX", valueAxisX);
			}
		}else{
			throw new ChartException(getClass().getSimpleName()+I18n.get("ChartException"));
		}
	}

}
