package es.uvigo.esei.amchartsJava.core.api.graphs;


import es.uvigo.esei.amchartsJava.core.constants.StepDirectionConstant.StepDirection;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;

public abstract interface IAmGraphStepController extends IAmGraphSerialChartController {

	abstract Boolean isNoStepRisers();

	abstract void setNoStepRisers(Boolean noStepRisers);

	abstract Object getPeriodSpan();

	abstract void setPeriodSpan(Number periodSpan) throws OutOfRangeException;

	abstract String getStepDirection();

	abstract void setStepDirection(StepDirection stepDirection);

}