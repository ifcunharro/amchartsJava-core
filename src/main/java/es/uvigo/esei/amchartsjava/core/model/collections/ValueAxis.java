package es.uvigo.esei.amchartsjava.core.model.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import es.uvigo.esei.amchartsjava.core.controllers.axis.ValueAxisController;
import es.uvigo.esei.amchartsjava.core.controllers.axis.ValueAxisRadarChartController;

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
	
	/**
	 * Get number of ValueAxis added to chart.
	 * @return Number of ValueAxis.
	 */
	public int sizeAxis(){
		return sizeAxis;
	}
	
	/**
	 * Get number of ValueAxis to not radar charts.
	 * @return Number of ValueAxisController.
	 */
	public int sizeValueAxis(){
		if(isNotEmptyValueAxis()){
			return this.getValueAxis().size();
		}
		return 0;
	}
	
	/**
	 * Get number of ValueAxis to radar chart.
	 * @return Number of ValueAxisRadarChartController.
	 */
	public int sizeValueAxisRadar(){
		if(isNotEmptyValueAxisRadarChart()){
			return this.getValueAxisRadar().size();
		}
		return 0;
	}
	
	/**
	 * Get delete ValueAxis.
	 * @return Number of delete ValueAxis.
	 */
	public int getDeleteValueAxis(){
		return deleteAxis;
	}
	
	/**
	 * Check exists ValueAxis in collection.
	 * @param idValueAxis ValueAxis id.
	 * @return Exists or doesn't exist ValueAxis in collection.
	 */
	public boolean existValueAxis(String idValueAxis) {
		return getAllAxisIds().contains(idValueAxis);
	}
	
	/**
	 * Check exists any ValueAxis to radar chart.
	 * @return List of ValueAxisRadarChartController initialized.
	 */
	public boolean isNotEmptyValueAxisRadarChart() {
		return getValueAxisRadar()!=null;
	}

	/**
	 * Check exists any ValueAxis to not radar chart.
	 * @return List of ValueAxisController initialized.
	 */
	public boolean isNotEmptyValueAxis() {
		return getValueAxis()!=null;
	}
	
	/**
	 * Get ValueAxis ids.
	 * @return ValueAxis ids.
	 */
	public List<String> getAllAxisIds(){
		return idValueAxes;
	}
	
	/**
	 * Get ValueAxis ids to not radar chart.
	 * @return ValueAxis ids.
	 */
	public List<String> getValueAxisIds(){
		List<String> ids = new ArrayList<String>();
		if(isNotEmptyValueAxis()){
			for(ValueAxisController valueAxis: getValueAxis()){
				ids.add(valueAxis.getId());
			}
		}
		return ids;
	}
	
	/**
	 * Get ValueAxis ids to radar chart.
	 * @return ValueAxis ids.
	 */
	public List<String> getValueAxisRadarIds(){
		List<String> ids = new ArrayList<String>();
		if(isNotEmptyValueAxisRadarChart()){
			for(ValueAxisRadarChartController valueAxisRadar: getValueAxisRadar()){
				ids.add(valueAxisRadar.getId());
			}
		}
		return ids;
	}
	
	/**
	 * Get ValueAxis.
	 * @return List of ValueAxis and ValueAxisRadarChart.
	 */
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
	
	/**
	 * Add a ValueAxis to collection.
	 * @param valueAxisController Controller for ValueAxis.
	 */
	public void addValueAxis(ValueAxisController valueAxisController){
		if(getValueAxis()==null){
			initValueAxis();
		}
		getValueAxis().add(valueAxisController);
		String idValueAxis = valueAxisController.getId();
		idValueAxes.add(idValueAxis);
		positionsAxis.put(idValueAxis, sizeValueAxis()-1);
		sizeAxis++;
	
	}
	
	/**
	 * Add a ValueAxisRadarChart to collection.
	 * @param valueAxisRadarChartController Controller for valueAxisRadarChart.
	 */
	public void addValueAxisRadar(ValueAxisRadarChartController valueAxisRadarChartController){
		if(getValueAxisRadar()==null){
			initValueAxisRadar();
		}
		getValueAxisRadar().add(valueAxisRadarChartController);
		String idValueAxisRadar = valueAxisRadarChartController.getId();
		idValueAxes.add(idValueAxisRadar);
		positionsAxis.put(idValueAxisRadar, sizeValueAxisRadar()-1);
		sizeAxis++;
	}
	
	/**
	 * Remove a valueAxis from collection.
	 * @param idValueAxis ValueAxis id.
	 */
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
	
	/**
	 * Remove a valueAxisRadarChart from collection.
	 * @param idValueAxisRadar ValueAxis id.
	 */
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

	/**
	 * Initialize list of ValueAxisController.
	 */
	private void initValueAxis(){
		valueAxis.put("ValueAxisController", new ArrayList<ValueAxisController>());	
	}
	
	/**
	 * Initialize list of ValueAxisRadarChartController.
	 */
	private void initValueAxisRadar(){
		valueAxis.put("ValueAxisRadarChartController", new ArrayList<ValueAxisRadarChartController>());
	}
	
	/**
	 * Remove list of ValueAxisController.
	 */
	private void deleteValueAxis() {
		valueAxis.remove("ValueAxisController");
	}
	
	/**
	 * Remove list of ValueAxisRadarChartController.
	 */
	private void deleteValueAxisRadar() {
		valueAxis.remove("ValueAxisRadarChartController");
	}
	
	/**
	 * Get list of ValueAxisController.
	 * @return List<ValueAxisController>
	 */
	@SuppressWarnings("unchecked")
	private List<ValueAxisController> getValueAxis(){
		return (List<ValueAxisController>)(List<?>) valueAxis.get("ValueAxisController");
	}
	
	/**
	 * Get list of ValueAxisRadarChartController.
	 * @return List<ValueAxisRadarChartController>
	 */
	@SuppressWarnings("unchecked")
	private List<ValueAxisRadarChartController> getValueAxisRadar(){
		return (List<ValueAxisRadarChartController>)(List<?>)valueAxis.get("ValueAxisRadarChartController");
	}


}
