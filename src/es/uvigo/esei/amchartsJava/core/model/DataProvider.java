package es.uvigo.esei.amchartsJava.core.model;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

import es.uvigo.esei.amchartsJava.core.controllers.provider.DataController;



public class DataProvider extends IModel {
	
	private Map<String,String> fields;
	private List<DataController> provider;
	
	
	
	@JsonIgnore
	public void setFields(Map<String,String> nameFields){
		fields = nameFields;
	}
	
	@JsonSetter
	public void setDataProvider(List<DataController> dataController){
		
	}
	
	public void addData(DataController dataController){
	
		
	}

	public void saveProvider(DataProvider providerData) {
		if(fields == null){
			fields = new HashMap<String, String>();
		}
		
		DataController map = providerData.provider.get(0);
		if(map.getData().size()>0){
			String key = null;
			Iterator<String> fieldKeys = map.keySet().iterator();
			while (fieldKeys.hasNext()){
				key = fieldKeys.next();
				fields.put(key, (String)map.get(key));
			}
		}
		
		
	}
	
	/*
	 * list<map<string,Object>> para cada map string son fields, se guardan en fields
	 * 
	 */
	
	
	
	

}
