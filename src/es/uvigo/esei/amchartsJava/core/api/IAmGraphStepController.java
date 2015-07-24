package es.uvigo.esei.amchartsJava.core.api;


import es.uvigo.esei.amchartsJava.core.constants.StepDirectionConstant.StepDirection;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;

public interface IAmGraphStepController extends IAmGraphSerialController {

	public Object isNoStepRisers();

	public void setNoStepRisers(Boolean noStepRisers);

	public Object getPeriodSpan();

	public void setPeriodSpan(Number periodSpan) throws IntegerException;

	public Object getStepDirection();

	public void setStepDirection(StepDirection stepDirection);

}