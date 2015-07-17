package es.uvigo.esei.amchartsJava.controllers.graphs;

import es.uvigo.esei.amchartsJava.constants.ShowAtConstant.ShowAt;

public class AmGraphCandleOhlcController extends AmGraphSerialController {

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
	
	public Object getOpenField(){
		return amGraph.getFeature("openField");
	}
	
	public void setOpenField(String openField){
		amGraph.setFeature("openField", openField);
	}
	
	public Object getShowBalloonAt(){
		return amGraph.getFeature("showBalloonAt");
	}
	
	public void setShowBalloonAt(ShowAt showBalloonAt){
		amGraph.setFeature("showBalloonAt", showBalloonAt.toString());
	}

}
