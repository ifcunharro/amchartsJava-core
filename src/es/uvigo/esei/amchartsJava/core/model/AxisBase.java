package es.uvigo.esei.amchartsJava.core.model;

import java.util.ArrayList;
import java.util.List;

import es.uvigo.esei.amchartsJava.core.api.guides.IGuideController;
import es.uvigo.esei.amchartsJava.core.controllers.guides.GuideController;

public class AxisBase extends IModel {
	
	protected List<GuideController> guides;
	
	public void addGuide(GuideController guideController) {
		if(guides==null){
			guides = new ArrayList<GuideController>();
		}
		
		guides.add(guideController);
		
	}
	
	public void removeGuide(IGuideController guideController){
		if(guides!=null){
			guides.remove(guideController);
		}
	}
	
	public boolean existGuide(IGuideController guideController){
		return guides.contains(guideController);
	}

}
