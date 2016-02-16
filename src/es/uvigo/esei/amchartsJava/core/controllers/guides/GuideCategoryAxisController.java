package es.uvigo.esei.amchartsJava.core.controllers.guides;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import es.uvigo.esei.amchartsJava.core.api.guides.IGuideCategoryAxisController;

/**
 * This class is a controller for Guide used by CategoryAxis
 * @author Iago Fernández Cuñarro
 *
 */
public class GuideCategoryAxisController extends GuideController 
	implements IGuideCategoryAxisController {
	

	private static final long serialVersionUID = -370496836869918203L;
	
	{
		//property used only by Guide used by CategoyAxis. Used to deserialize Guide to this class
		setExpand(false);
	}

	public String getCategory(){
		return (String) guide.getFeature("category");
	}
	
	public void setCategory(String category){
		guide.setFeature("category", category);
	}
	
	public String getDate(){
		return (String) guide.getFeature("date");
	}
	
	public void setDate(Date date){
		guide.setFeature("date", date.toString());
	}
	
	@JsonProperty(value="expand")
	public Boolean isExpand(){
		return (Boolean) guide.getFeature("expand");
	}
	
	public void setExpand(Boolean expand){
		guide.setFeature("expand", expand);
	}
	
	public String getToCategory(){
		return (String) guide.getFeature("toCategory");
	}
	
	public void setToCategory(String toCategory){
		guide.setFeature("toCategory", toCategory);
	}

}
