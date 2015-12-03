package es.uvigo.esei.amchartsJava.core.model;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import es.uvigo.esei.amchartsJava.core.controllers.PatternController;


public class AmGraph extends IModel  {
	private PatternController pattern;
	//guarda todos los fields activados para graph y el nombre asociado
	private Map<String,String> graphFields;

	public Map<String,String> getGraphFields(){
		return graphFields;
	}
	
	public void setGraphFields(Map<String,String> nameFields){
		if(graphFields == null){
			graphFields = new HashMap<String, String>();
		}
		graphFields = nameFields;
		setupFields();
	}
	
	private void setupFields() {
			Iterator<String> nameFields = graphFields.keySet().iterator();
			
			while(nameFields.hasNext()){
				switch(nameFields.next()){
					case "alphaField":
						setFeature("alphaField",graphFields.get("alphaField"));
						break;
					case "bulletField":
						setFeature("bulletField",graphFields.get("bulletField"));
						break;
					case "bulletSizeField":
						setFeature("bulletSizeField",graphFields.get("bulletSizeField"));
						break;
					case "closeField":
						setFeature("closeField",graphFields.get("closeField"));
						break;
					case "customBulletField":
						setFeature("customBulletField",graphFields.get("customBulletField"));
						break;
					case "dashLengthField":
						setFeature("dashLengthField",graphFields.get("dashLengthField"));
						break;
					case "descriptionField":
						setFeature("descriptionField",graphFields.get("descriptionField"));
						break;
					case "errorField":
						setFeature("errorField",graphFields.get("errorField"));
						break;
					case "fillColorsField":
						setFeature("fillColorsField",graphFields.get("fillColorsField"));
						break;
					case "gapField":
						setFeature("gapField",graphFields.get("gapField"));
						break;
					case "highField":
						setFeature("highField",graphFields.get("highField"));
						break;
					case "labelColorField":
						setFeature("labelColorField",graphFields.get("labelColorField"));
						break;
					case "lineColorField":
						setFeature("lineColorField",graphFields.get("lineColorField"));
						break;
					case "lowField":
						setFeature("lowField",graphFields.get("lowField"));
						break;
					case "openField":
						setFeature("openField",graphFields.get("openField"));
						break;
					case "patternField":
						setFeature("patternField",graphFields.get("patternField"));
						break;
					case "urlField":
						setFeature("urlField", graphFields.get("urlField"));
						break;
					case "valueField":
						setFeature("valueField", graphFields.get("urlField"));
						break;
					case "xField":
						setFeature("xField", graphFields.get("xField"));
						break;
					case "yField":
						setFeature("yField", graphFields.get("yField"));
						break;
				}
			}
			
	}
		
	

	public void addGraphField(String nameField,String valueField){
		if(graphFields == null){
			graphFields = new HashMap<String, String>();
		}
		graphFields.put(nameField, valueField);
	}
	
	public PatternController getPattern() {
		return pattern;
	}
	
	public void addPattern(PatternController patternController){
		pattern = patternController;
	}

}
