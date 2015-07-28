package es.uvigo.esei.amchartsJava.core.model.charts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import es.uvigo.esei.amchartsJava.core.api.IChartCursorController;

public abstract class AmRectangularChart extends AmCoordinateChart {
	private List<String> plotAreaFillColors;
	private IChartCursorController chartCursor;
	
	{
		plotAreaFillColors = new ArrayList<String>();
	}
	
	
	public void addPlotAreaFillColors(String... colors){
		plotAreaFillColors.clear();
		plotAreaFillColors.addAll(Arrays.asList(colors));
	}
	
	public IChartCursorController getChartCursor(){
		return chartCursor;
	}
	
	public void addChartCursor(IChartCursorController chartCursorController){
		chartCursor = chartCursorController;
	}
	
	public void removeChartCursor(){
		chartCursor = null;
		System.gc();
	}

}
