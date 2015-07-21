package es.uvigo.esei.amchartsJava.controllers.guides;

import es.uvigo.esei.amchartsJava.exceptions.FloatException;
import es.uvigo.esei.amchartsJava.validators.NumberValidator;

public class GuideValueAxisController extends GuideController {
	
	public Object getToValue(){
		return guide.getFeature("toValue");
	}
	
	public void setToValue(Number toValue) throws FloatException{
		if(NumberValidator.floatValidator(toValue)){
			guide.setFeature("toValue", toValue);
		}
	}
	
	public Object getValue(){
		return guide.getFeature("value");
	}
	
	public void setValue(Number value) throws FloatException{
		if(NumberValidator.floatValidator(value)){
			guide.setFeature("value", value);
		}
	}

}
