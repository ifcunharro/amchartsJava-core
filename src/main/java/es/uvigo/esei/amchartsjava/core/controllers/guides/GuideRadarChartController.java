package es.uvigo.esei.amchartsjava.core.controllers.guides;

import es.uvigo.esei.amchartsjava.core.api.guides.IGuideRadarChartController;
import es.uvigo.esei.amchartsjava.core.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsjava.core.validators.NumberValidator;

/**
 * This class is a controller for Guide used by AmRadarChart
 * @author Iago Fernández Cuñarro
 *
 */
public class GuideRadarChartController extends GuideController implements IGuideRadarChartController {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6291196097671275409L;
	
	{
		try{
			//properties only used by AmRadarChart. Used to deserialize Guide to this class
			setAngle(0);
			setToAngle(0);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Integer getAngle(){
		Object angle = guide.getFeature("angle");
		
		return angle != null ? ((Number)angle).intValue() : null;
	}
	
	public void setAngle(Number angle) throws OutOfRangeException{
		if(NumberValidator.rangeIntegerValidator(angle, 0, 360)){
			guide.setFeature("angle", angle);
		}
	}
	
	public Integer getToAngle(){
		Object toAngle = guide.getFeature("toAngle");
		
		return toAngle != null ? ((Number)toAngle).intValue() : null;
	}
	
	public void setToAngle(Number toAngle) throws OutOfRangeException{
		if(NumberValidator.rangeIntegerValidator(toAngle, 0, 360)){
			guide.setFeature("toAngle", toAngle);
		}
	}

}
