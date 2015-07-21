package es.uvigo.esei.amchartsJava.model;

import java.util.ArrayList;
import java.util.List;

import es.uvigo.esei.amchartsJava.controllers.guides.GuideController;

public class AxisBase extends IModel {
	
	protected List<GuideController> guides;
	
	public void addGuide(GuideController guideController) {
		if(guides==null){
			guides = new ArrayList<GuideController>();
		}
		
		guides.add(guideController);
		
	}
	
	public void removeGuide(GuideController guideController){
		if(guides!=null){
			guides.remove(guideController);
		}
	}
	
	public boolean existGuide(GuideController guideController){
		return guides.contains(guideController);
	}

}
