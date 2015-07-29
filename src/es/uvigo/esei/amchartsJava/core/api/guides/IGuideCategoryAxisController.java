package es.uvigo.esei.amchartsJava.core.api.guides;


public interface IGuideCategoryAxisController extends IGuideController {

	public Object isExpand();

	public void setExpand(Boolean expand);

	public Object getToCategory();

	//falta comprobar categoria existente dataProvider
	public void setToCategory(String toCategory);

}