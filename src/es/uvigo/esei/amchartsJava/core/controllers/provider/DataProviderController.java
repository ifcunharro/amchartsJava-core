package es.uvigo.esei.amchartsJava.core.controllers.provider;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class DataProviderController implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1938415250475227549L;
	private List<Map<String,Object>> dataProvider;
	
	{
		dataProvider = new ArrayList<Map<String,Object>>();
	}
	
	public List<Map<String, Object>> getDataProvider(){
		return dataProvider;
	}
	
	public void setDataProvider(List<Map<String, Object>> provider){
		dataProvider = provider;
	}
	
	public void addData(Map<String, Object> dataRow){
		dataProvider.add(dataRow);
	}
	
	@JsonIgnore
	public boolean isEmpty(){
		return dataProvider.isEmpty();
	}
	

}
