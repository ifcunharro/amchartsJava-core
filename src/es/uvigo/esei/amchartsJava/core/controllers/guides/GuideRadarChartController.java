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

	public Object getAngle(){
		return guide.getFeature("angle");
	}
	
	public void setAngle(Number angle) throws OutOfRangeException{
		if(NumberValidator.rangeIntegerValidator(angle, 0, 360)){
			guide.setFeature("angle", angle);
		}
	}
	
	public Object getToAngle(){
		return guide.getFeature("toAngle");
	}
	
	public void setToAngle(Number toAngle) throws OutOfRangeException{
		if(NumberValidator.rangeIntegerValidator(toAngle, 0, 360)){
			guide.setFeature("toAngle", toAngle);
		}
	}

}
