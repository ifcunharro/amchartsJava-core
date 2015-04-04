package amcharts.model.impl.TrendLine;

import amcharts.model.api.TrendLine.ITrendLine;

public class TrendLineXY extends ITrendLine{
	
	public Object getFinalXValue(){
		return trendLine.get("finalXValue");
	}
	
	public void setFinalXValue(Number finalXValue){
		trendLine.put("finalXValue", finalXValue);
	}
	
	public Object getInitialXValue(){
		return trendLine.get("initialXValue");
	}
	
	public void setInitialXValue(Number initialXValue){
		trendLine.put("initialXValue", initialXValue);
	}
	
	

}
