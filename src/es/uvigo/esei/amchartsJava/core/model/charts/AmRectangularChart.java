package es.uvigo.esei.amchartsJava.core.model.charts;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;















import es.uvigo.esei.amchartsJava.core.controllers.ChartCursorController;
import es.uvigo.esei.amchartsJava.core.controllers.ChartScrollBarController;
import es.uvigo.esei.amchartsJava.core.controllers.trendLines.TrendLineSerialChartController;
import es.uvigo.esei.amchartsJava.core.controllers.trendLines.TrendLineXyChartController;
import es.uvigo.esei.amchartsJava.core.exceptions.NotSupportedException;
import es.uvigo.esei.amchartsJava.core.model.collections.TrendLines;

public abstract class AmRectangularChart extends AmCoordinateChart {
	private List<String> plotAreaFillColors;
	private ChartCursorController chartCursor;
	private ChartScrollBarController scrollBar;
	private TrendLines trendLines;
	
	{
		plotAreaFillColors = new ArrayList<String>();
	}
	
	public void addPlotAreaFillColors(String... colors){
		plotAreaFillColors.clear();
		plotAreaFillColors.addAll(Arrays.asList(colors));
	}
	
	public ChartCursorController getChartCursor(){
		return chartCursor;
	}
	
	public ChartScrollBarController getChartScrollBar(){
		return scrollBar;
	}
	
	public Object getTrendLines(){
		if(trendLines == null){
			return null;
		}else{
			return trendLines.getTrendLines();
		}

	}
	
	public void addChartCursor(ChartCursorController chartCursorController){
		chartCursor = chartCursorController;
	}
	
	public void addChartScrollBar(ChartScrollBarController chartScrollBarController){
		chartScrollBarController.setChart(this);
		scrollBar = chartScrollBarController;
	}
	
	public abstract <T extends TrendLineSerialChartController> void addTrendLine(T trendLineController) throws NotSupportedException;
	
	protected void addTrendLineSerial(TrendLineSerialChartController trendLineSerialChartController) {
		if(trendLines==null){
			trendLines = new TrendLines();
		}
		addObserver(trendLineSerialChartController);
		setChanged();
		notifyObservers(trendLines.sizeTrendLineSerial()+1+trendLines.getDeleteTrendLines());
		trendLineSerialChartController.setChart(this);
		trendLines.addTrendLineSerial(trendLineSerialChartController);
		deleteObservers();
		
	}
	
	protected void addTrendLineXy(TrendLineXyChartController trendLineXyChartController) {
		if(trendLines==null){
			trendLines = new TrendLines();
		}
		addObserver(trendLineXyChartController);
		setChanged();
		notifyObservers(trendLines.sizeTrendLineXy()+1+trendLines.getDeleteTrendLines());
		trendLineXyChartController.setChart(this);
		trendLines.addTrendLineXy(trendLineXyChartController);
		deleteObservers();
		
	}
	
	public void removeChartCursor(){
		chartCursor = null;
		System.gc();
	}
	
	public void removeChartScrollBar(){
		scrollBar = null;
		System.gc();
	}
	
	public void removeTrendLine(String idTrendLine){
		if(trendLines.getTrendLineSerialIds().contains(idTrendLine)){
			removeTrendLineSerial(idTrendLine);
		}else if(trendLines.getTrendLineXyIds().contains(idTrendLine)){
			removeTrendLineXy(idTrendLine);
		}
	}
	
	
	
	private void removeTrendLineSerial(String idTrendLine){
		if(trendLines.isNotEmptyTrendLineSerial()){
			trendLines.removeTrendLineSerial(idTrendLine);
		}
		if(trendLines.getSizeTrendLines()==0){
			trendLines=null;
			System.gc();
		}
	}
	
	private void removeTrendLineXy(String idTrendLine){
		if(trendLines.isNotEmptyTrendLineXy()){
			trendLines.removeTrendLineXy(idTrendLine);
		}
		if(trendLines.getSizeTrendLines()==0){
			trendLines=null;
			System.gc();
		}
	}
	
	public boolean existTrendLine(String idTrendLine){
		if(trendLines != null){
			return trendLines.existTrendLine(idTrendLine);
		}else{
			return false;
		}
	}

}
