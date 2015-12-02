package es.uvigo.esei.amchartsJava.core.controllers.charts;

import com.fasterxml.jackson.annotation.JsonProperty;

import es.uvigo.esei.amchartsJava.core.api.charts.IAmXyChartController;
import es.uvigo.esei.amchartsJava.core.constants.AmchartsConstants;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsJava.core.model.charts.AmXyChart;
import es.uvigo.esei.amchartsJava.core.validators.NumberValidator;


public class AmXyChartController extends AmRectangularChartController<AmXyChart> 
	implements IAmXyChartController {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6384139590503426071L;
	
	public AmXyChartController(){
		super(new AmXyChart());
		setType(AmchartsConstants.CHART_TYPES.getXY());
	}
	
	@JsonProperty(value="hideXScrollbar")
	public Boolean isHideXScrollbar(){
		return (Boolean) amchart.getFeature("hideXScrollbar");
	}
	
	public void setHideXScrollbar(Boolean hideXScrollbar){
		amchart.setFeature("hideXScrollbar", hideXScrollbar);
	}
	
	@JsonProperty(value="hideYScrollbar")
	public Boolean isHideYScrollbar(){
		return (Boolean) amchart.getFeature("hideYScrollbar");
	}
	
	public void setHideYScrollbar(Boolean hideYScrollbar){
		amchart.setFeature("hideYScrollbar", hideYScrollbar);
	}
	
	public Integer getMaxZoomFactor(){
		Object maxZoomFactor = amchart.getFeature("maxZoomFactor");
		
		return maxZoomFactor != null ? ((Number)maxZoomFactor).intValue() : null;
	}
	
	public void setMaxZoomFactor(Number maxZoomFactor) throws OutOfRangeException{
		if(AmchartsConstants.IMPROVED_VISIBILITY.equals("true")){
			if(NumberValidator.rangeDoubleValidator(maxZoomFactor, 1, 20)){
				amchart.setFeature("maxZoomFactor", maxZoomFactor);
			}
		}else{
			amchart.setFeature("maxZoomFactor", maxZoomFactor);
		}
	}

	

}
