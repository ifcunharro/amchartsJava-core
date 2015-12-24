package es.uvigo.esei.amchartsJava.core.model.charts;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;















import es.uvigo.esei.amchartsJava.core.controllers.ChartCursorController;
import es.uvigo.esei.amchartsJava.core.controllers.ChartScrollbarController;
import es.uvigo.esei.amchartsJava.core.controllers.trendLines.TrendLineSerialChartController;
import es.uvigo.esei.amchartsJava.core.controllers.trendLines.TrendLineXyChartController;
import es.uvigo.esei.amchartsJava.core.exceptions.NotSupportedException;
import es.uvigo.esei.amchartsJava.core.model.collections.TrendLines;

public abstract class AmRectangularChart extends AmCoordinateChart {
	private List<String> plotAreaFillColors;
	private List<Number> plotAreaFillAlphas;
	private ChartCursorController chartCursor;
	private ChartScrollbarController scrollbar;
	private TrendLines trendLines;
	
	/**
	 * Get plotAreaFillColors.
	 * @return List of colors.
	 */
	public List<String> getPlotAreaFillColors(){
		return plotAreaFillColors;
	}
	
	/**
	 * Add new colors to plotAreaFillColors.
	 * @param colors Value for colors.
	 */
	public void addPlotAreaFillColors(String... colors){
		if(plotAreaFillColors == null){
			plotAreaFillColors = new ArrayList<String>();
		}
		plotAreaFillColors.clear();
		plotAreaFillColors.addAll(Arrays.asList(colors));
	}
	
	/**
	 * Get plotAreaFillAlphas.
	 * @return List of alphas.
	 */
	public List<Number> getPlotAreaFillAlphas(){
		return plotAreaFillAlphas;
	}
	
	/**
	 * Add new alphas to plotAreaFillAlphas.
	 * @param alphas Values for alphas.
	 */
	public void addPlotAreaFillAlphas(Number... alphas){
		if(plotAreaFillAlphas == null){
			plotAreaFillAlphas = new ArrayList<Number>();
		}
		plotAreaFillAlphas.clear();
		plotAreaFillAlphas.addAll(Arrays.asList(alphas));
	}
	
	/**
	 * Get chartCursor.
	 * @return ChartCursorController Controller for ChartCursor.
	 */
	public ChartCursorController getChartCursor(){
		return chartCursor;
	}
	
	/**
	 * Get chartScrollbar.
	 * @return ChartScrollbarController Controller for ChartScrollbar.
	 */
	public ChartScrollbarController getChartScrollbar(){
		return scrollbar;
	}
	
	/**
	 * Get TrendLines.
	 * @return Object List of TrendLines.
	 */
	public Object getTrendLines(){
		if(trendLines == null){
			return null;
		}else{
			return trendLines.getTrendLines();
		}

	}
	
	/**
	 * Add a chartCursor to chart.
	 * @param chartCursorController Controller for ChartCursor.
	 */
	public void addChartCursor(ChartCursorController chartCursorController){
		chartCursor = chartCursorController;
	}
	
	/**
	 * Add a chartScrollbar to chart.
	 * @param chartScrollbarController Controller for ChartScrollbar.
	 */
	public void addChartScrollbar(ChartScrollbarController chartScrollbarController){
		chartScrollbarController.setChart(this);
		scrollbar = chartScrollbarController;
	}
	
	/**
	 * Add a TrendLine to chart.
	 * @param <T> Type of TrendLine.
	 * @param trendLineController Controller for TrendLine.
	 * @throws NotSupportedException TrendLine is not supported by chart.
	 */
	public abstract <T extends TrendLineSerialChartController> void addTrendLine(T trendLineController) throws NotSupportedException;
	
	/**
	 * Add a TrendLine to chart of type serial.
	 * @param trendLineSerialChartController Controller for TrendLine of type serial.
	 */
	protected void addTrendLineSerial(TrendLineSerialChartController trendLineSerialChartController) {
		if(trendLines==null){
			trendLines = new TrendLines();
		}
		if(trendLineSerialChartController.getId()==null){
			addObserver(trendLineSerialChartController);
			setChanged();
			notifyObservers(trendLines.sizeTrendLineSerial()+1+trendLines.getDeleteTrendLines());
		}
		
		trendLineSerialChartController.setChart(this);
		trendLines.addTrendLineSerial(trendLineSerialChartController);
		deleteObservers();
		
	}
	
	/**
	 * Add a TrendLine to chart of type xy.
	 * @param trendLineXyChartController Controllef for TrendLine of type xy.
	 */
	protected void addTrendLineXy(TrendLineXyChartController trendLineXyChartController) {
		if(trendLines==null){
			trendLines = new TrendLines();
		}
		if(trendLineXyChartController.getId()==null){
			addObserver(trendLineXyChartController);
			setChanged();
			notifyObservers(trendLines.sizeTrendLineXy()+1+trendLines.getDeleteTrendLines());
		}
		
		trendLineXyChartController.setChart(this);
		trendLines.addTrendLineXy(trendLineXyChartController);
		deleteObservers();
		
	}
	
	/**
	 * Remove ChartCursor from chart.
	 */
	public void removeChartCursor(){
		chartCursor = null;
		System.gc();
	}
	
	/**
	 * Remove ChartScrollbar from chart.
	 */
	public void removeChartScrollbar(){
		scrollbar = null;
		System.gc();
	}
	
	/**
	 * Remove TrendLine from chart.
	 * @param idTrendLine TrendLine id.
	 */
	public void removeTrendLine(String idTrendLine){
		if(trendLines.getTrendLineSerialIds().contains(idTrendLine)){
			removeTrendLineSerial(idTrendLine);
		}else if(trendLines.getTrendLineXyIds().contains(idTrendLine)){
			removeTrendLineXy(idTrendLine);
		}
	}
	
	/**
	 * Remove TrendLine from chart of type serial.
	 * @param idTrendLine TrendLine id.
	 */
	private void removeTrendLineSerial(String idTrendLine){
		if(trendLines.isNotEmptyTrendLineSerial()){
			trendLines.removeTrendLineSerial(idTrendLine);
		}
		if(trendLines.getSizeTrendLines()==0){
			trendLines=null;
			System.gc();
		}
	}
	
	/**
	 * Remove TrendLine from chart of type xy.
	 * @param idTrendLine TrendLine id.
	 */
	private void removeTrendLineXy(String idTrendLine){
		if(trendLines.isNotEmptyTrendLineXy()){
			trendLines.removeTrendLineXy(idTrendLine);
		}
		if(trendLines.getSizeTrendLines()==0){
			trendLines=null;
			System.gc();
		}
	}
	
	/**
	 * Check exist TrendLine.
	 * @param idTrendLine TrendLine id.
	 * @return boolean Exist or doesn't exist TrendLine.
	 */
	public boolean existTrendLine(String idTrendLine){
		if(trendLines != null){
			return trendLines.existTrendLine(idTrendLine);
		}else{
			return false;
		}
	}

}
