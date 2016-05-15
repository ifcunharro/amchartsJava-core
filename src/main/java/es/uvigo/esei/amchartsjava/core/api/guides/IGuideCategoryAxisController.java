package es.uvigo.esei.amchartsjava.core.api.guides;

import java.sql.Date;

/**
 * 
 * Interface for GuideCategoryAxisController. This interface contains properties of guide used only by categoriAxis.
 *  Details of Guide and its properties in AmCharts API.
 * 
 * @author Iago Fernández Cuñarro
 *
 */
public abstract interface IGuideCategoryAxisController extends IGuideController {

	/**
	 * Get category property.
	 * @return Value of category.
	 */
	abstract String getCategory();

	/**
	 * Set category property.
	 * @param category Value for category.
	 */
	abstract void setCategory(String category);
	
	/**
	 * Get date property.
	 * @return Value of date.
	 */
	abstract String getDate();

	/**
	 * Set date property.
	 * @param date Value for date.
	 */
	abstract void setDate(Date date);
	
	/**
	 * Get expand property.<br>
	 * Default: false.
	 * @return Value of expand.
	 */
	abstract Boolean isExpand();

	/**
	 * Set expand property.
	 * @param expand Enable or disable expand.
	 */
	abstract void setExpand(Boolean expand);

	/**
	 * Get toCategory property.
	 * @return Value of toCategory.
	 */
	abstract String getToCategory();

	/**
	 * Set toCategory property.
	 * @param toCategory Value for toCategory.
	 */
	abstract void setToCategory(String toCategory);

}