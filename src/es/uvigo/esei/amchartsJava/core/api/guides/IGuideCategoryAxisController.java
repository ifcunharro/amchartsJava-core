package es.uvigo.esei.amchartsJava.core.api.guides;

import java.sql.Date;


public interface IGuideCategoryAxisController extends IGuideController {

	public Object getCategory();

	public void setCategory(String category);
	
	public Object getDate();

	public void setDate(Date date);
	
	public Object isExpand();

	public void setExpand(Boolean expand);

	public Object getToCategory();

	//falta comprobar categoria existente dataProvider
	public void setToCategory(String toCategory);

}