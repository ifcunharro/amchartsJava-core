package model;

import java.util.HashMap;
import java.util.Map;

public abstract class IModel {
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
	
	

}
