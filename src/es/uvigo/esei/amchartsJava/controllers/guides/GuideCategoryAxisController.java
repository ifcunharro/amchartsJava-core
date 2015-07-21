package es.uvigo.esei.amchartsJava.controllers.guides;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GuideCategoryAxisController extends GuideController {
	
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
