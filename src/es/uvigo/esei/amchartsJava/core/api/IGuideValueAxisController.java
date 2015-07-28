package es.uvigo.esei.amchartsJava.core.api;

import es.uvigo.esei.amchartsJava.core.exceptions.FloatException;

public interface IGuideValueAxisController extends IGuideController {

	public Object getToValue();

	public void setToValue(Number toValue) throws FloatException;

	public Object getValue();

	public void setValue(Number value) throws FloatException;

}