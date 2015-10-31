package es.uvigo.esei.amchartsJava.core.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Observable;

public abstract class IModel extends Observable {
	protected Map<String,Object> config;
	
	{
		config = new HashMap<String, Object>();
	}
	
	public Object getFeature(String nameFeature){
		return config.get(nameFeature);
	}
	
	public void setFeature(String nameFeature, Number feature){
		config.put(nameFeature, feature);
	}
	
	public void setFeature(String nameFeature, String feature){
		config.put(nameFeature, feature);
	}
	
	public void setFeature(String nameFeature, Boolean feature){
		config.put(nameFeature, feature);
	}
	
	public void removeFeature(String nameFeature){
		config.remove(nameFeature);
	}
	
	
}
