package es.uvigo.esei.amchartsJava.controllers.graphs;

import es.uvigo.esei.amchartsJava.constants.PointPositionConstant.PointPosition;
import es.uvigo.esei.amchartsJava.model.graphs.AmGraph;
import es.uvigo.esei.amchartsJava.model.graphs.AmGraphSerialGraph;

public class AmGraphSerialGraphController extends AmGraphController<AmGraph>{

	public AmGraphSerialGraphController() {
		super(new AmGraphSerialGraph());
	}
	
	//bulletAxis
	
	public Object getLineColorField(){
		return amGraph.getFeature("lineColorField");
	}
	
	public void setLineColorField(String lineColorField){
		amGraph.setFeature("lineColorField", lineColorField);
	}
	
	public Object getPointPosition(){
		return amGraph.getFeature("pointPosition");
	}
	
	public void setPointPosition(PointPosition pointPosition){
		amGraph.setFeature("pointPosition", pointPosition.toString());
	}

}
