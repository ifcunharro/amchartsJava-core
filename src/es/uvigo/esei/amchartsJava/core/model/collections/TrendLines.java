package es.uvigo.esei.amchartsJava.core.model.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import es.uvigo.esei.amchartsJava.core.controllers.trendLines.TrendLineSerialChartController;
import es.uvigo.esei.amchartsJava.core.controllers.trendLines.TrendLineXyChartController;

/**
 * Collection of TrendLines.
 * @author Iago Fernández Cuñarro
 *
 */
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
	
	/**
	 * Get number of TrendLines added to chart.
	 * @return int Number of TrendLines.
	 */
	public int getSizeTrendLines(){
		return sizeTrendLines;
	}
	
	/**
	 * Get number of TrendLines to chart type serial.
	 * @return int Number of TrendLineSerialChartController.
	 */
	public int sizeTrendLineSerial(){
		if(getTrendLinesSerial()!=null){
			return this.getTrendLinesSerial().size();
		}
		return 0;
	}
	
	/**
	 * Get number of TrendLines to chart type xy.
	 * @return int Number of TrendLineXyChartController.
	 */
	public int sizeTrendLineXy(){
		if(getTrendLinesXy()!=null){
			return this.getTrendLinesXy().size();
		}
		return 0;
	}
	
	/**
	 * Get delete TrendLines.
	 * @return int Number of delete TrendLines.
	 */
	public int getDeleteTrendLines(){
		return deleteTrendLines;
	}
	
	/**
	 * Check exist TrendLine in collection.
	 * @param idTrendLine TrendLine id.
	 * @return boolean Exist or doesn't exist TrendLine in collection.
	 */
	public boolean existTrendLine(String idTrendLine){
		return getAllIdsTrendLines().contains(idTrendLine);
	}
	
	/**
	 * Check exist any TrendLine to chart type xy.
	 * @return boolean List of TrendLineXyChartController initialized.
	 */
	public boolean isNotEmptyTrendLineXy() {
		return getTrendLinesXy() != null;
	}

	/**
	 * Check exist any TrendLine to chart type serial.
	 * @return boolean List of TrendLineSerialChartController initialized.
	 */
	public boolean isNotEmptyTrendLineSerial() {
		return getTrendLinesSerial() != null;
	}

	/**
	 * Get TrendLine ids.
	 * @return List of TrendLine ids.
	 */
	public List<String> getAllIdsTrendLines() {
		return idTrendLines;
	}

	/**
	 * Get TrendLine ids to chart type serial.
	 * @return TrendLine ids.
	 */
	public List<String> getTrendLineSerialIds(){
		List<String> ids = new ArrayList<String>();
		if(isNotEmptyTrendLineSerial()){
			for(TrendLineSerialChartController trendLineSerial: getTrendLinesSerial()){
				ids.add(trendLineSerial.getId());
			}
		}
		return ids;
	}
	
	/**
	 * Get TrendLine ids to chart type xy.
	 * @return TrendLine ids.
	 */
	public List<String> getTrendLineXyIds(){
		List<String> ids = new ArrayList<String>();
		if(isNotEmptyTrendLineXy()){
			for(TrendLineSerialChartController trendLineSerial: getTrendLinesSerial()){
				ids.add(trendLineSerial.getId());
			}
		}
		return ids;
	}
	
	/**
	 * Get TrendLines.
	 * @return List of TrendLines serial and xy.
	 */
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
	
	/**
	 * Add a TrendLine to chart type xy.
	 * @param trendLineXyChartController Controller for TrendLine to chart type xy.
	 */
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

	/**
	 * Add a TrendLine to chart type serial.
	 * @param trendLineSerialChartController Controller for TrendLien to chart type serial.
	 */
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
	
	/**
	 * Remove a TrendLine from chart type serial.
	 * @param idTrendLineSerial TrendLine id.
	 */
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
	
	/**
	 * Remove a TrendLine from chart type xy.
	 * @param idTrendLineXy TrendLine xy.
	 */
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
	
	/**
	 * Initialize list of TrendLineSerialChartController.
	 */
	private void initTrendLineSerial() {
		trendLines.put("TrendLineSerialChartController", new ArrayList<TrendLineSerialChartController>());
	}
	
	/**
	 * Initialize list of TrendLineXyChartController.
	 */
	private void initTrendLinesXy() {
		trendLines.put("TrendLineXyChartController", new ArrayList<TrendLineXyChartController>());
	}
	
	/**
	 * Remove list of TrendLineSerialChartController.
	 */
	private void deleteTrendLineSerial() {
		trendLines.remove("TrendLineSerialChartController");
	}
	
	/**
	 * Remove list of TrendLineXyChartController.
	 */
	private void deleteTrendLineXy() {
		trendLines.remove("TrendLineXyChartController");
	}

	/**
	 * Get list of TrendLineSerialChartController.
	 * @return List<TrendLineSerialChartController> 
	 */
	@SuppressWarnings("unchecked")
	private List<TrendLineSerialChartController> getTrendLinesSerial(){
			return (List<TrendLineSerialChartController>)(List<?>) trendLines.get("TrendLineSerialChartController");
	}
	
	/**
	 * Get list of TrendLineXyChartController.
	 * @return List<TrendLineXyChartController>
	 */
	@SuppressWarnings("unchecked")
	private List<TrendLineXyChartController> getTrendLinesXy(){
		return (List<TrendLineXyChartController>)(List<?>) trendLines.get("TrendLineXyChartController");
	}

}
