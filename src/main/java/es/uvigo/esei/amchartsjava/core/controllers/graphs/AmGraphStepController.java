package es.uvigo.esei.amchartsjava.core.controllers.graphs;

import com.fasterxml.jackson.annotation.JsonProperty;

import es.uvigo.esei.amchartsjava.core.api.graphs.IAmGraphStepController;
import es.uvigo.esei.amchartsjava.core.constants.AmchartsConstants;
import es.uvigo.esei.amchartsjava.core.constants.GraphType;
import es.uvigo.esei.amchartsjava.core.constants.StepDirection;
import es.uvigo.esei.amchartsjava.core.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsjava.core.validators.NumberValidator;

/**
 * This class is a controller for AmGraph of type step.
 * @author Iago Fernández Cuñarro
 *
 */
public class AmGraphStepController extends AmGraphController 
	implements IAmGraphStepController {
	
	
	private static final long serialVersionUID = 6400252053765498795L;


	{
		//used to deserialize from json to this class
		setType(GraphType.step);	
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
		if(stepDirection != null){
			amGraph.setFeature("stepDirection", stepDirection.toString());
		}
	}

}
