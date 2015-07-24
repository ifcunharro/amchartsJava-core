package es.uvigo.esei.amchartsJava.core.controllers.graphs;


import es.uvigo.esei.amchartsJava.core.api.IAmGraphCandleController;
import es.uvigo.esei.amchartsJava.core.constants.AmchartsConstants;
import es.uvigo.esei.amchartsJava.core.constants.ShowAtConstant.ShowAt;

public class AmGraphCandleController extends AmGraphSerialController implements IAmGraphCandleController {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6225507455268146232L;

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
