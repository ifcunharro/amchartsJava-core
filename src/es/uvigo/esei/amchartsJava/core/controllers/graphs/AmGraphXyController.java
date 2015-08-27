package es.uvigo.esei.amchartsJava.core.controllers.graphs;

import es.uvigo.esei.amchartsJava.core.api.graphs.IAmGraphXyController;
import es.uvigo.esei.amchartsJava.core.constants.AmchartsConstants;
import es.uvigo.esei.amchartsJava.core.constants.lang.I18n;
import es.uvigo.esei.amchartsJava.core.exceptions.ChartException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsJava.core.validators.NumberValidator;

public class AmGraphXyController extends AmGraphSerialChartController 
	implements IAmGraphXyController {

	

	/**
	 * 
	 */
	private static final long serialVersionUID = -1740784739849045134L;


	{
		setType(AmchartsConstants.GRAPH_TYPES.getLine());
		try {
			setMaxBulletSize(50);
		} catch (OutOfRangeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public Object getBulletAxis(){
		return amGraph.getFeature("bulletAxis");
	}
	
	public void setBulletAxis(String bulletAxis) throws ChartException{
		if(amchart != null){
			if(amchart.existValueAxis(bulletAxis)){
				amGraph.setFeature("bulletAxis", bulletAxis);
			}
		}else{
			throw new ChartException(getClass().getSimpleName()+I18n.get("ChartException"));
		}
	}
	
	public Object getFillToAxis(){
		return amGraph.getFeature("fillToAxis");
	}
	
	public void setFillToAxis(String fillToAxis) throws ChartException{
		if(amchart != null){
			if(amchart.existValueAxis(fillToAxis)){
				amGraph.setFeature("fillToAxis", fillToAxis);
			}
		}else{
			throw new ChartException(getClass().getSimpleName()+I18n.get("ChartException"));
		}
	}
	
	public Object getMaxBulletSize(){
		return amGraph.getFeature("maxBulletSize");
	}
	
	public void setMaxBulletSize(Number maxBulletSize) throws OutOfRangeException{
		if(NumberValidator.rangeIntegerValidator(maxBulletSize, 50, 100)){
			amGraph.setFeature("maxBulletSize", maxBulletSize);
		}
	}
	
	public Object getMinBulletSize(){
		return amGraph.getFeature("minBulletSize");
	}
	
	public void setMinBulletSize(Number minBulletSize) throws IntegerException{
		if(NumberValidator.integerValidator(minBulletSize) && minBulletSize.intValue()>=0){
			amGraph.setFeature("minBulletSize", minBulletSize);
		}
	}
	
	public Object getXAxis(){
		return amGraph.getFeature("xAxis");
	}
	
	public void setXAxis(String xAxis) throws ChartException{
		if(amchart != null){
			if(amchart.existValueAxis(xAxis)){
				amGraph.setFeature("xAxis", xAxis);
			}
		}else{
			throw new ChartException(getClass().getSimpleName()+I18n.get("ChartException"));
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
	
	public void setYAxis(String yAxis) throws ChartException{
		if(amchart != null){
			if(amchart.existValueAxis(yAxis)){
				amGraph.setFeature("yAxis", yAxis);
			}
		}else{
			throw new ChartException(getClass().getSimpleName()+I18n.get("ChartException"));
		}
	}
	
	public Object getYField(){
		return amGraph.getFeature("yField");
	}
	
	public void setYField(String yField){
		amGraph.setFeature("yField", yField);
	}
	
	
}
