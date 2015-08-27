package es.uvigo.esei.amchartsJava.core.model;

import java.util.ArrayList;
import java.util.List;

import es.uvigo.esei.amchartsJava.core.controllers.GaugeBandController;

public class GaugeAxis extends IModel{
	
	private List<GaugeBandController> gaugeBands;
	
	public List<GaugeBandController> getBands(){
		return gaugeBands;
	}
	
	public void setBands(List<GaugeBandController> gaugeBandControllers){
		if(gaugeBands == null){
			gaugeBands = new ArrayList<GaugeBandController>();
		}
		gaugeBands = gaugeBandControllers;
	}

	public void addBand(GaugeBandController gaugeBandController) {
		if(gaugeBands == null){
			gaugeBands = new ArrayList<GaugeBandController>();
		}
		gaugeBands.add(gaugeBandController);
		
	}
	

}
