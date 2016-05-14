package es.uvigo.esei.amchartsjava.core.controllers.provider;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * This class is a controller for dataProvider.
 * @author Iago Fernández Cuñarro
 *
 */
@JsonInclude(Include.NON_NULL)
public class DataProviderController implements Serializable {
	
	private static final long serialVersionUID = -1938415250475227549L;
	private List<Map<String,Object>> dataProvider;
	
	{
		dataProvider = new ArrayList<Map<String,Object>>();
	}
	
	/**
	 * Get dataProvider.
	 * @return dataProvider
	 */
	public List<Map<String, Object>> getDataProvider(){
		return dataProvider;
	}
	
	/**
	 * Set dataProvider.
	 * @param provider dataProvider property.
	 */
	public void setDataProvider(List<Map<String, Object>> provider){
		dataProvider = provider;
	}
	
	/**
	 * Add a row to dataProvider.
	 * @param dataRow data to add to dataProvider
	 */
	public void addData(Map<String, Object> dataRow){
		dataProvider.add(dataRow);
	}
	
	/**
	 * Check dataProvider is empty.
	 * @return DataProvider has rows or doesn't.
	 */
	@JsonIgnore
	public boolean isEmpty(){
		return dataProvider.isEmpty();
	}
	

}
