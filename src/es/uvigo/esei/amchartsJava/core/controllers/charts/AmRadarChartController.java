package es.uvigo.esei.amchartsJava.core.controllers.charts;

import es.uvigo.esei.amchartsJava.core.exceptions.CoordException;
import es.uvigo.esei.amchartsJava.core.model.charts.AmCoordinateChart;
import es.uvigo.esei.amchartsJava.core.model.charts.AmRadarChart;
import es.uvigo.esei.amchartsJava.core.validators.StringValidator;

public class AmRadarChartController extends AmCoordinateChartController<AmCoordinateChart> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2840100369483722635L;

	public AmRadarChartController() {
		super(new AmRadarChart());
	}
	
	public Object getCategoryField(){
		return amchart.getFeature("categoryField");
	}
	
	public void setCategoryField(String categoryField){
		amchart.setFeature("categoryField", categoryField);
	}
	
	public Object getMarginBottom(){
		return amchart.getFeature("marginBottom");
	}
	
	public void setMarginBottom(Number marginBottom){
		amchart.setFeature("marginBottom", marginBottom);
	}
	
	public Object getMarginLeft(){
		return amchart.getFeature("marginLeft");
	}
	
	public void setMarginLeft(Number marginLeft){
		amchart.setFeature("marginLeft", marginLeft);
	}
	
	public Object getMarginRight(){
		return amchart.getFeature("marginRight");
	}
	
	public void setMarginRight(Number marginRight){
		amchart.setFeature("marginRight", marginRight);
	}
	
	public Object getMarginTop(){
		return amchart.getFeature("marginTop");
	}
	
	public void setMarginTop(Number marginTop){
		amchart.setFeature("marginTop", marginTop);
	}
	
	public Object getRadius(){
		return amchart.getFeature("radius");
	}
	
	public void setRadius(String radius) throws CoordException{
		if(StringValidator.pixelOrPercent(radius)){
			amchart.setFeature("radius", radius);
		}
	}

}
