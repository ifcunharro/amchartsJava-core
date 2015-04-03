package amcharts.TrendLine;


import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_EMPTY)
public class TrendLines implements ITrendLines{
	//trendLines es un list para ayudar al parseo Json
	private List<ITrendLine> trendLines;
	
	
	public TrendLines() {
		trendLines = new ArrayList<ITrendLine>();	
	}
	
	public List<ITrendLine> getTrendLines() {
		return trendLines;
	}

	

	public void addTrendLine(ITrendLine tren) {
		
		if (tren.getId()==null){
			tren.setId("TrendLine-"+(trendLines.size()+1));
		}
		trendLines.add(tren);
	}

}
