package amcharts.TrendLine;

import java.util.List;


public interface ITrendLines {

	public List<ITrendLine> getTrendLines();
	
	public void addTrendLine(ITrendLine tr);

}