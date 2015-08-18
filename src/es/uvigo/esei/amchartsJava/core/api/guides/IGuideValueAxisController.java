package es.uvigo.esei.amchartsJava.core.api.guides;

import es.uvigo.esei.amchartsJava.core.exceptions.DoubleException;

public interface IGuideValueAxisController extends IGuideController {

	public Object getToValue();

	public void setToValue(Number toValue) throws DoubleException;

	public Object getValue();

	public void setValue(Number value) throws DoubleException;

}