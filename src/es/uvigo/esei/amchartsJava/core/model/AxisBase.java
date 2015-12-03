package es.uvigo.esei.amchartsJava.core.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Model class for CategoryAxis and ValueAxis
 * @author iago
 *
 */
public class AxisBase extends IModel {
	
	//guarda todos los fields activados para axes y el nombre asociado
	private Map<String,String> axesFields;

	/**
	 * Get nameFields used by user for axes.
	 * @return Map<String,String> Relation fields amcharts with nameField user.
	 */
	public Map<String,String> getAxesFields(){
		return axesFields;
	}
	
	/**
	 * Save nameFields used bu user for axes.
	 * @param nameFields Relation fields amcharts with nameField user.
	 */
	public void setAxesFields(Map<String,String> nameFields){
		if(axesFields == null){
			axesFields = new HashMap<String, String>();
		}
		axesFields = nameFields;
	}
	
	/**
	 * Add a new relation between nameField amcharts and nameField user for axes.
	 * @param nameField Name of field amcharts.
	 * @param valueField Name of field used by user.
	 */
	public void addAxesField(String nameField, String valueField) {
		if(axesFields == null){
			axesFields = new HashMap<String, String>();
		}
		axesFields.put(nameField, valueField);
		
	}
	
}
