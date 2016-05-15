package es.uvigo.esei.amchartsjava.core.controllers.graphs;

import com.fasterxml.jackson.annotation.JsonProperty;

import es.uvigo.esei.amchartsjava.core.api.graphs.IAmGraphSerialController;
import es.uvigo.esei.amchartsjava.core.constants.ColorsAmCharts;
import es.uvigo.esei.amchartsjava.core.validators.PropertyValidator;

/**
 * This class is a controller for AmGraph of type serial, used by type line,column or smoothedLine
 * @author Iago Fernández Cuñarro
 *
 */
public class AmGraphSerialController extends AmGraphController 
	implements IAmGraphSerialController {

	
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
		if(fillColors != null){
			amGraph.setFeature("fillColors", fillColors.toString());
		}
	}
	
	public String getFillColorsField(){
		return (String) amGraph.getFeature("fillColorsField");
	}
	
	public void setFillColorsField(String fillColorsField){
		if(PropertyValidator.isValidString(fillColorsField)){
			amGraph.setFeature("fillColorsField", fillColorsField);
			amGraph.addGraphField("fillColorsField", fillColorsField);
		}
	}
	
	public String getGapField(){
		return (String) amGraph.getFeature("gapField");
	}
	
	public void setGapField(String gapField){
		if(PropertyValidator.isValidString(gapField)){
			amGraph.setFeature("gapField", gapField);
			amGraph.addGraphField("gapField", gapField);
		}
	}

}
