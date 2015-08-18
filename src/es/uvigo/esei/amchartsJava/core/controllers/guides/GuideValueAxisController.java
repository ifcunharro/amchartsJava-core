package es.uvigo.esei.amchartsJava.core.controllers.guides;

import es.uvigo.esei.amchartsJava.core.api.guides.IGuideValueAxisController;
import es.uvigo.esei.amchartsJava.core.exceptions.DoubleException;
import es.uvigo.esei.amchartsJava.core.validators.NumberValidator;

public class GuideValueAxisController extends GuideController implements IGuideValueAxisController {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7932113405386773028L;

	public Object getToValue(){
		return guide.getFeature("toValue");
	}
	
	public void setToValue(Number toValue) throws DoubleException{
		if(NumberValidator.doubleValidator(toValue)){
			guide.setFeature("toValue", toValue);
		}
	}
	
	public Object getValue(){
		return guide.getFeature("value");
	}
	
	public void setValue(Number value) throws DoubleException{
		if(NumberValidator.doubleValidator(value)){
			guide.setFeature("value", value);
		}
	}

}
