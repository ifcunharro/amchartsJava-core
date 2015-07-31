package es.uvigo.esei.amchartsJava.core.model.charts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;






import es.uvigo.esei.amchartsJava.core.controllers.ChartCursorController;
import es.uvigo.esei.amchartsJava.core.controllers.ChartScrollBarController;

public abstract class AmRectangularChart extends AmCoordinateChart {
	private List<String> plotAreaFillColors;
	private ChartCursorController chartCursor;
	private ChartScrollBarController scrollBar;
	
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
	
	public void addChartCursor(ChartCursorController chartCursorController){
		chartCursor = chartCursorController;
	}
	
	public void addChartScrollBar(ChartScrollBarController chartScrollBarController){
		chartScrollBarController.setChart(this);
		scrollBar = chartScrollBarController;
	}
	
	public void removeChartCursor(){
		chartCursor = null;
		System.gc();
	}
	
	public void removeChartScrollBar(){
		scrollBar = null;
		System.gc();
	}

}
