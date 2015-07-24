package es.uvigo.esei.amchartsJava.core.controllers.graphs;

import es.uvigo.esei.amchartsJava.core.api.IAmGraphXyController;
import es.uvigo.esei.amchartsJava.core.constants.AmchartsConstants;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.validators.NumberValidator;

public class AmGraphXyController extends AmGraphSerialController implements IAmGraphXyController {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1740784739849045134L;

	{
		setType(AmchartsConstants.GRAPH_TYPES.getLine());
	}
	
	//bulletAxis
	
	//fillToAxis
	
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
	
	//xAxis
	
	public Object getXField(){
		return amGraph.getFeature("xField");
	}
	
	public void setXField(String xField){
		amGraph.setFeature("xField", xField);
	}
	
	//yAxis
	
	public Object getYField(){
		return amGraph.getFeature("yField");
	}
	
	public void setYField(String yField){
		amGraph.setFeature("yField", yField);
	}
	
	
}
