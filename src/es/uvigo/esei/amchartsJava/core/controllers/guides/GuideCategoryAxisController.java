package es.uvigo.esei.amchartsJava.core.controllers.guides;

import com.fasterxml.jackson.annotation.JsonProperty;

import es.uvigo.esei.amchartsJava.core.api.guides.IGuideCategoryAxisController;

public class GuideCategoryAxisController extends GuideController implements IGuideCategoryAxisController {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -370496836869918203L;

	@JsonProperty(value="expand")
	public Object isExpand(){
		return guide.getFeature("expand");
	}
	
	public void setExpand(Boolean expand){
		guide.setFeature("expand", expand);
	}
	
	public Object getToCategory(){
		return guide.getFeature("toCategory");
	}
	
	//falta comprobar categoria existente dataProvider
	public void setToCategory(String toCategory){
		guide.setFeature("toCategory", toCategory);
	}

}
