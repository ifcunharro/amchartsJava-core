package es.uvigo.esei.amchartsJava.core.controllers.graphs;

import com.fasterxml.jackson.annotation.JsonProperty;

import es.uvigo.esei.amchartsJava.core.api.graphs.IAmGraphStepController;
import es.uvigo.esei.amchartsJava.core.constants.AmchartsConstants;
import es.uvigo.esei.amchartsJava.core.constants.StepDirectionConstant.StepDirection;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.validators.NumberValidator;

public class AmGraphStepController extends AmGraphSerialChartController implements IAmGraphStepController {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6400252053765498795L;

	{
		setType(AmchartsConstants.GRAPH_TYPES.getStep());
	}
	
	
	@JsonProperty(value="noStepRisers")
	public Object isNoStepRisers(){
		return amGraph.getFeature("noStepRisers");
	}
	
	public void setNoStepRisers(Boolean noStepRisers){
		amGraph.setFeature("noStepRisers", noStepRisers);
	}
	
	public Object getPeriodSpan(){
		return amGraph.getFeature("periodSpan");
	}
	
	public void setPeriodSpan(Number periodSpan) throws IntegerException{
		if(NumberValidator.integerValidator(periodSpan)){
			amGraph.setFeature("periodSpan", periodSpan);
		}
	}
	
	public Object getStepDirection(){
		return amGraph.getFeature("stepDirection");
	}
	
	public void setStepDirection(StepDirection stepDirection){
		amGraph.setFeature("stepDirection", stepDirection.toString());
	}

}
