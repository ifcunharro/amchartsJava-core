package es.uvigo.esei.amchartsJava.core.model;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import es.uvigo.esei.amchartsJava.core.controllers.PatternController;

/**
 * Model class for AmGraph
 * @author Iago Fernández Cuñarro
 *
 */
public class AmGraph extends IModel  {
	private PatternController pattern;
	//guarda todos los fields activados para graph y el nombre asociado
	private Map<String,String> graphFields;

	/**
	 * Get graphFields used by user.
	 * @return Map<String,String> Map or relation nameField amcharts- nameField user.
	 */
	public Map<String,String> getGraphFields(){
		return graphFields;
	}
	
	/**
	 * Save a relation between nameFields used by user and nameFields amcharts.
	 * @param graphFields Map with key equals to nameField amcharts and value nameField used by user.
	 */
	public void setGraphFields(Map<String,String> nameFields){
		if(graphFields == null){
			graphFields = new HashMap<String, String>();
		}
		graphFields = nameFields;
		setupFields();
	}

	//used to set nameFields used by user in properties amgraph. Values can be loaded from
	//json file
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
		
	/**
	 * Add a relation nameField amcharts-nameField used by user.
	 * @param nameField name of field amcharts
	 * @param valueField name of field used by user
	 */
	public void addGraphField(String nameField,String valueField){
		if(graphFields == null){
			graphFields = new HashMap<String, String>();
		}
		graphFields.put(nameField, valueField);
	}
	
	/**
	 * Get graph pattern.
	 * @return PatternController Controller for pattern.
	 */
	public PatternController getPattern() {
		return pattern;
	}
	
	/**
	 * Add a pattern to amgraph.
	 * @param patternController Controller for pattern.
	 */
	public void addPattern(PatternController patternController){
		pattern = patternController;
	}

}
