package es.uvigo.esei.amchartsJava.core.model.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import es.uvigo.esei.amchartsJava.core.controllers.trendLines.TrendLineSerialChartController;
import es.uvigo.esei.amchartsJava.core.controllers.trendLines.TrendLineXyChartController;

public class TrendLines {
	
	private Map<String,Object> trendLines;
	private int deleteTrendLines;
	private List<String> idTrendLineSerial;
	private List<String> idTrendLineXy;
	
	{
		trendLines = new HashMap<String,Object>();
		idTrendLineSerial = new ArrayList<String>();
		idTrendLineXy = new ArrayList<String>();
		deleteTrendLines = 0;
	}

	public void initTrendLineSerial() {
		if(trendLines.get("trendLineSerial")==null){
			trendLines.put("trendLineSerial", new ArrayList<TrendLineSerialChartController>());
		}
	}
	
	public void initTrendLinesXy() {
		if(trendLines.get("trendLineXy")==null){
			trendLines.put("trendLineXy", new ArrayList<TrendLineXyChartController>());
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<TrendLineSerialChartController> getTrendLinesSerial(){
		if(trendLines.get("trendLineSerial")!=null){
			return (List<TrendLineSerialChartController>)(List<?>) trendLines.get("trendLineSerial");
		}
		return null;
	}
	
	public void removeTrendLineSerial(int position) {
		idTrendLineSerial.remove(getTrendLinesSerial().get(position).getId().toString());
		this.getTrendLinesSerial().remove(position);
		
		deleteTrendLines++;
	}
	
	public void removeTrendLineXy(int position) {
		idTrendLineXy.remove(getTrendLinesXy().get(position).getId().toString());
		this.getTrendLinesXy().remove(position);
		
		deleteTrendLines++;
	}
	
	@SuppressWarnings("unchecked")
	public List<TrendLineXyChartController> getTrendLinesXy(){
		if(trendLines.get("trendLineXy")!=null){
			return (List<TrendLineXyChartController>)(List<?>) trendLines.get("trendLineXy");
		}
		return null;
	}

	public void setTrendLinesSerial(List<TrendLineSerialChartController> trendLinesSerial) {
		trendLines.put("trendLineSerial", trendLinesSerial);
	}

	

	public void setTrendLinesXy(List<TrendLineXyChartController> trendLinesXy) {
		trendLines.put("trendLineXy", trendLinesXy);
	}
	
	public List<String> getTrendLineSerialIds(){
		return idTrendLineSerial;
	}
	
	public List<String> getTrendLineXyIds(){
		return idTrendLineXy;
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

	public void addTrendLineXy(TrendLineXyChartController trendLineController) {
		getTrendLinesXy().add(trendLineController);
		idTrendLineXy.add(trendLineController.getId().toString());
	}

	public void addTrendLineSerial(TrendLineSerialChartController trendLineController) {
		getTrendLinesSerial().add(trendLineController);
		idTrendLineSerial.add(trendLineController.getId().toString());
	}

}
