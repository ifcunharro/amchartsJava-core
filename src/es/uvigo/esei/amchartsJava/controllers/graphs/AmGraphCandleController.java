package es.uvigo.esei.amchartsJava.controllers.graphs;

import es.uvigo.esei.amchartsJava.constants.AmchartsConstants;
import es.uvigo.esei.amchartsJava.constants.ShowAtConstant.ShowAt;

public class AmGraphCandleController extends AmGraphSerialController {
	
	{
		setType(AmchartsConstants.GRAPH_TYPES.getCandleStick());
	}
	
	
	public Object getShowBulletsAt(){
		return amGraph.getFeature("showBulletsAt");
	}
	
	public void setShowBulletsAt(ShowAt showBulletsAt){
		amGraph.setFeature("showBulletsAt", showBulletsAt.toString());
	}
}
