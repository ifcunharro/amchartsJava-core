package es.uvigo.esei.amchartsJava.core.model;

import java.util.ArrayList;
import java.util.List;

import es.uvigo.esei.amchartsJava.core.controllers.GaugeBandController;

/**
 * Model class for GaugeAxis.
 * @author Iago Fernández Cuñarro
 *
 */
public class GaugeAxis extends IModel{
	
	private List<GaugeBandController> gaugeBands;
	
	/**
	 * Get gaugeBands.
	 * @return List<GaugeBandController> Controllers for gaugeBands.
	 */
	public List<GaugeBandController> getBands(){
		return gaugeBands;
	}
	
	/**
	 * Save gaugeBands.
	 * @param gaugeBandControllers List of controllers of gaugeBands.
	 */
	public void setBands(List<GaugeBandController> gaugeBandControllers){
		if(gaugeBands == null){
			gaugeBands = new ArrayList<GaugeBandController>();
		}
		gaugeBands = gaugeBandControllers;
	}

	/**
	 * Add a gaugeBand to bands of gaugeAxis.
	 * @param gaugeBandController Controller for gaugeBand.
	 */
	public void addBand(GaugeBandController gaugeBandController) {
		if(gaugeBands == null){
			gaugeBands = new ArrayList<GaugeBandController>();
		}
		gaugeBands.add(gaugeBandController);
		
	}
	

}
