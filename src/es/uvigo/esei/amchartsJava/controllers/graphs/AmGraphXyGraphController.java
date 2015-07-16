package es.uvigo.esei.amchartsJava.controllers.graphs;

import es.uvigo.esei.amchartsJava.model.AmGraph;
import es.uvigo.esei.amchartsJava.model.graphs.AmGraphXyGraph;

public class AmGraphXyGraphController extends AmGraphController<AmGraph> {

	public AmGraphXyGraphController(){
		super(new AmGraphXyGraph());
	}
	
	//bulletAxis
	
	//fillToAxis
	
	public Object getMaxBulletSize(){
		return amGraph.getFeature("maxBulletSize");
	}
	
	public void setMaxBulletSize(Number maxBulletSize){
		amGraph.setFeature("maxBulletSize", maxBulletSize);
	}
	
	public Object getMinBulletSize(){
		return amGraph.getFeature("minBulletSize");
	}
	
	public void setMinBulletSize(Number minBulletSize){
		amGraph.setFeature("minBulletSize", minBulletSize);
	}
	
	
}
