package es.uvigo.esei.amchartsJava.core.controllers.graphs;

import com.fasterxml.jackson.annotation.JsonProperty;

import es.uvigo.esei.amchartsJava.core.api.graphs.IAmGraphSerialController;
import es.uvigo.esei.amchartsJava.core.constants.ColorsAmCharts;


public class AmGraphSerialController extends AmGraphSerialChartController 
	implements IAmGraphSerialController {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3990193025590250473L;
	
	
	@JsonProperty(value="connect")
	public Boolean isConnect(){
		return (Boolean) amGraph.getFeature("connect");
	}
	
	public void setConnect(Boolean connect){
		amGraph.setFeature("connect", connect);
		
	}
	
	public String getFillColors(){
		return (String) amGraph.getFeature("fillColors");
	}
	
	public void setFillColors(ColorsAmCharts fillColors){
		amGraph.setFeature("fillColors", fillColors.toString());
	}
	
	public String getFillColorsField(){
		return (String) amGraph.getFeature("fillColorsField");
	}
	
	public void setFillColorsField(String fillColorsField){
		amGraph.setFeature("fillColorsField", fillColorsField);
		amGraph.addGraphField("fillColorsField", fillColorsField);
	}
	
	public String getGapField(){
		return (String) amGraph.getFeature("gapField");
	}
	
	public void setGapField(String gapField){
		amGraph.setFeature("gapField", gapField);
		amGraph.addGraphField("gapField", gapField);
	}

}
