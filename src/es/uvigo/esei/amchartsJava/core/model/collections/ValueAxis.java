package es.uvigo.esei.amchartsJava.core.model.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import es.uvigo.esei.amchartsJava.core.controllers.axis.ValueAxisController;
import es.uvigo.esei.amchartsJava.core.controllers.axis.ValueAxisRadarChartController;

public class ValueAxis{
	
	private Map<String,Object> valueAxis;
	private int deleteValueAxis;
	private List<String> idValueAxes;
	private List<String> idValueAxesRadar;


	{
		valueAxis = new HashMap<String,Object>();
		idValueAxes = new ArrayList<String>();
		idValueAxesRadar = new ArrayList<String>();
		deleteValueAxis = 0;
	}
	
	public void initValueAxis(){
		if(valueAxis.get("valueAxis")==null){
			valueAxis.put("valueAxis", new ArrayList<ValueAxisController>());
		}
	}
	
	public void initValueAxisRadar(){
		if(valueAxis.get("valueAxisRadarChart")==null){
			valueAxis.put("valueAxisRadarChart", new ArrayList<ValueAxisRadarChartController>());
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<ValueAxisController> getValueAxis(){
		if(valueAxis.get("valueAxis")!=null){
			return (List<ValueAxisController>)(List<?>) valueAxis.get("valueAxis");
		}
		return null;
		
	}
	
	@SuppressWarnings("unchecked")
	public List<ValueAxisRadarChartController> getValueAxisRadar(){
		if(valueAxis.get("valueAxisRadarChart")!=null){
			return (List<ValueAxisRadarChartController>)(List<?>)valueAxis.get("valueAxisRadarChart");
		}
		return null;
	}
	
	public void addValueAxis(ValueAxisController valueAxisController){
		
		getValueAxis().add(valueAxisController);
		idValueAxes.add(valueAxisController.getId().toString());
	}
	
	public void addValueAxisRadar(ValueAxisRadarChartController valueAxisRadarChartController){
		getValueAxisRadar().add(valueAxisRadarChartController);
		idValueAxesRadar.add(valueAxisRadarChartController.getId().toString());
	}
	
	public int sizeValueAxis(){
		if(getValueAxis()!=null){
			return this.getValueAxis().size();
		}
		return 0;
	}
	
	public int sizeValueAxisRadar(){
		if(getValueAxisRadar()!=null){
			return this.getValueAxisRadar().size();
		}
		return 0;
	}

	public void removeValueAxis(int position) {
		idValueAxes.remove(getValueAxis().get(position).getId().toString());
		this.getValueAxis().remove(position);
		
		deleteValueAxis++;
	}
	
	public void removeValueAxisRadar(int position) {
		idValueAxesRadar.remove(getValueAxisRadar().get(position).getId().toString());

		this.getValueAxisRadar().remove(position);
		deleteValueAxis++;
		
	}

	public void setValueAxis(List<ValueAxisController> valueAxes){
		valueAxis.put("valueAxis", valueAxes);
	}
	
	public void setValueAxisRadar(List<ValueAxisRadarChartController> valueAxisRadarChartsControllers){
		valueAxis.put("valueAxisRadarChart", valueAxisRadarChartsControllers);
	}
	
	public List<String> getValueAxisIds(){
		return idValueAxes;
	}
	
	public List<String> getValueAxisRadarIds(){
		return idValueAxesRadar;
	}
	
	public int getDeleteValueAxis(){
		return deleteValueAxis;
	}
	
}
