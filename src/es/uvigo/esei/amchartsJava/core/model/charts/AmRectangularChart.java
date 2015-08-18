package es.uvigo.esei.amchartsJava.core.model.charts;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;












import es.uvigo.esei.amchartsJava.core.controllers.ChartCursorController;
import es.uvigo.esei.amchartsJava.core.controllers.ChartScrollBarController;
import es.uvigo.esei.amchartsJava.core.controllers.trendLines.TrendLineSerialChartController;
import es.uvigo.esei.amchartsJava.core.controllers.trendLines.TrendLineXyChartController;
import es.uvigo.esei.amchartsJava.core.model.collections.TrendLines;

public abstract class AmRectangularChart extends AmCoordinateChart implements IJsonDeserializerAmRectangularChart {
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
		List<Object> list = new ArrayList<Object>();
		if(trendLines!=null){
			if(trendLines.getTrendLinesSerial()!=null){
				list.addAll(trendLines.getTrendLinesSerial());
			}
			if(trendLines.getTrendLinesXy()!=null){
				list.addAll(trendLines.getTrendLinesXy());
			}
		}
		if(list.size()==0){
			return null;
		}else{
			return list;
		}

	}
	
	public void addChartCursor(ChartCursorController chartCursorController){
		chartCursor = chartCursorController;
	}
	
	public void addChartScrollBar(ChartScrollBarController chartScrollBarController){
		chartScrollBarController.setChart(this);
		scrollBar = chartScrollBarController;
	}
	
	public <T extends TrendLineSerialChartController> void addTrendLine(T trendLineController){
		if(trendLines==null){
			trendLines = new TrendLines();
		}
		trendLineController.setChart(this);
		addObserver(trendLineController);
		setChanged();
		if(trendLineController instanceof TrendLineXyChartController){
			trendLines.initTrendLinesXy();
			notifyObservers(trendLines.sizeTrendLineXy()+1+trendLines.getDeleteTrendLines());
			trendLines.addTrendLineXy((TrendLineXyChartController)trendLineController);
		}else{
			trendLines.initTrendLineSerial();
			notifyObservers(trendLines.sizeTrendLineSerial()+1+trendLines.getDeleteTrendLines());
			trendLines.addTrendLineSerial((TrendLineSerialChartController)trendLineController);
		}
		
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
	
	public void removeTrendLineSerial(String idTrendLine){
		if(trendLines.getTrendLinesSerial()!=null){
			trendLines.removeTrendLineSerial(
					Integer.valueOf(idTrendLine.substring(idTrendLine.length() - 1))-1);
		}
		
		if(trendLines.sizeTrendLineSerial()==0 && trendLines.sizeTrendLineXy()==0){
			trendLines=null;
			System.gc();
		}
	}
	
	public void removeTrendLineXy(String idTrendLine){
		if(trendLines.getTrendLinesXy()!=null){
			trendLines.removeTrendLineXy(
					Integer.valueOf(idTrendLine.substring(idTrendLine.length() - 1))-1);
		}
		
		if(trendLines.sizeTrendLineXy()==0 && trendLines.sizeTrendLineSerial()==0){
			trendLines=null;
			System.gc();
		}
	}
	
	public boolean existTrendLine(String idTrendLine){
		return trendLines.getTrendLineSerialIds().contains(idTrendLine) ||
				trendLines.getTrendLineXyIds().contains(idTrendLine);
	}

	
	@SuppressWarnings("unchecked")
	public void setTrendLines(List<TrendLineXyChartController> trendLineControllers) {
		trendLines = new TrendLines();
		if(deserializeType.equals("serial")){
			trendLines.initTrendLineSerial();
			trendLines.setTrendLinesSerial((List<TrendLineSerialChartController>)(List<?>)trendLineControllers);
		}else{
			trendLines.initTrendLinesXy();
			trendLines.setTrendLinesXy(trendLineControllers);
		}
	}

	

}
