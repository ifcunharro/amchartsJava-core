package es.uvigo.esei.amchartsJava.core.api.guides;

import java.sql.Date;


public abstract interface IGuideCategoryAxisController extends IGuideController {

	abstract String getCategory();

	abstract void setCategory(String category);
	
	abstract String getDate();

	abstract void setDate(Date date);
	
	abstract Boolean isExpand();

	abstract void setExpand(Boolean expand);

	abstract String getToCategory();

	//falta comprobar categoria existente dataProvider
	abstract void setToCategory(String toCategory);

}