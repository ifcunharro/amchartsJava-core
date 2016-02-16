package es.uvigo.esei.amchartsJava.core.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Observable;

/**
 * Model classes in this package must extend this class. This class have methods to save values to properties of model objects.
 * @author Iago Fernández Cuñarro
 *
 */
public abstract class IModel extends Observable {
	protected Map<String,Object> config;
	
	{
		config = new HashMap<String, Object>();
	}
	
	/**
	 * Get value of property.
	 * @param nameFeature Name of property to recover.
	 * @return Value of property or null if doesn't save by user.
	 */
	public Object getFeature(String nameFeature){
		return config.get(nameFeature);
	}
	
	/**
	 * Set numeric property.
	 * @param nameFeature Name of property
	 * @param feature Value of property.
	 */
	public void setFeature(String nameFeature, Number feature){
		config.put(nameFeature, feature);
	}
	
	/**
	 * Set string property.
	 * @param nameFeature Name of property.
	 * @param feature Value of property.
	 */
	public void setFeature(String nameFeature, String feature){
		config.put(nameFeature, feature);
	}
	
	/**
	 * Set boolean property.
	 * @param nameFeature Name of property.
	 * @param feature Value of property.
	 */
	public void setFeature(String nameFeature, Boolean feature){
		config.put(nameFeature, feature);
	}
	
	/**
	 * Clear value for property saved.
	 * @param nameFeature Name of property.
	 */
	public void removeFeature(String nameFeature){
		config.remove(nameFeature);
	}
	
	
}
