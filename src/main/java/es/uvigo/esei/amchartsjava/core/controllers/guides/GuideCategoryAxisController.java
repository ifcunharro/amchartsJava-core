package es.uvigo.esei.amchartsjava.core.controllers.guides;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import es.uvigo.esei.amchartsjava.core.api.guides.IGuideCategoryAxisController;
import es.uvigo.esei.amchartsjava.core.validators.PropertyValidator;

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
		if(PropertyValidator.isValidString(category)){
			guide.setFeature("category", category);
		}
	}
	
	public String getDate(){
		return (String) guide.getFeature("date");
	}
	
	public void setDate(Date date){
		if(date != null){
			guide.setFeature("date", date.toString());
		}
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
		if(PropertyValidator.isValidString(toCategory)){
			guide.setFeature("toCategory", toCategory);
		}
	}

}
