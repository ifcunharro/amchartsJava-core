package es.uvigo.esei.amchartsJava.core.controllers.graphs;

import es.uvigo.esei.amchartsJava.core.api.graphs.IAmGraphCandleOhlcController;
import es.uvigo.esei.amchartsJava.core.constants.ShowAtConstant.ShowAt;


public abstract class AmGraphCandleOhlcController extends AmGraphSerialController implements IAmGraphCandleOhlcController {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6119951844854863121L;

	public Object getHighField(){
		return amGraph.getFeature("highField");
	}
	
	public void setHighField(String highField){
		amGraph.setFeature("highField", highField);
	}
	
	public Object getLowField(){
		return amGraph.getFeature("lowField");
	}
	
	public void setLowField(String lowField){
		amGraph.setFeature("lowField", lowField);
	}
	
	public Object getShowBulletsAt(){
		return amGraph.getFeature("showBulletsAt");
	}
	
	public void setShowBulletsAt(ShowAt showBulletsAt){
		amGraph.setFeature("showBulletsAt", showBulletsAt.toString());
	}
	
}
