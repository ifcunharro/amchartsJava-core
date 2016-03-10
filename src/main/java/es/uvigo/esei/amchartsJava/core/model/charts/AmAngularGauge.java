package es.uvigo.esei.amchartsJava.core.model.charts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import es.uvigo.esei.amchartsJava.core.controllers.GaugeArrowController;
import es.uvigo.esei.amchartsJava.core.controllers.GaugeAxisController;
import es.uvigo.esei.amchartsJava.core.controllers.GaugeBandController;
import es.uvigo.esei.amchartsJava.core.controllers.PatternController;
import es.uvigo.esei.amchartsJava.core.model.AmChart;

/**
 * Model class for AmAngularGauge.
 * @author Iago Fernández Cuñarro
 *
 */
public class AmAngularGauge extends AmChart {
	private List<GaugeArrowController> arrows;
	private List<GaugeAxisController> axes;
	private PatternController facePattern;
	private Map<String,Integer> positionArrows;
	private Map<String,Integer> positionAxes;
	private List<String> idArrows;
	private List<String> idAxes;
	private List<String> idGaugeBands;
	private int sizeBands;
	private int deleteArrows;
	private int deleteAxes;

	
	{
		sizeBands = 0;
		deleteArrows = 0;
		deleteAxes = 0;
	}
	
	/**
	 * Get GaugeArrows.
	 * @return List of GaugeArrows.
	 */
	public List<GaugeArrowController> getArrows(){
		return arrows;
	}
	
	/**
	 * Set GaugeArrows from json.
	 * @param gaugeArrowControllers List of GaugeArrows.
	 */
	public void setArrows(List<GaugeArrowController> gaugeArrowControllers) {
		if(arrows == null){
			arrows = new ArrayList<GaugeArrowController>();
			positionArrows = new HashMap<String,Integer>();
		}
		
		arrows = gaugeArrowControllers;
		for(GaugeArrowController arrow: arrows){
			positionArrows.put(arrow.getId(), arrows.indexOf(arrow));
		}
		
	}

	/**
	 * Get GaugeAxis.
	 * @return List of GaugeAxis.
	 */
	public List<GaugeAxisController> getAxes() {
		return axes;
	}

	/**
	 * Set GaugeAxis from json.
	 * @param gaugeAxisControllers List of GaugeAxis.
	 */
	public void setAxes(List<GaugeAxisController> gaugeAxisControllers) {
		if(axes == null){
			axes = new ArrayList<GaugeAxisController>();
			positionAxes = new HashMap<String, Integer>();
		}
		axes = gaugeAxisControllers;
		for(GaugeAxisController axe: axes){
			positionAxes.put(axe.getId(), axes.indexOf(axe));
		}
	}

	/**
	 * Get facePattern.
	 * @return PatternController Controller for pattern.
	 */
	public PatternController getFacePattern() {
		return facePattern;	
	}

	/**
	 * Set facePattern.
	 * @param pattern Controller for pattern.
	 */
	public void setFacePattern(PatternController pattern) {
		facePattern = pattern;
	}

	/**
	 * Add a GaugeArrow.
	 * @param gaugeArrowController Controller for GaugeArrow.
	 */
	public void addArrow(GaugeArrowController gaugeArrowController) {
		if(gaugeArrowController.getId()!=null){
			removeArrow(gaugeArrowController.getId());
		}
		if(arrows == null){
			arrows = new ArrayList<GaugeArrowController>();
			idArrows = new ArrayList<String>();
			positionArrows = new HashMap<String,Integer>();
		}
		synchronized (this) {
			addObserver(gaugeArrowController);
			setChanged();
			notifyObservers(arrows.size()+1+deleteArrows);
			deleteObservers();
			gaugeArrowController.setChart(this);
		}
		
		arrows.add(gaugeArrowController);
		idArrows.add(gaugeArrowController.getId());
		positionArrows.put(gaugeArrowController.getId(),arrows.size()-1);
	}
	
	
	/**
	 * Add a GaugeAxis.
	 * @param gaugeAxisController Controller for GaugeAxis.
	 */
	public void addAxis(GaugeAxisController gaugeAxisController){
		if(gaugeAxisController.getId() != null){
			removeAxis(gaugeAxisController.getId());
		}
		if(axes == null){
			axes = new ArrayList<GaugeAxisController>();
			idAxes = new ArrayList<String>();
			positionAxes = new HashMap<String, Integer>();
		}
		synchronized (this) {
			addObserver(gaugeAxisController);
			setChanged();
			notifyObservers(axes.size()+1+deleteAxes);
			deleteObservers();
			if(gaugeAxisController.getBands() != null){
				asignIdToBands(gaugeAxisController);
			}
		}
		axes.add(gaugeAxisController);
		idAxes.add(gaugeAxisController.getId());
		positionAxes.put(gaugeAxisController.getId(), axes.size()-1);
		
		
	}
	
	//Assign ids to GaugeBands for new GaugeAxis added to AmAngularGauge, to
	//GaugeBand added twice only one id is assigned to it
	private void asignIdToBands(GaugeAxisController gaugeAxisController){
		if(idGaugeBands == null){
			idGaugeBands = new ArrayList<String>();
		}
		List<GaugeBandController> bands = gaugeAxisController.getBands();
		for(GaugeBandController band: bands){
			if(!existGaugeBand(band.getId())){
				sizeBands++;
				addObserver(band);
				setChanged();
				notifyObservers(sizeBands);
				idGaugeBands.add("GaugeBand-"+sizeBands);
				deleteObservers();
			}
		}
	}

	/**
	 * Remove GaugeArrow.
	 * @param idArrow GaugeArrow id.
	 */
	public void removeArrow(String idArrow) {
		if(arrows != null){
			arrows.remove(positionArrows.get(idArrow).intValue());
			idArrows.remove(idArrow);
			positionArrows.remove(idArrow);
			deleteArrows++;
			if(arrows.size() == 0){
				arrows = null;
				idArrows = null;
				positionArrows = null;
				System.gc();
			}
		}
		
	}
	
	/**
	 * Remove GaugeAxis.
	 * @param idAxis GaugeAxis id.
	 */
	public void removeAxis(String idAxis){
		if(axes != null){
			axes.remove(positionAxes.get(idAxis).intValue());
			idAxes.remove(idAxis);
			positionAxes.remove(idAxis);
			deleteAxes++;
			if(axes.size() == 0){
				axes = null;
				idAxes = null;
				positionAxes = null;
				idGaugeBands = null;
				System.gc();
			}
		}
		
	}
	
	/**
	 * Check exist GaugeBand.
	 * @param idGaugeBand GaugeBand id.
	 * @return boolean Exist or doesn't exist GaugeBand.
	 */
	public boolean existGaugeBand(String idGaugeBand){
		if(idGaugeBands != null){
			return idGaugeBands.contains(idGaugeBand);
		}else{
			return false;
		}
	}
	
	/**
	 * Check exist GaugeAxis.
	 * @param idAxis GaugeAxis id.
	 * @return boolean Exist or doesn't exist GaugeAxis.
	 */
	public boolean existAxis(String idAxis){
		if(idAxes != null){
			return idAxes.contains(idAxis);
		}else{
			return false;
		}
	}
	
	/**
	 * Check exist GaugeArrow.
	 * @param idArrow GaugeArrow id.
	 * @return boolean Exist or doesn't exist GaugeArrow.
	 */
	public boolean existArrow(String idArrow){
		if(idArrows != null){
			return idArrows.contains(idArrow);
		}else{
			return false;
		}
	}
	
}
