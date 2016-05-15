package es.uvigo.esei.amchartsjava.core.model.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import es.uvigo.esei.amchartsjava.core.controllers.guides.GuideCategoryAxisController;
import es.uvigo.esei.amchartsjava.core.controllers.guides.GuideController;
import es.uvigo.esei.amchartsjava.core.controllers.guides.GuideRadarChartController;
import es.uvigo.esei.amchartsjava.core.controllers.guides.GuideValueAxisController;

/**
 * Collection of Guides.
 * @author Iago Fernández Cuñarro
 *
 */
public class Guides {
	
	private Map<String,Object> guides;
	private Map<String,Integer> positionsGuides;
	private int sizeGuides;
	private int deleteGuides;
	private List<String> idGuides;
	
	{
		guides = new HashMap<String,Object>();
		positionsGuides = new HashMap<String,Integer>();
		idGuides = new ArrayList<String>();
		sizeGuides = 0;
		deleteGuides = 0;
	}
	
	/**
	 * Get number of Guides added to chart.
	 * @return Number of Guides.
	 */
	public int sizeGuides(){
		return sizeGuides;
	}
	
	/**
	 * Get number of Guides to CategoryAxis.
	 * @return Number of GuideCategoryAxisController.
	 */
	public int sizeGuidesCategoryAxis(){
		if(isNotEmptyGuideCategoryAxis()){
			return getGuideCategoryAxis().size();
		}
		return 0;
	}
	
	/**
	 * Get number of Guides to radar chart.
	 * @return Number of GuideRadarChartController.
	 */
	public int sizeGuidesRadarChart(){
		if(isNotEmptyGuideRadarChart()){
			return getGuideRadarChart().size();
		}
		return 0;
	}
	
	/**
	 * Get number of Guides to ValueAxis.
	 * @return Number of GuideValueAxisController.
	 */
	public int sizeGuidesValueAxis(){
		if(isNotEmptyGuideValueAxis()){
			return getGuideValueAxis().size();
		}
		return 0;
	}
	
	/**
	 * Get delete Guides.
	 * @return Number of delete Guides.
	 */
	public int deleteGuides(){
		return deleteGuides;
	}
	
	/**
	 * Check exists Guide in collection.
	 * @param idGuide Guide id.
	 * @return Exists or doesn't exist Guide in collection.
	 */
	public boolean existGuide(String idGuide) {
		return getAllGuidesIds().contains(idGuide);
	}
	
	/**
	 * Check exists any Guide to CategoryAxis.
	 * @return List of GuideCategoryAxisController initialized.
	 */
	public boolean isNotEmptyGuideCategoryAxis(){
		return getGuideCategoryAxis()!=null;
	}
	
	/**
	 * Check exists any Guide to radar chart.
	 * @return List of GuideRadarChartController initialized.
	 */
	public boolean isNotEmptyGuideRadarChart(){
		return getGuideRadarChart()!=null;
	}
	
	/**
	 * Check exists any Guide to ValueAxis.
	 * @return List of GuideValueAxisController initialized.
	 */
	public boolean isNotEmptyGuideValueAxis(){
		return getGuideValueAxis()!=null;
	}
	
	/**
	 * Get Guide ids.
	 * @return List of Guide ids.
	 */
	public List<String> getAllGuidesIds(){
		return idGuides;
	}
	
	/**
	 * Get Guide ids to CategoryAxis. 
	 * @return Guide ids.
	 */
	public List<String> getGuideCategoryAxisIds(){
		List<String> ids = new ArrayList<String>();
		if(isNotEmptyGuideCategoryAxis()){
			for(GuideCategoryAxisController categoryAxisGuide: getGuideCategoryAxis()){
				ids.add(categoryAxisGuide.getId());
			}
		}
		return ids;
	}
	
	/**
	 * Get Guide ids to radar chart. 
	 * @return Guide ids.
	 */
	public List<String> getGuideRadarChartIds(){
		List<String> ids = new ArrayList<String>();
		if(isNotEmptyGuideRadarChart()){
			for(GuideRadarChartController radarChartGuide: getGuideRadarChart()){
				ids.add(radarChartGuide.getId());
			}
		}
		return ids;
	}
	
	/**
	 * Get Guide ids to ValueAxis. 
	 * @return Guide ids.
	 */
	public List<String> getGuideValueAxisIds(){
		List<String> ids = new ArrayList<String>();
		if(isNotEmptyGuideValueAxis()){
			for(GuideValueAxisController valueAxisGuide: getGuideValueAxis()){
				ids.add(valueAxisGuide.getId());
			}
		}
		return ids;
	}
	
	/**
	 * Get Guides.
	 * @return List of Guides.
	 */
	public List<GuideController> getGuides(){
		List<GuideController> guideControllers = new ArrayList<GuideController>();
		if(isNotEmptyGuideCategoryAxis()){
			for(GuideController guide: getGuideCategoryAxis()){
				guideControllers.add(guide);
			}
		}
		if(isNotEmptyGuideRadarChart()){
			for(GuideController guide: getGuideRadarChart()){
				guideControllers.add(guide);
			}
		}
		if(isNotEmptyGuideValueAxis()){
			for(GuideController guide: getGuideValueAxis()){
				guideControllers.add(guide);
			}
			
		}
		
		return guideControllers;
	}
	

