package es.uvigo.esei.amchartsJava.core.controllers.provider;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class DataController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5711414622508754334L;
	private Map<String,Object> data;
	
	{
		data = new HashMap<String, Object>();
	}
	
	public Map<String,Object> getData(){
		return data;
	}
	
	
	@SuppressWarnings("unused")
	private void setData(Map<String,Object> datas){
		if(data == null){
			data = new HashMap<String,Object>();
		}
		data = datas;
	}
	
	public void createData(String nameField,Object valueField){
		data.put(nameField, valueField);
	}
	
	public void removeData(String nameField){
		data.remove(nameField);
	}


	public Set<String> keySet() {
		return data.keySet();
	}


	public String get(String key) {
		if(data != null && data.get(key) != null){
			return (String) data.get(key);
		}else{
			return null;
		}
		
	}
	

}
