package es.uvigo.esei.amchartsJava.core.controllers.graphs;

import es.uvigo.esei.amchartsJava.core.api.graphs.IAmGraphCandleOhlcController;
import es.uvigo.esei.amchartsJava.core.constants.ShowAt;


public abstract class AmGraphCandleOhlcController extends AmGraphSerialController 
	implements IAmGraphCandleOhlcController {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6119951844854863121L;

	public String getHighField(){
		return (String) amGraph.getFeature("highField");
	}
	
	public void setHighField(String highField){
		amGraph.setFeature("highField", highField);
		amGraph.addGraphField("highField", highField);
	}
	
	public String getLowField(){
		return (String) amGraph.getFeature("lowField");
	}
	
	public void setLowField(String lowField){
		amGraph.setFeature("lowField", lowField);
		amGraph.addGraphField("lowField", lowField);
	}
	
	public String getShowBulletsAt(){
		return (String) amGraph.getFeature("showBulletsAt");
	}
	
	public void setShowBulletsAt(ShowAt showBulletsAt){
		amGraph.setFeature("showBulletsAt", showBulletsAt.toString());
	}
	
}
