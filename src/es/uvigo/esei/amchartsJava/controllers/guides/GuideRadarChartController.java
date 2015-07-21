package es.uvigo.esei.amchartsJava.controllers.guides;

import es.uvigo.esei.amchartsJava.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsJava.validators.NumberValidator;

public class GuideRadarChartController extends GuideController {
	
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