	/**
	 * Add a GuideCategoryAxis to collection.
	 * @param guideCategoryAxisController Controller for Guide to CategoryAxis.
	 */
	public void addGuideCategoryAxis(GuideCategoryAxisController guideCategoryAxisController){
		if(getGuideCategoryAxis()==null){
			initGuideCategoryAxis();
		}
		this.getGuideCategoryAxis().add(guideCategoryAxisController);
		String idGuide = guideCategoryAxisController.getId();
		idGuides.add(idGuide);
		positionsGuides.put(idGuide, sizeGuidesCategoryAxis()-1);
		sizeGuides++;
	}
	

	/**
	 * Add a GuideRadarChart to collection.
	 * @param guideRadarChartController Controller for Guide to radar chart.
	 */
	public void addGuideRadarChart(GuideRadarChartController guideRadarChartController){
		if(getGuideRadarChart()==null){
			initGuideRadarChart();
		}
		this.getGuideRadarChart().add(guideRadarChartController);
		String idGuide = guideRadarChartController.getId();
		idGuides.add(idGuide);
		positionsGuides.put(idGuide, sizeGuidesRadarChart()-1);
		sizeGuides++;
	}

	/**
	 * Add a GuideValueAxis to collection.
	 * @param guideValueAxisController Controller for Guide to ValueAxis.
	 */
	public void addGuideValueAxis(GuideValueAxisController guideValueAxisController){
		if(getGuideValueAxis()==null){
			initGuideValueAxis();
		}
		this.getGuideValueAxis().add(guideValueAxisController);
		String idGuide = guideValueAxisController.getId();
		idGuides.add(idGuide);
		positionsGuides.put(idGuide, sizeGuidesValueAxis()-1);
		sizeGuides++;
	}
	
	/**
	 * Remove a GuideCategoryAxis. 
	 * @param idGuideCategoryAxis Guide id.
	 */
	public void removeGuideCategoryAxis(String idGuideCategoryAxis) {
		int position = positionsGuides.get(idGuideCategoryAxis);
		this.getGuideCategoryAxis().remove(position);
		if(sizeGuidesCategoryAxis()==0){
			deleteGuideCategoryAxis();
		}
		sizeGuides--;
		deleteGuides++;
		idGuides.remove(idGuideCategoryAxis);
		positionsGuides.remove(idGuideCategoryAxis);
		
	}
	
	/**
	 * Remove a GuideRadarChart.
	 * @param idGuideRadarChart Guide id.
	 */
	public void removeGuideRadarChart(String idGuideRadarChart) {
		int position = positionsGuides.get(idGuideRadarChart);
		this.getGuideRadarChart().remove(position);
		if(sizeGuidesRadarChart()==0){
			deleteGuideRadarChart();
		}
		sizeGuides--;
		deleteGuides++;
		idGuides.remove(idGuideRadarChart);
		positionsGuides.remove(idGuideRadarChart);
	}
	
	/**
	 * Remove a GuideValueAxis.
	 * @param idGuideValueAxis Guide id.
	 */
	public void removeGuideValueAxis(String idGuideValueAxis) {
		int position = positionsGuides.get(idGuideValueAxis);
		this.getGuideValueAxis().remove(position);
		if(sizeGuidesValueAxis()==0){
			deleteGuideValueAxis();
		}
		sizeGuides--;
		deleteGuides++;
		idGuides.remove(idGuideValueAxis);
		positionsGuides.remove(idGuideValueAxis);
		
	}
	
	/**
	 * Initialize list of GuideCategoryAxisController.
	 */
	private void initGuideCategoryAxis(){
		guides.put("GuideCategoryAxisController", new ArrayList<GuideCategoryAxisController>());
	}
	
	/**
	 * Initialize list of GuideRadarChartController.
	 */
	private void initGuideRadarChart(){
		guides.put("GuideRadarChartController", new ArrayList<GuideRadarChartController>());
	}
	
	/**
	 * Initialize list of GuideValueAxisController.
	 */
	private void initGuideValueAxis(){
		guides.put("GuideValueAxisController", new ArrayList<GuideValueAxisController>());
	}
	
	/**
	 * Remove list of GuideCategoryAxisController.
	 */
	private void deleteGuideCategoryAxis(){
		guides.remove("GuideCategoryAxisController");
	}
	
	/**
	 * Remove list of GuideRadarChartController.
	 */
	private void deleteGuideRadarChart(){
		guides.remove("GuideRadarChartController");
	}
	
	/**
	 * Remove list of GuideValueAxisController.
	 */
	private void deleteGuideValueAxis(){
		guides.remove("GuideValueAxisController");
	}
	
	/**
	 * Get list of GuideCategoryAxisController.
	 * @return List<GuideCategoryAxisController>
	 */
	@SuppressWarnings("unchecked")
	private List<GuideCategoryAxisController> getGuideCategoryAxis(){
		return (List<GuideCategoryAxisController>) guides.get("GuideCategoryAxisController");
	}
	
	/**
	 * Get list of GuideRadarChartController.
	 * @return List<GuideRadarChartController>
	 */
	@SuppressWarnings("unchecked")
	private List<GuideRadarChartController> getGuideRadarChart(){
		return (List<GuideRadarChartController>) guides.get("GuideRadarChartController");
	}
	
	/**
	 * Get list of GuideValueAxisController.
	 * @return List<GuideValueAxisController>
	 */
	@SuppressWarnings("unchecked")
	private List<GuideValueAxisController> getGuideValueAxis(){
		return (List<GuideValueAxisController>) guides.get("GuideValueAxisController");
	}

}
