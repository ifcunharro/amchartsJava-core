package es.uvigo.esei.amchartsJava.core.model;

import java.util.HashMap;
import java.util.Map;

public class AxisBase extends IModel {
	
	//guarda todos los fields activados para axes y el nombre asociado
	private Map<String,String> axesFields;

	public Map<String,String> getAxesFields(){
		return axesFields;
	}
	
	public void setAxesFields(Map<String,String> nameFields){
		if(axesFields == null){
			axesFields = new HashMap<String, String>();
		}
		axesFields = nameFields;
	}
	
	public void addAxesField(String nameField, String valueField) {
		if(axesFields == null){
			axesFields = new HashMap<String, String>();
		}
		axesFields.put(nameField, valueField);
		
	}
	
}
