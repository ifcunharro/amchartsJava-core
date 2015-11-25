package es.uvigo.esei.amchartsJava.core.controllers.charts;

import es.uvigo.esei.amchartsJava.core.api.charts.IAmRadarChartController;
import es.uvigo.esei.amchartsJava.core.constants.AmchartsConstants;
import es.uvigo.esei.amchartsJava.core.exceptions.CoordException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.model.charts.AmCoordinateChart;
import es.uvigo.esei.amchartsJava.core.model.charts.AmRadarChart;
import es.uvigo.esei.amchartsJava.core.validators.NumberValidator;
import es.uvigo.esei.amchartsJava.core.validators.TypeValidator;

public class AmRadarChartController extends AmCoordinateChartController<AmCoordinateChart> 
		implements IAmRadarChartController {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2840100369483722635L;

	public AmRadarChartController() {
		super(new AmRadarChart());
		setType(AmchartsConstants.CHART_TYPES.getRadar());
	}
	
	public String getCategoryField(){
		return (String) amchart.getFeature("categoryField");
	}
	
	public void setCategoryField(String categoryField){
		amchart.setFeature("categoryField", categoryField);
		amchart.addField("categoryField", categoryField);
	}
	
	public Integer getMarginBottom(){
		Object marginBottom = amchart.getFeature("marginBottom");
		
		return marginBottom != null ? ((Number)marginBottom).intValue() : null;
	}
	
	public void setMarginBottom(Number marginBottom) throws IntegerException{
		if(NumberValidator.integerValidator(marginBottom)){
			amchart.setFeature("marginBottom", marginBottom);
		}
	}
	
	public Integer getMarginLeft(){
		Object marginLeft = amchart.getFeature("marginLeft");
		
		return marginLeft != null ? ((Number)marginLeft).intValue() : null;
	}
	
	public void setMarginLeft(Number marginLeft) throws IntegerException{
		if(NumberValidator.integerValidator(marginLeft)){
			amchart.setFeature("marginLeft", marginLeft);
		}
	}
	
	public Integer getMarginRight(){
		Object marginRight = amchart.getFeature("marginRight");
		
		return marginRight != null ? ((Number)marginRight).intValue() : null;
	}
	
	public void setMarginRight(Number marginRight) throws IntegerException{
		if(NumberValidator.integerValidator(marginRight)){
			amchart.setFeature("marginRight", marginRight);
		}
	}
	
	public Integer getMarginTop(){
		Object marginTop = amchart.getFeature("marginTop");
		
		return marginTop != null ? ((Number)marginTop).intValue() : null;
	}
	
	public void setMarginTop(Number marginTop) throws IntegerException{
		if(NumberValidator.integerValidator(marginTop)){
			amchart.setFeature("marginTop", marginTop);
		}
	}
	
	public String getRadius(){
		return (String) amchart.getFeature("radius");
	}
	
	public void setRadius(String radius) throws CoordException{
		if(TypeValidator.pixelOrPercent(radius)){
			amchart.setFeature("radius", radius);
		}
	}

}
