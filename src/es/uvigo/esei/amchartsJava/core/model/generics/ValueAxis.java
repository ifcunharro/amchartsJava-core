package es.uvigo.esei.amchartsJava.core.model.generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import es.uvigo.esei.amchartsJava.core.controllers.axis.ValueAxisController;
import es.uvigo.esei.amchartsJava.core.controllers.axis.ValueAxisRadarChartController;

public class ValueAxis{
	
	private Map<String,Object> valueAxis;

	{
		valueAxis = new HashMap<String,Object>();
	}
	
	public void initValueAxis(){
		valueAxis.put("valueAxis", new ArrayList<ValueAxisController>());
	}
	
	public void initValueAxisRadar(){
		valueAxis.put("valueAxisRadarChart", new ArrayList<ValueAxisRadarChartController>());
	}
	
	@SuppressWarnings("unchecked")
	public List<ValueAxisController> getValueAxis(){
		return (List<ValueAxisController>) valueAxis.get("valueAxis");
	}
	
	@SuppressWarnings("unchecked")
	public List<ValueAxisRadarChartController> getValueAxisRadar(){
		return (List<ValueAxisRadarChartController>) valueAxis.get("valueAxisRadarChart");
	}
	
	public void addValueAxis(ValueAxisController valueAxisController){
		this.getValueAxis().add(valueAxisController);
	}
	
	public void addValueAxisRadar(ValueAxisRadarChartController valueAxisRadarChartController){
		this.getValueAxisRadar().add(valueAxisRadarChartController);
	}
	
	public int sizeValueAxis(){
		return this.getValueAxis().size();
	}
	
	public int sizeValueAxisRadar(){
		return this.getValueAxisRadar().size();
	}

	public void removeValueAxis(int position) {
		this.getValueAxis().remove(position);
		
	}
	
	public void removeValueAxisRadar(int position) {
		this.getValueAxisRadar().remove(position);
		
	}

	public void setValueAxis(List<ValueAxisController> axes){
		valueAxis.put("valueAxis", axes);
	}
	
	public void setValueAxisRadar(List<ValueAxisRadarChartController> valueAxisRadarChartsControllers){
		valueAxis.put("valueAxisRadarChart", valueAxisRadarChartsControllers);
	}
	
}
