package es.uvigo.esei.amchartsJava.core.controllers.graphs;

import es.uvigo.esei.amchartsJava.core.constants.AmchartsConstants;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.validators.NumberValidator;

public class AmGraphXyController extends AmGraphSerialChartController {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1740784739849045134L;

	{
		setType(AmchartsConstants.GRAPH_TYPES.getLine());
	}
	
	public Object getBulletAxis(){
		return amGraph.getFeature("bulletAxis");
	}
	
	public void setBulletAxis(String bulletAxis){
		if(amchart.existValueAxis(bulletAxis)){
			amGraph.setFeature("bulletAxis", bulletAxis);
		}
	}
	
	public Object getFillToAxis(){
		return amGraph.getFeature("fillToAxis");
	}
	
	public void setFillToAxis(String fillToAxis){
		if(amchart.existValueAxis(fillToAxis)){
			amGraph.setFeature("fillToAxis", fillToAxis);
		}
	}
	
	public Object getMaxBulletSize(){
		return amGraph.getFeature("maxBulletSize");
	}
	
	public void setMaxBulletSize(Number maxBulletSize) throws IntegerException{
		if(NumberValidator.integerValidator(maxBulletSize)){
			amGraph.setFeature("maxBulletSize", maxBulletSize);
		}
	}
	
	public Object getMinBulletSize(){
		return amGraph.getFeature("minBulletSize");
	}
	
	public void setMinBulletSize(Number minBulletSize) throws IntegerException{
		if(NumberValidator.integerValidator(minBulletSize)){
			amGraph.setFeature("minBulletSize", minBulletSize);
		}
	}
	
	public Object getXAxis(){
		return amGraph.getFeature("xAxis");
	}
	
	public void setXAxis(String xAxis){
		if(amchart.existValueAxis(xAxis)){
			amGraph.setFeature("xAxis", xAxis);
		}
	}
	
	public Object getXField(){
		return amGraph.getFeature("xField");
	}
	
	public void setXField(String xField){
		amGraph.setFeature("xField", xField);
	}
	
	public Object getYAxis(){
		return amGraph.getFeature("yAxis");
	}
	
	public void setYAxis(String yAxis){
		if(amchart.existValueAxis(yAxis)){
			amGraph.setFeature("yAxis", yAxis);
		}
	}
	
	public Object getYField(){
		return amGraph.getFeature("yField");
	}
	
	public void setYField(String yField){
		amGraph.setFeature("yField", yField);
	}
	
	
}
