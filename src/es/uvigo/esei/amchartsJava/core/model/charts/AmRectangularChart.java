package es.uvigo.esei.amchartsJava.core.model.charts;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



import es.uvigo.esei.amchartsJava.core.controllers.ChartCursorController;
import es.uvigo.esei.amchartsJava.core.controllers.ChartScrollBarController;
import es.uvigo.esei.amchartsJava.core.controllers.trendLines.TrendLineSerialChartController;

public class AmRectangularChart extends AmCoordinateChart {
	private List<String> plotAreaFillColors;
	private ChartCursorController chartCursor;
	private ChartScrollBarController scrollBar;
	private List<TrendLineSerialChartController> trendLines;
	private List<String> idTrendLines;
	private int deleteTrendLines;
	
	{
		plotAreaFillColors = new ArrayList<String>();
		deleteTrendLines = 0;
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
	
	public List<TrendLineSerialChartController> getTrendLines(){
		return trendLines;
	}
	
	public void addChartCursor(ChartCursorController chartCursorController){
		chartCursor = chartCursorController;
	}
	
	public void addChartScrollBar(ChartScrollBarController chartScrollBarController){
		chartScrollBarController.setChart(this);
		scrollBar = chartScrollBarController;
	}
	
	public void addTrendLine(TrendLineSerialChartController trendLineController){
		if(trendLines==null){
			trendLines = new ArrayList<TrendLineSerialChartController>();
			idTrendLines = new ArrayList<String>();
		}
		addObserver(trendLineController);
		setChanged();
		notifyObservers(trendLines.size()+1+deleteTrendLines);
		trendLineController.setChart(this);
		trendLines.add(trendLineController);
		deleteObservers();
		idTrendLines.add("TrendLine-"+trendLines.size()+deleteTrendLines);
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
		if(trendLines!=null){
			trendLines.remove(Integer.valueOf(idTrendLine.substring(idTrendLine.length() - 1))-1);
			idTrendLines.remove(idTrendLine);
			deleteTrendLines++;
		}
		if(trendLines.size()==0){
			trendLines=null;
			idTrendLines=null;
			deleteTrendLines=0;
		}
	}
	
	public boolean existTrendLine(String idTrendLine){
		return idTrendLines.contains(idTrendLine);
	}

}
