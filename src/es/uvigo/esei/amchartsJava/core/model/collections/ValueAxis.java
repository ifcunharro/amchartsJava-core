package es.uvigo.esei.amchartsJava.core.model.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import es.uvigo.esei.amchartsJava.core.controllers.axis.ValueAxisController;
import es.uvigo.esei.amchartsJava.core.controllers.axis.ValueAxisRadarChartController;

public class ValueAxis{
	
	private Map<String,Object> valueAxis;
	private Map<String,Integer> positionsAxis;
	private List<String> idValueAxes;
	private int sizeAxis;
	private int deleteAxis;

	{
		valueAxis = new HashMap<String,Object>();
		positionsAxis = new HashMap<String,Integer>();
		idValueAxes = new ArrayList<String>();
		sizeAxis = 0;
		deleteAxis = 0;
	}
	
	public int sizeAxis(){
		return sizeAxis;
	}
	
	public int sizeValueAxis(){
		if(isNotEmptyValueAxis()){
			return this.getValueAxis().size();
		}
		return 0;
	}
	
	public int sizeValueAxisRadar(){
		if(isNotEmptyValueAxisRadarChart()){
			return this.getValueAxisRadar().size();
		}
		return 0;
	}
	

	public int getDeleteValueAxis(){
		return deleteAxis;
	}
	
	public boolean existValueAxis(String idValueAxis) {
		return getAllAxisIds().contains(idValueAxis);
	}
	
	public boolean isNotEmptyValueAxisRadarChart() {
		return getValueAxisRadar()!=null;
	}

	public boolean isNotEmptyValueAxis() {
		return getValueAxis()!=null;
	}
	
	public List<String> getAllAxisIds(){
		return idValueAxes;
	}
	
	public List<String> getValueAxisIds(){
		List<String> ids = new ArrayList<String>();
		if(isNotEmptyValueAxis()){
			for(ValueAxisController valueAxis: getValueAxis()){
				ids.add(valueAxis.getId().toString());
			}
		}
		return ids;
	}
	
	public List<String> getValueAxisRadarIds(){
		List<String> ids = new ArrayList<String>();
		if(isNotEmptyValueAxisRadarChart()){
			for(ValueAxisRadarChartController valueAxisRadar: getValueAxisRadar()){
				ids.add(valueAxisRadar.getId().toString());
			}
		}
		return ids;
	}
	
	public List<ValueAxisController> getValueAxes(){
		List<ValueAxisController> valueAxisControllers = new ArrayList<ValueAxisController>();
		if(isNotEmptyValueAxis()){
			for(ValueAxisController val: getValueAxis()){
				valueAxisControllers.add(val);
			}
		}
		if(isNotEmptyValueAxisRadarChart()){
			for(ValueAxisController val: getValueAxisRadar()){
				valueAxisControllers.add(val);
			}
		}

		return valueAxisControllers;
	}
	
	public void addValueAxis(ValueAxisController valueAxisController){
		if(getValueAxis()==null){
			initValueAxis();
		}
		getValueAxis().add(valueAxisController);
		String idValueAxis = valueAxisController.getId().toString();
		idValueAxes.add(idValueAxis);
		positionsAxis.put(idValueAxis, sizeValueAxis()-1);
		sizeAxis++;
	
	}
	
	public void addValueAxisRadar(ValueAxisRadarChartController valueAxisRadarChartController){
		if(getValueAxisRadar()==null){
			initValueAxisRadar();
		}
		getValueAxisRadar().add(valueAxisRadarChartController);
		String idValueAxisRadar = valueAxisRadarChartController.getId().toString();
		idValueAxes.add(idValueAxisRadar);
		positionsAxis.put(idValueAxisRadar, sizeValueAxisRadar()-1);
		sizeAxis++;
	}
	
	public void removeValueAxis(String idValueAxis) {
		int position = positionsAxis.get(idValueAxis);
		getValueAxis().remove(position);
		if(sizeValueAxis()==0){
			deleteValueAxis();
		}
		sizeAxis--;
		deleteAxis++;
		idValueAxes.remove(idValueAxis);
		positionsAxis.remove(idValueAxis);
		
	}
	
	public void removeValueAxisRadar(String idValueAxisRadar) {
		int position = positionsAxis.get(idValueAxisRadar);
		getValueAxisRadar().remove(position);
		if(sizeValueAxisRadar()==0){
			deleteValueAxisRadar();
		}
		sizeAxis--;
		deleteAxis++;
		idValueAxes.remove(idValueAxisRadar);
		positionsAxis.remove(idValueAxisRadar);
	}

	private void initValueAxis(){
		valueAxis.put("ValueAxisController", new ArrayList<ValueAxisController>());	
	}
	
	private void initValueAxisRadar(){
		valueAxis.put("ValueAxisRadarChartController", new ArrayList<ValueAxisRadarChartController>());
	}
	
	private void deleteValueAxis() {
		valueAxis.remove("ValueAxisController");
	}
	
	private void deleteValueAxisRadar() {
		valueAxis.remove("ValueAxisRadarChartController");
	}
	
	@SuppressWarnings("unchecked")
	private List<ValueAxisController> getValueAxis(){
		return (List<ValueAxisController>)(List<?>) valueAxis.get("ValueAxisController");
	}
	
	@SuppressWarnings("unchecked")
	private List<ValueAxisRadarChartController> getValueAxisRadar(){
		return (List<ValueAxisRadarChartController>)(List<?>)valueAxis.get("ValueAxisRadarChartController");
	}


}
