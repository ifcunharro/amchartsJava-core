package es.uvigo.esei.amchartsjava.core.controllers.guides;

import es.uvigo.esei.amchartsjava.core.api.guides.IGuideValueAxisController;
import es.uvigo.esei.amchartsjava.core.exceptions.DoubleException;
import es.uvigo.esei.amchartsjava.core.validators.NumberValidator;

/**
 * This class is a controller for Guide used by ValueAxis.
 * @author Iago Fernández Cuñarro
 *
 */
public class GuideValueAxisController extends GuideController implements IGuideValueAxisController {
	
	private static final long serialVersionUID = -7932113405386773028L;

	public Double getToValue(){
		Object toValue = guide.getFeature("toValue");
		
		return toValue != null ? ((Number)toValue).doubleValue() : null;
	}
	
	public void setToValue(Number toValue) throws DoubleException{
		if(NumberValidator.doubleValidator(toValue)){
			guide.setFeature("toValue", toValue);
		}
	}
	
	public Double getValue(){
		Object value = guide.getFeature("value");
		
		return value != null ? ((Number)value).doubleValue() : null;
	}
	
	public void setValue(Number value) throws DoubleException{
		if(NumberValidator.doubleValidator(value)){
			guide.setFeature("value", value);
		}
	}

}
