package es.uvigo.esei.amchartsJava.core.api.graphs;


import es.uvigo.esei.amchartsJava.core.constants.StepDirectionConstant.StepDirection;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;

public interface IAmGraphStepController extends IAmGraphSerialChartController {

	public Object isNoStepRisers();

	public void setNoStepRisers(Boolean noStepRisers);

	public Object getPeriodSpan();

	public void setPeriodSpan(Number periodSpan) throws OutOfRangeException;

	public Object getStepDirection();

	public void setStepDirection(StepDirection stepDirection);

}