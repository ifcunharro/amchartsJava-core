package es.uvigo.esei.amchartsJava.core.model;

import java.util.HashMap;
import java.util.Map;

public class AxisBase extends IModel {
	
	//guarda todos los fields activados para axes y el nombe asociado
	private Map<String,String> axesFields;

	public void addAxesField(String nameField, String valueField) {
		if(axesFields == null){
			axesFields = new HashMap<String, String>();
		}
		axesFields.put(nameField, valueField);
		
	}
	
}
