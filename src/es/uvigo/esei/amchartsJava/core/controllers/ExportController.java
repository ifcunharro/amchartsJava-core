package es.uvigo.esei.amchartsJava.core.controllers;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import es.uvigo.esei.amchartsJava.core.model.Export;

@JsonInclude(Include.NON_NULL)
public class ExportController implements Serializable {
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5753860660840996749L;
	private Export export;

	{
		export = new Export();
	}
	
	public Object getBackgroundColor(){
		return export.getFeature("backgroundColor");
	}
	
	public void setBackgroundColor(String backgroundColor){
		export.setFeature("backgroundColor", backgroundColor);
	}
	
	@JsonProperty(value="enabled")
	public Object isEnabled(){
		return export.getFeature("enabled");
	}
	
	public void setEnabled(Boolean enabled){
		export.setFeature("enabled", enabled);
	}
	
	public Object getDivId(){
		return export.getFeature("divId");
	}
	
	public void setDivId(String divId){
		export.setFeature("divId", divId);
	}
	
	public Object getFabric(){
		return export.getFabric();
	}
	
	public void setFabric(ExportController fabric){
		export.setFabric(fabric);
	}
	
	
	
	

}
