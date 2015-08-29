package es.uvigo.esei.amchartsJava.core.model.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import es.uvigo.esei.amchartsJava.core.controllers.trendLines.TrendLineSerialChartController;
import es.uvigo.esei.amchartsJava.core.controllers.trendLines.TrendLineXyChartController;

public class TrendLines {
	
	private Map<String,Object> trendLines;
	private Map<String,Integer> positionsTrendLines;
	private List<String> idTrendLines;
	private int sizeTrendLines;
	private int deleteTrendLines;
	
	
	{
		trendLines = new HashMap<String,Object>();
		positionsTrendLines = new HashMap<String, Integer>();
		idTrendLines = new ArrayList<String>();
		sizeTrendLines = 0;
		deleteTrendLines = 0;
	}
	
	public int getSizeTrendLines(){
		return sizeTrendLines;
	}
	
	public int sizeTrendLineSerial(){
		if(getTrendLinesSerial()!=null){
			return this.getTrendLinesSerial().size();
		}
		return 0;
	}
	
	public int sizeTrendLineXy(){
		if(getTrendLinesXy()!=null){
			return this.getTrendLinesXy().size();
		}
		return 0;
	}
	
	public int getDeleteTrendLines(){
		return deleteTrendLines;
	}
	
	public boolean existTrendLine(String idTrendLine){
		return getAllIdsTrendLines().contains(idTrendLine);
	}
	

	public boolean isNotEmptyTrendLineXy() {
		return getTrendLinesXy() != null;
	}

	public boolean isNotEmptyTrendLineSerial() {
		return getTrendLinesSerial() != null;
	}

	public List<String> getAllIdsTrendLines() {
		return idTrendLines;
	}

	public List<String> getTrendLineSerialIds(){
		List<String> ids = new ArrayList<String>();
		if(isNotEmptyTrendLineSerial()){
			for(TrendLineSerialChartController trendLineSerial: getTrendLinesSerial()){
				ids.add(trendLineSerial.getId());
			}
		}
		return ids;
	}
	
	public List<String> getTrendLineXyIds(){
		List<String> ids = new ArrayList<String>();
		if(isNotEmptyTrendLineXy()){
			for(TrendLineSerialChartController trendLineSerial: getTrendLinesSerial()){
				ids.add(trendLineSerial.getId());
			}
		}
		return ids;
	}
	
	public List<TrendLineSerialChartController> getTrendLines(){
		List<TrendLineSerialChartController> trendLineControllers = new ArrayList<TrendLineSerialChartController>();
		if(isNotEmptyTrendLineSerial()){
			for(TrendLineSerialChartController guide: getTrendLinesSerial()){
				trendLineControllers.add(guide);
			}
		}
		if(isNotEmptyTrendLineXy()){
			for(TrendLineXyChartController guide: getTrendLinesXy()){
				trendLineControllers.add(guide);
			}
		}
		
		
		return trendLineControllers;
	}
	
	
	public void addTrendLineXy(TrendLineXyChartController trendLineXyChartController) {
		if(getTrendLinesXy()==null){
			initTrendLinesXy();
		}
		getTrendLinesXy().add(trendLineXyChartController);
		String idTrendLine = trendLineXyChartController.getId();
		idTrendLines.add(idTrendLine);
		positionsTrendLines.put(idTrendLine, sizeTrendLineXy()-1);
		sizeTrendLines++;
	}

	public void addTrendLineSerial(TrendLineSerialChartController trendLineSerialChartController) {
		if(getTrendLinesSerial()==null){
			initTrendLineSerial();
		}
		getTrendLinesSerial().add(trendLineSerialChartController);
		String idTrendLine = trendLineSerialChartController.getId();
		idTrendLines.add(idTrendLine);
		positionsTrendLines.put(idTrendLine, sizeTrendLineSerial()-1);
		sizeTrendLines++;
	}
	
	public void removeTrendLineSerial(String idTrendLineSerial) {
		int position = positionsTrendLines.get(idTrendLineSerial);
		getTrendLinesSerial().remove(position);
		if(sizeTrendLineSerial()==0){
			deleteTrendLineSerial();
		}
		sizeTrendLines--;
		deleteTrendLines++;
		idTrendLines.remove(idTrendLineSerial);
		positionsTrendLines.remove(idTrendLineSerial);
	}
	
	
	public void removeTrendLineXy(String idTrendLineXy) {
		int position = positionsTrendLines.get(idTrendLineXy);
		getTrendLinesXy().remove(position);
		if(sizeTrendLineXy()==0){
			deleteTrendLineXy();
		}
		sizeTrendLines--;
		deleteTrendLines++;
		idTrendLines.remove(idTrendLineXy);
		positionsTrendLines.remove(idTrendLineXy);
	}
	
	private void initTrendLineSerial() {
		trendLines.put("TrendLineSerialChartController", new ArrayList<TrendLineSerialChartController>());
	}
	
	private void initTrendLinesXy() {
		trendLines.put("TrendLineXyChartController", new ArrayList<TrendLineXyChartController>());
	}
	
	private void deleteTrendLineSerial() {
		trendLines.remove("TrendLineSerialChartController");
	}
	
	private void deleteTrendLineXy() {
		trendLines.remove("TrendLineXyChartController");
	}

	@SuppressWarnings("unchecked")
	private List<TrendLineSerialChartController> getTrendLinesSerial(){
			return (List<TrendLineSerialChartController>)(List<?>) trendLines.get("TrendLineSerialChartController");
	}
	
	@SuppressWarnings("unchecked")
	private List<TrendLineXyChartController> getTrendLinesXy(){
		return (List<TrendLineXyChartController>)(List<?>) trendLines.get("TrendLineXyChartController");
	}

}
