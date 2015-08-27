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
	
	
	
	
	public List<GaugeArrowController> getArrows(){
		if(arrows == null){
			return null;
		}else{
			return arrows;
		}
	}
	
	

	public void setArrows(List<GaugeArrowController> gaugeArrowControllers) {
		if(arrows == null){
			arrows = new ArrayList<GaugeArrowController>();
			positionArrows = new HashMap<String,Integer>();
		}
		
		arrows = gaugeArrowControllers;
		for(GaugeArrowController arrow: arrows){
			positionArrows.put(arrow.getId().toString(), arrows.indexOf(arrow));
		}
		
	}

	public List<GaugeAxisController> getAxes() {
		if(axes == null){
			return null;
		}else{
			return axes;
		}
	}

	public void setAxes(List<GaugeAxisController> gaugeAxisControllers) {
		if(axes == null){
			axes = new ArrayList<GaugeAxisController>();
			positionAxes = new HashMap<String, Integer>();
		}
		axes = gaugeAxisControllers;
		for(GaugeAxisController axe: axes){
			positionAxes.put(axe.getId().toString(), axes.indexOf(axe));
		}
	}

	public Object getFacePattern() {
		return facePattern;	
	}

	public void setFacePattern(PatternController pattern) {
		facePattern = pattern;
	}

	public void addArrow(GaugeArrowController gaugeArrowController) {
		if(arrows == null){
			arrows = new ArrayList<GaugeArrowController>();
			idArrows = new ArrayList<String>();
			positionArrows = new HashMap<String,Integer>();
		}
		addObserver(gaugeArrowController);
		setChanged();
		notifyObservers(arrows.size()+1+deleteArrows);
		deleteObservers();
		gaugeArrowController.setChart(this);
		arrows.add(gaugeArrowController);
		idArrows.add(gaugeArrowController.getId().toString());
		positionArrows.put(gaugeArrowController.getId().toString(),arrows.size()-1);
	}
	
	public void addAxis(GaugeAxisController gaugeAxisController){
		if(axes == null){
			axes = new ArrayList<GaugeAxisController>();
			idAxes = new ArrayList<String>();
			positionAxes = new HashMap<String, Integer>();
		}
		addObserver(gaugeAxisController);
		setChanged();
		notifyObservers(axes.size()+1+deleteAxes);
		deleteObservers();
		if(gaugeAxisController.getBands() != null){
			asignIdToBands(gaugeAxisController);
		}
		axes.add(gaugeAxisController);
		idAxes.add(gaugeAxisController.getId().toString());
		positionAxes.put(gaugeAxisController.getId().toString(), axes.size()-1);
		
		
	}
	
	
	@SuppressWarnings("unchecked")
	private void asignIdToBands(GaugeAxisController gaugeAxisController){
		if(idGaugeBands == null){
			idGaugeBands = new ArrayList<String>();
		}
		List<GaugeBandController> bands = (List<GaugeBandController>)(List<?>)gaugeAxisController.getBands();
		for(GaugeBandController band: bands){
			sizeBands++;
			addObserver(band);
			setChanged();
			notifyObservers(sizeBands);
			idGaugeBands.add("GaugeBand-"+sizeBands);
			deleteObservers();
		}
	}

	public void removeArrow(String idArrow) {
		if(arrows != null){
			arrows.remove(positionArrows.get(idArrow));
		}
	}
	
	public void removeAxis(String idAxis){
		if(axes != null){
			axes.remove(positionAxes.get(idAxis));
		}
	}
	
	public boolean existGaugeBand(String idGaugeBand){
		if(idGaugeBands != null){
			return idGaugeBands.contains(idGaugeBand);
		}else{
			return false;
		}
	}
	
	public boolean existAxis(String idAxis){
		if(idAxes != null){
			return idAxes.contains(idAxis);
		}else{
			return false;
		}
	}
	
	public boolean existArrow(String idArrow){
		if(idArrows != null){
			return idArrows.contains(idArrow);
		}else{
			return false;
		}
	}
	
}
