package es.uvigo.esei.amchartsJava.core.controllers.graphs;

import com.fasterxml.jackson.annotation.JsonProperty;

import es.uvigo.esei.amchartsJava.core.api.graphs.IAmGraphStepController;
import es.uvigo.esei.amchartsJava.core.constants.AmchartsConstants;
import es.uvigo.esei.amchartsJava.core.constants.StepDirectionConstant.StepDirection;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsJava.core.validators.NumberValidator;

public class AmGraphStepController extends AmGraphSerialChartController 
	implements IAmGraphStepController {
	
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 6400252053765498795L;


	{
		setType(AmchartsConstants.GRAPH_TYPES.getStep());	
	}
	
	
	
	@JsonProperty(value="noStepRisers")
	public Boolean isNoStepRisers(){
		return (Boolean) amGraph.getFeature("noStepRisers");
	}
	
	public void setNoStepRisers(Boolean noStepRisers){
		amGraph.setFeature("noStepRisers", noStepRisers);
	}
	
	public Integer getPeriodSpan(){
		Object periodSpan = amGraph.getFeature("periodSpan");
		
		return periodSpan != null ? ((Number)periodSpan).intValue() : null;
	}
	
	public void setPeriodSpan(Number periodSpan) throws OutOfRangeException{
		if(AmchartsConstants.IMPROVED_VISIBILITY.equals("true")){
			if(NumberValidator.rangeIntegerValidator(periodSpan, -2, 2)){
				amGraph.setFeature("periodSpan", periodSpan);
			}
		}else{
			amGraph.setFeature("periodSpan", periodSpan);
		}
	}
	
	public String getStepDirection(){
		return (String) amGraph.getFeature("stepDirection");
	}
	
	public void setStepDirection(StepDirection stepDirection){
		amGraph.setFeature("stepDirection", stepDirection.toString());
	}

}
