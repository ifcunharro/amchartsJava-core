package es.uvigo.esei.amchartsJava.core.api.guides;

import es.uvigo.esei.amchartsJava.core.exceptions.DoubleException;

public abstract interface IGuideValueAxisController extends IGuideController {

	abstract Object getToValue();

	abstract void setToValue(Number toValue) throws DoubleException;

	abstract Object getValue();

	abstract void setValue(Number value) throws DoubleException;

}