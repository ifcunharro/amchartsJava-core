package es.uvigo.esei.amchartsJava.core.controllers.charts;

import com.fasterxml.jackson.annotation.JsonProperty;

import es.uvigo.esei.amchartsJava.core.api.charts.IAmXyChartController;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsJava.core.model.charts.AmRectangularChart;
import es.uvigo.esei.amchartsJava.core.validators.NumberValidator;

public class AmXyChartController extends AmRectangularChartController implements IAmXyChartController {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6384139590503426071L;
	
	public AmXyChartController(){
		super(new AmRectangularChart());
	}
	
	@JsonProperty(value="hideXScrollbar")
	public Object isHideXScrollbar(){
		return amchart.getFeature("hideXScrollbar");
	}
	
	public void setHideXScrollbar(Boolean hideXScrollbar){
		amchart.setFeature("hideXScrollbar", hideXScrollbar);
	}
	
	@JsonProperty(value="hideYScrollbar")
	public Object isHideYScrollbar(){
		return amchart.getFeature("hideYScrollbar");
	}
	
	public void setHideYScrollbar(Boolean hideYScrollbar){
		amchart.setFeature("hideYScrollbar", hideYScrollbar);
	}
	
	public Object getMaxZoomFactor(){
		return amchart.getFeature("maxZoomFactor");
	}
	
	public void setMaxZoomFactor(Number maxZoomFactor) throws OutOfRangeException{
		if(NumberValidator.rangeFloatValidator(maxZoomFactor, 1, 20)){
			amchart.setFeature("maxZoomFactor", maxZoomFactor);
		}
	}

	

}
