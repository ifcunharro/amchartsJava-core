package es.uvigo.esei.amchartsJava.controllers.graphs;

import com.fasterxml.jackson.annotation.JsonProperty;

import es.uvigo.esei.amchartsJava.constants.AmchartsConstants;
import es.uvigo.esei.amchartsJava.constants.StepDirectionConstant.StepDirection;
import es.uvigo.esei.amchartsJava.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.validators.NumberValidator;

public class AmGraphStepController extends AmGraphSerialController {
	
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
