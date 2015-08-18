package es.uvigo.esei.amchartsJava.core.model.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import es.uvigo.esei.amchartsJava.core.controllers.guides.GuideCategoryAxisController;
import es.uvigo.esei.amchartsJava.core.controllers.guides.GuideController;
import es.uvigo.esei.amchartsJava.core.controllers.guides.GuideRadarChartController;
import es.uvigo.esei.amchartsJava.core.controllers.guides.GuideValueAxisController;

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
	
	public int sizeGuides(){
		return sizeGuides;
	}
	
	public int sizeGuidesCategoryAxis(){
		if(isNotEmptyGuideCategoryAxis()){
			return getGuideCategoryAxis().size();
		}
		return 0;
	}
	
	public int sizeGuidesRadarChart(){
		if(isNotEmptyGuideRadarChart()){
			return getGuideRadarChart().size();
		}
		return 0;
	}
	
	public int sizeGuidesValueAxis(){
		if(isNotEmptyGuideValueAxis()){
			return getGuideValueAxis().size();
		}
		return 0;
	}
	
	public int deleteGuides(){
		return deleteGuides;
	}
	
	public boolean isNotEmptyGuideCategoryAxis(){
		return getGuideCategoryAxis()!=null;
	}
	
	public boolean isNotEmptyGuideRadarChart(){
		return getGuideRadarChart()!=null;
	}
	
	public boolean isNotEmptyGuideValueAxis(){
		return getGuideValueAxis()!=null;
	}
	
	public List<String> getAllGuidesIds(){
		return idGuides;
	}
	
	
	public List<String> getGuideCategoryAxisIds(){
		List<String> ids = new ArrayList<String>();
		if(isNotEmptyGuideCategoryAxis()){
			for(GuideCategoryAxisController categoryAxisGuide: getGuideCategoryAxis()){
				ids.add(categoryAxisGuide.getId().toString());
			}
		}
		return ids;
	}
	
	public List<String> getGuideRadarChartIds(){
		List<String> ids = new ArrayList<String>();
		if(isNotEmptyGuideRadarChart()){
			for(GuideRadarChartController radarChartGuide: getGuideRadarChart()){
				ids.add(radarChartGuide.getId().toString());
			}
		}
		return ids;
	}
	
	public List<String> getGuideValueAxisIds(){
		List<String> ids = new ArrayList<String>();
		if(isNotEmptyGuideValueAxis()){
			for(GuideValueAxisController valueAxisGuide: getGuideValueAxis()){
				ids.add(valueAxisGuide.getId().toString());
			}
		}
		return ids;
	}
	
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
	
	public void addGuideCategoryAxis(GuideCategoryAxisController guideCategoryAxisController){
		if(getGuideCategoryAxis()==null){
			initGuideCategoryAxis();
		}
		this.getGuideCategoryAxis().add(guideCategoryAxisController);
		String idGuide = guideCategoryAxisController.getId().toString();
		idGuides.add(idGuide);
		positionsGuides.put(idGuide, sizeGuidesCategoryAxis()-1);
		sizeGuides++;
	}
	
	public void addGuideRadarChart(GuideRadarChartController guideRadarChartController){
		if(getGuideRadarChart()==null){
			initGuideRadarChart();
		}
		this.getGuideRadarChart().add(guideRadarChartController);
		String idGuide = guideRadarChartController.getId().toString();
		idGuides.add(idGuide);
		positionsGuides.put(idGuide, sizeGuidesRadarChart()-1);
		sizeGuides++;
	}

	
	public void addGuideValueAxis(GuideValueAxisController guideValueAxisController){
		if(getGuideValueAxis()==null){
			initGuideValueAxis();
		}
		this.getGuideValueAxis().add(guideValueAxisController);
		String idGuide = guideValueAxisController.getId().toString();
		idGuides.add(idGuide);
		positionsGuides.put(idGuide, sizeGuidesValueAxis()-1);
		sizeGuides++;
	}
	
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
	
	private void initGuideCategoryAxis(){
		guides.put("GuideCategoryAxisController", new ArrayList<GuideCategoryAxisController>());
	}
	
	private void initGuideRadarChart(){
		guides.put("GuideRadarChartController", new ArrayList<GuideRadarChartController>());
	}
	
	private void initGuideValueAxis(){
		guides.put("GuideValueAxisController", new ArrayList<GuideValueAxisController>());
	}
	
	
	private void deleteGuideCategoryAxis(){
		guides.remove("GuideCategoryAxisController");
	}
	
	private void deleteGuideRadarChart(){
		guides.remove("GuideRadarChartController");
	}
	
	private void deleteGuideValueAxis(){
		guides.remove("GuideValueAxisController");
	}
	
	@SuppressWarnings("unchecked")
	private List<GuideCategoryAxisController> getGuideCategoryAxis(){
		return (List<GuideCategoryAxisController>) guides.get("GuideCategoryAxisController");
	}
	
	@SuppressWarnings("unchecked")
	private List<GuideRadarChartController> getGuideRadarChart(){
		return (List<GuideRadarChartController>) guides.get("GuideRadarChartController");
	}
	
	@SuppressWarnings("unchecked")
	private List<GuideValueAxisController> getGuideValueAxis(){
		return (List<GuideValueAxisController>) guides.get("GuideValueAxisController");
	}
	
	
	public boolean existGuide(String idGuide) {
		return getAllGuidesIds().contains(idGuide);
	}
	
}
