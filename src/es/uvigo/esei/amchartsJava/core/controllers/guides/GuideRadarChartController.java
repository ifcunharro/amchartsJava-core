package es.uvigo.esei.amchartsJava.core.controllers.guides;

import es.uvigo.esei.amchartsJava.core.api.guides.IGuideRadarChartController;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsJava.core.validators.NumberValidator;

public class GuideRadarChartController extends GuideController implements IGuideRadarChartController {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6291196097671275409L;
	
	{
		try{
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
